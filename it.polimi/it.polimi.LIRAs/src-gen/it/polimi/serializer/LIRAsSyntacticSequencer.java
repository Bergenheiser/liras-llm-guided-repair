/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.serializer;

import com.google.inject.Inject;
import it.polimi.services.LIRAsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LIRAsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LIRAsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Action_StopKeyword_1_0_or___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__p;
	protected AbstractElementAlias match_Action___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__a;
	protected AbstractElementAlias match_Conclusion_NLTerminalRuleCall_2_a;
	protected AbstractElementAlias match_Conclusion_NLTerminalRuleCall_5_a;
	protected AbstractElementAlias match_Condition_AmpersandAmpersandKeyword_1_0_0_or_VerticalLineVerticalLineKeyword_1_0_1;
	protected AbstractElementAlias match_Loop_AllKeyword_0_1_q;
	protected AbstractElementAlias match_Loop_AllKeyword_1_1_q;
	protected AbstractElementAlias match_Model_NLTerminalRuleCall_0_a;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_1_p;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_2_0_1_p;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_2_0_2_2_p;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_2_0_3_2_p;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_2_1_2_p;
	protected AbstractElementAlias match_Pattern_NLTerminalRuleCall_2_2_2_p;
	protected AbstractElementAlias match_Pattern_RobotRobotParserRuleCall_2_0_3_1_0_0;
	protected AbstractElementAlias match_Pattern_RobotRobotParserRuleCall_2_0_3_1_1_1_0;
	protected AbstractElementAlias match_Pattern_RobotsKeyword_2_0_3_0_or_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p__a___RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0______;
	protected AbstractElementAlias match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a__a;
	protected AbstractElementAlias match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a;
	protected AbstractElementAlias match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a;
	protected AbstractElementAlias match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a;
	protected AbstractElementAlias match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_0_2_2_p_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__p_HumansKeyword_2_0_2_0__p;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__a;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__p;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__a;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__p;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__a;
	protected AbstractElementAlias match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__p;
	protected AbstractElementAlias match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a;
	protected AbstractElementAlias match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a;
	protected AbstractElementAlias match_Pattern___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q;
	protected AbstractElementAlias match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p;
	protected AbstractElementAlias match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p;
	protected AbstractElementAlias match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a;
	protected AbstractElementAlias match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a;
	protected AbstractElementAlias match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a;
	protected AbstractElementAlias match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a;
	protected AbstractElementAlias match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p;
	protected AbstractElementAlias match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p;
	protected AbstractElementAlias match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p;
	protected AbstractElementAlias match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p;
	protected AbstractElementAlias match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p;
	protected AbstractElementAlias match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p;
	protected AbstractElementAlias match_Pattern_____RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0_____NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p__a;
	protected AbstractElementAlias match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p;
	protected AbstractElementAlias match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p;
	protected AbstractElementAlias match_Relation_EqualsSignEqualsSignKeyword_0_6_4_or_ExclamationMarkEqualsSignKeyword_0_6_5_or_GreaterThanSignEqualsSignKeyword_0_6_2_or_GreaterThanSignKeyword_0_6_0_or_LessThanSignEqualsSignKeyword_0_6_3_or_LessThanSignKeyword_0_6_1;
	protected AbstractElementAlias match_Relation_EqualsSignEqualsSignKeyword_1_4_4_or_ExclamationMarkEqualsSignKeyword_1_4_5_or_GreaterThanSignEqualsSignKeyword_1_4_2_or_GreaterThanSignKeyword_1_4_0_or_LessThanSignEqualsSignKeyword_1_4_3_or_LessThanSignKeyword_1_4_1;
	protected AbstractElementAlias match_Sequence_NLTerminalRuleCall_3_p;
	protected AbstractElementAlias match_SubSequence_NLTerminalRuleCall_3_1_a;
	protected AbstractElementAlias match_SubSequence_NLTerminalRuleCall_3_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LIRAsGrammarAccess) access;
		match_Action_StopKeyword_1_0_or___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__p = new AlternativeAlias(false, false, new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1()), new TokenAlias(false, false, grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0()), new TokenAlias(false, false, grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2())), new TokenAlias(false, false, grammarAccess.getActionAccess().getStopKeyword_1_0()));
		match_Action___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1()), new TokenAlias(false, false, grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0()), new TokenAlias(false, false, grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2()));
		match_Conclusion_NLTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_2());
		match_Conclusion_NLTerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getConclusionAccess().getNLTerminalRuleCall_5());
		match_Condition_AmpersandAmpersandKeyword_1_0_0_or_VerticalLineVerticalLineKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getVerticalLineVerticalLineKeyword_1_0_1()));
		match_Loop_AllKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLoopAccess().getAllKeyword_0_1());
		match_Loop_AllKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getLoopAccess().getAllKeyword_1_1());
		match_Model_NLTerminalRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getModelAccess().getNLTerminalRuleCall_0());
		match_Pattern_NLTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_1());
		match_Pattern_NLTerminalRuleCall_2_0_1_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1());
		match_Pattern_NLTerminalRuleCall_2_0_2_2_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2());
		match_Pattern_NLTerminalRuleCall_2_0_3_2_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2());
		match_Pattern_NLTerminalRuleCall_2_1_2_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2());
		match_Pattern_NLTerminalRuleCall_2_2_2_p = new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2());
		match_Pattern_RobotRobotParserRuleCall_2_0_3_1_0_0 = new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_0_0());
		match_Pattern_RobotRobotParserRuleCall_2_0_3_1_1_1_0 = new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_1_1_0());
		match_Pattern_RobotsKeyword_2_0_3_0_or_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p__a___RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0______ = new AlternativeAlias(false, false, new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0())), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()));
		match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))));
		match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))));
		match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()))));
		match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))));
		match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))));
		match_Pattern___NLTerminalRuleCall_2_0_2_2_p_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__p_HumansKeyword_2_0_2_0__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1())), new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()));
		match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__a = new GroupAlias(true, true, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()), new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()));
		match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()), new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()));
		match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__a = new GroupAlias(true, true, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()));
		match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()));
		match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__a = new GroupAlias(true, true, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()));
		match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()));
		match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()))));
		match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())))));
		match_Pattern___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()));
		match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())));
		match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())));
		match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a = new GroupAlias(true, true, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()));
		match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a = new GroupAlias(true, true, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()));
		match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a = new GroupAlias(true, true, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2())), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()));
		match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())));
		match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))));
		match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()))));
		match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())));
		match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))));
		match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()))));
		match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())));
		match_Pattern_____RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0_____NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0())), new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0())), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()), new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()))));
		match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())));
		match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p = new GroupAlias(true, false, new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()))), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()), new TokenAlias(true, false, grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()))));
		match_Relation_EqualsSignEqualsSignKeyword_0_6_4_or_ExclamationMarkEqualsSignKeyword_0_6_5_or_GreaterThanSignEqualsSignKeyword_0_6_2_or_GreaterThanSignKeyword_0_6_0_or_LessThanSignEqualsSignKeyword_0_6_3_or_LessThanSignKeyword_0_6_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_0_6_4()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_0_6_5()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_0_6_2()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_0_6_0()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_0_6_3()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getLessThanSignKeyword_0_6_1()));
		match_Relation_EqualsSignEqualsSignKeyword_1_4_4_or_ExclamationMarkEqualsSignKeyword_1_4_5_or_GreaterThanSignEqualsSignKeyword_1_4_2_or_GreaterThanSignKeyword_1_4_0_or_LessThanSignEqualsSignKeyword_1_4_3_or_LessThanSignKeyword_1_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_4_4()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_4_5()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_4_2()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_4_0()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_4_3()), new TokenAlias(false, false, grammarAccess.getRelationAccess().getLessThanSignKeyword_1_4_1()));
		match_Sequence_NLTerminalRuleCall_3_p = new TokenAlias(true, false, grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3());
		match_SubSequence_NLTerminalRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1());
		match_SubSequence_NLTerminalRuleCall_3_1_p = new TokenAlias(true, false, grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NL:
	 * 	(' '* '\r'? '\n' '\t'*)+
	 * ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Action_StopKeyword_1_0_or___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__p.equals(syntax))
				emit_Action_StopKeyword_1_0_or___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Action___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__a.equals(syntax))
				emit_Action___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Conclusion_NLTerminalRuleCall_2_a.equals(syntax))
				emit_Conclusion_NLTerminalRuleCall_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Conclusion_NLTerminalRuleCall_5_a.equals(syntax))
				emit_Conclusion_NLTerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_AmpersandAmpersandKeyword_1_0_0_or_VerticalLineVerticalLineKeyword_1_0_1.equals(syntax))
				emit_Condition_AmpersandAmpersandKeyword_1_0_0_or_VerticalLineVerticalLineKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Loop_AllKeyword_0_1_q.equals(syntax))
				emit_Loop_AllKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Loop_AllKeyword_1_1_q.equals(syntax))
				emit_Loop_AllKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Model_NLTerminalRuleCall_0_a.equals(syntax))
				emit_Model_NLTerminalRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_1_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_2_0_1_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_2_0_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_2_0_2_2_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_2_0_2_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_2_0_3_2_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_2_0_3_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_2_1_2_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_2_1_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_NLTerminalRuleCall_2_2_2_p.equals(syntax))
				emit_Pattern_NLTerminalRuleCall_2_2_2_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_RobotRobotParserRuleCall_2_0_3_1_0_0.equals(syntax))
				emit_Pattern_RobotRobotParserRuleCall_2_0_3_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_RobotRobotParserRuleCall_2_0_3_1_1_1_0.equals(syntax))
				emit_Pattern_RobotRobotParserRuleCall_2_0_3_1_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_RobotsKeyword_2_0_3_0_or_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p__a___RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0______.equals(syntax))
				emit_Pattern_RobotsKeyword_2_0_3_0_or_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p__a___RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0______(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a__a.equals(syntax))
				emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a.equals(syntax))
				emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a.equals(syntax))
				emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a.equals(syntax))
				emit_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a.equals(syntax))
				emit_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_0_2_2_p_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__p_HumansKeyword_2_0_2_0__p.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_0_2_2_p_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__p_HumansKeyword_2_0_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__a.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__p.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__a.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__p.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__a.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__p.equals(syntax))
				emit_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a.equals(syntax))
				emit_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a.equals(syntax))
				emit_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q.equals(syntax))
				emit_Pattern___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p.equals(syntax))
				emit_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p.equals(syntax))
				emit_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a.equals(syntax))
				emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a.equals(syntax))
				emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a.equals(syntax))
				emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a.equals(syntax))
				emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p.equals(syntax))
				emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p.equals(syntax))
				emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p.equals(syntax))
				emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p.equals(syntax))
				emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p.equals(syntax))
				emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p.equals(syntax))
				emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_____RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0_____NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p__a.equals(syntax))
				emit_Pattern_____RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0_____NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p.equals(syntax))
				emit_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p.equals(syntax))
				emit_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relation_EqualsSignEqualsSignKeyword_0_6_4_or_ExclamationMarkEqualsSignKeyword_0_6_5_or_GreaterThanSignEqualsSignKeyword_0_6_2_or_GreaterThanSignKeyword_0_6_0_or_LessThanSignEqualsSignKeyword_0_6_3_or_LessThanSignKeyword_0_6_1.equals(syntax))
				emit_Relation_EqualsSignEqualsSignKeyword_0_6_4_or_ExclamationMarkEqualsSignKeyword_0_6_5_or_GreaterThanSignEqualsSignKeyword_0_6_2_or_GreaterThanSignKeyword_0_6_0_or_LessThanSignEqualsSignKeyword_0_6_3_or_LessThanSignKeyword_0_6_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Relation_EqualsSignEqualsSignKeyword_1_4_4_or_ExclamationMarkEqualsSignKeyword_1_4_5_or_GreaterThanSignEqualsSignKeyword_1_4_2_or_GreaterThanSignKeyword_1_4_0_or_LessThanSignEqualsSignKeyword_1_4_3_or_LessThanSignKeyword_1_4_1.equals(syntax))
				emit_Relation_EqualsSignEqualsSignKeyword_1_4_4_or_ExclamationMarkEqualsSignKeyword_1_4_5_or_GreaterThanSignEqualsSignKeyword_1_4_2_or_GreaterThanSignKeyword_1_4_0_or_LessThanSignEqualsSignKeyword_1_4_3_or_LessThanSignKeyword_1_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Sequence_NLTerminalRuleCall_3_p.equals(syntax))
				emit_Sequence_NLTerminalRuleCall_3_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SubSequence_NLTerminalRuleCall_3_1_a.equals(syntax))
				emit_SubSequence_NLTerminalRuleCall_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SubSequence_NLTerminalRuleCall_3_1_p.equals(syntax))
				emit_SubSequence_NLTerminalRuleCall_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'stop' | ('fetch' | 'deliver' | 'leave')+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Action_StopKeyword_1_0_or___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('fetch' | 'deliver' | 'leave')*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) resource=Resource
	 *     resource=Resource (ambiguity) (rule end)
	 *     resource=Resource (ambiguity) resource=Resource
	 
	 * </pre>
	 */
	protected void emit_Action___DeliverKeyword_1_2_0_1_or_FetchKeyword_1_2_0_0_or_LeaveKeyword_1_2_0_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL*
	 *
	 * This ambiguous syntax occurs at:
	 *     condition+=Condition (ambiguity) 'failure:' condition+=Condition
	 
	 * </pre>
	 */
	protected void emit_Conclusion_NLTerminalRuleCall_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL*
	 *
	 * This ambiguous syntax occurs at:
	 *     condition+=Condition (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Conclusion_NLTerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '&&' | '||'
	 *
	 * This ambiguous syntax occurs at:
	 *     atomicPredicate+=AtomicPredicate (ambiguity) '!' atomicPredicate+=AtomicPredicate
	 *     atomicPredicate+=AtomicPredicate (ambiguity) atomicPredicate+=AtomicPredicate
	 
	 * </pre>
	 */
	protected void emit_Condition_AmpersandAmpersandKeyword_1_0_0_or_VerticalLineVerticalLineKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'all'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'skip' (ambiguity) 'if' condition=Condition
	 
	 * </pre>
	 */
	protected void emit_Loop_AllKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'all'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'restart' (ambiguity) 'if' condition=Condition
	 
	 * </pre>
	 */
	protected void emit_Loop_AllKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) pattern=Pattern
	 
	 * </pre>
	 */
	protected void emit_Model_NLTerminalRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=ID 
	 *         (ambiguity) 
	 *         (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 
	 *         'resources:' 
	 *         (NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'resources:')* 
	 *         resources+=Resource
	 *     )
	 *     (
	 *         name=ID 
	 *         (ambiguity) 
	 *         (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 
	 *         'locations:' 
	 *         (NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'locations:')* 
	 *         locations+=Location
	 *     )
	 *     (
	 *         name=ID 
	 *         (ambiguity) 
	 *         ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 
	 *         'Robots:' 
	 *         (NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 'Robots:')* 
	 *         robot+=Robot
	 *     )
	 *     name=ID (ambiguity) (('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+)* 'Humans:' human+=Human
	 *     name=ID (ambiguity) ((('locations:' NL+) | ('resources:' NL+))? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         locations+=Location 
	 *         NL+ 
	 *         (('resources:' NL+)? ('locations:' NL+)?)+ 
	 *         'agents:' 
	 *         (ambiguity) 
	 *         (('Humans:' NL+)? ('Robots:' NL+)? (('resources:' NL+)? ('locations:' NL+)?)+ 'agents:' (ambiguity))* 
	 *         'Humans:' 
	 *         human+=Human
	 *     )
	 *     (
	 *         resources+=Resource 
	 *         NL+ 
	 *         (('locations:' NL+)? ('resources:' NL+)?)+ 
	 *         'agents:' 
	 *         (ambiguity) 
	 *         (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+)? ('resources:' NL+)?)+ 'agents:' (ambiguity))* 
	 *         'Humans:' 
	 *         human+=Human
	 *     )
	 *     name=ID NL+ (('locations:' NL+) | ('resources:' NL+))* 'agents:' (ambiguity) (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* 'agents:' (ambiguity))* 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_2_0_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         human+=Human 
	 *         (ambiguity) 
	 *         (
	 *             'Robots:' | 
	 *             (
	 *                 ('Robots:' NL+)? 
	 *                 ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Robots:' NL+)?)+ 
	 *                 ('Humans:' (ambiguity) ('Robots:' NL+)? ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Robots:' NL+)?)+)* 
	 *                 (('Humans:' (ambiguity) 'Robots:') | 'Robots:')
	 *             )
	 *         ) 
	 *         robot+=Robot
	 *     )
	 *     (
	 *         human+=Human 
	 *         (ambiguity) 
	 *         ('Robots:' NL+)? 
	 *         (('locations:' NL+)? ('resources:' NL+)?)+ 
	 *         ('agents:' NL+ ('Humans:' (ambiguity))? ('Robots:' NL+)? (('locations:' NL+)? ('resources:' NL+)?)+)* 
	 *         'resources:' 
	 *         resources+=Resource
	 *     )
	 *     (
	 *         human+=Human 
	 *         (ambiguity) 
	 *         ('Robots:' NL+)? 
	 *         (('resources:' NL+)? ('locations:' NL+)?)+ 
	 *         ('agents:' NL+ ('Humans:' (ambiguity))? ('Robots:' NL+)? (('resources:' NL+)? ('locations:' NL+)?)+)* 
	 *         'locations:' 
	 *         locations+=Location
	 *     )
	 *     human+=Human (ambiguity) ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* ('agents:' NL+ ('Humans:' (ambiguity))? ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))*)* (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_2_0_2_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         robot+=Robot 
	 *         (ambiguity) 
	 *         ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 
	 *         ((('Humans:' NL+ 'Robots:') | 'Robots:') (ambiguity) ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+)* 
	 *         'Humans:' 
	 *         human+=Human
	 *     )
	 *     robot+=Robot (ambiguity) (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)?)?)+ 'resources:'
	 *     robot+=Robot (ambiguity) (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)?)?)+ 'locations:'
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_2_0_3_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         locations+=Location 
	 *         (ambiguity) 
	 *         (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('resources:' NL+)?)+ 
	 *         ('locations:' (ambiguity) (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('resources:' NL+)?)+)* 
	 *         'resources:' 
	 *         resources+=Resource
	 *     )
	 *     (
	 *         locations+=Location 
	 *         (ambiguity) 
	 *         (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 
	 *         ('locations:' (ambiguity) (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+)* 
	 *         (rule end)
	 *     )
	 *     (
	 *         locations+=Location 
	 *         (ambiguity) 
	 *         (('resources:' NL+)? ('locations:' (ambiguity))?)+ 
	 *         'agents:' 
	 *         NL+ 
	 *         (('Humans:' NL+)? ('Robots:' NL+)? (('resources:' NL+)? ('locations:' (ambiguity))?)+ 'agents:' NL+)* 
	 *         'Humans:' 
	 *         human+=Human
	 *     )
	 *     locations+=Location (ambiguity)
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_2_1_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         resources+=Resource 
	 *         (ambiguity) 
	 *         (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('locations:' NL+)?)+ 
	 *         ('resources:' (ambiguity) (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('locations:' NL+)?)+)* 
	 *         'locations:' 
	 *         locations+=Location
	 *     )
	 *     (
	 *         resources+=Resource 
	 *         (ambiguity) 
	 *         (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 
	 *         ('resources:' (ambiguity) (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+)* 
	 *         (rule end)
	 *     )
	 *     (
	 *         resources+=Resource 
	 *         (ambiguity) 
	 *         (('locations:' NL+)? ('resources:' (ambiguity))?)+ 
	 *         'agents:' 
	 *         NL+ 
	 *         (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+)? ('resources:' (ambiguity))?)+ 'agents:' NL+)* 
	 *         'Humans:' 
	 *         human+=Human
	 *     )
	 *     resources+=Resource (ambiguity)
	 
	 * </pre>
	 */
	protected void emit_Pattern_NLTerminalRuleCall_2_2_2_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     robot+=Robot
	 *
	 * This ambiguous syntax occurs at:
	 *     (ambiguity)
	 
	 * </pre>
	 */
	protected void emit_Pattern_RobotRobotParserRuleCall_2_0_3_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     robot+=Robot
	 *
	 * This ambiguous syntax occurs at:
	 *     (ambiguity)
	 
	 * </pre>
	 */
	protected void emit_Pattern_RobotRobotParserRuleCall_2_0_3_1_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         'Robots:' | 
	  *         (
	  *             ('Robots:' NL+)? 
	  *             ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Robots:' NL+)?)+ 
	  *             ('Humans:' NL+ ('Robots:' NL+)? ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Robots:' NL+)?)+)* 
	  *             (('Humans:' NL+ 'Robots:') | 'Robots:')
	  *         )
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ (ambiguity) robot+=Robot
	 
	 * </pre>
	 */
	protected void emit_Pattern_RobotsKeyword_2_0_3_0_or_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__p__a___RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0______(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))*)*
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+)? ('resources:' NL+)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (('locations:' NL+)? ('resources:' NL+)?)+ (ambiguity) 'resources:' resources+=Resource
	 
	 * </pre>
	 */
	protected void emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (('resources:' NL+)? ('locations:' NL+)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (('resources:' NL+)? ('locations:' NL+)?)+ (ambiguity) 'locations:' locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('locations:' NL+ (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('resources:' NL+)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location NL+ (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('resources:' NL+)?)+ (ambiguity) 'resources:' resources+=Resource
	 
	 * </pre>
	 */
	protected void emit_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('locations:' NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ (('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+)+ 'Humans:')+
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human (ambiguity) human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_0_2_2_p_____RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__p_HumansKeyword_2_0_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 'Robots:')*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 'Robots:' (ambiguity) robot+=Robot
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ 'Robots:')+
	 *
	 * This ambiguous syntax occurs at:
	 *     robot+=Robot (ambiguity) robot+=Robot
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p_RobotsKeyword_2_0_3_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'locations:')*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'locations:' (ambiguity) locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'locations:')+
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location (ambiguity) locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_1_2_p_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_LocationsKeyword_2_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'resources:')*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'resources:' (ambiguity) resources+=Resource
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ 'resources:')+
	 *
	 * This ambiguous syntax occurs at:
	 *     resources+=Resource (ambiguity) resources+=Resource
	 
	 * </pre>
	 */
	protected void emit_Pattern___NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p_ResourcesKeyword_2_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('resources:' NL+ (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('locations:' NL+)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     resources+=Resource NL+ (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('locations:' NL+)?)+ (ambiguity) 'locations:' locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('resources:' NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     resources+=Resource NL+ (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+ (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('Robots:' NL+)?
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ (ambiguity) (('locations:' NL+) | ('resources:' NL+))* ('agents:' NL+ ('Humans:' NL+)? (ambiguity) (('locations:' NL+) | ('resources:' NL+))*)* (rule end)
	 *     human+=Human NL+ (ambiguity) (('locations:' NL+)? ('resources:' NL+)?)+ ('agents:' NL+ ('Humans:' NL+)? (ambiguity) (('locations:' NL+)? ('resources:' NL+)?)+)* 'resources:' resources+=Resource
	 *     human+=Human NL+ (ambiguity) (('resources:' NL+)? ('locations:' NL+)?)+ ('agents:' NL+ ('Humans:' NL+)? (ambiguity) (('resources:' NL+)? ('locations:' NL+)?)+)* 'locations:' locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('locations:' NL+)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     resources+=Resource NL+ (ambiguity) ('resources:' NL+ (ambiguity))* 'locations:' locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)? ('resources:' NL+)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location NL+ (ambiguity) ('locations:' NL+ (ambiguity))* 'resources:' resources+=Resource
	 
	 * </pre>
	 */
	protected void emit_Pattern_____AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ (ambiguity) 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('Humans:' NL+)? ('Robots:' NL+)? (('locations:' NL+)? ('resources:' NL+)?)+ 'agents:' NL+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     resources+=Resource NL+ (('locations:' NL+)? ('resources:' NL+)?)+ 'agents:' NL+ (ambiguity) 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('Humans:' NL+)? ('Robots:' NL+)? (('resources:' NL+)? ('locations:' NL+)?)+ 'agents:' NL+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location NL+ (('resources:' NL+)? ('locations:' NL+)?)+ 'agents:' NL+ (ambiguity) 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('locations:' NL+) | ('resources:' NL+))*
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (ambiguity) ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (ambiguity))* (rule end)
	 *     name=ID NL+ (ambiguity) 'agents:' NL+ (('Humans:' NL+)? ('Robots:' NL+)? (ambiguity) 'agents:' NL+)* 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (ambiguity) 'resources:' (NL+ (ambiguity) 'resources:')* resources+=Resource
	 *     resources+=Resource NL+ (ambiguity) ('resources:' NL+ (ambiguity))* (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('locations:' NL+)? ('agents:' NL+ ('Humans:' NL+)?)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     robot+=Robot NL+ (ambiguity) 'resources:'
	 
	 * </pre>
	 */
	protected void emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('locations:' NL+)? ('resources:' NL+)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (ambiguity) ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (ambiguity))* 'resources:' resources+=Resource
	 *     resources+=Resource NL+ (ambiguity) 'agents:' NL+ (('Humans:' NL+)? ('Robots:' NL+)? (ambiguity) 'agents:' NL+)* 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     locations+=Location NL+ (ambiguity) ('locations:' NL+ (ambiguity))* (rule end)
	 *     name=ID NL+ (ambiguity) 'locations:' (NL+ (ambiguity) 'locations:')* locations+=Location
	 
	 * </pre>
	 */
	protected void emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('resources:' NL+)? ('agents:' NL+ ('Humans:' NL+)?)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     robot+=Robot NL+ (ambiguity) 'locations:'
	 
	 * </pre>
	 */
	protected void emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('resources:' NL+)? ('locations:' NL+)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     human+=Human NL+ ('Robots:' NL+)? (ambiguity) ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)? (ambiguity))* 'locations:' locations+=Location
	 *     locations+=Location NL+ (ambiguity) 'agents:' NL+ (('Humans:' NL+)? ('Robots:' NL+)? (ambiguity) 'agents:' NL+)* 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p__q___LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ((('Humans:' NL+ 'Robots:') | 'Robots:') NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+)*
	 *
	 * This ambiguous syntax occurs at:
	 *     robot+=Robot NL+ ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+ (ambiguity) 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_____RobotsKeyword_2_0_3_0_or___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p_RobotsKeyword_2_0_3_0_____NLTerminalRuleCall_2_0_3_2_p_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ((('locations:' NL+) | ('resources:' NL+))* 'agents:' NL+ ('Humans:' NL+)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (ambiguity) 'Robots:' (NL+ (ambiguity) 'Robots:')* robot+=Robot
	 *     robot+=Robot NL+ (ambiguity) ((('Humans:' NL+ 'Robots:') | 'Robots:') NL+ (ambiguity))* 'Humans:' human+=Human
	 
	 * </pre>
	 */
	protected void emit_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____a_AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ((('locations:' NL+) | ('resources:' NL+))? ('agents:' NL+ ('Humans:' NL+)? ('Robots:' NL+)?)?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID NL+ (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Pattern_______LocationsKeyword_2_1_0_NLTerminalRuleCall_2_1_2_p___or___ResourcesKeyword_2_2_0_NLTerminalRuleCall_2_2_2_p____q___AgentsKeyword_2_0_0_NLTerminalRuleCall_2_0_1_p___HumansKeyword_2_0_2_0_NLTerminalRuleCall_2_0_2_2_p__q___RobotsKeyword_2_0_3_0_NLTerminalRuleCall_2_0_3_2_p__q__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         '&gt;' | 
	  *         '&lt;' | 
	  *         '&gt;=' | 
	  *         '&lt;=' | 
	  *         '==' | 
	  *         '!='
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     agent+=Agent ')' (ambiguity) th=INT
	 
	 * </pre>
	 */
	protected void emit_Relation_EqualsSignEqualsSignKeyword_0_6_4_or_ExclamationMarkEqualsSignKeyword_0_6_5_or_GreaterThanSignEqualsSignKeyword_0_6_2_or_GreaterThanSignKeyword_0_6_0_or_LessThanSignEqualsSignKeyword_0_6_3_or_LessThanSignKeyword_0_6_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         '&gt;' | 
	  *         '&lt;' | 
	  *         '&gt;=' | 
	  *         '&lt;=' | 
	  *         '==' | 
	  *         '!='
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     agent+=Agent ')' (ambiguity) th=INT
	 
	 * </pre>
	 */
	protected void emit_Relation_EqualsSignEqualsSignKeyword_1_4_4_or_ExclamationMarkEqualsSignKeyword_1_4_5_or_GreaterThanSignEqualsSignKeyword_1_4_2_or_GreaterThanSignKeyword_1_4_0_or_LessThanSignEqualsSignKeyword_1_4_3_or_LessThanSignKeyword_1_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     action=Action ':' (ambiguity) (rule end)
	 *     action=Action ':' (ambiguity) subSequence+=SubSequence
	 *     agent=Agent ':' (ambiguity) (rule end)
	 *     agent=Agent ':' (ambiguity) subSequence+=SubSequence
	 
	 * </pre>
	 */
	protected void emit_Sequence_NLTerminalRuleCall_3_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL*
	 *
	 * This ambiguous syntax occurs at:
	 *     i=INT ':' (ambiguity) action+=Action
	 *     i=INT ':' (ambiguity) loop+=Loop
	 *     j=INT ':' (ambiguity) action+=Action
	 *     j=INT ':' (ambiguity) loop+=Loop
	 
	 * </pre>
	 */
	protected void emit_SubSequence_NLTerminalRuleCall_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     NL+
	 *
	 * This ambiguous syntax occurs at:
	 *     action+=Action (ambiguity) (rule end)
	 *     action+=Action (ambiguity) action+=Action
	 *     action+=Action (ambiguity) loop+=Loop
	 *     conditionalStatement+=ConditionalStatement (ambiguity) (rule end)
	 *     conditionalStatement+=ConditionalStatement (ambiguity) action+=Action
	 *     conditionalStatement+=ConditionalStatement (ambiguity) loop+=Loop
	 *     i=INT ':' (ambiguity) (rule end)
	 *     j=INT ':' (ambiguity) (rule end)
	 *     loop+=Loop (ambiguity) (rule end)
	 *     loop+=Loop (ambiguity) action+=Action
	 *     loop+=Loop (ambiguity) loop+=Loop
	 
	 * </pre>
	 */
	protected void emit_SubSequence_NLTerminalRuleCall_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
