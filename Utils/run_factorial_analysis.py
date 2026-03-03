import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import os
import argparse
import numpy as np
from matplotlib.ticker import PercentFormatter

def get_data_path(args):
    potential_paths = [
        args.input,
        'combined_run_histories.csv',
        '../combined_run_histories.csv',
        'Report/Histories/combined_run_histories.csv'
    ]
    for path in potential_paths:
        if os.path.exists(path):
            return path
    raise FileNotFoundError(f"Could not find data file. Checked paths: {potential_paths}")

def load_and_prep_data(csv_path):
    """
    Uses the exact methodology from the friend's script to ensure accurate numbers.
    Isolates the data to one row per run_id before calculating success.
    """
    df = pd.read_csv(csv_path)
    
    # Run-level: first iteration row (contains the derived metrics for the whole run)
    run_df = (
        df.sort_values(["config_id", "run_id", "iteration"])
        .drop_duplicates(subset=["run_id"], keep="first")
        .copy()
    )
    
    # Calculate success identically to friend's script
    run_df["success_bool"] = run_df["status"].astype(str).eq("success").astype(int)
    
    # Clean system prompt (Repair)
    if 'cfg_system_prompt' in run_df.columns:
        prompt_col = 'cfg_system_prompt'
    else:
        prompt_col = 'system_prompt'
    run_df['system_prompt_clean'] = run_df[prompt_col].apply(lambda x: str(x).split('/')[-1])
    
    # Standardize shots
    if "few_shots" not in run_df.columns:
        if "jshots" in run_df.columns:
            run_df["few_shots"] = run_df["jshots"].map({"yes": "Yes", "no": "No"}).fillna("No")
        elif "repair_shots" in run_df.columns:
            run_df["few_shots"] = run_df["repair_shots"].apply(
                lambda v: "Yes" if pd.to_numeric(v, errors="coerce") > 0 else "No"
            )
    else:
        run_df["few_shots"] = run_df["few_shots"].astype(str).str.strip()
        
    # Ensure numeric columns for behavioral analysis
    numeric_cols = ['derived_first_success_iteration', 'derived_regression_steps', 'derived_monotonicity_ratio']
    for col in numeric_cols:
        if col in run_df.columns:
            run_df[col] = pd.to_numeric(run_df[col], errors='coerce')
            
    return run_df

def main():
    parser = argparse.ArgumentParser(description='Run cross-comparative factorial analysis.')
    parser.add_argument('--input', type=str, default='Report/Histories/combined_run_histories.csv')
    parser.add_argument('--output_dir', type=str, default='Report/Figures-v2/')
    args = parser.parse_args()

    os.makedirs(args.output_dir, exist_ok=True)
    
    try:
        data_path = get_data_path(args)
        run_df = load_and_prep_data(data_path)
    except FileNotFoundError as e:
        print(f"Error: {e}")
        return

    sns.set_theme(style="whitegrid")
    custom_palette = ["#d8b3e0", "#5c4f8a"]

    # =========================================================================
    # PART 1: CROSS-COMPARATIVE ANALYSIS (MOTIVATIONS FOR THE STUDY)
    # Goal: "Yes it works, but why, and what should future improvements focus on?"
    # =========================================================================
    print("Generating Part 1: Cross-Comparative Analysis Figures...")
    
    # --- Plot 1.1: Isolated Main Effects (What to focus on) ---
    
    # 1. Prepare Model Effect Data
    model_effect = run_df.groupby('model')['success_bool'].mean().reset_index()
    model_effect['model_clean'] = model_effect['model'].str.replace('gemini-', '').str.replace('-preview', '')

    # 2. Prepare Shot Effect Data (Overall + By Model)
    shot_overall = run_df.groupby('few_shots')['success_bool'].mean().reset_index()
    shot_overall['Model Split'] = 'Overall Average'
    shot_model = run_df.groupby(['few_shots', 'model'])['success_bool'].mean().reset_index()
    shot_model['Model Split'] = shot_model['model'].str.replace('gemini-', '').str.replace('-preview', '')
    shot_plot_df = pd.concat([shot_overall, shot_model.drop(columns=['model'])], ignore_index=True)

    # 3. Prepare Prompt Effect Data (Overall + By Model)
    prompt_overall = run_df.groupby('system_prompt_clean')['success_bool'].mean().reset_index()
    prompt_overall['Model Split'] = 'Overall Average'
    prompt_model = run_df.groupby(['system_prompt_clean', 'model'])['success_bool'].mean().reset_index()
    prompt_model['Model Split'] = prompt_model['model'].str.replace('gemini-', '').str.replace('-preview', '')
    prompt_plot_df = pd.concat([prompt_overall, prompt_model.drop(columns=['model'])], ignore_index=True)

    hue_order = ['Overall Average', '2.5-flash', '3-pro']

    # We make the figure slightly wider (18) to comfortably fit the grouped bars
    fig, axes = plt.subplots(1, 3, figsize=(18, 6), sharey=True)
    fig.suptitle('Main Effects: Identifying the Highest-Yield Dimensions for Future Improvement', fontsize=16, y=1.05)

    # Ax 0: Model Capability (Standard single bars)
    sns.barplot(data=model_effect, x='model_clean', y='success_bool', ax=axes[0], palette="Blues")
    axes[0].set_title('Model Capability Impact')
    axes[0].set_ylabel('Average Success Rate')
    axes[0].set_xlabel('')

    # Ax 1: Few-Shot Context (Grouped bars)
    sns.barplot(data=shot_plot_df, x='few_shots', y='success_bool', hue='Model Split', hue_order=hue_order, ax=axes[1], palette="Greens")
    axes[1].set_title('Few-Shot Context Impact')
    axes[1].set_xlabel('Few Shots')

    # Ax 2: System Prompt (Grouped bars)
    sns.barplot(data=prompt_plot_df, x='system_prompt_clean', y='success_bool', hue='Model Split', hue_order=hue_order, ax=axes[2], palette="Oranges")
    axes[2].set_title('System Prompt Tuning Impact')
    axes[2].set_xlabel('Repair System Prompt')

    for ax in axes:
        ax.yaxis.set_major_formatter(PercentFormatter(1.0))
        ax.set_ylim(0, 1.1)
        # Add exact percentage text
        for p in ax.patches:
            height = p.get_height()
            if pd.notna(height) and height > 0:
                # Rotate text slightly on grouped bars to prevent numbers from overlapping
                rotation = 45 if ax != axes[0] else 0
                ax.annotate(f"{height:.1%}", (p.get_x() + p.get_width() / 2., height),
                            ha='center', va='bottom', fontsize=9, xytext=(0, 4), textcoords='offset points', rotation=rotation)
                
    # Fix the duplicate legends
    axes[1].legend(title='Scope', loc='upper left', fontsize=9)
    axes[2].legend(title='Scope', loc='upper left', fontsize=9)
            
    plt.savefig(os.path.join(args.output_dir, 'fig_1_isolated_main_effects.png'), bbox_inches='tight', dpi=300)
    plt.close('all')

    # --- Plot 1.2: Factorial Synergy (All Configs) ---
    plt.figure(figsize=(12, 6))
    g = sns.catplot(
        data=run_df, kind="bar", x="model", y="success_bool", hue="few_shots", 
        col="system_prompt_clean", height=5, aspect=1.2, errorbar=None, palette=custom_palette
    )
    g.set_axis_labels("Model", "Success Rate")
    g.set_titles("Repair Prompt: {col_name}")
    g.fig.suptitle("Config Synergy: Model × Few-Shot × Prompt", y=1.05, fontsize=16)
    g._legend.set_title("Few Shots")
    
    for ax in g.axes.flat:
        ax.set_ylim(0, 1.1)
        ax.yaxis.set_major_formatter(PercentFormatter(1.0))
        for p in ax.patches:
            if p.get_height() > 0:
                ax.annotate(f"{p.get_height():.1%}", (p.get_x() + p.get_width() / 2., p.get_height()),
                            ha='center', va='bottom', fontsize=10, xytext=(0, 5), textcoords='offset points')
                
    plt.savefig(os.path.join(args.output_dir, 'fig_2_factorial_success_rate.png'), bbox_inches='tight', dpi=300)
    plt.close('all')

    # --- Plot 1.3: Efficiency of Repair (Iterations to Success) ---
    # Only look at runs that actually succeeded
    success_df = run_df[run_df['success_bool'] == 1].copy()
    if not success_df.empty and 'derived_first_success_iteration' in success_df.columns:
        plt.figure(figsize=(10, 6))
        sns.boxplot(
            data=success_df, x="model", y="derived_first_success_iteration", 
            hue="few_shots", palette=custom_palette
        )
        plt.title('Repair Efficiency: Iterations Required to Reach Validation (Successful Runs)', fontsize=14)
        plt.ylabel('Iterations to Success')
        plt.xlabel('Model')
        plt.legend(title="Few Shots")
        plt.savefig(os.path.join(args.output_dir, 'fig_3_repair_efficiency.png'), bbox_inches='tight', dpi=300)
        plt.close('all')

    # --- Plot 1.4: "Why it fails" - Reasoning Stability / Regression Steps ---
    # Comparing how many times the model made the code WORSE during its iteration attempts
    if 'derived_regression_steps' in run_df.columns:
        plt.figure(figsize=(10, 6))
        sns.barplot(
            data=run_df, x="model", y="derived_regression_steps", 
            hue="few_shots", errorbar=('ci', 95), palette="Reds"
        )
        plt.title('Reasoning Stability: Average Regression Steps per Run\n(Lower is better: indicates model is not breaking existing logic)', fontsize=14)
        plt.ylabel('Avg Count of Regressions (Making Error Score Worse)')
        plt.xlabel('Model')
        plt.legend(title="Few Shots")
        plt.savefig(os.path.join(args.output_dir, 'fig_4_reasoning_stability.png'), bbox_inches='tight', dpi=300)
        plt.close('all')


    # =========================================================================
    # PART 2: GENERATIVE BASELINE EFFECTS
    # =========================================================================
    print("Generating Part 2: Generative Baseline Analysis Figures...")
    
    run_df['gen_scenario_clean'] = run_df['scenario'].apply(lambda x: str(x).replace('.txt', '').replace('Scenario_', 'S'))
    run_df['gen_prompt_clean'] = run_df['system_prompt'].apply(lambda x: str(x).replace('.txt', ''))
    
    baseline_table = run_df.groupby(['gen_prompt_clean', 'gen_scenario_clean']).agg(
        Total_Runs=('success_bool', 'count'),
        Success_Rate=('success_bool', 'mean')
    ).reset_index()
    
    pivot_success = baseline_table.pivot(index='gen_prompt_clean', columns='gen_scenario_clean', values='Success_Rate')
    
    plt.figure(figsize=(8, 5))
    sns.heatmap(
        pivot_success, annot=True, fmt=".0%", cmap="RdYlGn", 
        vmin=0, vmax=1, linewidths=0.5, cbar_kws={'label': 'Success Rate'}
    )
    plt.title('Generative Baseline Fixability (Prompt × Scenario)', fontsize=14, pad=15)
    plt.ylabel('Generative System Prompt')
    plt.xlabel('Scenario')
    plt.savefig(os.path.join(args.output_dir, 'fig_5_baseline_heatmap.png'), bbox_inches='tight', dpi=300)
    plt.close('all')
    
    print("Done! All analysis figures exported to Report/Figures-v2/")

if __name__ == "__main__":
    main()