/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Model#getPattern <em>Pattern</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Model#getSequence <em>Sequence</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Model#getConclusion <em>Conclusion</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see it.polimi.lIRAs.LIRAsPackage#getModel_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Model#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Sequence}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getModel_Sequence()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getSequence();

  /**
   * Returns the value of the '<em><b>Conclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conclusion</em>' containment reference.
   * @see #setConclusion(Conclusion)
   * @see it.polimi.lIRAs.LIRAsPackage#getModel_Conclusion()
   * @model containment="true"
   * @generated
   */
  Conclusion getConclusion();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Model#getConclusion <em>Conclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conclusion</em>' containment reference.
   * @see #getConclusion()
   * @generated
   */
  void setConclusion(Conclusion value);

} // Model
