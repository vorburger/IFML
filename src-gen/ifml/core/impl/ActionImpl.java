/**
 */
package ifml.core.impl;

import ifml.core.Action;
import ifml.core.ActionEvent;
import ifml.core.CorePackage;
import ifml.core.DynamicBehavior;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.ActionImpl#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link ifml.core.impl.ActionImpl#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends InteractionFlowElementImpl implements Action
{
  /**
   * The cached value of the '{@link #getActionEvents() <em>Action Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionEvents()
   * @generated
   * @ordered
   */
  protected EList<ActionEvent> actionEvents;

  /**
   * The cached value of the '{@link #getDynamicBehavior() <em>Dynamic Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamicBehavior()
   * @generated
   * @ordered
   */
  protected DynamicBehavior dynamicBehavior;

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
    return CorePackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionEvent> getActionEvents()
  {
    if (actionEvents == null)
    {
      actionEvents = new EObjectContainmentEList<ActionEvent>(ActionEvent.class, this, CorePackage.ACTION__ACTION_EVENTS);
    }
    return actionEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicBehavior getDynamicBehavior()
  {
    if (dynamicBehavior != null && dynamicBehavior.eIsProxy())
    {
      InternalEObject oldDynamicBehavior = (InternalEObject)dynamicBehavior;
      dynamicBehavior = (DynamicBehavior)eResolveProxy(oldDynamicBehavior);
      if (dynamicBehavior != oldDynamicBehavior)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.ACTION__DYNAMIC_BEHAVIOR, oldDynamicBehavior, dynamicBehavior));
      }
    }
    return dynamicBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicBehavior basicGetDynamicBehavior()
  {
    return dynamicBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynamicBehavior(DynamicBehavior newDynamicBehavior)
  {
    DynamicBehavior oldDynamicBehavior = dynamicBehavior;
    dynamicBehavior = newDynamicBehavior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTION__DYNAMIC_BEHAVIOR, oldDynamicBehavior, dynamicBehavior));
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
      case CorePackage.ACTION__ACTION_EVENTS:
        return ((InternalEList<?>)getActionEvents()).basicRemove(otherEnd, msgs);
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
      case CorePackage.ACTION__ACTION_EVENTS:
        return getActionEvents();
      case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
        if (resolve) return getDynamicBehavior();
        return basicGetDynamicBehavior();
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
      case CorePackage.ACTION__ACTION_EVENTS:
        getActionEvents().clear();
        getActionEvents().addAll((Collection<? extends ActionEvent>)newValue);
        return;
      case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
        setDynamicBehavior((DynamicBehavior)newValue);
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
      case CorePackage.ACTION__ACTION_EVENTS:
        getActionEvents().clear();
        return;
      case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
        setDynamicBehavior((DynamicBehavior)null);
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
      case CorePackage.ACTION__ACTION_EVENTS:
        return actionEvents != null && !actionEvents.isEmpty();
      case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
        return dynamicBehavior != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
