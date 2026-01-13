/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LIRAsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cPatternAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPatternPatternParserRuleCall_1_0 = (RuleCall)cPatternAssignment_1.eContents().get(0);
		private final Assignment cSequenceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSequenceSequenceParserRuleCall_2_0 = (RuleCall)cSequenceAssignment_2.eContents().get(0);
		private final Assignment cConclusionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cConclusionConclusionParserRuleCall_3_0 = (RuleCall)cConclusionAssignment_3.eContents().get(0);
		
		//// Others modified files:
		//// LIRAsValidator.Java - in the folder /it.polimi.LIRAs/src/it.polimi.validation
		//// LIRAsGenerator.xtend - in the folder /it.polimi.LIRAs/src/it.polimi.generator
		//// Model rule represents the root of the model
		//Model:
		//    NL*
		//    pattern=Pattern
		//    sequence+=Sequence*
		//    conclusion=Conclusion?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//NL*
		//pattern=Pattern
		//sequence+=Sequence*
		//conclusion=Conclusion?
		public Group getGroup() { return cGroup; }
		
		//NL*
		public RuleCall getNLTerminalRuleCall_0() { return cNLTerminalRuleCall_0; }
		
		//pattern=Pattern
		public Assignment getPatternAssignment_1() { return cPatternAssignment_1; }
		
		//Pattern
		public RuleCall getPatternPatternParserRuleCall_1_0() { return cPatternPatternParserRuleCall_1_0; }
		
		//sequence+=Sequence*
		public Assignment getSequenceAssignment_2() { return cSequenceAssignment_2; }
		
		//Sequence
		public RuleCall getSequenceSequenceParserRuleCall_2_0() { return cSequenceSequenceParserRuleCall_2_0; }
		
		//conclusion=Conclusion?
		public Assignment getConclusionAssignment_3() { return cConclusionAssignment_3; }
		
		//Conclusion
		public RuleCall getConclusionConclusionParserRuleCall_3_0() { return cConclusionConclusionParserRuleCall_3_0; }
	}
	public class PatternElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Pattern");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cAgentsKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2_0_1 = (RuleCall)cGroup_2_0.eContents().get(1);
		private final Group cGroup_2_0_2 = (Group)cGroup_2_0.eContents().get(2);
		private final Keyword cHumansKeyword_2_0_2_0 = (Keyword)cGroup_2_0_2.eContents().get(0);
		private final Group cGroup_2_0_2_1 = (Group)cGroup_2_0_2.eContents().get(1);
		private final Assignment cHumanAssignment_2_0_2_1_0 = (Assignment)cGroup_2_0_2_1.eContents().get(0);
		private final RuleCall cHumanHumanParserRuleCall_2_0_2_1_0_0 = (RuleCall)cHumanAssignment_2_0_2_1_0.eContents().get(0);
		private final Group cGroup_2_0_2_1_1 = (Group)cGroup_2_0_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_2_1_1_0 = (Keyword)cGroup_2_0_2_1_1.eContents().get(0);
		private final Assignment cHumanAssignment_2_0_2_1_1_1 = (Assignment)cGroup_2_0_2_1_1.eContents().get(1);
		private final RuleCall cHumanHumanParserRuleCall_2_0_2_1_1_1_0 = (RuleCall)cHumanAssignment_2_0_2_1_1_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2_0_2_2 = (RuleCall)cGroup_2_0_2.eContents().get(2);
		private final Group cGroup_2_0_3 = (Group)cGroup_2_0.eContents().get(3);
		private final Keyword cRobotsKeyword_2_0_3_0 = (Keyword)cGroup_2_0_3.eContents().get(0);
		private final Group cGroup_2_0_3_1 = (Group)cGroup_2_0_3.eContents().get(1);
		private final Assignment cRobotAssignment_2_0_3_1_0 = (Assignment)cGroup_2_0_3_1.eContents().get(0);
		private final RuleCall cRobotRobotParserRuleCall_2_0_3_1_0_0 = (RuleCall)cRobotAssignment_2_0_3_1_0.eContents().get(0);
		private final Group cGroup_2_0_3_1_1 = (Group)cGroup_2_0_3_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_0_3_1_1_0 = (Keyword)cGroup_2_0_3_1_1.eContents().get(0);
		private final Assignment cRobotAssignment_2_0_3_1_1_1 = (Assignment)cGroup_2_0_3_1_1.eContents().get(1);
		private final RuleCall cRobotRobotParserRuleCall_2_0_3_1_1_1_0 = (RuleCall)cRobotAssignment_2_0_3_1_1_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2_0_3_2 = (RuleCall)cGroup_2_0_3.eContents().get(2);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cLocationsKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Assignment cLocationsAssignment_2_1_1_0 = (Assignment)cGroup_2_1_1.eContents().get(0);
		private final RuleCall cLocationsLocationParserRuleCall_2_1_1_0_0 = (RuleCall)cLocationsAssignment_2_1_1_0.eContents().get(0);
		private final Group cGroup_2_1_1_1 = (Group)cGroup_2_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_1_1_0 = (Keyword)cGroup_2_1_1_1.eContents().get(0);
		private final Assignment cLocationsAssignment_2_1_1_1_1 = (Assignment)cGroup_2_1_1_1.eContents().get(1);
		private final RuleCall cLocationsLocationParserRuleCall_2_1_1_1_1_0 = (RuleCall)cLocationsAssignment_2_1_1_1_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Keyword cResourcesKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Group cGroup_2_2_1 = (Group)cGroup_2_2.eContents().get(1);
		private final Assignment cResourcesAssignment_2_2_1_0 = (Assignment)cGroup_2_2_1.eContents().get(0);
		private final RuleCall cResourcesResourceParserRuleCall_2_2_1_0_0 = (RuleCall)cResourcesAssignment_2_2_1_0.eContents().get(0);
		private final Group cGroup_2_2_1_1 = (Group)cGroup_2_2_1.eContents().get(1);
		private final Keyword cCommaKeyword_2_2_1_1_0 = (Keyword)cGroup_2_2_1_1.eContents().get(0);
		private final Assignment cResourcesAssignment_2_2_1_1_1 = (Assignment)cGroup_2_2_1_1.eContents().get(1);
		private final RuleCall cResourcesResourceParserRuleCall_2_2_1_1_1_0 = (RuleCall)cResourcesAssignment_2_2_1_1_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2_2_2 = (RuleCall)cGroup_2_2.eContents().get(2);
		
		//// Definition of the pattern name and the parameters to be pass (and use in the specification)
		//Pattern:
		//    name=ID NL+
		//    (('agents:'  NL+
		//    ('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
		//    ('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)? )
		//    | 'locations:' (locations+=Location (',' locations+=Location)*)? NL+
		//    | 'resources:' (resources+=Resource (',' resources+=Resource)*)? NL+)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID NL+
		//(('agents:'  NL+
		//('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
		//('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)? )
		//| 'locations:' (locations+=Location (',' locations+=Location)*)? NL+
		//| 'resources:' (resources+=Resource (',' resources+=Resource)*)? NL+)*
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_1() { return cNLTerminalRuleCall_1; }
		
		//(('agents:'  NL+
		//('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
		//('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)? )
		//| 'locations:' (locations+=Location (',' locations+=Location)*)? NL+
		//| 'resources:' (resources+=Resource (',' resources+=Resource)*)? NL+)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//('agents:'  NL+
		//    ('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
		//    ('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)? )
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'agents:'
		public Keyword getAgentsKeyword_2_0_0() { return cAgentsKeyword_2_0_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_2_0_1() { return cNLTerminalRuleCall_2_0_1; }
		
		//('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
		public Group getGroup_2_0_2() { return cGroup_2_0_2; }
		
		//'Humans:'
		public Keyword getHumansKeyword_2_0_2_0() { return cHumansKeyword_2_0_2_0; }
		
		//(human+=Human (',' human+=Human)*)?
		public Group getGroup_2_0_2_1() { return cGroup_2_0_2_1; }
		
		//human+=Human
		public Assignment getHumanAssignment_2_0_2_1_0() { return cHumanAssignment_2_0_2_1_0; }
		
		//Human
		public RuleCall getHumanHumanParserRuleCall_2_0_2_1_0_0() { return cHumanHumanParserRuleCall_2_0_2_1_0_0; }
		
		//(',' human+=Human)*
		public Group getGroup_2_0_2_1_1() { return cGroup_2_0_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_2_1_1_0() { return cCommaKeyword_2_0_2_1_1_0; }
		
		//human+=Human
		public Assignment getHumanAssignment_2_0_2_1_1_1() { return cHumanAssignment_2_0_2_1_1_1; }
		
		//Human
		public RuleCall getHumanHumanParserRuleCall_2_0_2_1_1_1_0() { return cHumanHumanParserRuleCall_2_0_2_1_1_1_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_2_0_2_2() { return cNLTerminalRuleCall_2_0_2_2; }
		
		//('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)?
		public Group getGroup_2_0_3() { return cGroup_2_0_3; }
		
		//'Robots:'
		public Keyword getRobotsKeyword_2_0_3_0() { return cRobotsKeyword_2_0_3_0; }
		
		//(robot+=Robot (',' robot+=Robot)*)?
		public Group getGroup_2_0_3_1() { return cGroup_2_0_3_1; }
		
		//robot+=Robot
		public Assignment getRobotAssignment_2_0_3_1_0() { return cRobotAssignment_2_0_3_1_0; }
		
		//Robot
		public RuleCall getRobotRobotParserRuleCall_2_0_3_1_0_0() { return cRobotRobotParserRuleCall_2_0_3_1_0_0; }
		
		//(',' robot+=Robot)*
		public Group getGroup_2_0_3_1_1() { return cGroup_2_0_3_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_0_3_1_1_0() { return cCommaKeyword_2_0_3_1_1_0; }
		
		//robot+=Robot
		public Assignment getRobotAssignment_2_0_3_1_1_1() { return cRobotAssignment_2_0_3_1_1_1; }
		
		//Robot
		public RuleCall getRobotRobotParserRuleCall_2_0_3_1_1_1_0() { return cRobotRobotParserRuleCall_2_0_3_1_1_1_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_2_0_3_2() { return cNLTerminalRuleCall_2_0_3_2; }
		
		//'locations:' (locations+=Location (',' locations+=Location)*)? NL+
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'locations:'
		public Keyword getLocationsKeyword_2_1_0() { return cLocationsKeyword_2_1_0; }
		
		//(locations+=Location (',' locations+=Location)*)?
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }
		
		//locations+=Location
		public Assignment getLocationsAssignment_2_1_1_0() { return cLocationsAssignment_2_1_1_0; }
		
		//Location
		public RuleCall getLocationsLocationParserRuleCall_2_1_1_0_0() { return cLocationsLocationParserRuleCall_2_1_1_0_0; }
		
		//(',' locations+=Location)*
		public Group getGroup_2_1_1_1() { return cGroup_2_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_1_1_0() { return cCommaKeyword_2_1_1_1_0; }
		
		//locations+=Location
		public Assignment getLocationsAssignment_2_1_1_1_1() { return cLocationsAssignment_2_1_1_1_1; }
		
		//Location
		public RuleCall getLocationsLocationParserRuleCall_2_1_1_1_1_0() { return cLocationsLocationParserRuleCall_2_1_1_1_1_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_2_1_2() { return cNLTerminalRuleCall_2_1_2; }
		
		//'resources:' (resources+=Resource (',' resources+=Resource)*)? NL+
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'resources:'
		public Keyword getResourcesKeyword_2_2_0() { return cResourcesKeyword_2_2_0; }
		
		//(resources+=Resource (',' resources+=Resource)*)?
		public Group getGroup_2_2_1() { return cGroup_2_2_1; }
		
		//resources+=Resource
		public Assignment getResourcesAssignment_2_2_1_0() { return cResourcesAssignment_2_2_1_0; }
		
		//Resource
		public RuleCall getResourcesResourceParserRuleCall_2_2_1_0_0() { return cResourcesResourceParserRuleCall_2_2_1_0_0; }
		
		//(',' resources+=Resource)*
		public Group getGroup_2_2_1_1() { return cGroup_2_2_1_1; }
		
		//','
		public Keyword getCommaKeyword_2_2_1_1_0() { return cCommaKeyword_2_2_1_1_0; }
		
		//resources+=Resource
		public Assignment getResourcesAssignment_2_2_1_1_1() { return cResourcesAssignment_2_2_1_1_1; }
		
		//Resource
		public RuleCall getResourcesResourceParserRuleCall_2_2_1_1_1_0() { return cResourcesResourceParserRuleCall_2_2_1_1_1_0; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_2_2_2() { return cNLTerminalRuleCall_2_2_2; }
	}
	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAgentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAgentAgentParserRuleCall_0_0 = (RuleCall)cAgentAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDefaultKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActionActionParserRuleCall_1_1_0 = (RuleCall)cActionAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cNLTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cSubSequenceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSubSequenceSubSequenceParserRuleCall_4_0 = (RuleCall)cSubSequenceAssignment_4.eContents().get(0);
		
		//// Sequence rule defines the structure of a sequence
		//Sequence:
		//    agent=Agent ('default' action=Action)? ':' NL+
		//    (subSequence+=SubSequence)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//agent=Agent ('default' action=Action)? ':' NL+
		//(subSequence+=SubSequence)*
		public Group getGroup() { return cGroup; }
		
		//agent=Agent
		public Assignment getAgentAssignment_0() { return cAgentAssignment_0; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_0_0() { return cAgentAgentParserRuleCall_0_0; }
		
		//('default' action=Action)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'default'
		public Keyword getDefaultKeyword_1_0() { return cDefaultKeyword_1_0; }
		
		//action=Action
		public Assignment getActionAssignment_1_1() { return cActionAssignment_1_1; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_1_1_0() { return cActionActionParserRuleCall_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//NL+
		public RuleCall getNLTerminalRuleCall_3() { return cNLTerminalRuleCall_3; }
		
		//(subSequence+=SubSequence)*
		public Assignment getSubSequenceAssignment_4() { return cSubSequenceAssignment_4; }
		
		//SubSequence
		public RuleCall getSubSequenceSubSequenceParserRuleCall_4_0() { return cSubSequenceSubSequenceParserRuleCall_4_0; }
	}
	public class SubSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.SubSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIINTTerminalRuleCall_0_0 = (RuleCall)cIAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cJAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cJINTTerminalRuleCall_1_1_0 = (RuleCall)cJAssignment_1_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_3_0 = (Alternatives)cGroup_3.eContents().get(0);
		private final Assignment cLoopAssignment_3_0_0 = (Assignment)cAlternatives_3_0.eContents().get(0);
		private final RuleCall cLoopLoopParserRuleCall_3_0_0_0 = (RuleCall)cLoopAssignment_3_0_0.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cAlternatives_3_0.eContents().get(1);
		private final Assignment cActionAssignment_3_0_1_0 = (Assignment)cGroup_3_0_1.eContents().get(0);
		private final RuleCall cActionActionParserRuleCall_3_0_1_0_0 = (RuleCall)cActionAssignment_3_0_1_0.eContents().get(0);
		private final Assignment cConditionalStatementAssignment_3_0_1_1 = (Assignment)cGroup_3_0_1.eContents().get(1);
		private final RuleCall cConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0 = (RuleCall)cConditionalStatementAssignment_3_0_1_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		
		//// SubSequence rule defines the structure of a subsequence within a sequence
		//SubSequence:
		//    i=INT ('-' j=INT)? ':' ( ( ( loop+=Loop) | ((action+=Action) (conditionalStatement+=ConditionalStatement)?) )? NL )+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//i=INT ('-' j=INT)? ':' ( ( ( loop+=Loop) | ((action+=Action) (conditionalStatement+=ConditionalStatement)?) )? NL )+
		public Group getGroup() { return cGroup; }
		
		//i=INT
		public Assignment getIAssignment_0() { return cIAssignment_0; }
		
		//INT
		public RuleCall getIINTTerminalRuleCall_0_0() { return cIINTTerminalRuleCall_0_0; }
		
		//('-' j=INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0() { return cHyphenMinusKeyword_1_0; }
		
		//j=INT
		public Assignment getJAssignment_1_1() { return cJAssignment_1_1; }
		
		//INT
		public RuleCall getJINTTerminalRuleCall_1_1_0() { return cJINTTerminalRuleCall_1_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//( ( ( loop+=Loop) | ((action+=Action) (conditionalStatement+=ConditionalStatement)?) )? NL )+
		public Group getGroup_3() { return cGroup_3; }
		
		//( ( loop+=Loop) | ((action+=Action) (conditionalStatement+=ConditionalStatement)?) )?
		public Alternatives getAlternatives_3_0() { return cAlternatives_3_0; }
		
		//( loop+=Loop)
		public Assignment getLoopAssignment_3_0_0() { return cLoopAssignment_3_0_0; }
		
		//Loop
		public RuleCall getLoopLoopParserRuleCall_3_0_0_0() { return cLoopLoopParserRuleCall_3_0_0_0; }
		
		//((action+=Action) (conditionalStatement+=ConditionalStatement)?)
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }
		
		//(action+=Action)
		public Assignment getActionAssignment_3_0_1_0() { return cActionAssignment_3_0_1_0; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_3_0_1_0_0() { return cActionActionParserRuleCall_3_0_1_0_0; }
		
		//(conditionalStatement+=ConditionalStatement)?
		public Assignment getConditionalStatementAssignment_3_0_1_1() { return cConditionalStatementAssignment_3_0_1_1; }
		
		//ConditionalStatement
		public RuleCall getConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0() { return cConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_3_1() { return cNLTerminalRuleCall_3_1; }
	}
	public class ConclusionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Conclusion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSuccessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConditionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_1_0 = (RuleCall)cConditionAssignment_1.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cFailureKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cConditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConditionConditionParserRuleCall_4_0 = (RuleCall)cConditionAssignment_4.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Conclusion:
		//    'success:' condition+=Condition NL*
		//    'failure:' condition+=Condition NL*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'success:' condition+=Condition NL*
		//'failure:' condition+=Condition NL*
		public Group getGroup() { return cGroup; }
		
		//'success:'
		public Keyword getSuccessKeyword_0() { return cSuccessKeyword_0; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_1() { return cConditionAssignment_1; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_1_0() { return cConditionConditionParserRuleCall_1_0; }
		
		//NL*
		public RuleCall getNLTerminalRuleCall_2() { return cNLTerminalRuleCall_2; }
		
		//'failure:'
		public Keyword getFailureKeyword_3() { return cFailureKeyword_3; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_4() { return cConditionAssignment_4; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_4_0() { return cConditionConditionParserRuleCall_4_0; }
		
		//NL*
		public RuleCall getNLTerminalRuleCall_5() { return cNLTerminalRuleCall_5; }
	}
	public class LoopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Loop");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cSkipKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cAllKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cIfKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cConditionAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cConditionConditionParserRuleCall_0_3_0 = (RuleCall)cConditionAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cRestartKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cAllKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cIfKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cConditionAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cConditionConditionParserRuleCall_1_3_0 = (RuleCall)cConditionAssignment_1_3.eContents().get(0);
		
		//Loop:
		//    ('skip' ('all')? 'if' condition=Condition) | ('restart' ('all')?  'if' condition=Condition)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('skip' ('all')? 'if' condition=Condition) | ('restart' ('all')?  'if' condition=Condition)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('skip' ('all')? 'if' condition=Condition)
		public Group getGroup_0() { return cGroup_0; }
		
		//'skip'
		public Keyword getSkipKeyword_0_0() { return cSkipKeyword_0_0; }
		
		//('all')?
		public Keyword getAllKeyword_0_1() { return cAllKeyword_0_1; }
		
		//'if'
		public Keyword getIfKeyword_0_2() { return cIfKeyword_0_2; }
		
		//condition=Condition
		public Assignment getConditionAssignment_0_3() { return cConditionAssignment_0_3; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_0_3_0() { return cConditionConditionParserRuleCall_0_3_0; }
		
		//('restart' ('all')?  'if' condition=Condition)
		public Group getGroup_1() { return cGroup_1; }
		
		//'restart'
		public Keyword getRestartKeyword_1_0() { return cRestartKeyword_1_0; }
		
		//('all')?
		public Keyword getAllKeyword_1_1() { return cAllKeyword_1_1; }
		
		//'if'
		public Keyword getIfKeyword_1_2() { return cIfKeyword_1_2; }
		
		//condition=Condition
		public Assignment getConditionAssignment_1_3() { return cConditionAssignment_1_3; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_1_3_0() { return cConditionConditionParserRuleCall_1_3_0; }
	}
	public class ConditionalStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.ConditionalStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cUntilKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cConditionAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_0_1_0 = (RuleCall)cConditionAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cIfKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cConditionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_1_1_0 = (RuleCall)cConditionAssignment_1_1.eContents().get(0);
		private final Keyword cElseKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cActionAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cActionActionParserRuleCall_1_3_0 = (RuleCall)cActionAssignment_1_3.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cIfKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cConditionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_2_1_0 = (RuleCall)cConditionAssignment_2_1.eContents().get(0);
		private final Keyword cElseKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cActionAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cActionActionParserRuleCall_2_3_0 = (RuleCall)cActionAssignment_2_3.eContents().get(0);
		private final Keyword cUntilKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Assignment cConditionAssignment_2_5 = (Assignment)cGroup_2.eContents().get(5);
		private final RuleCall cConditionConditionParserRuleCall_2_5_0 = (RuleCall)cConditionAssignment_2_5.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cWaitKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNINTTerminalRuleCall_3_1_0 = (RuleCall)cNAssignment_3_1.eContents().get(0);
		
		//ConditionalStatement:
		//    'until' condition+=Condition
		//    | 'if' condition+=Condition 'else' action=Action
		//    | 'if' condition+=Condition 'else' action=Action 'until' condition+=Condition
		//    | 'wait' n=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'until' condition+=Condition
		//| 'if' condition+=Condition 'else' action=Action
		//| 'if' condition+=Condition 'else' action=Action 'until' condition+=Condition
		//| 'wait' n=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'until' condition+=Condition
		public Group getGroup_0() { return cGroup_0; }
		
		//'until'
		public Keyword getUntilKeyword_0_0() { return cUntilKeyword_0_0; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_0_1() { return cConditionAssignment_0_1; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_0_1_0() { return cConditionConditionParserRuleCall_0_1_0; }
		
		//'if' condition+=Condition 'else' action=Action
		public Group getGroup_1() { return cGroup_1; }
		
		//'if'
		public Keyword getIfKeyword_1_0() { return cIfKeyword_1_0; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_1_1() { return cConditionAssignment_1_1; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_1_1_0() { return cConditionConditionParserRuleCall_1_1_0; }
		
		//'else'
		public Keyword getElseKeyword_1_2() { return cElseKeyword_1_2; }
		
		//action=Action
		public Assignment getActionAssignment_1_3() { return cActionAssignment_1_3; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_1_3_0() { return cActionActionParserRuleCall_1_3_0; }
		
		//'if' condition+=Condition 'else' action=Action 'until' condition+=Condition
		public Group getGroup_2() { return cGroup_2; }
		
		//'if'
		public Keyword getIfKeyword_2_0() { return cIfKeyword_2_0; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_2_1() { return cConditionAssignment_2_1; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_2_1_0() { return cConditionConditionParserRuleCall_2_1_0; }
		
		//'else'
		public Keyword getElseKeyword_2_2() { return cElseKeyword_2_2; }
		
		//action=Action
		public Assignment getActionAssignment_2_3() { return cActionAssignment_2_3; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_2_3_0() { return cActionActionParserRuleCall_2_3_0; }
		
		//'until'
		public Keyword getUntilKeyword_2_4() { return cUntilKeyword_2_4; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_2_5() { return cConditionAssignment_2_5; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_2_5_0() { return cConditionConditionParserRuleCall_2_5_0; }
		
		//'wait' n=INT
		public Group getGroup_3() { return cGroup_3; }
		
		//'wait'
		public Keyword getWaitKeyword_3_0() { return cWaitKeyword_3_0; }
		
		//n=INT
		public Assignment getNAssignment_3_1() { return cNAssignment_3_1; }
		
		//INT
		public RuleCall getNINTTerminalRuleCall_3_1_0() { return cNINTTerminalRuleCall_3_1_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cStopKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cMoveToKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cTargetAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cTargetTargetParserRuleCall_1_1_1_0 = (RuleCall)cTargetAssignment_1_1_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_2 = (UnorderedGroup)cAlternatives_1.eContents().get(2);
		private final Alternatives cAlternatives_1_2_0 = (Alternatives)cUnorderedGroup_1_2.eContents().get(0);
		private final Keyword cFetchKeyword_1_2_0_0 = (Keyword)cAlternatives_1_2_0.eContents().get(0);
		private final Keyword cDeliverKeyword_1_2_0_1 = (Keyword)cAlternatives_1_2_0.eContents().get(1);
		private final Keyword cLeaveKeyword_1_2_0_2 = (Keyword)cAlternatives_1_2_0.eContents().get(2);
		private final Assignment cResourceAssignment_1_2_1 = (Assignment)cUnorderedGroup_1_2.eContents().get(1);
		private final RuleCall cResourceResourceParserRuleCall_1_2_1_0 = (RuleCall)cResourceAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cFollowKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cAgentAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cAgentAgentParserRuleCall_1_3_1_0 = (RuleCall)cAgentAssignment_1_3_1.eContents().get(0);
		private final Group cGroup_1_3_2 = (Group)cGroup_1_3.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_1_3_2_0 = (Keyword)cGroup_1_3_2.eContents().get(0);
		private final Assignment cTargetAssignment_1_3_2_1 = (Assignment)cGroup_1_3_2.eContents().get(1);
		private final RuleCall cTargetTargetParserRuleCall_1_3_2_1_0 = (RuleCall)cTargetAssignment_1_3_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3_2_2 = (Keyword)cGroup_1_3_2.eContents().get(2);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Keyword cReceiveFromKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cAgentAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cAgentAgentParserRuleCall_1_4_1_0 = (RuleCall)cAgentAssignment_1_4_1.eContents().get(0);
		
		//// Action rule defines the various actions that can be performed
		//Action:
		//    {Action}
		//    ('stop'
		//    | 'moveTo' target=Target
		//    | (('fetch' | 'deliver' | 'leave') & resource=Resource)
		//    | 'follow' agent=Agent ('(' target=Target ')')?
		//    | 'receiveFrom' agent=Agent)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Action}
		//('stop'
		//| 'moveTo' target=Target
		//| (('fetch' | 'deliver' | 'leave') & resource=Resource)
		//| 'follow' agent=Agent ('(' target=Target ')')?
		//| 'receiveFrom' agent=Agent)
		public Group getGroup() { return cGroup; }
		
		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }
		
		//('stop'
		//| 'moveTo' target=Target
		//| (('fetch' | 'deliver' | 'leave') & resource=Resource)
		//| 'follow' agent=Agent ('(' target=Target ')')?
		//| 'receiveFrom' agent=Agent)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'stop'
		public Keyword getStopKeyword_1_0() { return cStopKeyword_1_0; }
		
		//'moveTo' target=Target
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'moveTo'
		public Keyword getMoveToKeyword_1_1_0() { return cMoveToKeyword_1_1_0; }
		
		//target=Target
		public Assignment getTargetAssignment_1_1_1() { return cTargetAssignment_1_1_1; }
		
		//Target
		public RuleCall getTargetTargetParserRuleCall_1_1_1_0() { return cTargetTargetParserRuleCall_1_1_1_0; }
		
		//(('fetch' | 'deliver' | 'leave') & resource=Resource)
		public UnorderedGroup getUnorderedGroup_1_2() { return cUnorderedGroup_1_2; }
		
		//('fetch' | 'deliver' | 'leave')
		public Alternatives getAlternatives_1_2_0() { return cAlternatives_1_2_0; }
		
		//'fetch'
		public Keyword getFetchKeyword_1_2_0_0() { return cFetchKeyword_1_2_0_0; }
		
		//'deliver'
		public Keyword getDeliverKeyword_1_2_0_1() { return cDeliverKeyword_1_2_0_1; }
		
		//'leave'
		public Keyword getLeaveKeyword_1_2_0_2() { return cLeaveKeyword_1_2_0_2; }
		
		//resource=Resource
		public Assignment getResourceAssignment_1_2_1() { return cResourceAssignment_1_2_1; }
		
		//Resource
		public RuleCall getResourceResourceParserRuleCall_1_2_1_0() { return cResourceResourceParserRuleCall_1_2_1_0; }
		
		//'follow' agent=Agent ('(' target=Target ')')?
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'follow'
		public Keyword getFollowKeyword_1_3_0() { return cFollowKeyword_1_3_0; }
		
		//agent=Agent
		public Assignment getAgentAssignment_1_3_1() { return cAgentAssignment_1_3_1; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_1_3_1_0() { return cAgentAgentParserRuleCall_1_3_1_0; }
		
		//('(' target=Target ')')?
		public Group getGroup_1_3_2() { return cGroup_1_3_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_3_2_0() { return cLeftParenthesisKeyword_1_3_2_0; }
		
		//target=Target
		public Assignment getTargetAssignment_1_3_2_1() { return cTargetAssignment_1_3_2_1; }
		
		//Target
		public RuleCall getTargetTargetParserRuleCall_1_3_2_1_0() { return cTargetTargetParserRuleCall_1_3_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3_2_2() { return cRightParenthesisKeyword_1_3_2_2; }
		
		//'receiveFrom' agent=Agent
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'receiveFrom'
		public Keyword getReceiveFromKeyword_1_4_0() { return cReceiveFromKeyword_1_4_0; }
		
		//agent=Agent
		public Assignment getAgentAssignment_1_4_1() { return cAgentAssignment_1_4_1; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_1_4_1_0() { return cAgentAgentParserRuleCall_1_4_1_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cAtomicPredicateAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cAtomicPredicateAtomicPredicateParserRuleCall_0_0_0 = (RuleCall)cAtomicPredicateAssignment_0_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cAtomicPredicateAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0 = (RuleCall)cAtomicPredicateAssignment_0_1_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cAmpersandAmpersandKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cVerticalLineVerticalLineKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Assignment cAtomicPredicateAssignment_1_1_0 = (Assignment)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0 = (RuleCall)cAtomicPredicateAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cAtomicPredicateAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0 = (RuleCall)cAtomicPredicateAssignment_1_1_1_1.eContents().get(0);
		
		//Condition:
		//    ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) )
		//    ( ('&&' | '||') ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) ) )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) )
		//( ('&&' | '||') ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) ) )*
		public Group getGroup() { return cGroup; }
		
		//( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) )
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//atomicPredicate+=AtomicPredicate
		public Assignment getAtomicPredicateAssignment_0_0() { return cAtomicPredicateAssignment_0_0; }
		
		//AtomicPredicate
		public RuleCall getAtomicPredicateAtomicPredicateParserRuleCall_0_0_0() { return cAtomicPredicateAtomicPredicateParserRuleCall_0_0_0; }
		
		//('!' atomicPredicate+=AtomicPredicate)
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0_1_0() { return cExclamationMarkKeyword_0_1_0; }
		
		//atomicPredicate+=AtomicPredicate
		public Assignment getAtomicPredicateAssignment_0_1_1() { return cAtomicPredicateAssignment_0_1_1; }
		
		//AtomicPredicate
		public RuleCall getAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0() { return cAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0; }
		
		//( ('&&' | '||') ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) ) )*
		public Group getGroup_1() { return cGroup_1; }
		
		//('&&' | '||')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'&&'
		public Keyword getAmpersandAmpersandKeyword_1_0_0() { return cAmpersandAmpersandKeyword_1_0_0; }
		
		//'||'
		public Keyword getVerticalLineVerticalLineKeyword_1_0_1() { return cVerticalLineVerticalLineKeyword_1_0_1; }
		
		//( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) )
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//atomicPredicate+=AtomicPredicate
		public Assignment getAtomicPredicateAssignment_1_1_0() { return cAtomicPredicateAssignment_1_1_0; }
		
		//AtomicPredicate
		public RuleCall getAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0() { return cAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0; }
		
		//('!' atomicPredicate+=AtomicPredicate)
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_1_1_1_0() { return cExclamationMarkKeyword_1_1_1_0; }
		
		//atomicPredicate+=AtomicPredicate
		public Assignment getAtomicPredicateAssignment_1_1_1_1() { return cAtomicPredicateAssignment_1_1_1_1; }
		
		//AtomicPredicate
		public RuleCall getAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0() { return cAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0; }
	}
	public class AtomicPredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.AtomicPredicate");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cAtomicPredicateAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cTiredKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cTimeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cNAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cNINTTerminalRuleCall_1_2_0 = (RuleCall)cNAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cPositionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cAgentAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_2_2_0 = (RuleCall)cAgentAssignment_2_2.eContents().get(0);
		private final Keyword cCommaKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Assignment cLocationAssignment_2_4 = (Assignment)cGroup_2.eContents().get(4);
		private final RuleCall cLocationLocationParserRuleCall_2_4_0 = (RuleCall)cLocationAssignment_2_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cPossessKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cAgentAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_3_2_0 = (RuleCall)cAgentAssignment_3_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cResourceAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cResourceResourceParserRuleCall_3_4_0 = (RuleCall)cResourceAssignment_3_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cBusyKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cAgentAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_4_2_0 = (RuleCall)cAgentAssignment_4_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cStillKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAgentAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_5_2_0 = (RuleCall)cAgentAssignment_5_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Assignment cRelationAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cRelationRelationParserRuleCall_6_0 = (RuleCall)cRelationAssignment_6.eContents().get(0);
		
		//AtomicPredicate:
		//    {AtomicPredicate}
		//    'tired'
		//    | 'time' '(' n=INT ')'
		//    | 'position' '(' agent=Agent',' location=Location')'
		//    | 'possess' '(' agent=Agent',' resource=Resource')'
		//    | 'busy' '(' agent=Agent')'
		//    | 'still' '(' agent=Agent')'
		//    | relation=Relation
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{AtomicPredicate}
		//'tired'
		//| 'time' '(' n=INT ')'
		//| 'position' '(' agent=Agent',' location=Location')'
		//| 'possess' '(' agent=Agent',' resource=Resource')'
		//| 'busy' '(' agent=Agent')'
		//| 'still' '(' agent=Agent')'
		//| relation=Relation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{AtomicPredicate}
		//'tired'
		public Group getGroup_0() { return cGroup_0; }
		
		//{AtomicPredicate}
		public Action getAtomicPredicateAction_0_0() { return cAtomicPredicateAction_0_0; }
		
		//'tired'
		public Keyword getTiredKeyword_0_1() { return cTiredKeyword_0_1; }
		
		//'time' '(' n=INT ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'time'
		public Keyword getTimeKeyword_1_0() { return cTimeKeyword_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//n=INT
		public Assignment getNAssignment_1_2() { return cNAssignment_1_2; }
		
		//INT
		public RuleCall getNINTTerminalRuleCall_1_2_0() { return cNINTTerminalRuleCall_1_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//'position' '(' agent=Agent',' location=Location')'
		public Group getGroup_2() { return cGroup_2; }
		
		//'position'
		public Keyword getPositionKeyword_2_0() { return cPositionKeyword_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_1() { return cLeftParenthesisKeyword_2_1; }
		
		//agent=Agent
		public Assignment getAgentAssignment_2_2() { return cAgentAssignment_2_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_2_2_0() { return cAgentAgentParserRuleCall_2_2_0; }
		
		//','
		public Keyword getCommaKeyword_2_3() { return cCommaKeyword_2_3; }
		
		//location=Location
		public Assignment getLocationAssignment_2_4() { return cLocationAssignment_2_4; }
		
		//Location
		public RuleCall getLocationLocationParserRuleCall_2_4_0() { return cLocationLocationParserRuleCall_2_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_5() { return cRightParenthesisKeyword_2_5; }
		
		//'possess' '(' agent=Agent',' resource=Resource')'
		public Group getGroup_3() { return cGroup_3; }
		
		//'possess'
		public Keyword getPossessKeyword_3_0() { return cPossessKeyword_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }
		
		//agent=Agent
		public Assignment getAgentAssignment_3_2() { return cAgentAssignment_3_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_3_2_0() { return cAgentAgentParserRuleCall_3_2_0; }
		
		//','
		public Keyword getCommaKeyword_3_3() { return cCommaKeyword_3_3; }
		
		//resource=Resource
		public Assignment getResourceAssignment_3_4() { return cResourceAssignment_3_4; }
		
		//Resource
		public RuleCall getResourceResourceParserRuleCall_3_4_0() { return cResourceResourceParserRuleCall_3_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_5() { return cRightParenthesisKeyword_3_5; }
		
		//'busy' '(' agent=Agent')'
		public Group getGroup_4() { return cGroup_4; }
		
		//'busy'
		public Keyword getBusyKeyword_4_0() { return cBusyKeyword_4_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_1() { return cLeftParenthesisKeyword_4_1; }
		
		//agent=Agent
		public Assignment getAgentAssignment_4_2() { return cAgentAssignment_4_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_4_2_0() { return cAgentAgentParserRuleCall_4_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }
		
		//'still' '(' agent=Agent')'
		public Group getGroup_5() { return cGroup_5; }
		
		//'still'
		public Keyword getStillKeyword_5_0() { return cStillKeyword_5_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }
		
		//agent=Agent
		public Assignment getAgentAssignment_5_2() { return cAgentAssignment_5_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_5_2_0() { return cAgentAgentParserRuleCall_5_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_3() { return cRightParenthesisKeyword_5_3; }
		
		//relation=Relation
		public Assignment getRelationAssignment_6() { return cRelationAssignment_6; }
		
		//Relation
		public RuleCall getRelationRelationParserRuleCall_6_0() { return cRelationRelationParserRuleCall_6_0; }
	}
	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Relation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDistKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cAgentAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_0_2_0 = (RuleCall)cAgentAssignment_0_2.eContents().get(0);
		private final Keyword cCommaKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cAgentAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cAgentAgentParserRuleCall_0_4_0 = (RuleCall)cAgentAssignment_0_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Alternatives cAlternatives_0_6 = (Alternatives)cGroup_0.eContents().get(6);
		private final Keyword cGreaterThanSignKeyword_0_6_0 = (Keyword)cAlternatives_0_6.eContents().get(0);
		private final Keyword cLessThanSignKeyword_0_6_1 = (Keyword)cAlternatives_0_6.eContents().get(1);
		private final Keyword cGreaterThanSignEqualsSignKeyword_0_6_2 = (Keyword)cAlternatives_0_6.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_0_6_3 = (Keyword)cAlternatives_0_6.eContents().get(3);
		private final Keyword cEqualsSignEqualsSignKeyword_0_6_4 = (Keyword)cAlternatives_0_6.eContents().get(4);
		private final Keyword cExclamationMarkEqualsSignKeyword_0_6_5 = (Keyword)cAlternatives_0_6.eContents().get(5);
		private final Assignment cThAssignment_0_7 = (Assignment)cGroup_0.eContents().get(7);
		private final RuleCall cThINTTerminalRuleCall_0_7_0 = (RuleCall)cThAssignment_0_7.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cSocKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cAgentAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cAgentAgentParserRuleCall_1_2_0 = (RuleCall)cAgentAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Alternatives cAlternatives_1_4 = (Alternatives)cGroup_1.eContents().get(4);
		private final Keyword cGreaterThanSignKeyword_1_4_0 = (Keyword)cAlternatives_1_4.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1_4_1 = (Keyword)cAlternatives_1_4.eContents().get(1);
		private final Keyword cGreaterThanSignEqualsSignKeyword_1_4_2 = (Keyword)cAlternatives_1_4.eContents().get(2);
		private final Keyword cLessThanSignEqualsSignKeyword_1_4_3 = (Keyword)cAlternatives_1_4.eContents().get(3);
		private final Keyword cEqualsSignEqualsSignKeyword_1_4_4 = (Keyword)cAlternatives_1_4.eContents().get(4);
		private final Keyword cExclamationMarkEqualsSignKeyword_1_4_5 = (Keyword)cAlternatives_1_4.eContents().get(5);
		private final Assignment cThAssignment_1_5 = (Assignment)cGroup_1.eContents().get(5);
		private final RuleCall cThINTTerminalRuleCall_1_5_0 = (RuleCall)cThAssignment_1_5.eContents().get(0);
		
		//Relation:
		//    ('dist' '(' agent+=Agent ',' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT)
		//    | 'soc' '(' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//('dist' '(' agent+=Agent ',' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT)
		//| 'soc' '(' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('dist' '(' agent+=Agent ',' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT)
		public Group getGroup_0() { return cGroup_0; }
		
		//'dist'
		public Keyword getDistKeyword_0_0() { return cDistKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }
		
		//agent+=Agent
		public Assignment getAgentAssignment_0_2() { return cAgentAssignment_0_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_0_2_0() { return cAgentAgentParserRuleCall_0_2_0; }
		
		//','
		public Keyword getCommaKeyword_0_3() { return cCommaKeyword_0_3; }
		
		//agent+=Agent
		public Assignment getAgentAssignment_0_4() { return cAgentAssignment_0_4; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_0_4_0() { return cAgentAgentParserRuleCall_0_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_5() { return cRightParenthesisKeyword_0_5; }
		
		//('>' | '<' | '>=' | '<=' | '==' | '!=')
		public Alternatives getAlternatives_0_6() { return cAlternatives_0_6; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_0_6_0() { return cGreaterThanSignKeyword_0_6_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_0_6_1() { return cLessThanSignKeyword_0_6_1; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_0_6_2() { return cGreaterThanSignEqualsSignKeyword_0_6_2; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_0_6_3() { return cLessThanSignEqualsSignKeyword_0_6_3; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_0_6_4() { return cEqualsSignEqualsSignKeyword_0_6_4; }
		
		//'!='
		public Keyword getExclamationMarkEqualsSignKeyword_0_6_5() { return cExclamationMarkEqualsSignKeyword_0_6_5; }
		
		//th=INT
		public Assignment getThAssignment_0_7() { return cThAssignment_0_7; }
		
		//INT
		public RuleCall getThINTTerminalRuleCall_0_7_0() { return cThINTTerminalRuleCall_0_7_0; }
		
		//'soc' '(' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT
		public Group getGroup_1() { return cGroup_1; }
		
		//'soc'
		public Keyword getSocKeyword_1_0() { return cSocKeyword_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }
		
		//agent+=Agent
		public Assignment getAgentAssignment_1_2() { return cAgentAssignment_1_2; }
		
		//Agent
		public RuleCall getAgentAgentParserRuleCall_1_2_0() { return cAgentAgentParserRuleCall_1_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//('>' | '<' | '>=' | '<=' | '==' | '!=')
		public Alternatives getAlternatives_1_4() { return cAlternatives_1_4; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_1_4_0() { return cGreaterThanSignKeyword_1_4_0; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1_4_1() { return cLessThanSignKeyword_1_4_1; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_1_4_2() { return cGreaterThanSignEqualsSignKeyword_1_4_2; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_1_4_3() { return cLessThanSignEqualsSignKeyword_1_4_3; }
		
		//'=='
		public Keyword getEqualsSignEqualsSignKeyword_1_4_4() { return cEqualsSignEqualsSignKeyword_1_4_4; }
		
		//'!='
		public Keyword getExclamationMarkEqualsSignKeyword_1_4_5() { return cExclamationMarkEqualsSignKeyword_1_4_5; }
		
		//th=INT
		public Assignment getThAssignment_1_5() { return cThAssignment_1_5; }
		
		//INT
		public RuleCall getThINTTerminalRuleCall_1_5_0() { return cThINTTerminalRuleCall_1_5_0; }
	}
	public class TargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Target");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//// Target rule specifies the target of an action, it can be an agent, a location or a resources
		//Target:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class AgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Agent");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//// Agent rule defines the properties of an agent
		//Agent:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class HumanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Human");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Human:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class RobotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Robot");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Robot:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class LocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Location");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//// Location rule defines the coordinates of a location
		//Location:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.Resource");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//// Resource rule defines the properties of a resource
		//Resource:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final PatternElements pPattern;
	private final SequenceElements pSequence;
	private final SubSequenceElements pSubSequence;
	private final ConclusionElements pConclusion;
	private final LoopElements pLoop;
	private final ConditionalStatementElements pConditionalStatement;
	private final ActionElements pAction;
	private final ConditionElements pCondition;
	private final AtomicPredicateElements pAtomicPredicate;
	private final RelationElements pRelation;
	private final TargetElements pTarget;
	private final AgentElements pAgent;
	private final HumanElements pHuman;
	private final RobotElements pRobot;
	private final LocationElements pLocation;
	private final ResourceElements pResource;
	private final TerminalRule tNL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LIRAsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPattern = new PatternElements();
		this.pSequence = new SequenceElements();
		this.pSubSequence = new SubSequenceElements();
		this.pConclusion = new ConclusionElements();
		this.pLoop = new LoopElements();
		this.pConditionalStatement = new ConditionalStatementElements();
		this.pAction = new ActionElements();
		this.pCondition = new ConditionElements();
		this.pAtomicPredicate = new AtomicPredicateElements();
		this.pRelation = new RelationElements();
		this.pTarget = new TargetElements();
		this.pAgent = new AgentElements();
		this.pHuman = new HumanElements();
		this.pRobot = new RobotElements();
		this.pLocation = new LocationElements();
		this.pResource = new ResourceElements();
		this.tNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.polimi.LIRAs.NL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.polimi.LIRAs".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Others modified files:
	//// LIRAsValidator.Java - in the folder /it.polimi.LIRAs/src/it.polimi.validation
	//// LIRAsGenerator.xtend - in the folder /it.polimi.LIRAs/src/it.polimi.generator
	//// Model rule represents the root of the model
	//Model:
	//    NL*
	//    pattern=Pattern
	//    sequence+=Sequence*
	//    conclusion=Conclusion?
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//// Definition of the pattern name and the parameters to be pass (and use in the specification)
	//Pattern:
	//    name=ID NL+
	//    (('agents:'  NL+
	//    ('Humans:' (human+=Human (',' human+=Human)*)? NL+)?
	//    ('Robots:' (robot+=Robot (',' robot+=Robot)*)? NL+)? )
	//    | 'locations:' (locations+=Location (',' locations+=Location)*)? NL+
	//    | 'resources:' (resources+=Resource (',' resources+=Resource)*)? NL+)*
	//;
	public PatternElements getPatternAccess() {
		return pPattern;
	}
	
	public ParserRule getPatternRule() {
		return getPatternAccess().getRule();
	}
	
	//// Sequence rule defines the structure of a sequence
	//Sequence:
	//    agent=Agent ('default' action=Action)? ':' NL+
	//    (subSequence+=SubSequence)*
	//;
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}
	
	//// SubSequence rule defines the structure of a subsequence within a sequence
	//SubSequence:
	//    i=INT ('-' j=INT)? ':' ( ( ( loop+=Loop) | ((action+=Action) (conditionalStatement+=ConditionalStatement)?) )? NL )+
	//;
	public SubSequenceElements getSubSequenceAccess() {
		return pSubSequence;
	}
	
	public ParserRule getSubSequenceRule() {
		return getSubSequenceAccess().getRule();
	}
	
	//Conclusion:
	//    'success:' condition+=Condition NL*
	//    'failure:' condition+=Condition NL*
	//;
	public ConclusionElements getConclusionAccess() {
		return pConclusion;
	}
	
	public ParserRule getConclusionRule() {
		return getConclusionAccess().getRule();
	}
	
	//Loop:
	//    ('skip' ('all')? 'if' condition=Condition) | ('restart' ('all')?  'if' condition=Condition)
	//;
	public LoopElements getLoopAccess() {
		return pLoop;
	}
	
	public ParserRule getLoopRule() {
		return getLoopAccess().getRule();
	}
	
	//ConditionalStatement:
	//    'until' condition+=Condition
	//    | 'if' condition+=Condition 'else' action=Action
	//    | 'if' condition+=Condition 'else' action=Action 'until' condition+=Condition
	//    | 'wait' n=INT
	//;
	public ConditionalStatementElements getConditionalStatementAccess() {
		return pConditionalStatement;
	}
	
	public ParserRule getConditionalStatementRule() {
		return getConditionalStatementAccess().getRule();
	}
	
	//// Action rule defines the various actions that can be performed
	//Action:
	//    {Action}
	//    ('stop'
	//    | 'moveTo' target=Target
	//    | (('fetch' | 'deliver' | 'leave') & resource=Resource)
	//    | 'follow' agent=Agent ('(' target=Target ')')?
	//    | 'receiveFrom' agent=Agent)
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Condition:
	//    ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) )
	//    ( ('&&' | '||') ( atomicPredicate+=AtomicPredicate | ('!' atomicPredicate+=AtomicPredicate) ) )*
	//;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//AtomicPredicate:
	//    {AtomicPredicate}
	//    'tired'
	//    | 'time' '(' n=INT ')'
	//    | 'position' '(' agent=Agent',' location=Location')'
	//    | 'possess' '(' agent=Agent',' resource=Resource')'
	//    | 'busy' '(' agent=Agent')'
	//    | 'still' '(' agent=Agent')'
	//    | relation=Relation
	//    ;
	public AtomicPredicateElements getAtomicPredicateAccess() {
		return pAtomicPredicate;
	}
	
	public ParserRule getAtomicPredicateRule() {
		return getAtomicPredicateAccess().getRule();
	}
	
	//Relation:
	//    ('dist' '(' agent+=Agent ',' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT)
	//    | 'soc' '(' agent+=Agent ')' ('>' | '<' | '>=' | '<=' | '==' | '!=') th=INT
	//;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//// Target rule specifies the target of an action, it can be an agent, a location or a resources
	//Target:
	//    name=ID
	//;
	public TargetElements getTargetAccess() {
		return pTarget;
	}
	
	public ParserRule getTargetRule() {
		return getTargetAccess().getRule();
	}
	
	//// Agent rule defines the properties of an agent
	//Agent:
	//    name=ID
	//;
	public AgentElements getAgentAccess() {
		return pAgent;
	}
	
	public ParserRule getAgentRule() {
		return getAgentAccess().getRule();
	}
	
	//Human:
	//    name=ID
	//;
	public HumanElements getHumanAccess() {
		return pHuman;
	}
	
	public ParserRule getHumanRule() {
		return getHumanAccess().getRule();
	}
	
	//Robot:
	//    name=ID
	//;
	public RobotElements getRobotAccess() {
		return pRobot;
	}
	
	public ParserRule getRobotRule() {
		return getRobotAccess().getRule();
	}
	
	//// Location rule defines the coordinates of a location
	//Location:
	//    name=ID
	//;
	public LocationElements getLocationAccess() {
		return pLocation;
	}
	
	public ParserRule getLocationRule() {
		return getLocationAccess().getRule();
	}
	
	//// Resource rule defines the properties of a resource
	//Resource:
	//    name=ID
	//;
	public ResourceElements getResourceAccess() {
		return pResource;
	}
	
	public ParserRule getResourceRule() {
		return getResourceAccess().getRule();
	}
	
	//// NL terminal rule specifies newline characters
	//terminal NL:
	//    (' '* '\r'? '\n' '\t'*)+
	//;
	public TerminalRule getNLRule() {
		return tNL;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
