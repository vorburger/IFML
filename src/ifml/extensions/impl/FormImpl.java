/**
 */
package ifml.extensions.impl;

import ifml.core.impl.ViewComponentImpl;

import ifml.extensions.ExtensionsPackage;
import ifml.extensions.Form;
import ifml.extensions.SubmitEvent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.extensions.impl.FormImpl#getSubmitEvent <em>Submit Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends ViewComponentImpl implements Form
{
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
  protected FormImpl()
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
    return ExtensionsPackage.Literals.FORM;
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
      submitEvent = new EObjectResolvingEList<SubmitEvent>(SubmitEvent.class, this, ExtensionsPackage.FORM__SUBMIT_EVENT);
    }
    return submitEvent;
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
      case ExtensionsPackage.FORM__SUBMIT_EVENT:
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
      case ExtensionsPackage.FORM__SUBMIT_EVENT:
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
      case ExtensionsPackage.FORM__SUBMIT_EVENT:
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
      case ExtensionsPackage.FORM__SUBMIT_EVENT:
        return submitEvent != null && !submitEvent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormImpl
