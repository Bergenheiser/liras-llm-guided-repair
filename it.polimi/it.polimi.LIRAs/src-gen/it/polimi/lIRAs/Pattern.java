/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Pattern#getHuman <em>Human</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Pattern#getRobot <em>Robot</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Pattern#getLocations <em>Locations</em>}</li>
 *   <li>{@link it.polimi.lIRAs.Pattern#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see it.polimi.lIRAs.LIRAsPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.polimi.lIRAs.LIRAsPackage#getPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.polimi.lIRAs.Pattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Human</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Human}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Human</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getPattern_Human()
   * @model containment="true"
   * @generated
   */
  EList<Human> getHuman();

  /**
   * Returns the value of the '<em><b>Robot</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Robot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robot</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getPattern_Robot()
   * @model containment="true"
   * @generated
   */
  EList<Robot> getRobot();

  /**
   * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Location}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getPattern_Locations()
   * @model containment="true"
   * @generated
   */
  EList<Location> getLocations();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link it.polimi.lIRAs.Resource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see it.polimi.lIRAs.LIRAsPackage#getPattern_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

} // Pattern
