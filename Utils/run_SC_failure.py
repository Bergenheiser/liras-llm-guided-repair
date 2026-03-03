import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import os
import argparse
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
    df = pd.read_csv(csv_path)
    
    # Run-level: first iteration row
    run_df = (
        df.sort_values(["config_id", "run_id", "iteration"])
        .drop_duplicates(subset=["run_id"], keep="first")
        .copy()
    )
    
    run_df["success_bool"] = run_df["status"].astype(str).eq("success").astype(int)
    
    # Clean up Generative SP and Scenario for the axes
    run_df['gen_scenario_clean'] = run_df['scenario'].apply(lambda x: str(x).replace('.txt', '').replace('Scenario_', 'S'))
    run_df['gen_prompt_clean'] = run_df['system_prompt'].apply(lambda x: str(x).replace('.txt', ''))
    
    # Clean up Repair parameters for the legend
    run_df['model_clean'] = run_df['model'].str.replace('gemini-', '').str.replace('-preview', '')
    if "few_shots" not in run_df.columns:
        if "jshots" in run_df.columns:
            run_df["few_shots"] = run_df["jshots"].map({"yes": "Yes", "no": "No"}).fillna("No")
        elif "repair_shots" in run_df.columns:
            run_df["few_shots"] = run_df["repair_shots"].apply(
                lambda v: "Yes" if pd.to_numeric(v, errors="coerce") > 0 else "No"
            )
    else:
        run_df["few_shots"] = run_df["few_shots"].astype(str).str.strip()
        
    run_df['derived_initial_error_score'] = pd.to_numeric(run_df['derived_initial_error_score'], errors='coerce')
    
    return run_df

def main():
    parser = argparse.ArgumentParser(description='Analyze impact of features on scenarios and system prompts.')
    parser.add_argument('--input', type=str, default='Report/Histories/combined_run_histories.csv')
    parser.add_argument('--output_dir', type=str, default='Report/Figures-v2')
    args = parser.parse_args()

    os.makedirs(args.output_dir, exist_ok=True)
    
    try:
        run_df = load_and_prep_data(get_data_path(args))
    except FileNotFoundError as e:
        print(f"Error: {e}")
        return

    sns.set_theme(style="whitegrid")

    # =========================================================================
    # PLOT 1: Impact of Features to Each Scenario
    # =========================================================================
    print("Generating Feature Impact by Scenario...")
    plt.figure(figsize=(12, 6))
    g = sns.catplot(
        data=run_df, kind="bar", x="gen_scenario_clean", y="success_bool", 
        hue="model_clean", col="few_shots", height=5, aspect=1.2, palette="Blues"
    )
    g.set_axis_labels("Generative Scenario", "Success Rate")
    g.set_titles("Repair Few-Shots Context: {col_name}")
    g.fig.suptitle("Impact of Repair Features Across Different Generative Scenarios", y=1.05, fontsize=16)
    
    for ax in g.axes.flat:
        ax.set_ylim(0, 1.1)
        ax.yaxis.set_major_formatter(PercentFormatter(1.0))
        for p in ax.patches:
            height = p.get_height()
            if pd.notna(height) and height > 0:
                ax.annotate(f"{height:.0%}", (p.get_x() + p.get_width() / 2., height),
                            ha='center', va='bottom', fontsize=9, xytext=(0, 4), textcoords='offset points')
                            
    plt.savefig(os.path.join(args.output_dir, 'fig_sc1_feature_impact_by_scenario.png'), bbox_inches='tight', dpi=300)
    plt.close('all')

    # =========================================================================
    # PLOT 2: Impact of Features to Each System Prompt
    # =========================================================================
    print("Generating Feature Impact by Generative System Prompt...")
    plt.figure(figsize=(12, 6))
    g = sns.catplot(
        data=run_df, kind="bar", x="gen_prompt_clean", y="success_bool", 
        hue="model_clean", col="few_shots", height=5, aspect=1.2, palette="Oranges"
    )
    g.set_axis_labels("Generative System Prompt", "Success Rate")
    g.set_titles("Repair Few-Shots Context: {col_name}")
    g.fig.suptitle("Impact of Repair Features Across Different Generative System Prompts", y=1.05, fontsize=16)
    
    for ax in g.axes.flat:
        ax.set_ylim(0, 1.1)
        ax.yaxis.set_major_formatter(PercentFormatter(1.0))
        for p in ax.patches:
            height = p.get_height()
            if pd.notna(height) and height > 0:
                ax.annotate(f"{height:.0%}", (p.get_x() + p.get_width() / 2., height),
                            ha='center', va='bottom', fontsize=9, xytext=(0, 4), textcoords='offset points')
                            
    plt.savefig(os.path.join(args.output_dir, 'fig_sc2_feature_impact_by_gen_prompt.png'), bbox_inches='tight', dpi=300)
    plt.close('all')

    # =========================================================================
    # PLOT 3: The Proof - Error Score vs. Success Rate Correlation
    # =========================================================================
    print("Generating Initial Messiness vs Success Rate scatter plot...")
    
    # Group by the Generative configuration to get the baseline averages
    baseline_table = run_df.groupby(['gen_prompt_clean', 'gen_scenario_clean']).agg(
        Total_Runs=('success_bool', 'count'),
        Success_Rate=('success_bool', 'mean'),
        Avg_Initial_Error_Score=('derived_initial_error_score', 'mean')
    ).reset_index()

    plt.figure(figsize=(10, 6))
    sns.regplot(
        data=baseline_table, x="Avg_Initial_Error_Score", y="Success_Rate", 
        scatter_kws={'s': 80, 'alpha': 0.7, 'color': '#d62728'}, 
        line_kws={'color': '#1f77b4', 'linestyle': '--'}
    )
    
    # Annotate the points so we know which Scenario/Prompt combination failed the hardest
    for i, row in baseline_table.iterrows():
        plt.text(row['Avg_Initial_Error_Score'] + 20, row['Success_Rate'], 
                 f"{row['gen_scenario_clean']}-{row['gen_prompt_clean']}", 
                 fontsize=8, alpha=0.8)

    plt.title("Generative Quality vs. Repair Efficacy\n(Higher Initial Error Predicts Lower Repair Success)", fontsize=14, pad=15)
    plt.xlabel("Average Initial Error Score (Pre-Repair DSL Messiness)")
    plt.ylabel("Ultimate Success Rate")
    plt.gca().yaxis.set_major_formatter(PercentFormatter(1.0))
    plt.xlim(0, max(baseline_table['Avg_Initial_Error_Score']) * 1.15)
    plt.ylim(0, 1.05)
    
    plt.savefig(os.path.join(args.output_dir, 'fig_sc3_error_vs_success_correlation.png'), bbox_inches='tight', dpi=300)
    plt.close('all')
    
    print("\nDone! All files successfully saved to Report/Figures-v2/")

if __name__ == "__main__":
    main()