/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import it.polimi.ide.contentassist.antlr.internal.InternalLIRAsParser;
import it.polimi.services.LIRAsGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LIRAsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LIRAsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LIRAsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPatternAccess().getAlternatives_2(), "rule__Pattern__Alternatives_2");
			builder.put(grammarAccess.getSubSequenceAccess().getAlternatives_3_0(), "rule__SubSequence__Alternatives_3_0");
			builder.put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
			builder.put(grammarAccess.getConditionalStatementAccess().getAlternatives(), "rule__ConditionalStatement__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives_1(), "rule__Action__Alternatives_1");
			builder.put(grammarAccess.getActionAccess().getAlternatives_1_2_0(), "rule__Action__Alternatives_1_2_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives_0(), "rule__Condition__Alternatives_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives_1_0(), "rule__Condition__Alternatives_1_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives_1_1(), "rule__Condition__Alternatives_1_1");
			builder.put(grammarAccess.getAtomicPredicateAccess().getAlternatives(), "rule__AtomicPredicate__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_0_6(), "rule__Relation__Alternatives_0_6");
			builder.put(grammarAccess.getRelationAccess().getAlternatives_1_4(), "rule__Relation__Alternatives_1_4");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0(), "rule__Pattern__Group_2_0__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_2(), "rule__Pattern__Group_2_0_2__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_2_1(), "rule__Pattern__Group_2_0_2_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_2_1_1(), "rule__Pattern__Group_2_0_2_1_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_3(), "rule__Pattern__Group_2_0_3__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_3_1(), "rule__Pattern__Group_2_0_3_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_0_3_1_1(), "rule__Pattern__Group_2_0_3_1_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_1(), "rule__Pattern__Group_2_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_1_1(), "rule__Pattern__Group_2_1_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_1_1_1(), "rule__Pattern__Group_2_1_1_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_2(), "rule__Pattern__Group_2_2__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_2_1(), "rule__Pattern__Group_2_2_1__0");
			builder.put(grammarAccess.getPatternAccess().getGroup_2_2_1_1(), "rule__Pattern__Group_2_2_1_1__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
			builder.put(grammarAccess.getSequenceAccess().getGroup_1(), "rule__Sequence__Group_1__0");
			builder.put(grammarAccess.getSubSequenceAccess().getGroup(), "rule__SubSequence__Group__0");
			builder.put(grammarAccess.getSubSequenceAccess().getGroup_1(), "rule__SubSequence__Group_1__0");
			builder.put(grammarAccess.getSubSequenceAccess().getGroup_3(), "rule__SubSequence__Group_3__0");
			builder.put(grammarAccess.getSubSequenceAccess().getGroup_3_0_1(), "rule__SubSequence__Group_3_0_1__0");
			builder.put(grammarAccess.getConclusionAccess().getGroup(), "rule__Conclusion__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_0(), "rule__Loop__Group_0__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_1(), "rule__Loop__Group_1__0");
			builder.put(grammarAccess.getConditionalStatementAccess().getGroup_0(), "rule__ConditionalStatement__Group_0__0");
			builder.put(grammarAccess.getConditionalStatementAccess().getGroup_1(), "rule__ConditionalStatement__Group_1__0");
			builder.put(grammarAccess.getConditionalStatementAccess().getGroup_2(), "rule__ConditionalStatement__Group_2__0");
			builder.put(grammarAccess.getConditionalStatementAccess().getGroup_3(), "rule__ConditionalStatement__Group_3__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1_1(), "rule__Action__Group_1_1__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1_3(), "rule__Action__Group_1_3__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1_3_2(), "rule__Action__Group_1_3_2__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1_4(), "rule__Action__Group_1_4__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_0_1(), "rule__Condition__Group_0_1__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_1_1_1(), "rule__Condition__Group_1_1_1__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_0(), "rule__AtomicPredicate__Group_0__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_1(), "rule__AtomicPredicate__Group_1__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_2(), "rule__AtomicPredicate__Group_2__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_3(), "rule__AtomicPredicate__Group_3__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_4(), "rule__AtomicPredicate__Group_4__0");
			builder.put(grammarAccess.getAtomicPredicateAccess().getGroup_5(), "rule__AtomicPredicate__Group_5__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_0(), "rule__Relation__Group_0__0");
			builder.put(grammarAccess.getRelationAccess().getGroup_1(), "rule__Relation__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getPatternAssignment_1(), "rule__Model__PatternAssignment_1");
			builder.put(grammarAccess.getModelAccess().getSequenceAssignment_2(), "rule__Model__SequenceAssignment_2");
			builder.put(grammarAccess.getModelAccess().getConclusionAssignment_3(), "rule__Model__ConclusionAssignment_3");
			builder.put(grammarAccess.getPatternAccess().getNameAssignment_0(), "rule__Pattern__NameAssignment_0");
			builder.put(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_0(), "rule__Pattern__HumanAssignment_2_0_2_1_0");
			builder.put(grammarAccess.getPatternAccess().getHumanAssignment_2_0_2_1_1_1(), "rule__Pattern__HumanAssignment_2_0_2_1_1_1");
			builder.put(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_0(), "rule__Pattern__RobotAssignment_2_0_3_1_0");
			builder.put(grammarAccess.getPatternAccess().getRobotAssignment_2_0_3_1_1_1(), "rule__Pattern__RobotAssignment_2_0_3_1_1_1");
			builder.put(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_0(), "rule__Pattern__LocationsAssignment_2_1_1_0");
			builder.put(grammarAccess.getPatternAccess().getLocationsAssignment_2_1_1_1_1(), "rule__Pattern__LocationsAssignment_2_1_1_1_1");
			builder.put(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_0(), "rule__Pattern__ResourcesAssignment_2_2_1_0");
			builder.put(grammarAccess.getPatternAccess().getResourcesAssignment_2_2_1_1_1(), "rule__Pattern__ResourcesAssignment_2_2_1_1_1");
			builder.put(grammarAccess.getSequenceAccess().getAgentAssignment_0(), "rule__Sequence__AgentAssignment_0");
			builder.put(grammarAccess.getSequenceAccess().getActionAssignment_1_1(), "rule__Sequence__ActionAssignment_1_1");
			builder.put(grammarAccess.getSequenceAccess().getSubSequenceAssignment_4(), "rule__Sequence__SubSequenceAssignment_4");
			builder.put(grammarAccess.getSubSequenceAccess().getIAssignment_0(), "rule__SubSequence__IAssignment_0");
			builder.put(grammarAccess.getSubSequenceAccess().getJAssignment_1_1(), "rule__SubSequence__JAssignment_1_1");
			builder.put(grammarAccess.getSubSequenceAccess().getLoopAssignment_3_0_0(), "rule__SubSequence__LoopAssignment_3_0_0");
			builder.put(grammarAccess.getSubSequenceAccess().getActionAssignment_3_0_1_0(), "rule__SubSequence__ActionAssignment_3_0_1_0");
			builder.put(grammarAccess.getSubSequenceAccess().getConditionalStatementAssignment_3_0_1_1(), "rule__SubSequence__ConditionalStatementAssignment_3_0_1_1");
			builder.put(grammarAccess.getConclusionAccess().getConditionAssignment_1(), "rule__Conclusion__ConditionAssignment_1");
			builder.put(grammarAccess.getConclusionAccess().getConditionAssignment_4(), "rule__Conclusion__ConditionAssignment_4");
			builder.put(grammarAccess.getLoopAccess().getConditionAssignment_0_3(), "rule__Loop__ConditionAssignment_0_3");
			builder.put(grammarAccess.getLoopAccess().getConditionAssignment_1_3(), "rule__Loop__ConditionAssignment_1_3");
			builder.put(grammarAccess.getConditionalStatementAccess().getConditionAssignment_0_1(), "rule__ConditionalStatement__ConditionAssignment_0_1");
			builder.put(grammarAccess.getConditionalStatementAccess().getConditionAssignment_1_1(), "rule__ConditionalStatement__ConditionAssignment_1_1");
			builder.put(grammarAccess.getConditionalStatementAccess().getActionAssignment_1_3(), "rule__ConditionalStatement__ActionAssignment_1_3");
			builder.put(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_1(), "rule__ConditionalStatement__ConditionAssignment_2_1");
			builder.put(grammarAccess.getConditionalStatementAccess().getActionAssignment_2_3(), "rule__ConditionalStatement__ActionAssignment_2_3");
			builder.put(grammarAccess.getConditionalStatementAccess().getConditionAssignment_2_5(), "rule__ConditionalStatement__ConditionAssignment_2_5");
			builder.put(grammarAccess.getConditionalStatementAccess().getNAssignment_3_1(), "rule__ConditionalStatement__NAssignment_3_1");
			builder.put(grammarAccess.getActionAccess().getTargetAssignment_1_1_1(), "rule__Action__TargetAssignment_1_1_1");
			builder.put(grammarAccess.getActionAccess().getResourceAssignment_1_2_1(), "rule__Action__ResourceAssignment_1_2_1");
			builder.put(grammarAccess.getActionAccess().getAgentAssignment_1_3_1(), "rule__Action__AgentAssignment_1_3_1");
			builder.put(grammarAccess.getActionAccess().getTargetAssignment_1_3_2_1(), "rule__Action__TargetAssignment_1_3_2_1");
			builder.put(grammarAccess.getActionAccess().getAgentAssignment_1_4_1(), "rule__Action__AgentAssignment_1_4_1");
			builder.put(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_0(), "rule__Condition__AtomicPredicateAssignment_0_0");
			builder.put(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_0_1_1(), "rule__Condition__AtomicPredicateAssignment_0_1_1");
			builder.put(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_0(), "rule__Condition__AtomicPredicateAssignment_1_1_0");
			builder.put(grammarAccess.getConditionAccess().getAtomicPredicateAssignment_1_1_1_1(), "rule__Condition__AtomicPredicateAssignment_1_1_1_1");
			builder.put(grammarAccess.getAtomicPredicateAccess().getNAssignment_1_2(), "rule__AtomicPredicate__NAssignment_1_2");
			builder.put(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_2_2(), "rule__AtomicPredicate__AgentAssignment_2_2");
			builder.put(grammarAccess.getAtomicPredicateAccess().getLocationAssignment_2_4(), "rule__AtomicPredicate__LocationAssignment_2_4");
			builder.put(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_3_2(), "rule__AtomicPredicate__AgentAssignment_3_2");
			builder.put(grammarAccess.getAtomicPredicateAccess().getResourceAssignment_3_4(), "rule__AtomicPredicate__ResourceAssignment_3_4");
			builder.put(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_4_2(), "rule__AtomicPredicate__AgentAssignment_4_2");
			builder.put(grammarAccess.getAtomicPredicateAccess().getAgentAssignment_5_2(), "rule__AtomicPredicate__AgentAssignment_5_2");
			builder.put(grammarAccess.getAtomicPredicateAccess().getRelationAssignment_6(), "rule__AtomicPredicate__RelationAssignment_6");
			builder.put(grammarAccess.getRelationAccess().getAgentAssignment_0_2(), "rule__Relation__AgentAssignment_0_2");
			builder.put(grammarAccess.getRelationAccess().getAgentAssignment_0_4(), "rule__Relation__AgentAssignment_0_4");
			builder.put(grammarAccess.getRelationAccess().getThAssignment_0_7(), "rule__Relation__ThAssignment_0_7");
			builder.put(grammarAccess.getRelationAccess().getAgentAssignment_1_2(), "rule__Relation__AgentAssignment_1_2");
			builder.put(grammarAccess.getRelationAccess().getThAssignment_1_5(), "rule__Relation__ThAssignment_1_5");
			builder.put(grammarAccess.getTargetAccess().getNameAssignment(), "rule__Target__NameAssignment");
			builder.put(grammarAccess.getAgentAccess().getNameAssignment(), "rule__Agent__NameAssignment");
			builder.put(grammarAccess.getHumanAccess().getNameAssignment(), "rule__Human__NameAssignment");
			builder.put(grammarAccess.getRobotAccess().getNameAssignment(), "rule__Robot__NameAssignment");
			builder.put(grammarAccess.getLocationAccess().getNameAssignment(), "rule__Location__NameAssignment");
			builder.put(grammarAccess.getResourceAccess().getNameAssignment(), "rule__Resource__NameAssignment");
			builder.put(grammarAccess.getActionAccess().getUnorderedGroup_1_2(), "rule__Action__UnorderedGroup_1_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LIRAsGrammarAccess grammarAccess;

	@Override
	protected InternalLIRAsParser createParser() {
		InternalLIRAsParser result = new InternalLIRAsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LIRAsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LIRAsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
