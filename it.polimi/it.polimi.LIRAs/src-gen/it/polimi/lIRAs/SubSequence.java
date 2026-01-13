/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.SubSequence#getI <em>I</em>}</li>
 *   <li>{@link it.polimi.lIRAs.SubSequence#getJ <em>J</em>}</li>
 *   <li>{@link it.polimi.lIRAs.SubSequence#getLoop <em>Loop</em>}</li>
 *   <li>{@link it.polimi.lIRAs.SubSequence#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.SubSequence#getConditionalStatement <em>Conditional Statement</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence()
 * @model
 * @generated
 */
public interface SubSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' attribute.
   * @see #setI(int)
   * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence_I()
   * @model
   * @generated
   */
  int getI();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.SubSequence#getI <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' attribute.
   * @see #getI()
   * @generated
   */
  void setI(int value);

  /**
   * Returns the value of the '<em><b>J</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>J</em>' attribute.
   * @see #setJ(int)
   * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence_J()
   * @model
   * @generated
   */
  int getJ();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.SubSequence#getJ <em>J</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>J</em>' attribute.
   * @see #getJ()
   * @generated
   */
  void setJ(int value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Loop}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence_Loop()
   * @model containment="true"
   * @generated
   */
  EList<Loop> getLoop();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

  /**
   * Returns the value of the '<em><b>Conditional Statement</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.ConditionalStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional Statement</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getSubSequence_ConditionalStatement()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalStatement> getConditionalStatement();

} // SubSequence
