/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.polimi.lIRAs.LIRAsFactory
 * @model kind="package"
 * @generated
 */
public interface LIRAsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lIRAs";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.polimi.it/LIRAs";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lIRAs";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LIRAsPackage eINSTANCE = it.polimi.lIRAs.impl.LIRAsPackageImpl.init();

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ModelImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SEQUENCE = 1;

  /**
   * The feature id for the '<em><b>Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONCLUSION = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.PatternImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Human</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__HUMAN = 1;

  /**
   * The feature id for the '<em><b>Robot</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__ROBOT = 2;

  /**
   * The feature id for the '<em><b>Locations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__LOCATIONS = 3;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__RESOURCES = 4;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.SequenceImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 2;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__AGENT = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__ACTION = 1;

  /**
   * The feature id for the '<em><b>Sub Sequence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__SUB_SEQUENCE = 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.SubSequenceImpl <em>Sub Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.SubSequenceImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getSubSequence()
   * @generated
   */
  int SUB_SEQUENCE = 3;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE__I = 0;

  /**
   * The feature id for the '<em><b>J</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE__J = 1;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE__LOOP = 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE__ACTION = 3;

  /**
   * The feature id for the '<em><b>Conditional Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE__CONDITIONAL_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Sub Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SEQUENCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ConclusionImpl <em>Conclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ConclusionImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getConclusion()
   * @generated
   */
  int CONCLUSION = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCLUSION__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Conclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCLUSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.LoopImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 5;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ConditionalStatementImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getConditionalStatement()
   * @generated
   */
  int CONDITIONAL_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__ACTION = 1;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT__N = 2;

  /**
   * The number of structural features of the '<em>Conditional Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ActionImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TARGET = 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__AGENT = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ConditionImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Atomic Predicate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ATOMIC_PREDICATE = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.AtomicPredicateImpl <em>Atomic Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.AtomicPredicateImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAtomicPredicate()
   * @generated
   */
  int ATOMIC_PREDICATE = 9;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE__N = 0;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE__AGENT = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE__LOCATION = 2;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE__RESOURCE = 3;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE__RELATION = 4;

  /**
   * The number of structural features of the '<em>Atomic Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PREDICATE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.RelationImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 10;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__AGENT = 0;

  /**
   * The feature id for the '<em><b>Th</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TH = 1;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.TargetImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__NAME = 0;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.AgentImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.HumanImpl <em>Human</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.HumanImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getHuman()
   * @generated
   */
  int HUMAN = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN__NAME = 0;

  /**
   * The number of structural features of the '<em>Human</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUMAN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.RobotImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__NAME = 0;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.LocationImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.polimi.lIRAs.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.polimi.lIRAs.impl.ResourceImpl
   * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see it.polimi.lIRAs.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Model#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see it.polimi.lIRAs.Model#getPattern()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Pattern();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Model#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence</em>'.
   * @see it.polimi.lIRAs.Model#getSequence()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sequence();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Model#getConclusion <em>Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conclusion</em>'.
   * @see it.polimi.lIRAs.Model#getConclusion()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Conclusion();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see it.polimi.lIRAs.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Pattern#getHuman <em>Human</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Human</em>'.
   * @see it.polimi.lIRAs.Pattern#getHuman()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Human();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Pattern#getRobot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Robot</em>'.
   * @see it.polimi.lIRAs.Pattern#getRobot()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Robot();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Pattern#getLocations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locations</em>'.
   * @see it.polimi.lIRAs.Pattern#getLocations()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Locations();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Pattern#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see it.polimi.lIRAs.Pattern#getResources()
   * @see #getPattern()
   * @generated
   */
  EReference getPattern_Resources();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see it.polimi.lIRAs.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Sequence#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Agent</em>'.
   * @see it.polimi.lIRAs.Sequence#getAgent()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Agent();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Sequence#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see it.polimi.lIRAs.Sequence#getAction()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Action();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Sequence#getSubSequence <em>Sub Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Sequence</em>'.
   * @see it.polimi.lIRAs.Sequence#getSubSequence()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_SubSequence();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.SubSequence <em>Sub Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Sequence</em>'.
   * @see it.polimi.lIRAs.SubSequence
   * @generated
   */
  EClass getSubSequence();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.SubSequence#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see it.polimi.lIRAs.SubSequence#getI()
   * @see #getSubSequence()
   * @generated
   */
  EAttribute getSubSequence_I();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.SubSequence#getJ <em>J</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>J</em>'.
   * @see it.polimi.lIRAs.SubSequence#getJ()
   * @see #getSubSequence()
   * @generated
   */
  EAttribute getSubSequence_J();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.SubSequence#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loop</em>'.
   * @see it.polimi.lIRAs.SubSequence#getLoop()
   * @see #getSubSequence()
   * @generated
   */
  EReference getSubSequence_Loop();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.SubSequence#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see it.polimi.lIRAs.SubSequence#getAction()
   * @see #getSubSequence()
   * @generated
   */
  EReference getSubSequence_Action();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.SubSequence#getConditionalStatement <em>Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditional Statement</em>'.
   * @see it.polimi.lIRAs.SubSequence#getConditionalStatement()
   * @see #getSubSequence()
   * @generated
   */
  EReference getSubSequence_ConditionalStatement();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Conclusion <em>Conclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conclusion</em>'.
   * @see it.polimi.lIRAs.Conclusion
   * @generated
   */
  EClass getConclusion();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Conclusion#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see it.polimi.lIRAs.Conclusion#getCondition()
   * @see #getConclusion()
   * @generated
   */
  EReference getConclusion_Condition();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see it.polimi.lIRAs.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Loop#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see it.polimi.lIRAs.Loop#getCondition()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Condition();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.ConditionalStatement <em>Conditional Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Statement</em>'.
   * @see it.polimi.lIRAs.ConditionalStatement
   * @generated
   */
  EClass getConditionalStatement();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.ConditionalStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see it.polimi.lIRAs.ConditionalStatement#getCondition()
   * @see #getConditionalStatement()
   * @generated
   */
  EReference getConditionalStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.ConditionalStatement#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see it.polimi.lIRAs.ConditionalStatement#getAction()
   * @see #getConditionalStatement()
   * @generated
   */
  EReference getConditionalStatement_Action();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.ConditionalStatement#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see it.polimi.lIRAs.ConditionalStatement#getN()
   * @see #getConditionalStatement()
   * @generated
   */
  EAttribute getConditionalStatement_N();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see it.polimi.lIRAs.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Action#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see it.polimi.lIRAs.Action#getTarget()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Target();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Action#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see it.polimi.lIRAs.Action#getResource()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Resource();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.Action#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Agent</em>'.
   * @see it.polimi.lIRAs.Action#getAgent()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Agent();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see it.polimi.lIRAs.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Condition#getAtomicPredicate <em>Atomic Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atomic Predicate</em>'.
   * @see it.polimi.lIRAs.Condition#getAtomicPredicate()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_AtomicPredicate();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.AtomicPredicate <em>Atomic Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Predicate</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate
   * @generated
   */
  EClass getAtomicPredicate();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.AtomicPredicate#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate#getN()
   * @see #getAtomicPredicate()
   * @generated
   */
  EAttribute getAtomicPredicate_N();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.AtomicPredicate#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Agent</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate#getAgent()
   * @see #getAtomicPredicate()
   * @generated
   */
  EReference getAtomicPredicate_Agent();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.AtomicPredicate#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Location</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate#getLocation()
   * @see #getAtomicPredicate()
   * @generated
   */
  EReference getAtomicPredicate_Location();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.AtomicPredicate#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate#getResource()
   * @see #getAtomicPredicate()
   * @generated
   */
  EReference getAtomicPredicate_Resource();

  /**
   * Returns the meta object for the containment reference '{@link it.polimi.lIRAs.AtomicPredicate#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see it.polimi.lIRAs.AtomicPredicate#getRelation()
   * @see #getAtomicPredicate()
   * @generated
   */
  EReference getAtomicPredicate_Relation();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see it.polimi.lIRAs.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the containment reference list '{@link it.polimi.lIRAs.Relation#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agent</em>'.
   * @see it.polimi.lIRAs.Relation#getAgent()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Agent();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Relation#getTh <em>Th</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Th</em>'.
   * @see it.polimi.lIRAs.Relation#getTh()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Th();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see it.polimi.lIRAs.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Target#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Target#getName()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Name();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see it.polimi.lIRAs.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Human <em>Human</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Human</em>'.
   * @see it.polimi.lIRAs.Human
   * @generated
   */
  EClass getHuman();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Human#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Human#getName()
   * @see #getHuman()
   * @generated
   */
  EAttribute getHuman_Name();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see it.polimi.lIRAs.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Robot#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Robot#getName()
   * @see #getRobot()
   * @generated
   */
  EAttribute getRobot_Name();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see it.polimi.lIRAs.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Location#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Location#getName()
   * @see #getLocation()
   * @generated
   */
  EAttribute getLocation_Name();

  /**
   * Returns the meta object for class '{@link it.polimi.lIRAs.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see it.polimi.lIRAs.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link it.polimi.lIRAs.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.polimi.lIRAs.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LIRAsFactory getLIRAsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ModelImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PATTERN = eINSTANCE.getModel_Pattern();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SEQUENCE = eINSTANCE.getModel_Sequence();

    /**
     * The meta object literal for the '<em><b>Conclusion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONCLUSION = eINSTANCE.getModel_Conclusion();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.PatternImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

    /**
     * The meta object literal for the '<em><b>Human</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__HUMAN = eINSTANCE.getPattern_Human();

    /**
     * The meta object literal for the '<em><b>Robot</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__ROBOT = eINSTANCE.getPattern_Robot();

    /**
     * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__LOCATIONS = eINSTANCE.getPattern_Locations();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATTERN__RESOURCES = eINSTANCE.getPattern_Resources();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.SequenceImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__AGENT = eINSTANCE.getSequence_Agent();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__ACTION = eINSTANCE.getSequence_Action();

    /**
     * The meta object literal for the '<em><b>Sub Sequence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__SUB_SEQUENCE = eINSTANCE.getSequence_SubSequence();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.SubSequenceImpl <em>Sub Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.SubSequenceImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getSubSequence()
     * @generated
     */
    EClass SUB_SEQUENCE = eINSTANCE.getSubSequence();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SEQUENCE__I = eINSTANCE.getSubSequence_I();

    /**
     * The meta object literal for the '<em><b>J</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SEQUENCE__J = eINSTANCE.getSubSequence_J();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SEQUENCE__LOOP = eINSTANCE.getSubSequence_Loop();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SEQUENCE__ACTION = eINSTANCE.getSubSequence_Action();

    /**
     * The meta object literal for the '<em><b>Conditional Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SEQUENCE__CONDITIONAL_STATEMENT = eINSTANCE.getSubSequence_ConditionalStatement();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ConclusionImpl <em>Conclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ConclusionImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getConclusion()
     * @generated
     */
    EClass CONCLUSION = eINSTANCE.getConclusion();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCLUSION__CONDITION = eINSTANCE.getConclusion_Condition();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.LoopImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__CONDITION = eINSTANCE.getLoop_Condition();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ConditionalStatementImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getConditionalStatement()
     * @generated
     */
    EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_STATEMENT__CONDITION = eINSTANCE.getConditionalStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_STATEMENT__ACTION = eINSTANCE.getConditionalStatement_Action();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_STATEMENT__N = eINSTANCE.getConditionalStatement_N();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ActionImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__TARGET = eINSTANCE.getAction_Target();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__RESOURCE = eINSTANCE.getAction_Resource();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__AGENT = eINSTANCE.getAction_Agent();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ConditionImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Atomic Predicate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ATOMIC_PREDICATE = eINSTANCE.getCondition_AtomicPredicate();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.AtomicPredicateImpl <em>Atomic Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.AtomicPredicateImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAtomicPredicate()
     * @generated
     */
    EClass ATOMIC_PREDICATE = eINSTANCE.getAtomicPredicate();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_PREDICATE__N = eINSTANCE.getAtomicPredicate_N();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PREDICATE__AGENT = eINSTANCE.getAtomicPredicate_Agent();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PREDICATE__LOCATION = eINSTANCE.getAtomicPredicate_Location();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PREDICATE__RESOURCE = eINSTANCE.getAtomicPredicate_Resource();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PREDICATE__RELATION = eINSTANCE.getAtomicPredicate_Relation();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.RelationImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__AGENT = eINSTANCE.getRelation_Agent();

    /**
     * The meta object literal for the '<em><b>Th</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TH = eINSTANCE.getRelation_Th();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.TargetImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__NAME = eINSTANCE.getTarget_Name();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.AgentImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.HumanImpl <em>Human</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.HumanImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getHuman()
     * @generated
     */
    EClass HUMAN = eINSTANCE.getHuman();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HUMAN__NAME = eINSTANCE.getHuman_Name();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.RobotImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.LocationImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

    /**
     * The meta object literal for the '{@link it.polimi.lIRAs.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.polimi.lIRAs.impl.ResourceImpl
     * @see it.polimi.lIRAs.impl.LIRAsPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

  }

} //LIRAsPackage
