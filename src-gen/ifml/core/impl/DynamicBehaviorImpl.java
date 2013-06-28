/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.DynamicBehavior;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.Behavior;
import uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.DynamicBehaviorImpl#getBehavioralFeature <em>Behavioral Feature</em>}</li>
 *   <li>{@link ifml.core.impl.DynamicBehaviorImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicBehaviorImpl extends ContentBindingImpl implements DynamicBehavior
{
  /**
   * The cached value of the '{@link #getBehavioralFeature() <em>Behavioral Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavioralFeature()
   * @generated
   * @ordered
   */
  protected BehavioralFeature behavioralFeature;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected Behavior behavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicBehaviorImpl()
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
    return CorePackage.Literals.DYNAMIC_BEHAVIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehavioralFeature getBehavioralFeature()
  {
    if (behavioralFeature != null && behavioralFeature.eIsProxy())
    {
      InternalEObject oldBehavioralFeature = (InternalEObject)behavioralFeature;
      behavioralFeature = (BehavioralFeature)eResolveProxy(oldBehavioralFeature);
      if (behavioralFeature != oldBehavioralFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE, oldBehavioralFeature, behavioralFeature));
      }
    }
    return behavioralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehavioralFeature basicGetBehavioralFeature()
  {
    return behavioralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavioralFeature(BehavioralFeature newBehavioralFeature)
  {
    BehavioralFeature oldBehavioralFeature = behavioralFeature;
    behavioralFeature = newBehavioralFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE, oldBehavioralFeature, behavioralFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior getBehavior()
  {
    if (behavior != null && behavior.eIsProxy())
    {
      InternalEObject oldBehavior = (InternalEObject)behavior;
      behavior = (Behavior)eResolveProxy(oldBehavior);
      if (behavior != oldBehavior)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR, oldBehavior, behavior));
      }
    }
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior basicGetBehavior()
  {
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavior(Behavior newBehavior)
  {
    Behavior oldBehavior = behavior;
    behavior = newBehavior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR, oldBehavior, behavior));
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
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE:
        if (resolve) return getBehavioralFeature();
        return basicGetBehavioralFeature();
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR:
        if (resolve) return getBehavior();
        return basicGetBehavior();
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
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE:
        setBehavioralFeature((BehavioralFeature)newValue);
        return;
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR:
        setBehavior((Behavior)newValue);
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
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE:
        setBehavioralFeature((BehavioralFeature)null);
        return;
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR:
        setBehavior((Behavior)null);
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
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE:
        return behavioralFeature != null;
      case CorePackage.DYNAMIC_BEHAVIOR__BEHAVIOR:
        return behavior != null;
    }
    return super.eIsSet(featureID);
  }

} //DynamicBehaviorImpl
