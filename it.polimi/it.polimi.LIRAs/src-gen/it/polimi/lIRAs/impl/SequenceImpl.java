/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Action;
import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Sequence;
import it.polimi.lIRAs.SubSequence;

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
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.SequenceImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SequenceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.SequenceImpl#getSubSequence <em>Sub Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence
{
  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected Agent agent;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getSubSequence() <em>Sub Sequence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSequence()
   * @generated
   * @ordered
   */
  protected EList<SubSequence> subSequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceImpl()
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
    return LIRAsPackage.Literals.SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Agent getAgent()
  {
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs)
  {
    Agent oldAgent = agent;
    agent = newAgent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.SEQUENCE__AGENT, oldAgent, newAgent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAgent(Agent newAgent)
  {
    if (newAgent != agent)
    {
      NotificationChain msgs = null;
      if (agent != null)
        msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.SEQUENCE__AGENT, null, msgs);
      if (newAgent != null)
        msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.SEQUENCE__AGENT, null, msgs);
      msgs = basicSetAgent(newAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.SEQUENCE__AGENT, newAgent, newAgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.SEQUENCE__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.SEQUENCE__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.SEQUENCE__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.SEQUENCE__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubSequence> getSubSequence()
  {
    if (subSequence == null)
    {
      subSequence = new EObjectContainmentEList<SubSequence>(SubSequence.class, this, LIRAsPackage.SEQUENCE__SUB_SEQUENCE);
    }
    return subSequence;
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
      case LIRAsPackage.SEQUENCE__AGENT:
        return basicSetAgent(null, msgs);
      case LIRAsPackage.SEQUENCE__ACTION:
        return basicSetAction(null, msgs);
      case LIRAsPackage.SEQUENCE__SUB_SEQUENCE:
        return ((InternalEList<?>)getSubSequence()).basicRemove(otherEnd, msgs);
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
      case LIRAsPackage.SEQUENCE__AGENT:
        return getAgent();
      case LIRAsPackage.SEQUENCE__ACTION:
        return getAction();
      case LIRAsPackage.SEQUENCE__SUB_SEQUENCE:
        return getSubSequence();
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
      case LIRAsPackage.SEQUENCE__AGENT:
        setAgent((Agent)newValue);
        return;
      case LIRAsPackage.SEQUENCE__ACTION:
        setAction((Action)newValue);
        return;
      case LIRAsPackage.SEQUENCE__SUB_SEQUENCE:
        getSubSequence().clear();
        getSubSequence().addAll((Collection<? extends SubSequence>)newValue);
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
      case LIRAsPackage.SEQUENCE__AGENT:
        setAgent((Agent)null);
        return;
      case LIRAsPackage.SEQUENCE__ACTION:
        setAction((Action)null);
        return;
      case LIRAsPackage.SEQUENCE__SUB_SEQUENCE:
        getSubSequence().clear();
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
      case LIRAsPackage.SEQUENCE__AGENT:
        return agent != null;
      case LIRAsPackage.SEQUENCE__ACTION:
        return action != null;
      case LIRAsPackage.SEQUENCE__SUB_SEQUENCE:
        return subSequence != null && !subSequence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequenceImpl
