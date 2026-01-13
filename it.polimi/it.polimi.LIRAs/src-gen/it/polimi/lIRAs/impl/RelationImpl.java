/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Relation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.RelationImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.RelationImpl#getTh <em>Th</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation
{
  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected EList<Agent> agent;

  /**
   * The default value of the '{@link #getTh() <em>Th</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTh()
   * @generated
   * @ordered
   */
  protected static final int TH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTh() <em>Th</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTh()
   * @generated
   * @ordered
   */
  protected int th = TH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LIRAsPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Agent> getAgent()
  {
    if (agent == null)
    {
      agent = new EObjectContainmentEList<Agent>(Agent.class, this, LIRAsPackage.RELATION__AGENT);
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTh()
  {
    return th;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTh(int newTh)
  {
    int oldTh = th;
    th = newTh;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.RELATION__TH, oldTh, th));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LIRAsPackage.RELATION__AGENT:
        return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LIRAsPackage.RELATION__AGENT:
        return getAgent();
      case LIRAsPackage.RELATION__TH:
        return getTh();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LIRAsPackage.RELATION__AGENT:
        getAgent().clear();
        getAgent().addAll((Collection<? extends Agent>)newValue);
        return;
      case LIRAsPackage.RELATION__TH:
        setTh((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LIRAsPackage.RELATION__AGENT:
        getAgent().clear();
        return;
      case LIRAsPackage.RELATION__TH:
        setTh(TH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LIRAsPackage.RELATION__AGENT:
        return agent != null && !agent.isEmpty();
      case LIRAsPackage.RELATION__TH:
        return th != TH_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (th: ");
    result.append(th);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
