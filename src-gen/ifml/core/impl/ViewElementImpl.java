/**
 */
package ifml.core.impl;

import ifml.core.ActivationExpression;
import ifml.core.CorePackage;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;
import ifml.core.ViewElementEvent;

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
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.ViewElementImpl#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link ifml.core.impl.ViewElementImpl#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link ifml.core.impl.ViewElementImpl#getViewContainer <em>View Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewElementImpl extends InteractionFlowElementImpl implements ViewElement
{
  /**
   * The cached value of the '{@link #getViewElementEvents() <em>View Element Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewElementEvents()
   * @generated
   * @ordered
   */
  protected EList<ViewElementEvent> viewElementEvents;

  /**
   * The cached value of the '{@link #getActivationExpression() <em>Activation Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivationExpression()
   * @generated
   * @ordered
   */
  protected ActivationExpression activationExpression;

  /**
   * The cached value of the '{@link #getViewContainer() <em>View Container</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewContainer()
   * @generated
   * @ordered
   */
  protected ViewContainer viewContainer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewElementImpl()
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
    return CorePackage.Literals.VIEW_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewElementEvent> getViewElementEvents()
  {
    if (viewElementEvents == null)
    {
      viewElementEvents = new EObjectContainmentEList<ViewElementEvent>(ViewElementEvent.class, this, CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS);
    }
    return viewElementEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivationExpression getActivationExpression()
  {
    if (activationExpression != null && activationExpression.eIsProxy())
    {
      InternalEObject oldActivationExpression = (InternalEObject)activationExpression;
      activationExpression = (ActivationExpression)eResolveProxy(oldActivationExpression);
      if (activationExpression != oldActivationExpression)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
      }
    }
    return activationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivationExpression basicGetActivationExpression()
  {
    return activationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivationExpression(ActivationExpression newActivationExpression)
  {
    ActivationExpression oldActivationExpression = activationExpression;
    activationExpression = newActivationExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContainer getViewContainer()
  {
    if (viewContainer != null && viewContainer.eIsProxy())
    {
      InternalEObject oldViewContainer = (InternalEObject)viewContainer;
      viewContainer = (ViewContainer)eResolveProxy(oldViewContainer);
      if (viewContainer != oldViewContainer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.VIEW_ELEMENT__VIEW_CONTAINER, oldViewContainer, viewContainer));
      }
    }
    return viewContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewContainer basicGetViewContainer()
  {
    return viewContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewContainer(ViewContainer newViewContainer)
  {
    ViewContainer oldViewContainer = viewContainer;
    viewContainer = newViewContainer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VIEW_ELEMENT__VIEW_CONTAINER, oldViewContainer, viewContainer));
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
      case CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS:
        return ((InternalEList<?>)getViewElementEvents()).basicRemove(otherEnd, msgs);
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
      case CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS:
        return getViewElementEvents();
      case CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION:
        if (resolve) return getActivationExpression();
        return basicGetActivationExpression();
      case CorePackage.VIEW_ELEMENT__VIEW_CONTAINER:
        if (resolve) return getViewContainer();
        return basicGetViewContainer();
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
      case CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS:
        getViewElementEvents().clear();
        getViewElementEvents().addAll((Collection<? extends ViewElementEvent>)newValue);
        return;
      case CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION:
        setActivationExpression((ActivationExpression)newValue);
        return;
      case CorePackage.VIEW_ELEMENT__VIEW_CONTAINER:
        setViewContainer((ViewContainer)newValue);
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
      case CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS:
        getViewElementEvents().clear();
        return;
      case CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION:
        setActivationExpression((ActivationExpression)null);
        return;
      case CorePackage.VIEW_ELEMENT__VIEW_CONTAINER:
        setViewContainer((ViewContainer)null);
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
      case CorePackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENTS:
        return viewElementEvents != null && !viewElementEvents.isEmpty();
      case CorePackage.VIEW_ELEMENT__ACTIVATION_EXPRESSION:
        return activationExpression != null;
      case CorePackage.VIEW_ELEMENT__VIEW_CONTAINER:
        return viewContainer != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewElementImpl
