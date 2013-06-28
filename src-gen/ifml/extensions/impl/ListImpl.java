/**
 */
package ifml.extensions.impl;

import ifml.core.impl.ViewComponentImpl;

import ifml.extensions.ExtensionsPackage;
import ifml.extensions.List;
import ifml.extensions.SelectEvent;
import ifml.extensions.SubmitEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.extensions.impl.ListImpl#getSelectEvent <em>Select Event</em>}</li>
 *   <li>{@link ifml.extensions.impl.ListImpl#getSubmitEvent <em>Submit Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends ViewComponentImpl implements List
{
  /**
   * The cached value of the '{@link #getSelectEvent() <em>Select Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectEvent()
   * @generated
   * @ordered
   */
  protected EList<SelectEvent> selectEvent;

  /**
   * The cached value of the '{@link #getSubmitEvent() <em>Submit Event</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubmitEvent()
   * @generated
   * @ordered
   */
  protected EList<SubmitEvent> submitEvent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListImpl()
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
    return ExtensionsPackage.Literals.LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelectEvent> getSelectEvent()
  {
    if (selectEvent == null)
    {
      selectEvent = new EObjectContainmentEList<SelectEvent>(SelectEvent.class, this, ExtensionsPackage.LIST__SELECT_EVENT);
    }
    return selectEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubmitEvent> getSubmitEvent()
  {
    if (submitEvent == null)
    {
      submitEvent = new EObjectResolvingEList<SubmitEvent>(SubmitEvent.class, this, ExtensionsPackage.LIST__SUBMIT_EVENT);
    }
    return submitEvent;
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
      case ExtensionsPackage.LIST__SELECT_EVENT:
        return ((InternalEList<?>)getSelectEvent()).basicRemove(otherEnd, msgs);
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
      case ExtensionsPackage.LIST__SELECT_EVENT:
        return getSelectEvent();
      case ExtensionsPackage.LIST__SUBMIT_EVENT:
        return getSubmitEvent();
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
      case ExtensionsPackage.LIST__SELECT_EVENT:
        getSelectEvent().clear();
        getSelectEvent().addAll((Collection<? extends SelectEvent>)newValue);
        return;
      case ExtensionsPackage.LIST__SUBMIT_EVENT:
        getSubmitEvent().clear();
        getSubmitEvent().addAll((Collection<? extends SubmitEvent>)newValue);
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
      case ExtensionsPackage.LIST__SELECT_EVENT:
        getSelectEvent().clear();
        return;
      case ExtensionsPackage.LIST__SUBMIT_EVENT:
        getSubmitEvent().clear();
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
      case ExtensionsPackage.LIST__SELECT_EVENT:
        return selectEvent != null && !selectEvent.isEmpty();
      case ExtensionsPackage.LIST__SUBMIT_EVENT:
        return submitEvent != null && !submitEvent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ListImpl
