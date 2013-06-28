/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.InteractionFlow;
import ifml.core.InteractionFlowElement;
import ifml.core.Parameter;

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
 * An implementation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.InteractionFlowElementImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ifml.core.impl.InteractionFlowElementImpl#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 *   <li>{@link ifml.core.impl.InteractionFlowElementImpl#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InteractionFlowElementImpl extends NamedElementImpl implements InteractionFlowElement
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionFlowElementImpl()
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
    return CorePackage.Literals.INTERACTION_FLOW_ELEMENT;
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
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS);
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
      inInteractionFlows = new EObjectResolvingEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS);
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
      outInteractionFlows = new EObjectContainmentEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);
    }
    return outInteractionFlows;
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
      case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
        return ((InternalEList<?>)getOutInteractionFlows()).basicRemove(otherEnd, msgs);
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
      case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
        return getParameters();
      case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
        return getInInteractionFlows();
      case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
        return getOutInteractionFlows();
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
      case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
        getInInteractionFlows().clear();
        getInInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
        return;
      case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
        getOutInteractionFlows().clear();
        getOutInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
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
      case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
        getParameters().clear();
        return;
      case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
        getInInteractionFlows().clear();
        return;
      case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
        getOutInteractionFlows().clear();
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
      case CorePackage.INTERACTION_FLOW_ELEMENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case CorePackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS:
        return inInteractionFlows != null && !inInteractionFlows.isEmpty();
      case CorePackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
        return outInteractionFlows != null && !outInteractionFlows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractionFlowElementImpl
