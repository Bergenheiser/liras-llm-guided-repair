/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Action;
import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Resource;
import it.polimi.lIRAs.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.ActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ActionImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.ActionImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Target target;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return LIRAsPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs)
  {
    Target oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__TARGET, oldTarget, newTarget);
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
  public void setTarget(Target newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resource getResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__RESOURCE, oldResource, newResource);
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
  public void setResource(Resource newResource)
  {
    if (newResource != resource)
    {
      NotificationChain msgs = null;
      if (resource != null)
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__RESOURCE, newResource, newResource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__AGENT, oldAgent, newAgent);
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
        msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__AGENT, null, msgs);
      if (newAgent != null)
        msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ACTION__AGENT, null, msgs);
      msgs = basicSetAgent(newAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ACTION__AGENT, newAgent, newAgent));
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
      case LIRAsPackage.ACTION__TARGET:
        return basicSetTarget(null, msgs);
      case LIRAsPackage.ACTION__RESOURCE:
        return basicSetResource(null, msgs);
      case LIRAsPackage.ACTION__AGENT:
        return basicSetAgent(null, msgs);
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
      case LIRAsPackage.ACTION__TARGET:
        return getTarget();
      case LIRAsPackage.ACTION__RESOURCE:
        return getResource();
      case LIRAsPackage.ACTION__AGENT:
        return getAgent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LIRAsPackage.ACTION__TARGET:
        setTarget((Target)newValue);
        return;
      case LIRAsPackage.ACTION__RESOURCE:
        setResource((Resource)newValue);
        return;
      case LIRAsPackage.ACTION__AGENT:
        setAgent((Agent)newValue);
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
      case LIRAsPackage.ACTION__TARGET:
        setTarget((Target)null);
        return;
      case LIRAsPackage.ACTION__RESOURCE:
        setResource((Resource)null);
        return;
      case LIRAsPackage.ACTION__AGENT:
        setAgent((Agent)null);
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
      case LIRAsPackage.ACTION__TARGET:
        return target != null;
      case LIRAsPackage.ACTION__RESOURCE:
        return resource != null;
      case LIRAsPackage.ACTION__AGENT:
        return agent != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
