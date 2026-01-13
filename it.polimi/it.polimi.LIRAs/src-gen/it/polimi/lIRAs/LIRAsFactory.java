/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.lIRAs.LIRAsPackage
 * @generated
 */
public interface LIRAsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LIRAsFactory eINSTANCE = it.polimi.lIRAs.impl.LIRAsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns a new object of class '<em>Sub Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Sequence</em>'.
   * @generated
   */
  SubSequence createSubSequence();

  /**
   * Returns a new object of class '<em>Conclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conclusion</em>'.
   * @generated
   */
  Conclusion createConclusion();

  /**
   * Returns a new object of class '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop</em>'.
   * @generated
   */
  Loop createLoop();

  /**
   * Returns a new object of class '<em>Conditional Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Statement</em>'.
   * @generated
   */
  ConditionalStatement createConditionalStatement();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Atomic Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Predicate</em>'.
   * @generated
   */
  AtomicPredicate createAtomicPredicate();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target</em>'.
   * @generated
   */
  Target createTarget();

  /**
   * Returns a new object of class '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Agent</em>'.
   * @generated
   */
  Agent createAgent();

  /**
   * Returns a new object of class '<em>Human</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Human</em>'.
   * @generated
   */
  Human createHuman();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Location</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location</em>'.
   * @generated
   */
  Location createLocation();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LIRAsPackage getLIRAsPackage();

} //LIRAsFactory
