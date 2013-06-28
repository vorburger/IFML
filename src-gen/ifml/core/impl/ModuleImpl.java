/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.InteractionFlowModelElement;
import ifml.core.Module;
import ifml.core.Port;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.ModuleImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link ifml.core.impl.ModuleImpl#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link ifml.core.impl.ModuleImpl#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends InteractionFlowModelElementImpl implements Module
{
  /**
   * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> inputPorts;

  /**
   * The cached value of the '{@link #getOutputPorts() <em>Output Ports</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> outputPorts;

  /**
   * The cached value of the '{@link #getInteractionFlowModelElements() <em>Interaction Flow Model Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionFlowModelElements()
   * @generated
   * @ordered
   */
  protected EList<InteractionFlowModelElement> interactionFlowModelElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return CorePackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getInputPorts()
  {
    if (inputPorts == null)
    {
      inputPorts = new EObjectResolvingEList<Port>(Port.class, this, CorePackage.MODULE__INPUT_PORTS);
    }
    return inputPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getOutputPorts()
  {
    if (outputPorts == null)
    {
      outputPorts = new EObjectResolvingEList<Port>(Port.class, this, CorePackage.MODULE__OUTPUT_PORTS);
    }
    return outputPorts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionFlowModelElement> getInteractionFlowModelElements()
  {
    if (interactionFlowModelElements == null)
    {
      interactionFlowModelElements = new EObjectResolvingEList<InteractionFlowModelElement>(InteractionFlowModelElement.class, this, CorePackage.MODULE__INTERACTION_FLOW_MODEL_ELEMENTS);
    }
    return interactionFlowModelElements;
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
      case CorePackage.MODULE__INPUT_PORTS:
        return getInputPorts();
      case CorePackage.MODULE__OUTPUT_PORTS:
        return getOutputPorts();
      case CorePackage.MODULE__INTERACTION_FLOW_MODEL_ELEMENTS:
        return getInteractionFlowModelElements();
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
      case CorePackage.MODULE__INPUT_PORTS:
        getInputPorts().clear();
        getInputPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case CorePackage.MODULE__OUTPUT_PORTS:
        getOutputPorts().clear();
        getOutputPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case CorePackage.MODULE__INTERACTION_FLOW_MODEL_ELEMENTS:
        getInteractionFlowModelElements().clear();
        getInteractionFlowModelElements().addAll((Collection<? extends InteractionFlowModelElement>)newValue);
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
      case CorePackage.MODULE__INPUT_PORTS:
        getInputPorts().clear();
        return;
      case CorePackage.MODULE__OUTPUT_PORTS:
        getOutputPorts().clear();
        return;
      case CorePackage.MODULE__INTERACTION_FLOW_MODEL_ELEMENTS:
        getInteractionFlowModelElements().clear();
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
      case CorePackage.MODULE__INPUT_PORTS:
        return inputPorts != null && !inputPorts.isEmpty();
      case CorePackage.MODULE__OUTPUT_PORTS:
        return outputPorts != null && !outputPorts.isEmpty();
      case CorePackage.MODULE__INTERACTION_FLOW_MODEL_ELEMENTS:
        return interactionFlowModelElements != null && !interactionFlowModelElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleImpl
