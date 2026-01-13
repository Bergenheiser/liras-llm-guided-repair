/*
 * generated  by Xtext 2.41.0
 */
grammar InternalLIRAs;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package it.polimi.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package it.polimi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.services.LIRAsGrammarAccess;

}

@parser::members {

 	private LIRAsGrammarAccess grammarAccess;

    public InternalLIRAsParser(TokenStream input, LIRAsGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected LIRAsGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_NL_0=RULE_NL
			{
				newLeafNode(this_NL_0, grammarAccess.getModelAccess().getNLTerminalRuleCall_0());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getPatternPatternParserRuleCall_1_0());
				}
				lv_pattern_1_0=rulePattern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"pattern",
						lv_pattern_1_0,
						"it.polimi.LIRAs.Pattern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_2_0());
				}
				lv_sequence_2_0=ruleSequence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"sequence",
						lv_sequence_2_0,
						"it.polimi.LIRAs.Sequence");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getConclusionConclusionParserRuleCall_3_0());
				}
				lv_conclusion_3_0=ruleConclusion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"conclusion",
						lv_conclusion_3_0,
						"it.polimi.LIRAs.Conclusion");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPatternRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			this_NL_1=RULE_NL
			{
				newLeafNode(this_NL_1, grammarAccess.getPatternAccess().getNLTerminalRuleCall_1());
			}
		)+
		(
			(
				otherlv_2='agents:'
				{
					newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0());
				}
				(
					this_NL_3=RULE_NL
					{
						newLeafNode(this_NL_3, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1());
					}
				)+
				(
					otherlv_4='Humans:'
					{
						newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0());
					}
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_0_0());
								}
								lv_human_5_0=ruleHuman
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getPatternRule());
									}
									add(
										$current,
										"human",
										lv_human_5_0,
										"it.polimi.LIRAs.Human");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_6=','
							{
								newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getCommaKeyword_2_0_2_1_1_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_1_1_0());
									}
									lv_human_7_0=ruleHuman
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPatternRule());
										}
										add(
											$current,
											"human",
											lv_human_7_0,
											"it.polimi.LIRAs.Human");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					(
						this_NL_8=RULE_NL
						{
							newLeafNode(this_NL_8, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2());
						}
					)+
				)?
				(
					otherlv_9='Robots:'
					{
						newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0());
					}
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_0_0());
								}
								lv_robot_10_0=ruleRobot
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getPatternRule());
									}
									add(
										$current,
										"robot",
										lv_robot_10_0,
										"it.polimi.LIRAs.Robot");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_11=','
							{
								newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getCommaKeyword_2_0_3_1_1_0());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_1_1_0());
									}
									lv_robot_12_0=ruleRobot
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getPatternRule());
										}
										add(
											$current,
											"robot",
											lv_robot_12_0,
											"it.polimi.LIRAs.Robot");
										afterParserOrEnumRuleCall();
									}
								)
							)
						)*
					)?
					(
						this_NL_13=RULE_NL
						{
							newLeafNode(this_NL_13, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2());
						}
					)+
				)?
			)
			    |
			(
				otherlv_14='locations:'
				{
					newLeafNode(otherlv_14, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_0_0());
							}
							lv_locations_15_0=ruleLocation
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getPatternRule());
								}
								add(
									$current,
									"locations",
									lv_locations_15_0,
									"it.polimi.LIRAs.Location");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_16=','
						{
							newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_1_1_0());
								}
								lv_locations_17_0=ruleLocation
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getPatternRule());
									}
									add(
										$current,
										"locations",
										lv_locations_17_0,
										"it.polimi.LIRAs.Location");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				(
					this_NL_18=RULE_NL
					{
						newLeafNode(this_NL_18, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2());
					}
				)+
			)
			    |
			(
				otherlv_19='resources:'
				{
					newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_0_0());
							}
							lv_resources_20_0=ruleResource
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getPatternRule());
								}
								add(
									$current,
									"resources",
									lv_resources_20_0,
									"it.polimi.LIRAs.Resource");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_21=','
						{
							newLeafNode(otherlv_21, grammarAccess.getPatternAccess().getCommaKeyword_2_2_1_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_1_1_0());
								}
								lv_resources_22_0=ruleResource
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getPatternRule());
									}
									add(
										$current,
										"resources",
										lv_resources_22_0,
										"it.polimi.LIRAs.Resource");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				(
					this_NL_23=RULE_NL
					{
						newLeafNode(this_NL_23, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2());
					}
				)+
			)
		)*
	)
;

// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	iv_ruleSequence=ruleSequence
	{ $current=$iv_ruleSequence.current; }
	EOF;

// Rule Sequence
ruleSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSequenceAccess().getAgentAgentParserRuleCall_0_0());
				}
				lv_agent_0_0=ruleAgent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSequenceRule());
					}
					set(
						$current,
						"agent",
						lv_agent_0_0,
						"it.polimi.LIRAs.Agent");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='default'
			{
				newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getDefaultKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSequenceAccess().getActionActionParserRuleCall_1_1_0());
					}
					lv_action_2_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSequenceRule());
						}
						set(
							$current,
							"action",
							lv_action_2_0,
							"it.polimi.LIRAs.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getColonKeyword_2());
		}
		(
			this_NL_4=RULE_NL
			{
				newLeafNode(this_NL_4, grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3());
			}
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getSequenceAccess().getSubSequenceSubSequenceParserRuleCall_4_0());
				}
				lv_subSequence_5_0=ruleSubSequence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSequenceRule());
					}
					add(
						$current,
						"subSequence",
						lv_subSequence_5_0,
						"it.polimi.LIRAs.SubSequence");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSubSequence
entryRuleSubSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubSequenceRule()); }
	iv_ruleSubSequence=ruleSubSequence
	{ $current=$iv_ruleSubSequence.current; }
	EOF;

// Rule SubSequence
ruleSubSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_i_0_0=RULE_INT
				{
					newLeafNode(lv_i_0_0, grammarAccess.getSubSequenceAccess().getIINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubSequenceRule());
					}
					setWithLastConsumed(
						$current,
						"i",
						lv_i_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_1='-'
			{
				newLeafNode(otherlv_1, grammarAccess.getSubSequenceAccess().getHyphenMinusKeyword_1_0());
			}
			(
				(
					lv_j_2_0=RULE_INT
					{
						newLeafNode(lv_j_2_0, grammarAccess.getSubSequenceAccess().getJINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSubSequenceRule());
						}
						setWithLastConsumed(
							$current,
							"j",
							lv_j_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getSubSequenceAccess().getColonKeyword_2());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSubSequenceAccess().getLoopLoopParserRuleCall_3_0_0_0());
						}
						lv_loop_4_0=ruleLoop
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSubSequenceRule());
							}
							add(
								$current,
								"loop",
								lv_loop_4_0,
								"it.polimi.LIRAs.Loop");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getSubSequenceAccess().getActionActionParserRuleCall_3_0_1_0_0());
							}
							lv_action_5_0=ruleAction
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSubSequenceRule());
								}
								add(
									$current,
									"action",
									lv_action_5_0,
									"it.polimi.LIRAs.Action");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						(
							{
								newCompositeNode(grammarAccess.getSubSequenceAccess().getConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0());
							}
							lv_conditionalStatement_6_0=ruleConditionalStatement
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getSubSequenceRule());
								}
								add(
									$current,
									"conditionalStatement",
									lv_conditionalStatement_6_0,
									"it.polimi.LIRAs.ConditionalStatement");
								afterParserOrEnumRuleCall();
							}
						)
					)?
				)
			)?
			this_NL_7=RULE_NL
			{
				newLeafNode(this_NL_7, grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1());
			}
		)+
	)
;

// Entry rule entryRuleConclusion
entryRuleConclusion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConclusionRule()); }
	iv_ruleConclusion=ruleConclusion
	{ $current=$iv_ruleConclusion.current; }
	EOF;

// Rule Conclusion
ruleConclusion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='success:'
		{
			newLeafNode(otherlv_0, grammarAccess.getConclusionAccess().getSuccessKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConclusionRule());
					}
					add(
						$current,
						"condition",
						lv_condition_1_0,
						"it.polimi.LIRAs.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_NL_2=RULE_NL
			{
				newLeafNode(this_NL_2, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_2());
			}
		)*
		otherlv_3='failure:'
		{
			newLeafNode(otherlv_3, grammarAccess.getConclusionAccess().getFailureKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_4_0());
				}
				lv_condition_4_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConclusionRule());
					}
					add(
						$current,
						"condition",
						lv_condition_4_0,
						"it.polimi.LIRAs.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_NL_5=RULE_NL
			{
				newLeafNode(this_NL_5, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_5());
			}
		)*
	)
;

// Entry rule entryRuleLoop
entryRuleLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopRule()); }
	iv_ruleLoop=ruleLoop
	{ $current=$iv_ruleLoop.current; }
	EOF;

// Rule Loop
ruleLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='skip'
			{
				newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getSkipKeyword_0_0());
			}
			(
				otherlv_1='all'
				{
					newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getAllKeyword_0_1());
				}
			)?
			otherlv_2='if'
			{
				newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getIfKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_0_3_0());
					}
					lv_condition_3_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLoopRule());
						}
						set(
							$current,
							"condition",
							lv_condition_3_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_4='restart'
			{
				newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getRestartKeyword_1_0());
			}
			(
				otherlv_5='all'
				{
					newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getAllKeyword_1_1());
				}
			)?
			otherlv_6='if'
			{
				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getIfKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_1_3_0());
					}
					lv_condition_7_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLoopRule());
						}
						set(
							$current,
							"condition",
							lv_condition_7_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleConditionalStatement
entryRuleConditionalStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalStatementRule()); }
	iv_ruleConditionalStatement=ruleConditionalStatement
	{ $current=$iv_ruleConditionalStatement.current; }
	EOF;

