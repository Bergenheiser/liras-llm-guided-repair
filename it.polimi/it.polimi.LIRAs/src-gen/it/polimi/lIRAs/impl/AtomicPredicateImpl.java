/**
 * generated  by Xtext 2.41.0
 */
package it.polimi.lIRAs.impl;

import it.polimi.lIRAs.Agent;
import it.polimi.lIRAs.AtomicPredicate;
import it.polimi.lIRAs.LIRAsPackage;
import it.polimi.lIRAs.Location;
import it.polimi.lIRAs.Relation;
import it.polimi.lIRAs.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.lIRAs.impl.AtomicPredicateImpl#getN <em>N</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.AtomicPredicateImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.AtomicPredicateImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.AtomicPredicateImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link it.polimi.lIRAs.impl.AtomicPredicateImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicPredicateImpl extends MinimalEObjectImpl.Container implements AtomicPredicate
{
  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

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
   * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected Location location;

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
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected Relation relation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicPredicateImpl()
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
    return LIRAsPackage.Literals.ATOMIC_PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__N, oldN, n));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__AGENT, oldAgent, newAgent);
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
        msgs = ((InternalEObject)agent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__AGENT, null, msgs);
      if (newAgent != null)
        msgs = ((InternalEObject)newAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__AGENT, null, msgs);
      msgs = basicSetAgent(newAgent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__AGENT, newAgent, newAgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Location getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs)
  {
    Location oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__LOCATION, oldLocation, newLocation);
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
  public void setLocation(Location newLocation)
  {
    if (newLocation != location)
    {
      NotificationChain msgs = null;
      if (location != null)
        msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__LOCATION, null, msgs);
      if (newLocation != null)
        msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__LOCATION, null, msgs);
      msgs = basicSetLocation(newLocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__LOCATION, newLocation, newLocation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__RESOURCE, oldResource, newResource);
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
        msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__RESOURCE, null, msgs);
      if (newResource != null)
        msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__RESOURCE, null, msgs);
      msgs = basicSetResource(newResource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__RESOURCE, newResource, newResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relation getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelation(Relation newRelation, NotificationChain msgs)
  {
    Relation oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__RELATION, oldRelation, newRelation);
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
  public void setRelation(Relation newRelation)
  {
    if (newRelation != relation)
    {
      NotificationChain msgs = null;
      if (relation != null)
        msgs = ((InternalEObject)relation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__RELATION, null, msgs);
      if (newRelation != null)
        msgs = ((InternalEObject)newRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LIRAsPackage.ATOMIC_PREDICATE__RELATION, null, msgs);
      msgs = basicSetRelation(newRelation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LIRAsPackage.ATOMIC_PREDICATE__RELATION, newRelation, newRelation));
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
      case LIRAsPackage.ATOMIC_PREDICATE__AGENT:
        return basicSetAgent(null, msgs);
      case LIRAsPackage.ATOMIC_PREDICATE__LOCATION:
        return basicSetLocation(null, msgs);
      case LIRAsPackage.ATOMIC_PREDICATE__RESOURCE:
        return basicSetResource(null, msgs);
      case LIRAsPackage.ATOMIC_PREDICATE__RELATION:
        return basicSetRelation(null, msgs);
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
      case LIRAsPackage.ATOMIC_PREDICATE__N:
        return getN();
      case LIRAsPackage.ATOMIC_PREDICATE__AGENT:
        return getAgent();
      case LIRAsPackage.ATOMIC_PREDICATE__LOCATION:
        return getLocation();
      case LIRAsPackage.ATOMIC_PREDICATE__RESOURCE:
        return getResource();
      case LIRAsPackage.ATOMIC_PREDICATE__RELATION:
        return getRelation();
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
      case LIRAsPackage.ATOMIC_PREDICATE__N:
        setN((Integer)newValue);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__AGENT:
        setAgent((Agent)newValue);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__LOCATION:
        setLocation((Location)newValue);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__RESOURCE:
        setResource((Resource)newValue);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__RELATION:
        setRelation((Relation)newValue);
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
      case LIRAsPackage.ATOMIC_PREDICATE__N:
        setN(N_EDEFAULT);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__AGENT:
        setAgent((Agent)null);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__LOCATION:
        setLocation((Location)null);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__RESOURCE:
        setResource((Resource)null);
        return;
      case LIRAsPackage.ATOMIC_PREDICATE__RELATION:
        setRelation((Relation)null);
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
      case LIRAsPackage.ATOMIC_PREDICATE__N:
        return n != N_EDEFAULT;
      case LIRAsPackage.ATOMIC_PREDICATE__AGENT:
        return agent != null;
      case LIRAsPackage.ATOMIC_PREDICATE__LOCATION:
        return location != null;
      case LIRAsPackage.ATOMIC_PREDICATE__RESOURCE:
        return resource != null;
      case LIRAsPackage.ATOMIC_PREDICATE__RELATION:
        return relation != null;
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
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //AtomicPredicateImpl
