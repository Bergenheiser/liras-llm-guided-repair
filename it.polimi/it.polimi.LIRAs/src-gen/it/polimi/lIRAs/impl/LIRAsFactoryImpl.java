/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LIRAsFactoryImpl extends EFactoryImpl implements LIRAsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LIRAsFactory init()
  {
    try
    {
      LIRAsFactory theLIRAsFactory = (LIRAsFactory)EPackage.Registry.INSTANCE.getEFactory(LIRAsPackage.eNS_URI);
      if (theLIRAsFactory != null)
      {
        return theLIRAsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LIRAsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LIRAsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LIRAsPackage.MODEL: return createModel();
      case LIRAsPackage.PATTERN: return createPattern();
      case LIRAsPackage.SEQUENCE: return createSequence();
      case LIRAsPackage.SUB_SEQUENCE: return createSubSequence();
      case LIRAsPackage.CONCLUSION: return createConclusion();
      case LIRAsPackage.LOOP: return createLoop();
      case LIRAsPackage.CONDITIONAL_STATEMENT: return createConditionalStatement();
      case LIRAsPackage.ACTION: return createAction();
      case LIRAsPackage.CONDITION: return createCondition();
      case LIRAsPackage.ATOMIC_PREDICATE: return createAtomicPredicate();
      case LIRAsPackage.RELATION: return createRelation();
      case LIRAsPackage.TARGET: return createTarget();
      case LIRAsPackage.AGENT: return createAgent();
      case LIRAsPackage.HUMAN: return createHuman();
      case LIRAsPackage.ROBOT: return createRobot();
      case LIRAsPackage.LOCATION: return createLocation();
      case LIRAsPackage.RESOURCE: return createResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubSequence createSubSequence()
  {
    SubSequenceImpl subSequence = new SubSequenceImpl();
    return subSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conclusion createConclusion()
  {
    ConclusionImpl conclusion = new ConclusionImpl();
    return conclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalStatement createConditionalStatement()
  {
    ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
    return conditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicPredicate createAtomicPredicate()
  {
    AtomicPredicateImpl atomicPredicate = new AtomicPredicateImpl();
    return atomicPredicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Human createHuman()
  {
    HumanImpl human = new HumanImpl();
    return human;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LIRAsPackage getLIRAsPackage()
  {
    return (LIRAsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LIRAsPackage getPackage()
  {
    return LIRAsPackage.eINSTANCE;
  }

} //LIRAsFactoryImpl
