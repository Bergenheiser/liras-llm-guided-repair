/*
 * generated  by Xtext 2.41.0
 */
grammar InternalLIRAs;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package it.polimi.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package it.polimi.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.polimi.services.LIRAsGrammarAccess;

}
@parser::members {
	private LIRAsGrammarAccess grammarAccess;

	public void setGrammarAccess(LIRAsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePattern
entryRulePattern
:
{ before(grammarAccess.getPatternRule()); }
	 rulePattern
{ after(grammarAccess.getPatternRule()); } 
	 EOF 
;

// Rule Pattern
rulePattern 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPatternAccess().getGroup()); }
		(rule__Pattern__Group__0)
		{ after(grammarAccess.getPatternAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSequence
entryRuleSequence
:
{ before(grammarAccess.getSequenceRule()); }
	 ruleSequence
{ after(grammarAccess.getSequenceRule()); } 
	 EOF 
;

// Rule Sequence
ruleSequence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSequenceAccess().getGroup()); }
		(rule__Sequence__Group__0)
		{ after(grammarAccess.getSequenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubSequence
entryRuleSubSequence
:
{ before(grammarAccess.getSubSequenceRule()); }
	 ruleSubSequence
{ after(grammarAccess.getSubSequenceRule()); } 
	 EOF 
;

// Rule SubSequence
ruleSubSequence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubSequenceAccess().getGroup()); }
		(rule__SubSequence__Group__0)
		{ after(grammarAccess.getSubSequenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConclusion
entryRuleConclusion
:
{ before(grammarAccess.getConclusionRule()); }
	 ruleConclusion
{ after(grammarAccess.getConclusionRule()); } 
	 EOF 
;

// Rule Conclusion
ruleConclusion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConclusionAccess().getGroup()); }
		(rule__Conclusion__Group__0)
		{ after(grammarAccess.getConclusionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoop
entryRuleLoop
:
{ before(grammarAccess.getLoopRule()); }
	 ruleLoop
{ after(grammarAccess.getLoopRule()); } 
	 EOF 
;

// Rule Loop
ruleLoop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoopAccess().getAlternatives()); }
		(rule__Loop__Alternatives)
		{ after(grammarAccess.getLoopAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConditionalStatement
entryRuleConditionalStatement
:
{ before(grammarAccess.getConditionalStatementRule()); }
	 ruleConditionalStatement
{ after(grammarAccess.getConditionalStatementRule()); } 
	 EOF 
;

// Rule ConditionalStatement
ruleConditionalStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getAlternatives()); }
		(rule__ConditionalStatement__Alternatives)
		{ after(grammarAccess.getConditionalStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCondition
entryRuleCondition
:
{ before(grammarAccess.getConditionRule()); }
	 ruleCondition
{ after(grammarAccess.getConditionRule()); } 
	 EOF 
;

// Rule Condition
ruleCondition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionAccess().getGroup()); }
		(rule__Condition__Group__0)
		{ after(grammarAccess.getConditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicPredicate
entryRuleAtomicPredicate
:
{ before(grammarAccess.getAtomicPredicateRule()); }
	 ruleAtomicPredicate
{ after(grammarAccess.getAtomicPredicateRule()); } 
	 EOF 
;

// Rule AtomicPredicate
ruleAtomicPredicate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getAlternatives()); }
		(rule__AtomicPredicate__Alternatives)
		{ after(grammarAccess.getAtomicPredicateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelation
entryRuleRelation
:
{ before(grammarAccess.getRelationRule()); }
	 ruleRelation
{ after(grammarAccess.getRelationRule()); } 
	 EOF 
;

// Rule Relation
ruleRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationAccess().getAlternatives()); }
		(rule__Relation__Alternatives)
		{ after(grammarAccess.getRelationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTarget
entryRuleTarget
:
{ before(grammarAccess.getTargetRule()); }
	 ruleTarget
{ after(grammarAccess.getTargetRule()); } 
	 EOF 
;

// Rule Target
ruleTarget 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTargetAccess().getNameAssignment()); }
		(rule__Target__NameAssignment)
		{ after(grammarAccess.getTargetAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAgent
entryRuleAgent
:
{ before(grammarAccess.getAgentRule()); }
	 ruleAgent
{ after(grammarAccess.getAgentRule()); } 
	 EOF 
;

// Rule Agent
ruleAgent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAgentAccess().getNameAssignment()); }
		(rule__Agent__NameAssignment)
		{ after(grammarAccess.getAgentAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHuman
entryRuleHuman
:
{ before(grammarAccess.getHumanRule()); }
	 ruleHuman
{ after(grammarAccess.getHumanRule()); } 
	 EOF 
;

// Rule Human
ruleHuman 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHumanAccess().getNameAssignment()); }
		(rule__Human__NameAssignment)
		{ after(grammarAccess.getHumanAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRobot
entryRuleRobot
:
{ before(grammarAccess.getRobotRule()); }
	 ruleRobot
{ after(grammarAccess.getRobotRule()); } 
	 EOF 
;

// Rule Robot
ruleRobot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRobotAccess().getNameAssignment()); }
		(rule__Robot__NameAssignment)
		{ after(grammarAccess.getRobotAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLocation
entryRuleLocation
:
{ before(grammarAccess.getLocationRule()); }
	 ruleLocation
{ after(grammarAccess.getLocationRule()); } 
	 EOF 
;

// Rule Location
ruleLocation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLocationAccess().getNameAssignment()); }
		(rule__Location__NameAssignment)
		{ after(grammarAccess.getLocationAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleResource
entryRuleResource
:
{ before(grammarAccess.getResourceRule()); }
	 ruleResource
{ after(grammarAccess.getResourceRule()); } 
	 EOF 
;

// Rule Resource
ruleResource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getResourceAccess().getNameAssignment()); }
		(rule__Resource__NameAssignment)
		{ after(grammarAccess.getResourceAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getGroup_2_0()); }
		(rule__Pattern__Group_2_0__0)
		{ after(grammarAccess.getPatternAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getGroup_2_1()); }
		(rule__Pattern__Group_2_1__0)
		{ after(grammarAccess.getPatternAccess().getGroup_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getPatternAccess().getGroup_2_2()); }
		(rule__Pattern__Group_2_2__0)
		{ after(grammarAccess.getPatternAccess().getGroup_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Alternatives_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getLoopAssignment_3_0_0()); }
		(rule__SubSequence__LoopAssignment_3_0_0)
		{ after(grammarAccess.getSubSequenceAccess().getLoopAssignment_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubSequenceAccess().getGroup_3_0_1()); }
		(rule__SubSequence__Group_3_0_1__0)
		{ after(grammarAccess.getSubSequenceAccess().getGroup_3_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopAccess().getGroup_0()); }
		(rule__Loop__Group_0__0)
		{ after(grammarAccess.getLoopAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getLoopAccess().getGroup_1()); }
		(rule__Loop__Group_1__0)
		{ after(grammarAccess.getLoopAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getGroup_0()); }
		(rule__ConditionalStatement__Group_0__0)
		{ after(grammarAccess.getConditionalStatementAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionalStatementAccess().getGroup_1()); }
		(rule__ConditionalStatement__Group_1__0)
		{ after(grammarAccess.getConditionalStatementAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getConditionalStatementAccess().getGroup_2()); }
		(rule__ConditionalStatement__Group_2__0)
		{ after(grammarAccess.getConditionalStatementAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getConditionalStatementAccess().getGroup_3()); }
		(rule__ConditionalStatement__Group_3__0)
		{ after(grammarAccess.getConditionalStatementAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getStopKeyword_1_0()); }
		'stop'
		{ after(grammarAccess.getActionAccess().getStopKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getGroup_1_1()); }
		(rule__Action__Group_1_1__0)
		{ after(grammarAccess.getActionAccess().getGroup_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getUnorderedGroup_1_2()); }
		(rule__Action__UnorderedGroup_1_2)
		{ after(grammarAccess.getActionAccess().getUnorderedGroup_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getGroup_1_3()); }
		(rule__Action__Group_1_3__0)
		{ after(grammarAccess.getActionAccess().getGroup_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getGroup_1_4()); }
		(rule__Action__Group_1_4__0)
		{ after(grammarAccess.getActionAccess().getGroup_1_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives_1_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0()); }
		'fetch'
		{ after(grammarAccess.getActionAccess().getFetchKeyword_1_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1()); }
		'deliver'
		{ after(grammarAccess.getActionAccess().getDeliverKeyword_1_2_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2()); }
		'leave'
		{ after(grammarAccess.getActionAccess().getLeaveKeyword_1_2_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_0()); }
		(rule__Condition__AtomicPredicateAssignment_0_0)
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getGroup_0_1()); }
		(rule__Condition__Group_0_1__0)
		{ after(grammarAccess.getConditionAccess().getGroup_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_1_0_0()); }
		'&&'
		{ after(grammarAccess.getConditionAccess().getAmpersandAmpersandKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getVerticalLineVerticalLineKeyword_1_0_1()); }
		'||'
		{ after(grammarAccess.getConditionAccess().getVerticalLineVerticalLineKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_0()); }
		(rule__Condition__AtomicPredicateAssignment_1_1_0)
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConditionAccess().getGroup_1_1_1()); }
		(rule__Condition__Group_1_1_1__0)
		{ after(grammarAccess.getConditionAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_0()); }
		(rule__AtomicPredicate__Group_0__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_1()); }
		(rule__AtomicPredicate__Group_1__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_2()); }
		(rule__AtomicPredicate__Group_2__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_3()); }
		(rule__AtomicPredicate__Group_3__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_4()); }
		(rule__AtomicPredicate__Group_4__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getGroup_5()); }
		(rule__AtomicPredicate__Group_5__0)
		{ after(grammarAccess.getAtomicPredicateAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getRelationAssignment_6()); }
		(rule__AtomicPredicate__RelationAssignment_6)
		{ after(grammarAccess.getAtomicPredicateAccess().getRelationAssignment_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getGroup_0()); }
		(rule__Relation__Group_0__0)
		{ after(grammarAccess.getRelationAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getGroup_1()); }
		(rule__Relation__Group_1__0)
		{ after(grammarAccess.getRelationAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives_0_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_0_6_0()); }
		'>'
		{ after(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_0_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getLessThanSignKeyword_0_6_1()); }
		'<'
		{ after(grammarAccess.getRelationAccess().getLessThanSignKeyword_0_6_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_0_6_2()); }
		'>='
		{ after(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_0_6_2()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_0_6_3()); }
		'<='
		{ after(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_0_6_3()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_0_6_4()); }
		'=='
		{ after(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_0_6_4()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_0_6_5()); }
		'!='
		{ after(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_0_6_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_4_0()); }
		'>'
		{ after(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getLessThanSignKeyword_1_4_1()); }
		'<'
		{ after(grammarAccess.getRelationAccess().getLessThanSignKeyword_1_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_4_2()); }
		'>='
		{ after(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_4_2()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_4_3()); }
		'<='
		{ after(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_4_3()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_4_4()); }
		'=='
		{ after(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_4_4()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_4_5()); }
		'!='
		{ after(grammarAccess.getRelationAccess().getExclamationMarkEqualsSignKeyword_1_4_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNLTerminalRuleCall_0()); }
	(RULE_NL)*
	{ after(grammarAccess.getModelAccess().getNLTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getPatternAssignment_1()); }
	(rule__Model__PatternAssignment_1)
	{ after(grammarAccess.getModelAccess().getPatternAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getSequenceAssignment_2()); }
	(rule__Model__SequenceAssignment_2)*
	{ after(grammarAccess.getModelAccess().getSequenceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getConclusionAssignment_3()); }
	(rule__Model__ConclusionAssignment_3)?
	{ after(grammarAccess.getModelAccess().getConclusionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group__0__Impl
	rule__Pattern__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getNameAssignment_0()); }
	(rule__Pattern__NameAssignment_0)
	{ after(grammarAccess.getPatternAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group__1__Impl
	rule__Pattern__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_1()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getAlternatives_2()); }
	(rule__Pattern__Alternatives_2)*
	{ after(grammarAccess.getPatternAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0__0__Impl
	rule__Pattern__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()); }
	'agents:'
	{ after(grammarAccess.getPatternAccess().getAgentsKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0__1__Impl
	rule__Pattern__Group_2_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0__2__Impl
	rule__Pattern__Group_2_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_2()); }
	(rule__Pattern__Group_2_0_2__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_3()); }
	(rule__Pattern__Group_2_0_3__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2__0__Impl
	rule__Pattern__Group_2_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()); }
	'Humans:'
	{ after(grammarAccess.getPatternAccess().getHumansKeyword_2_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2__1__Impl
	rule__Pattern__Group_2_0_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_2_1()); }
	(rule__Pattern__Group_2_0_2_1__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_2_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2_1__0__Impl
	rule__Pattern__Group_2_0_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_0()); }
	(rule__Pattern__HumanAssignment_2_0_2_1_0)
	{ after(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_2_1_1()); }
	(rule__Pattern__Group_2_0_2_1_1__0)*
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2_1_1__0__Impl
	rule__Pattern__Group_2_0_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getCommaKeyword_2_0_2_1_1_0()); }
	','
	{ after(grammarAccess.getPatternAccess().getCommaKeyword_2_0_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_1_1()); }
	(rule__Pattern__HumanAssignment_2_0_2_1_1_1)
	{ after(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3__0__Impl
	rule__Pattern__Group_2_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()); }
	'Robots:'
	{ after(grammarAccess.getPatternAccess().getRobotsKeyword_2_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3__1__Impl
	rule__Pattern__Group_2_0_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_3_1()); }
	(rule__Pattern__Group_2_0_3_1__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_0_3_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3_1__0__Impl
	rule__Pattern__Group_2_0_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_0()); }
	(rule__Pattern__RobotAssignment_2_0_3_1_0)
	{ after(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_0_3_1_1()); }
	(rule__Pattern__Group_2_0_3_1_1__0)*
	{ after(grammarAccess.getPatternAccess().getGroup_2_0_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_0_3_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3_1_1__0__Impl
	rule__Pattern__Group_2_0_3_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getCommaKeyword_2_0_3_1_1_0()); }
	','
	{ after(grammarAccess.getPatternAccess().getCommaKeyword_2_0_3_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_0_3_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_0_3_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_1_1()); }
	(rule__Pattern__RobotAssignment_2_0_3_1_1_1)
	{ after(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1__0__Impl
	rule__Pattern__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()); }
	'locations:'
	{ after(grammarAccess.getPatternAccess().getLocationsKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1__1__Impl
	rule__Pattern__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_1_1()); }
	(rule__Pattern__Group_2_1_1__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_1_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1_1__0__Impl
	rule__Pattern__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_0()); }
	(rule__Pattern__LocationsAssignment_2_1_1_0)
	{ after(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_1_1_1()); }
	(rule__Pattern__Group_2_1_1_1__0)*
	{ after(grammarAccess.getPatternAccess().getGroup_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1_1_1__0__Impl
	rule__Pattern__Group_2_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_1_0()); }
	','
	{ after(grammarAccess.getPatternAccess().getCommaKeyword_2_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_1_1()); }
	(rule__Pattern__LocationsAssignment_2_1_1_1_1)
	{ after(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2__0__Impl
	rule__Pattern__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()); }
	'resources:'
	{ after(grammarAccess.getPatternAccess().getResourcesKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2__1__Impl
	rule__Pattern__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_2_1()); }
	(rule__Pattern__Group_2_2_1__0)?
	{ after(grammarAccess.getPatternAccess().getGroup_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()); }
		(RULE_NL)
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()); }
	)
	(
		{ before(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()); }
		(RULE_NL)*
		{ after(grammarAccess.getPatternAccess().getNLTerminalRuleCall_2_2_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2_1__0__Impl
	rule__Pattern__Group_2_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_0()); }
	(rule__Pattern__ResourcesAssignment_2_2_1_0)
	{ after(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getGroup_2_2_1_1()); }
	(rule__Pattern__Group_2_2_1_1__0)*
	{ after(grammarAccess.getPatternAccess().getGroup_2_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Pattern__Group_2_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2_1_1__0__Impl
	rule__Pattern__Group_2_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getCommaKeyword_2_2_1_1_0()); }
	','
	{ after(grammarAccess.getPatternAccess().getCommaKeyword_2_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Pattern__Group_2_2_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__Group_2_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_1_1()); }
	(rule__Pattern__ResourcesAssignment_2_2_1_1_1)
	{ after(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group__0__Impl
	rule__Sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getAgentAssignment_0()); }
	(rule__Sequence__AgentAssignment_0)
	{ after(grammarAccess.getSequenceAccess().getAgentAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group__1__Impl
	rule__Sequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getGroup_1()); }
	(rule__Sequence__Group_1__0)?
	{ after(grammarAccess.getSequenceAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group__2__Impl
	rule__Sequence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getSequenceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group__3__Impl
	rule__Sequence__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3()); }
		(RULE_NL)
		{ after(grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3()); }
	)
	(
		{ before(grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3()); }
		(RULE_NL)*
		{ after(grammarAccess.getSequenceAccess().getNLTerminalRuleCall_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getSubSequenceAssignment_4()); }
	(rule__Sequence__SubSequenceAssignment_4)*
	{ after(grammarAccess.getSequenceAccess().getSubSequenceAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group_1__0__Impl
	rule__Sequence__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getDefaultKeyword_1_0()); }
	'default'
	{ after(grammarAccess.getSequenceAccess().getDefaultKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sequence__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSequenceAccess().getActionAssignment_1_1()); }
	(rule__Sequence__ActionAssignment_1_1)
	{ after(grammarAccess.getSequenceAccess().getActionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubSequence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group__0__Impl
	rule__SubSequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getIAssignment_0()); }
	(rule__SubSequence__IAssignment_0)
	{ after(grammarAccess.getSubSequenceAccess().getIAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group__1__Impl
	rule__SubSequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getGroup_1()); }
	(rule__SubSequence__Group_1__0)?
	{ after(grammarAccess.getSubSequenceAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group__2__Impl
	rule__SubSequence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getSubSequenceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSubSequenceAccess().getGroup_3()); }
		(rule__SubSequence__Group_3__0)
		{ after(grammarAccess.getSubSequenceAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getSubSequenceAccess().getGroup_3()); }
		(rule__SubSequence__Group_3__0)*
		{ after(grammarAccess.getSubSequenceAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubSequence__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_1__0__Impl
	rule__SubSequence__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getHyphenMinusKeyword_1_0()); }
	'-'
	{ after(grammarAccess.getSubSequenceAccess().getHyphenMinusKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getJAssignment_1_1()); }
	(rule__SubSequence__JAssignment_1_1)
	{ after(grammarAccess.getSubSequenceAccess().getJAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubSequence__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_3__0__Impl
	rule__SubSequence__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getAlternatives_3_0()); }
	(rule__SubSequence__Alternatives_3_0)?
	{ after(grammarAccess.getSubSequenceAccess().getAlternatives_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1()); }
	RULE_NL
	{ after(grammarAccess.getSubSequenceAccess().getNLTerminalRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubSequence__Group_3_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_3_0_1__0__Impl
	rule__SubSequence__Group_3_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getActionAssignment_3_0_1_0()); }
	(rule__SubSequence__ActionAssignment_3_0_1_0)
	{ after(grammarAccess.getSubSequenceAccess().getActionAssignment_3_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubSequence__Group_3_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__Group_3_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubSequenceAccess().getConditionalStatementAssignment_3_0_1_1()); }
	(rule__SubSequence__ConditionalStatementAssignment_3_0_1_1)?
	{ after(grammarAccess.getSubSequenceAccess().getConditionalStatementAssignment_3_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Conclusion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__0__Impl
	rule__Conclusion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getSuccessKeyword_0()); }
	'success:'
	{ after(grammarAccess.getConclusionAccess().getSuccessKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__1__Impl
	rule__Conclusion__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getConditionAssignment_1()); }
	(rule__Conclusion__ConditionAssignment_1)
	{ after(grammarAccess.getConclusionAccess().getConditionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__2__Impl
	rule__Conclusion__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getNLTerminalRuleCall_2()); }
	(RULE_NL)*
	{ after(grammarAccess.getConclusionAccess().getNLTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__3__Impl
	rule__Conclusion__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getFailureKeyword_3()); }
	'failure:'
	{ after(grammarAccess.getConclusionAccess().getFailureKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__4__Impl
	rule__Conclusion__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getConditionAssignment_4()); }
	(rule__Conclusion__ConditionAssignment_4)
	{ after(grammarAccess.getConclusionAccess().getConditionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conclusion__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConclusionAccess().getNLTerminalRuleCall_5()); }
	(RULE_NL)*
	{ after(grammarAccess.getConclusionAccess().getNLTerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Loop__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_0__0__Impl
	rule__Loop__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getSkipKeyword_0_0()); }
	'skip'
	{ after(grammarAccess.getLoopAccess().getSkipKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_0__1__Impl
	rule__Loop__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getAllKeyword_0_1()); }
	('all')?
	{ after(grammarAccess.getLoopAccess().getAllKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_0__2__Impl
	rule__Loop__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getIfKeyword_0_2()); }
	'if'
	{ after(grammarAccess.getLoopAccess().getIfKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getConditionAssignment_0_3()); }
	(rule__Loop__ConditionAssignment_0_3)
	{ after(grammarAccess.getLoopAccess().getConditionAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Loop__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_1__0__Impl
	rule__Loop__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getRestartKeyword_1_0()); }
	'restart'
	{ after(grammarAccess.getLoopAccess().getRestartKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_1__1__Impl
	rule__Loop__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getAllKeyword_1_1()); }
	('all')?
	{ after(grammarAccess.getLoopAccess().getAllKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_1__2__Impl
	rule__Loop__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getIfKeyword_1_2()); }
	'if'
	{ after(grammarAccess.getLoopAccess().getIfKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Loop__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopAccess().getConditionAssignment_1_3()); }
	(rule__Loop__ConditionAssignment_1_3)
	{ after(grammarAccess.getLoopAccess().getConditionAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalStatement__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_0__0__Impl
	rule__ConditionalStatement__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getUntilKeyword_0_0()); }
	'until'
	{ after(grammarAccess.getConditionalStatementAccess().getUntilKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getConditionAssignment_0_1()); }
	(rule__ConditionalStatement__ConditionAssignment_0_1)
	{ after(grammarAccess.getConditionalStatementAccess().getConditionAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalStatement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_1__0__Impl
	rule__ConditionalStatement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getIfKeyword_1_0()); }
	'if'
	{ after(grammarAccess.getConditionalStatementAccess().getIfKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_1__1__Impl
	rule__ConditionalStatement__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getConditionAssignment_1_1()); }
	(rule__ConditionalStatement__ConditionAssignment_1_1)
	{ after(grammarAccess.getConditionalStatementAccess().getConditionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_1__2__Impl
	rule__ConditionalStatement__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getElseKeyword_1_2()); }
	'else'
	{ after(grammarAccess.getConditionalStatementAccess().getElseKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getActionAssignment_1_3()); }
	(rule__ConditionalStatement__ActionAssignment_1_3)
	{ after(grammarAccess.getConditionalStatementAccess().getActionAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalStatement__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__0__Impl
	rule__ConditionalStatement__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getIfKeyword_2_0()); }
	'if'
	{ after(grammarAccess.getConditionalStatementAccess().getIfKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__1__Impl
	rule__ConditionalStatement__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_1()); }
	(rule__ConditionalStatement__ConditionAssignment_2_1)
	{ after(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__2__Impl
	rule__ConditionalStatement__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getElseKeyword_2_2()); }
	'else'
	{ after(grammarAccess.getConditionalStatementAccess().getElseKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__3__Impl
	rule__ConditionalStatement__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getActionAssignment_2_3()); }
	(rule__ConditionalStatement__ActionAssignment_2_3)
	{ after(grammarAccess.getConditionalStatementAccess().getActionAssignment_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__4__Impl
	rule__ConditionalStatement__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getUntilKeyword_2_4()); }
	'until'
	{ after(grammarAccess.getConditionalStatementAccess().getUntilKeyword_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_5()); }
	(rule__ConditionalStatement__ConditionAssignment_2_5)
	{ after(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalStatement__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_3__0__Impl
	rule__ConditionalStatement__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getWaitKeyword_3_0()); }
	'wait'
	{ after(grammarAccess.getConditionalStatementAccess().getWaitKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalStatement__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalStatementAccess().getNAssignment_3_1()); }
	(rule__ConditionalStatement__NAssignment_3_1)
	{ after(grammarAccess.getConditionalStatementAccess().getNAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getActionAction_0()); }
	()
	{ after(grammarAccess.getActionAccess().getActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getAlternatives_1()); }
	(rule__Action__Alternatives_1)
	{ after(grammarAccess.getActionAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_1__0__Impl
	rule__Action__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getMoveToKeyword_1_1_0()); }
	'moveTo'
	{ after(grammarAccess.getActionAccess().getMoveToKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getTargetAssignment_1_1_1()); }
	(rule__Action__TargetAssignment_1_1_1)
	{ after(grammarAccess.getActionAccess().getTargetAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3__0__Impl
	rule__Action__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getFollowKeyword_1_3_0()); }
	'follow'
	{ after(grammarAccess.getActionAccess().getFollowKeyword_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3__1__Impl
	rule__Action__Group_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getAgentAssignment_1_3_1()); }
	(rule__Action__AgentAssignment_1_3_1)
	{ after(grammarAccess.getActionAccess().getAgentAssignment_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getGroup_1_3_2()); }
	(rule__Action__Group_1_3_2__0)?
	{ after(grammarAccess.getActionAccess().getGroup_1_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_1_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3_2__0__Impl
	rule__Action__Group_1_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_3_2_0()); }
	'('
	{ after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_1_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3_2__1__Impl
	rule__Action__Group_1_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getTargetAssignment_1_3_2_1()); }
	(rule__Action__TargetAssignment_1_3_2_1)
	{ after(grammarAccess.getActionAccess().getTargetAssignment_1_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getRightParenthesisKeyword_1_3_2_2()); }
	')'
	{ after(grammarAccess.getActionAccess().getRightParenthesisKeyword_1_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_4__0__Impl
	rule__Action__Group_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getReceiveFromKeyword_1_4_0()); }
	'receiveFrom'
	{ after(grammarAccess.getActionAccess().getReceiveFromKeyword_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_1_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getAgentAssignment_1_4_1()); }
	(rule__Action__AgentAssignment_1_4_1)
	{ after(grammarAccess.getActionAccess().getAgentAssignment_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__0__Impl
	rule__Condition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAlternatives_0()); }
	(rule__Condition__Alternatives_0)
	{ after(grammarAccess.getConditionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getGroup_1()); }
	(rule__Condition__Group_1__0)*
	{ after(grammarAccess.getConditionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_0_1__0__Impl
	rule__Condition__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0_1_0()); }
	'!'
	{ after(grammarAccess.getConditionAccess().getExclamationMarkKeyword_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_1_1()); }
	(rule__Condition__AtomicPredicateAssignment_0_1_1)
	{ after(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1__0__Impl
	rule__Condition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAlternatives_1_0()); }
	(rule__Condition__Alternatives_1_0)
	{ after(grammarAccess.getConditionAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAlternatives_1_1()); }
	(rule__Condition__Alternatives_1_1)
	{ after(grammarAccess.getConditionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Condition__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1_1_1__0__Impl
	rule__Condition__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getExclamationMarkKeyword_1_1_1_0()); }
	'!'
	{ after(grammarAccess.getConditionAccess().getExclamationMarkKeyword_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Condition__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_1_1()); }
	(rule__Condition__AtomicPredicateAssignment_1_1_1_1)
	{ after(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_0__0__Impl
	rule__AtomicPredicate__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getAtomicPredicateAction_0_0()); }
	()
	{ after(grammarAccess.getAtomicPredicateAccess().getAtomicPredicateAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getTiredKeyword_0_1()); }
	'tired'
	{ after(grammarAccess.getAtomicPredicateAccess().getTiredKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_1__0__Impl
	rule__AtomicPredicate__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getTimeKeyword_1_0()); }
	'time'
	{ after(grammarAccess.getAtomicPredicateAccess().getTimeKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_1__1__Impl
	rule__AtomicPredicate__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_1__2__Impl
	rule__AtomicPredicate__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getNAssignment_1_2()); }
	(rule__AtomicPredicate__NAssignment_1_2)
	{ after(grammarAccess.getAtomicPredicateAccess().getNAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__0__Impl
	rule__AtomicPredicate__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getPositionKeyword_2_0()); }
	'position'
	{ after(grammarAccess.getAtomicPredicateAccess().getPositionKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__1__Impl
	rule__AtomicPredicate__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_2_1()); }
	'('
	{ after(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__2__Impl
	rule__AtomicPredicate__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_2_2()); }
	(rule__AtomicPredicate__AgentAssignment_2_2)
	{ after(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__3__Impl
	rule__AtomicPredicate__Group_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getCommaKeyword_2_3()); }
	','
	{ after(grammarAccess.getAtomicPredicateAccess().getCommaKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__4__Impl
	rule__AtomicPredicate__Group_2__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLocationAssignment_2_4()); }
	(rule__AtomicPredicate__LocationAssignment_2_4)
	{ after(grammarAccess.getAtomicPredicateAccess().getLocationAssignment_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_2__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_2__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_2_5()); }
	')'
	{ after(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_2_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__0__Impl
	rule__AtomicPredicate__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getPossessKeyword_3_0()); }
	'possess'
	{ after(grammarAccess.getAtomicPredicateAccess().getPossessKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__1__Impl
	rule__AtomicPredicate__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_3_1()); }
	'('
	{ after(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__2__Impl
	rule__AtomicPredicate__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_3_2()); }
	(rule__AtomicPredicate__AgentAssignment_3_2)
	{ after(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__3__Impl
	rule__AtomicPredicate__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getCommaKeyword_3_3()); }
	','
	{ after(grammarAccess.getAtomicPredicateAccess().getCommaKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__4__Impl
	rule__AtomicPredicate__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getResourceAssignment_3_4()); }
	(rule__AtomicPredicate__ResourceAssignment_3_4)
	{ after(grammarAccess.getAtomicPredicateAccess().getResourceAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_3_5()); }
	')'
	{ after(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_4__0__Impl
	rule__AtomicPredicate__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getBusyKeyword_4_0()); }
	'busy'
	{ after(grammarAccess.getAtomicPredicateAccess().getBusyKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_4__1__Impl
	rule__AtomicPredicate__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_4_1()); }
	'('
	{ after(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_4__2__Impl
	rule__AtomicPredicate__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_4_2()); }
	(rule__AtomicPredicate__AgentAssignment_4_2)
	{ after(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_4_3()); }
	')'
	{ after(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPredicate__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_5__0__Impl
	rule__AtomicPredicate__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getStillKeyword_5_0()); }
	'still'
	{ after(grammarAccess.getAtomicPredicateAccess().getStillKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_5__1__Impl
	rule__AtomicPredicate__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_5_1()); }
	'('
	{ after(grammarAccess.getAtomicPredicateAccess().getLeftParenthesisKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_5__2__Impl
	rule__AtomicPredicate__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_5_2()); }
	(rule__AtomicPredicate__AgentAssignment_5_2)
	{ after(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicPredicate__Group_5__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_5_3()); }
	')'
	{ after(grammarAccess.getAtomicPredicateAccess().getRightParenthesisKeyword_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__0__Impl
	rule__Relation__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getDistKeyword_0_0()); }
	'dist'
	{ after(grammarAccess.getRelationAccess().getDistKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__1__Impl
	rule__Relation__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__2__Impl
	rule__Relation__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAgentAssignment_0_2()); }
	(rule__Relation__AgentAssignment_0_2)
	{ after(grammarAccess.getRelationAccess().getAgentAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__3__Impl
	rule__Relation__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getCommaKeyword_0_3()); }
	','
	{ after(grammarAccess.getRelationAccess().getCommaKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__4__Impl
	rule__Relation__Group_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAgentAssignment_0_4()); }
	(rule__Relation__AgentAssignment_0_4)
	{ after(grammarAccess.getRelationAccess().getAgentAssignment_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__5__Impl
	rule__Relation__Group_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRightParenthesisKeyword_0_5()); }
	')'
	{ after(grammarAccess.getRelationAccess().getRightParenthesisKeyword_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__6__Impl
	rule__Relation__Group_0__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAlternatives_0_6()); }
	(rule__Relation__Alternatives_0_6)
	{ after(grammarAccess.getRelationAccess().getAlternatives_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getThAssignment_0_7()); }
	(rule__Relation__ThAssignment_0_7)
	{ after(grammarAccess.getRelationAccess().getThAssignment_0_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__0__Impl
	rule__Relation__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getSocKeyword_1_0()); }
	'soc'
	{ after(grammarAccess.getRelationAccess().getSocKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__1__Impl
	rule__Relation__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getRelationAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__2__Impl
	rule__Relation__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAgentAssignment_1_2()); }
	(rule__Relation__AgentAssignment_1_2)
	{ after(grammarAccess.getRelationAccess().getAgentAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__3__Impl
	rule__Relation__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getRelationAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__4__Impl
	rule__Relation__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAlternatives_1_4()); }
	(rule__Relation__Alternatives_1_4)
	{ after(grammarAccess.getRelationAccess().getAlternatives_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getThAssignment_1_5()); }
	(rule__Relation__ThAssignment_1_5)
	{ after(grammarAccess.getRelationAccess().getThAssignment_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__UnorderedGroup_1_2
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
	}
:
	rule__Action__UnorderedGroup_1_2__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getActionAccess().getUnorderedGroup_1_2())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
	restoreStackSize(stackSize);
}

rule__Action__UnorderedGroup_1_2__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActionAccess().getAlternatives_1_2_0()); }
					(rule__Action__Alternatives_1_2_0)
					{ after(grammarAccess.getActionAccess().getAlternatives_1_2_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getActionAccess().getResourceAssignment_1_2_1()); }
					(rule__Action__ResourceAssignment_1_2_1)
					{ after(grammarAccess.getActionAccess().getResourceAssignment_1_2_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_1_2());
	restoreStackSize(stackSize);
}

rule__Action__UnorderedGroup_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__UnorderedGroup_1_2__Impl
	rule__Action__UnorderedGroup_1_2__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__UnorderedGroup_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__UnorderedGroup_1_2__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__PatternAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getPatternPatternParserRuleCall_1_0()); }
		rulePattern
		{ after(grammarAccess.getModelAccess().getPatternPatternParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__SequenceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_2_0()); }
		ruleSequence
		{ after(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ConclusionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getConclusionConclusionParserRuleCall_3_0()); }
		ruleConclusion
		{ after(grammarAccess.getModelAccess().getConclusionConclusionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__HumanAssignment_2_0_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_0_0()); }
		ruleHuman
		{ after(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__HumanAssignment_2_0_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_1_1_0()); }
		ruleHuman
		{ after(grammarAccess.getPatternAccess().getHumanHumanParserRuleCall_2_0_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__RobotAssignment_2_0_3_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_0_0()); }
		ruleRobot
		{ after(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__RobotAssignment_2_0_3_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_1_1_0()); }
		ruleRobot
		{ after(grammarAccess.getPatternAccess().getRobotRobotParserRuleCall_2_0_3_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__LocationsAssignment_2_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_0_0()); }
		ruleLocation
		{ after(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__LocationsAssignment_2_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_1_1_0()); }
		ruleLocation
		{ after(grammarAccess.getPatternAccess().getLocationsLocationParserRuleCall_2_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__ResourcesAssignment_2_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_0_0()); }
		ruleResource
		{ after(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Pattern__ResourcesAssignment_2_2_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_1_1_0()); }
		ruleResource
		{ after(grammarAccess.getPatternAccess().getResourcesResourceParserRuleCall_2_2_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__AgentAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSequenceAccess().getAgentAgentParserRuleCall_0_0()); }
		ruleAgent
		{ after(grammarAccess.getSequenceAccess().getAgentAgentParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__ActionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSequenceAccess().getActionActionParserRuleCall_1_1_0()); }
		ruleAction
		{ after(grammarAccess.getSequenceAccess().getActionActionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__SubSequenceAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSequenceAccess().getSubSequenceSubSequenceParserRuleCall_4_0()); }
		ruleSubSequence
		{ after(grammarAccess.getSequenceAccess().getSubSequenceSubSequenceParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__IAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getIINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getSubSequenceAccess().getIINTTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__JAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getJINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getSubSequenceAccess().getJINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__LoopAssignment_3_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getLoopLoopParserRuleCall_3_0_0_0()); }
		ruleLoop
		{ after(grammarAccess.getSubSequenceAccess().getLoopLoopParserRuleCall_3_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__ActionAssignment_3_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getActionActionParserRuleCall_3_0_1_0_0()); }
		ruleAction
		{ after(grammarAccess.getSubSequenceAccess().getActionActionParserRuleCall_3_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubSequence__ConditionalStatementAssignment_3_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubSequenceAccess().getConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0()); }
		ruleConditionalStatement
		{ after(grammarAccess.getSubSequenceAccess().getConditionalStatementConditionalStatementParserRuleCall_3_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__ConditionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_1_0()); }
		ruleCondition
		{ after(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conclusion__ConditionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_4_0()); }
		ruleCondition
		{ after(grammarAccess.getConclusionAccess().getConditionConditionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__ConditionAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_0_3_0()); }
		ruleCondition
		{ after(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Loop__ConditionAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_1_3_0()); }
		ruleCondition
		{ after(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ConditionAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_0_1_0()); }
		ruleCondition
		{ after(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ConditionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_1_0()); }
		ruleCondition
		{ after(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ActionAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_1_3_0()); }
		ruleAction
		{ after(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ConditionAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_1_0()); }
		ruleCondition
		{ after(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ActionAssignment_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_2_3_0()); }
		ruleAction
		{ after(grammarAccess.getConditionalStatementAccess().getActionActionParserRuleCall_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__ConditionAssignment_2_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_5_0()); }
		ruleCondition
		{ after(grammarAccess.getConditionalStatementAccess().getConditionConditionParserRuleCall_2_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalStatement__NAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalStatementAccess().getNINTTerminalRuleCall_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getConditionalStatementAccess().getNINTTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__TargetAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_1_1_0()); }
		ruleTarget
		{ after(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__ResourceAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getResourceResourceParserRuleCall_1_2_1_0()); }
		ruleResource
		{ after(grammarAccess.getActionAccess().getResourceResourceParserRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__AgentAssignment_1_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_3_1_0()); }
		ruleAgent
		{ after(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__TargetAssignment_1_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_3_2_1_0()); }
		ruleTarget
		{ after(grammarAccess.getActionAccess().getTargetTargetParserRuleCall_1_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__AgentAssignment_1_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_4_1_0()); }
		ruleAgent
		{ after(grammarAccess.getActionAccess().getAgentAgentParserRuleCall_1_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__AtomicPredicateAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_0_0()); }
		ruleAtomicPredicate
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__AtomicPredicateAssignment_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0()); }
		ruleAtomicPredicate
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__AtomicPredicateAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0()); }
		ruleAtomicPredicate
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Condition__AtomicPredicateAssignment_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0()); }
		ruleAtomicPredicate
		{ after(grammarAccess.getConditionAccess().getAtomicPredicateAtomicPredicateParserRuleCall_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__NAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getNINTTerminalRuleCall_1_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAtomicPredicateAccess().getNINTTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__AgentAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_2_2_0()); }
		ruleAgent
		{ after(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__LocationAssignment_2_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getLocationLocationParserRuleCall_2_4_0()); }
		ruleLocation
		{ after(grammarAccess.getAtomicPredicateAccess().getLocationLocationParserRuleCall_2_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__AgentAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_3_2_0()); }
		ruleAgent
		{ after(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__ResourceAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getResourceResourceParserRuleCall_3_4_0()); }
		ruleResource
		{ after(grammarAccess.getAtomicPredicateAccess().getResourceResourceParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__AgentAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_4_2_0()); }
		ruleAgent
		{ after(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__AgentAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_5_2_0()); }
		ruleAgent
		{ after(grammarAccess.getAtomicPredicateAccess().getAgentAgentParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPredicate__RelationAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicPredicateAccess().getRelationRelationParserRuleCall_6_0()); }
		ruleRelation
		{ after(grammarAccess.getAtomicPredicateAccess().getRelationRelationParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__AgentAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_2_0()); }
		ruleAgent
		{ after(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__AgentAssignment_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_4_0()); }
		ruleAgent
		{ after(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ThAssignment_0_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getThINTTerminalRuleCall_0_7_0()); }
		RULE_INT
		{ after(grammarAccess.getRelationAccess().getThINTTerminalRuleCall_0_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__AgentAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_1_2_0()); }
		ruleAgent
		{ after(grammarAccess.getRelationAccess().getAgentAgentParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ThAssignment_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getThINTTerminalRuleCall_1_5_0()); }
		RULE_INT
		{ after(grammarAccess.getRelationAccess().getThINTTerminalRuleCall_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Target__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Human__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Robot__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Location__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Resource__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NL : (' '* '\r'? '\n' '\t'*)+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
