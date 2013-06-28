/**
 */
package ifml.extensions.impl;

import ifml.core.ActivationExpression;
import ifml.core.CorePackage;
import ifml.core.InteractionFlow;
import ifml.core.InteractionFlowElement;
import ifml.core.NamedElement;
import ifml.core.Parameter;
import ifml.core.ViewComponentPart;
import ifml.core.ViewElementEvent;

import ifml.core.impl.ExpressionImpl;

import ifml.extensions.ExtensionsPackage;
import ifml.extensions.Selector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Element;
import uml.TemplaetableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getSubViewComponentParts <em>Sub View Component Parts</em>}</li>
 *   <li>{@link ifml.extensions.impl.SelectorImpl#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectorImpl extends ExpressionImpl implements Selector
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getInInteractionFlows() <em>In Interaction Flows</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInInteractionFlows()
   * @generated
   * @ordered
   */
  protected EList<InteractionFlow> inInteractionFlows;

  /**
   * The cached value of the '{@link #getOutInteractionFlows() <em>Out Interaction Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutInteractionFlows()
   * @generated
   * @ordered
   */
  protected EList<InteractionFlow> outInteractionFlows;

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
   * The cached value of the '{@link #getSubViewComponentParts() <em>Sub View Component Parts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubViewComponentParts()
   * @generated
   * @ordered
   */
  protected EList<ViewComponentPart> subViewComponentParts;

  /**
   * The cached value of the '{@link #getParentViewComponentPart() <em>Parent View Component Part</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentViewComponentPart()
   * @generated
   * @ordered
   */
  protected ViewComponentPart parentViewComponentPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
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
    return ExtensionsPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.SELECTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ExtensionsPackage.SELECTOR__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionFlow> getInInteractionFlows()
  {
    if (inInteractionFlows == null)
    {
      inInteractionFlows = new EObjectResolvingEList<InteractionFlow>(InteractionFlow.class, this, ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS);
    }
    return inInteractionFlows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionFlow> getOutInteractionFlows()
  {
    if (outInteractionFlows == null)
    {
      outInteractionFlows = new EObjectContainmentEList<InteractionFlow>(InteractionFlow.class, this, ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS);
    }
    return outInteractionFlows;
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
      viewElementEvents = new EObjectContainmentEList<ViewElementEvent>(ViewElementEvent.class, this, ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS);
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION, oldActivationExpression, activationExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewComponentPart> getSubViewComponentParts()
  {
    if (subViewComponentParts == null)
    {
      subViewComponentParts = new EObjectWithInverseResolvingEList<ViewComponentPart>(ViewComponentPart.class, this, ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS, CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART);
    }
    return subViewComponentParts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewComponentPart getParentViewComponentPart()
  {
    if (parentViewComponentPart != null && parentViewComponentPart.eIsProxy())
    {
      InternalEObject oldParentViewComponentPart = (InternalEObject)parentViewComponentPart;
      parentViewComponentPart = (ViewComponentPart)eResolveProxy(oldParentViewComponentPart);
      if (parentViewComponentPart != oldParentViewComponentPart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART, oldParentViewComponentPart, parentViewComponentPart));
      }
    }
    return parentViewComponentPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewComponentPart basicGetParentViewComponentPart()
  {
    return parentViewComponentPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentViewComponentPart(ViewComponentPart newParentViewComponentPart, NotificationChain msgs)
  {
    ViewComponentPart oldParentViewComponentPart = parentViewComponentPart;
    parentViewComponentPart = newParentViewComponentPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART, oldParentViewComponentPart, newParentViewComponentPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentViewComponentPart(ViewComponentPart newParentViewComponentPart)
  {
    if (newParentViewComponentPart != parentViewComponentPart)
    {
      NotificationChain msgs = null;
      if (parentViewComponentPart != null)
        msgs = ((InternalEObject)parentViewComponentPart).eInverseRemove(this, CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS, ViewComponentPart.class, msgs);
      if (newParentViewComponentPart != null)
        msgs = ((InternalEObject)newParentViewComponentPart).eInverseAdd(this, CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS, ViewComponentPart.class, msgs);
      msgs = basicSetParentViewComponentPart(newParentViewComponentPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART, newParentViewComponentPart, newParentViewComponentPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubViewComponentParts()).basicAdd(otherEnd, msgs);
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        if (parentViewComponentPart != null)
          msgs = ((InternalEObject)parentViewComponentPart).eInverseRemove(this, CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS, ViewComponentPart.class, msgs);
        return basicSetParentViewComponentPart((ViewComponentPart)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ExtensionsPackage.SELECTOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS:
        return ((InternalEList<?>)getOutInteractionFlows()).basicRemove(otherEnd, msgs);
      case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS:
        return ((InternalEList<?>)getViewElementEvents()).basicRemove(otherEnd, msgs);
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        return ((InternalEList<?>)getSubViewComponentParts()).basicRemove(otherEnd, msgs);
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        return basicSetParentViewComponentPart(null, msgs);
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
      case ExtensionsPackage.SELECTOR__NAME:
        return getName();
      case ExtensionsPackage.SELECTOR__PARAMETERS:
        return getParameters();
      case ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS:
        return getInInteractionFlows();
      case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS:
        return getOutInteractionFlows();
      case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS:
        return getViewElementEvents();
      case ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION:
        if (resolve) return getActivationExpression();
        return basicGetActivationExpression();
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        return getSubViewComponentParts();
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        if (resolve) return getParentViewComponentPart();
        return basicGetParentViewComponentPart();
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
      case ExtensionsPackage.SELECTOR__NAME:
        setName((String)newValue);
        return;
      case ExtensionsPackage.SELECTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS:
        getInInteractionFlows().clear();
        getInInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
        return;
      case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS:
        getOutInteractionFlows().clear();
        getOutInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
        return;
      case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS:
        getViewElementEvents().clear();
        getViewElementEvents().addAll((Collection<? extends ViewElementEvent>)newValue);
        return;
      case ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION:
        setActivationExpression((ActivationExpression)newValue);
        return;
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        getSubViewComponentParts().clear();
        getSubViewComponentParts().addAll((Collection<? extends ViewComponentPart>)newValue);
        return;
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        setParentViewComponentPart((ViewComponentPart)newValue);
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
      case ExtensionsPackage.SELECTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExtensionsPackage.SELECTOR__PARAMETERS:
        getParameters().clear();
        return;
      case ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS:
        getInInteractionFlows().clear();
        return;
      case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS:
        getOutInteractionFlows().clear();
        return;
      case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS:
        getViewElementEvents().clear();
        return;
      case ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION:
        setActivationExpression((ActivationExpression)null);
        return;
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        getSubViewComponentParts().clear();
        return;
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        setParentViewComponentPart((ViewComponentPart)null);
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
      case ExtensionsPackage.SELECTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExtensionsPackage.SELECTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS:
        return inInteractionFlows != null && !inInteractionFlows.isEmpty();
      case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS:
        return outInteractionFlows != null && !outInteractionFlows.isEmpty();
      case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS:
        return viewElementEvents != null && !viewElementEvents.isEmpty();
      case ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION:
        return activationExpression != null;
      case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS:
        return subViewComponentParts != null && !subViewComponentParts.isEmpty();
      case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART:
        return parentViewComponentPart != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case ExtensionsPackage.SELECTOR__NAME: return CorePackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TemplaetableElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == InteractionFlowElement.class)
    {
      switch (derivedFeatureID)
      {
        case ExtensionsPackage.SELECTOR__PARAMETERS: return CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS;
        case ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS: return CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;
        case ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS: return CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;
        default: return -1;
      }
    }
    if (baseClass == ViewComponentPart.class)
    {
      switch (derivedFeatureID)
      {
        case ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS: return CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;
        case ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION: return CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;
        case ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS: return CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;
        case ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART: return CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case CorePackage.NAMED_ELEMENT__NAME: return ExtensionsPackage.SELECTOR__NAME;
        default: return -1;
      }
    }
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TemplaetableElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == InteractionFlowElement.class)
    {
      switch (baseFeatureID)
      {
        case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS: return ExtensionsPackage.SELECTOR__PARAMETERS;
        case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS: return ExtensionsPackage.SELECTOR__IN_INTERACTION_FLOWS;
        case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS: return ExtensionsPackage.SELECTOR__OUT_INTERACTION_FLOWS;
        default: return -1;
      }
    }
    if (baseClass == ViewComponentPart.class)
    {
      switch (baseFeatureID)
      {
        case CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS: return ExtensionsPackage.SELECTOR__VIEW_ELEMENT_EVENTS;
        case CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION: return ExtensionsPackage.SELECTOR__ACTIVATION_EXPRESSION;
        case CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS: return ExtensionsPackage.SELECTOR__SUB_VIEW_COMPONENT_PARTS;
        case CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART: return ExtensionsPackage.SELECTOR__PARENT_VIEW_COMPONENT_PART;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SelectorImpl
