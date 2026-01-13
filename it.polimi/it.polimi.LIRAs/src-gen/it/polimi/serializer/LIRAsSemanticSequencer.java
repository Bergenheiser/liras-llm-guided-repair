/*
 * generated  by Xtext 2.41.0
 */
package it.polimi.serializer;

import com.google.inject.Inject;
import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.AtomicPredicate;
import it.polimi.lIRAs.Conclusion;
import it.polimi.lIRAs.Condition;
import it.polimi.lIRAs.ConditionalStatement;
import it.polimi.lIRAs.Human;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Location;
import it.polimi.lIRAs.Loop;
import it.polimi.lIRAs.Model;
import it.polimi.lIRAs.Pattern;
import it.polimi.lIRAs.Relation;
import it.polimi.lIRAs.Resource;
import it.polimi.lIRAs.Robot;
import it.polimi.lIRAs.Sequence;
import it.polimi.lIRAs.SubSequence;
import it.polimi.lIRAs.Target;
import it.polimi.services.LIRAsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LIRAsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LIRAsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LIRAsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LIRAsPackage.ACTION:
				sequence_Action(context, (it.polimi.lIRAs.Action) semanticObject); 
				return; 
			case LIRAsPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case LIRAsPackage.ATOMIC_PREDICATE:
				sequence_AtomicPredicate(context, (AtomicPredicate) semanticObject); 
				return; 
			case LIRAsPackage.CONCLUSION:
				sequence_Conclusion(context, (Conclusion) semanticObject); 
				return; 
			case LIRAsPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case LIRAsPackage.CONDITIONAL_STATEMENT:
				sequence_ConditionalStatement(context, (ConditionalStatement) semanticObject); 
				return; 
			case LIRAsPackage.HUMAN:
				sequence_Human(context, (Human) semanticObject); 
				return; 
			case LIRAsPackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case LIRAsPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case LIRAsPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case LIRAsPackage.PATTERN:
				sequence_Pattern(context, (Pattern) semanticObject); 
				return; 
			case LIRAsPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			case LIRAsPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case LIRAsPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case LIRAsPackage.SEQUENCE:
				sequence_Sequence(context, (Sequence) semanticObject); 
				return; 
			case LIRAsPackage.SUB_SEQUENCE:
				sequence_SubSequence(context, (SubSequence) semanticObject); 
				return; 
			case LIRAsPackage.TARGET:
				sequence_Target(context, (Target) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (target=Target | resource=Resource+ | (agent=Agent target=Target?) | agent=Agent)?
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, it.polimi.lIRAs.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Agent returns Agent
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Agent(ISerializationContext context, Agent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.AGENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.AGENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AtomicPredicate returns AtomicPredicate
	 *
	 * Constraint:
	 *     (
	 *         n=INT | 
	 *         (agent=Agent location=Location) | 
	 *         (agent=Agent resource=Resource) | 
	 *         agent=Agent | 
	 *         agent=Agent | 
	 *         relation=Relation
	 *     )?
	 * </pre>
	 */
	protected void sequence_AtomicPredicate(ISerializationContext context, AtomicPredicate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Conclusion returns Conclusion
	 *
	 * Constraint:
	 *     (condition+=Condition condition+=Condition)
	 * </pre>
	 */
	protected void sequence_Conclusion(ISerializationContext context, Conclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (
	 *         (atomicPredicate+=AtomicPredicate | atomicPredicate+=AtomicPredicate) 
	 *         atomicPredicate+=AtomicPredicate? 
	 *         (atomicPredicate+=AtomicPredicate? atomicPredicate+=AtomicPredicate?)*
	 *     )
	 * </pre>
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ConditionalStatement returns ConditionalStatement
	 *
	 * Constraint:
	 *     (condition+=Condition | (condition+=Condition action=Action) | (condition+=Condition action=Action condition+=Condition) | n=INT)
	 * </pre>
	 */
	protected void sequence_ConditionalStatement(ISerializationContext context, ConditionalStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Human returns Human
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Human(ISerializationContext context, Human semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.HUMAN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.HUMAN__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Location returns Location
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.LOCATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.LOCATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (condition=Condition | condition=Condition)
	 * </pre>
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (pattern=Pattern sequence+=Sequence* conclusion=Conclusion?)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Pattern returns Pattern
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ((human+=Human human+=Human*) | (robot+=Robot robot+=Robot*) | (locations+=Location locations+=Location*) | (resources+=Resource resources+=Resource*))*
	 *     )
	 * </pre>
	 */
	protected void sequence_Pattern(ISerializationContext context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     ((agent+=Agent agent+=Agent th=INT) | (agent+=Agent th=INT))
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.RESOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.ROBOT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.ROBOT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Sequence returns Sequence
	 *
	 * Constraint:
	 *     (agent=Agent action=Action? subSequence+=SubSequence*)
	 * </pre>
	 */
	protected void sequence_Sequence(ISerializationContext context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SubSequence returns SubSequence
	 *
	 * Constraint:
	 *     (i=INT j=INT? (loop+=Loop? (action+=Action conditionalStatement+=ConditionalStatement?)?)+)
	 * </pre>
	 */
	protected void sequence_SubSequence(ISerializationContext context, SubSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Target returns Target
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_Target(ISerializationContext context, Target semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LIRAsPackage.Literals.TARGET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LIRAsPackage.Literals.TARGET__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTargetAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