// Rule ConditionalStatement
ruleConditionalStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='until'
			{
				newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getUntilKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_0_1_0());
					}
					lv_condition_1_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						add(
							$current,
							"condition",
							lv_condition_1_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='if'
			{
				newLeafNode(otherlv_2, grammarAccess.getConditionalStatementAccess().getIfKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_1_0());
					}
					lv_condition_3_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						add(
							$current,
							"condition",
							lv_condition_3_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4='else'
			{
				newLeafNode(otherlv_4, grammarAccess.getConditionalStatementAccess().getElseKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_1_3_0());
					}
					lv_action_5_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						set(
							$current,
							"action",
							lv_action_5_0,
							"it.polimi.LIRAs.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='if'
			{
				newLeafNode(otherlv_6, grammarAccess.getConditionalStatementAccess().getIfKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_1_0());
					}
					lv_condition_7_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						add(
							$current,
							"condition",
							lv_condition_7_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_8='else'
			{
				newLeafNode(otherlv_8, grammarAccess.getConditionalStatementAccess().getElseKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_2_3_0());
					}
					lv_action_9_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						set(
							$current,
							"action",
							lv_action_9_0,
							"it.polimi.LIRAs.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10='until'
			{
				newLeafNode(otherlv_10, grammarAccess.getConditionalStatementAccess().getUntilKeyword_2_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_5_0());
					}
					lv_condition_11_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
						}
						add(
							$current,
							"condition",
							lv_condition_11_0,
							"it.polimi.LIRAs.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='wait'
			{
				newLeafNode(otherlv_12, grammarAccess.getConditionalStatementAccess().getWaitKeyword_3_0());
			}
			(
				(
					lv_n_13_0=RULE_INT
					{
						newLeafNode(lv_n_13_0, grammarAccess.getConditionalStatementAccess().getNINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConditionalStatementRule());
						}
						setWithLastConsumed(
							$current,
							"n",
							lv_n_13_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionAccess().getActionAction_0(),
					$current);
			}
		)
		(
			otherlv_1='stop'
			{
				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getStopKeyword_1_0());
			}
			    |
			(
				otherlv_2='moveTo'
				{
					newLeafNode(otherlv_2, grammarAccess.getActionAccess().getMoveToKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_1_1_0());
						}
						lv_target_3_0=ruleTarget
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActionRule());
							}
							set(
								$current,
								"target",
								lv_target_3_0,
								"it.polimi.LIRAs.Target");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0);
						}
									({true}?=>(otherlv_5='fetch'
									{
										newLeafNode(otherlv_5, grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0());
									}
									    |
									otherlv_6='deliver'
									{
										newLeafNode(otherlv_6, grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1());
									}
									    |
									otherlv_7='leave'
									{
										newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1);
						}
									({true}?=>((
										{
											newCompositeNode(grammarAccess.getActionAccess().getResourceResourceParserRuleCall_1_2_1_0());
										}
										lv_resource_8_0=ruleResource
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getActionRule());
											}
											set(
												$current,
												"resource",
												lv_resource_8_0,
												"it.polimi.LIRAs.Resource");
											afterParserOrEnumRuleCall();
										}
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getActionAccess().getUnorderedGroup_1_2())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
					}
			)
			    |
			(
				otherlv_9='follow'
				{
					newLeafNode(otherlv_9, grammarAccess.getActionAccess().getFollowKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_3_1_0());
						}
						lv_agent_10_0=ruleAgent
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActionRule());
							}
							set(
								$current,
								"agent",
								lv_agent_10_0,
								"it.polimi.LIRAs.Agent");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_11='('
					{
						newLeafNode(otherlv_11, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_3_2_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_3_2_1_0());
							}
							lv_target_12_0=ruleTarget
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getActionRule());
								}
								set(
									$current,
									"target",
									lv_target_12_0,
									"it.polimi.LIRAs.Target");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_13=')'
					{
						newLeafNode(otherlv_13, grammarAccess.getActionAccess().getRightParenthesisKeyword_1_3_2_2());
					}
				)?
			)
			    |
			(
				otherlv_14='receiveFrom'
				{
					newLeafNode(otherlv_14, grammarAccess.getActionAccess().getReceiveFromKeyword_1_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_4_1_0());
						}
						lv_agent_15_0=ruleAgent
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getActionRule());
							}
							set(
								$current,
								"agent",
								lv_agent_15_0,
								"it.polimi.LIRAs.Agent");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_0_0());
					}
					lv_atomicPredicate_0_0=ruleAtomicPredicate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRule());
						}
						add(
							$current,
							"atomicPredicate",
							lv_atomicPredicate_0_0,
							"it.polimi.LIRAs.AtomicPredicate");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_1='!'
				{
					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getExclamationMarkKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0());
						}
						lv_atomicPredicate_2_0=ruleAtomicPredicate
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConditionRule());
							}
							add(
								$current,
								"atomicPredicate",
								lv_atomicPredicate_2_0,
								"it.polimi.LIRAs.AtomicPredicate");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		(
			(
				otherlv_3='&&'
				{
					newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_1_0_0());
				}
				    |
				otherlv_4='||'
				{
					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getVerticalLineVerticalLineKeyword_1_0_1());
				}
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0());
						}
						lv_atomicPredicate_5_0=ruleAtomicPredicate
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getConditionRule());
							}
							add(
								$current,
								"atomicPredicate",
								lv_atomicPredicate_5_0,
								"it.polimi.LIRAs.AtomicPredicate");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_6='!'
					{
						newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getExclamationMarkKeyword_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0());
							}
							lv_atomicPredicate_7_0=ruleAtomicPredicate
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getConditionRule());
								}
								add(
									$current,
									"atomicPredicate",
									lv_atomicPredicate_7_0,
									"it.polimi.LIRAs.AtomicPredicate");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAtomicPredicate
entryRuleAtomicPredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicPredicateRule()); }
	iv_ruleAtomicPredicate=ruleAtomicPredicate
	{ $current=$iv_ruleAtomicPredicate.current; }
	EOF;

// Rule AtomicPredicate
ruleAtomicPredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicPredicateAccess().getAtomicPredicateAction_0_0(),
						$current);
				}
			)
			otherlv_1='tired'
			{
				newLeafNode(otherlv_1, grammarAccess.getAtomicPredicateAccess().getTiredKeyword_0_1());
			}
		)
		    |
		(
			otherlv_2='time'
			{
				newLeafNode(otherlv_2, grammarAccess.getAtomicPredicateAccess().getTimeKeyword_1_0());
			}
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					lv_n_4_0=RULE_INT
					{
						newLeafNode(lv_n_4_0, grammarAccess.getAtomicPredicateAccess().getNINTTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicPredicateRule());
						}
						setWithLastConsumed(
							$current,
							"n",
							lv_n_4_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_1_3());
			}
		)
		    |
		(
			otherlv_6='position'
			{
				newLeafNode(otherlv_6, grammarAccess.getAtomicPredicateAccess().getPositionKeyword_2_0());
			}
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_2_2_0());
					}
					lv_agent_8_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"agent",
							lv_agent_8_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=','
			{
				newLeafNode(otherlv_9, grammarAccess.getAtomicPredicateAccess().getCommaKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getLocationLocationParserRuleCall_2_4_0());
					}
					lv_location_10_0=ruleLocation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"location",
							lv_location_10_0,
							"it.polimi.LIRAs.Location");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11=')'
			{
				newLeafNode(otherlv_11, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_2_5());
			}
		)
		    |
		(
			otherlv_12='possess'
			{
				newLeafNode(otherlv_12, grammarAccess.getAtomicPredicateAccess().getPossessKeyword_3_0());
			}
			otherlv_13='('
			{
				newLeafNode(otherlv_13, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_3_2_0());
					}
					lv_agent_14_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"agent",
							lv_agent_14_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_15=','
			{
				newLeafNode(otherlv_15, grammarAccess.getAtomicPredicateAccess().getCommaKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getResourceResourceParserRuleCall_3_4_0());
					}
					lv_resource_16_0=ruleResource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"resource",
							lv_resource_16_0,
							"it.polimi.LIRAs.Resource");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=')'
			{
				newLeafNode(otherlv_17, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_3_5());
			}
		)
		    |
		(
			otherlv_18='busy'
			{
				newLeafNode(otherlv_18, grammarAccess.getAtomicPredicateAccess().getBusyKeyword_4_0());
			}
			otherlv_19='('
			{
				newLeafNode(otherlv_19, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_4_2_0());
					}
					lv_agent_20_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"agent",
							lv_agent_20_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=')'
			{
				newLeafNode(otherlv_21, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_4_3());
			}
		)
		    |
		(
			otherlv_22='still'
			{
				newLeafNode(otherlv_22, grammarAccess.getAtomicPredicateAccess().getStillKeyword_5_0());
			}
			otherlv_23='('
			{
				newLeafNode(otherlv_23, grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_5_2_0());
					}
					lv_agent_24_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
						}
						set(
							$current,
							"agent",
							lv_agent_24_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=')'
			{
				newLeafNode(otherlv_25, grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_5_3());
			}
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getAtomicPredicateAccess().getRelationRelationParserRuleCall_6_0());
				}
				lv_relation_26_0=ruleRelation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtomicPredicateRule());
					}
					set(
						$current,
						"relation",
						lv_relation_26_0,
						"it.polimi.LIRAs.Relation");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='dist'
			{
				newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getDistKeyword_0_0());
			}
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_2_0());
					}
					lv_agent_2_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationRule());
						}
						add(
							$current,
							"agent",
							lv_agent_2_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getCommaKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_4_0());
					}
					lv_agent_4_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationRule());
						}
						add(
							$current,
							"agent",
							lv_agent_4_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightParenthesisKeyword_0_5());
			}
			(
				otherlv_6='>'
				{
					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_0_6_0());
				}
				    |
				otherlv_7='<'
				{
					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getLessThanSignKeyword_0_6_1());
				}
				    |
				otherlv_8='>='
				{
					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_0_6_2());
				}
				    |
				otherlv_9='<='
				{
					newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_0_6_3());
				}
				    |
				otherlv_10='=='
				{
					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_0_6_4());
				}
				    |
				otherlv_11='!='
				{
					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_0_6_5());
				}
			)
			(
				(
					lv_th_12_0=RULE_INT
					{
						newLeafNode(lv_th_12_0, grammarAccess.getRelationAccess().getThINTTerminalRuleCall_0_7_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed(
							$current,
							"th",
							lv_th_12_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			otherlv_13='soc'
			{
				newLeafNode(otherlv_13, grammarAccess.getRelationAccess().getSocKeyword_1_0());
			}
			otherlv_14='('
			{
				newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_1_2_0());
					}
					lv_agent_15_0=ruleAgent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRelationRule());
						}
						add(
							$current,
							"agent",
							lv_agent_15_0,
							"it.polimi.LIRAs.Agent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_16=')'
			{
				newLeafNode(otherlv_16, grammarAccess.getRelationAccess().getRightParenthesisKeyword_1_3());
			}
			(
				otherlv_17='>'
				{
					newLeafNode(otherlv_17, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_4_0());
				}
				    |
				otherlv_18='<'
				{
					newLeafNode(otherlv_18, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_4_1());
				}
				    |
				otherlv_19='>='
				{
					newLeafNode(otherlv_19, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_4_2());
				}
				    |
				otherlv_20='<='
				{
					newLeafNode(otherlv_20, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_4_3());
				}
				    |
				otherlv_21='=='
				{
					newLeafNode(otherlv_21, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_4_4());
				}
				    |
				otherlv_22='!='
				{
					newLeafNode(otherlv_22, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_4_5());
				}
			)
			(
				(
					lv_th_23_0=RULE_INT
					{
						newLeafNode(lv_th_23_0, grammarAccess.getRelationAccess().getThINTTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRelationRule());
						}
						setWithLastConsumed(
							$current,
							"th",
							lv_th_23_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTarget
entryRuleTarget returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTargetRule()); }
	iv_ruleTarget=ruleTarget
	{ $current=$iv_ruleTarget.current; }
	EOF;

// Rule Target
ruleTarget returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTargetRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	iv_ruleAgent=ruleAgent
	{ $current=$iv_ruleAgent.current; }
	EOF;

// Rule Agent
ruleAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAgentRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleHuman
entryRuleHuman returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHumanRule()); }
	iv_ruleHuman=ruleHuman
	{ $current=$iv_ruleHuman.current; }
	EOF;

// Rule Human
ruleHuman returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getHumanRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleRobot
entryRuleRobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_ruleRobot=ruleRobot
	{ $current=$iv_ruleRobot.current; }
	EOF;

// Rule Robot
ruleRobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRobotRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_ruleLocation=ruleLocation
	{ $current=$iv_ruleLocation.current; }
	EOF;

// Rule Location
ruleLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLocationRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleResource
entryRuleResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResourceRule()); }
	iv_ruleResource=ruleResource
	{ $current=$iv_ruleResource.current; }
	EOF;

// Rule Resource
ruleResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getResourceRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_NL : (' '* '\r'? '\n' '\t'*)+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
