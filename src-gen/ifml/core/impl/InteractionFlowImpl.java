/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.InteractionFlow;
import ifml.core.InteractionFlowElement;
import ifml.core.ParameterBindingGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.InteractionFlowImpl#getSrcInteractionFlowElement <em>Src Interaction Flow Element</em>}</li>
 *   <li>{@link ifml.core.impl.InteractionFlowImpl#getTrgtInteractionFlowElement <em>Trgt Interaction Flow Element</em>}</li>
 *   <li>{@link ifml.core.impl.InteractionFlowImpl#getParameterBindingGroup <em>Parameter Binding Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFlowImpl extends InteractionFlowModelElementImpl implements InteractionFlow
{
  /**
   * The cached value of the '{@link #getSrcInteractionFlowElement() <em>Src Interaction Flow Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcInteractionFlowElement()
   * @generated
   * @ordered
   */
  protected InteractionFlowElement srcInteractionFlowElement;

  /**
   * The cached value of the '{@link #getTrgtInteractionFlowElement() <em>Trgt Interaction Flow Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrgtInteractionFlowElement()
   * @generated
   * @ordered
   */
  protected InteractionFlowElement trgtInteractionFlowElement;

  /**
   * The cached value of the '{@link #getParameterBindingGroup() <em>Parameter Binding Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterBindingGroup()
   * @generated
   * @ordered
   */
  protected ParameterBindingGroup parameterBindingGroup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionFlowImpl()
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
    return CorePackage.Literals.INTERACTION_FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowElement getSrcInteractionFlowElement()
  {
    if (srcInteractionFlowElement != null && srcInteractionFlowElement.eIsProxy())
    {
      InternalEObject oldSrcInteractionFlowElement = (InternalEObject)srcInteractionFlowElement;
      srcInteractionFlowElement = (InteractionFlowElement)eResolveProxy(oldSrcInteractionFlowElement);
      if (srcInteractionFlowElement != oldSrcInteractionFlowElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT, oldSrcInteractionFlowElement, srcInteractionFlowElement));
      }
    }
    return srcInteractionFlowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowElement basicGetSrcInteractionFlowElement()
  {
    return srcInteractionFlowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrcInteractionFlowElement(InteractionFlowElement newSrcInteractionFlowElement)
  {
    InteractionFlowElement oldSrcInteractionFlowElement = srcInteractionFlowElement;
    srcInteractionFlowElement = newSrcInteractionFlowElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT, oldSrcInteractionFlowElement, srcInteractionFlowElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowElement getTrgtInteractionFlowElement()
  {
    if (trgtInteractionFlowElement != null && trgtInteractionFlowElement.eIsProxy())
    {
      InternalEObject oldTrgtInteractionFlowElement = (InternalEObject)trgtInteractionFlowElement;
      trgtInteractionFlowElement = (InteractionFlowElement)eResolveProxy(oldTrgtInteractionFlowElement);
      if (trgtInteractionFlowElement != oldTrgtInteractionFlowElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT, oldTrgtInteractionFlowElement, trgtInteractionFlowElement));
      }
    }
    return trgtInteractionFlowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowElement basicGetTrgtInteractionFlowElement()
  {
    return trgtInteractionFlowElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrgtInteractionFlowElement(InteractionFlowElement newTrgtInteractionFlowElement)
  {
    InteractionFlowElement oldTrgtInteractionFlowElement = trgtInteractionFlowElement;
    trgtInteractionFlowElement = newTrgtInteractionFlowElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT, oldTrgtInteractionFlowElement, trgtInteractionFlowElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterBindingGroup getParameterBindingGroup()
  {
    return parameterBindingGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterBindingGroup(ParameterBindingGroup newParameterBindingGroup, NotificationChain msgs)
  {
    ParameterBindingGroup oldParameterBindingGroup = parameterBindingGroup;
    parameterBindingGroup = newParameterBindingGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, oldParameterBindingGroup, newParameterBindingGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterBindingGroup(ParameterBindingGroup newParameterBindingGroup)
  {
    if (newParameterBindingGroup != parameterBindingGroup)
    {
      NotificationChain msgs = null;
      if (parameterBindingGroup != null)
        msgs = ((InternalEObject)parameterBindingGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, null, msgs);
      if (newParameterBindingGroup != null)
        msgs = ((InternalEObject)newParameterBindingGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, null, msgs);
      msgs = basicSetParameterBindingGroup(newParameterBindingGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP, newParameterBindingGroup, newParameterBindingGroup));
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
      case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
        return basicSetParameterBindingGroup(null, msgs);
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
      case CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT:
        if (resolve) return getSrcInteractionFlowElement();
        return basicGetSrcInteractionFlowElement();
      case CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT:
        if (resolve) return getTrgtInteractionFlowElement();
        return basicGetTrgtInteractionFlowElement();
      case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
        return getParameterBindingGroup();
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
      case CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT:
        setSrcInteractionFlowElement((InteractionFlowElement)newValue);
        return;
      case CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT:
        setTrgtInteractionFlowElement((InteractionFlowElement)newValue);
        return;
      case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
        setParameterBindingGroup((ParameterBindingGroup)newValue);
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
      case CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT:
        setSrcInteractionFlowElement((InteractionFlowElement)null);
        return;
      case CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT:
        setTrgtInteractionFlowElement((InteractionFlowElement)null);
        return;
      case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
        setParameterBindingGroup((ParameterBindingGroup)null);
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
      case CorePackage.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT:
        return srcInteractionFlowElement != null;
      case CorePackage.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT:
        return trgtInteractionFlowElement != null;
      case CorePackage.INTERACTION_FLOW__PARAMETER_BINDING_GROUP:
        return parameterBindingGroup != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractionFlowImpl
