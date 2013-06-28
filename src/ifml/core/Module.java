/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.Module#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link ifml.core.Module#getOutputPorts <em>Output Ports</em>}</li>
 *   <li>{@link ifml.core.Module#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends InteractionFlowModelElement
{
  /**
   * Returns the value of the '<em><b>Input Ports</b></em>' reference list.
   * The list contents are of type {@link ifml.core.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Ports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Ports</em>' reference list.
   * @see ifml.core.CorePackage#getModule_InputPorts()
   * @model required="true"
   * @generated
   */
  EList<Port> getInputPorts();

  /**
   * Returns the value of the '<em><b>Output Ports</b></em>' reference list.
   * The list contents are of type {@link ifml.core.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Ports</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Ports</em>' reference list.
   * @see ifml.core.CorePackage#getModule_OutputPorts()
   * @model required="true"
   * @generated
   */
  EList<Port> getOutputPorts();

  /**
   * Returns the value of the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
   * The list contents are of type {@link ifml.core.InteractionFlowModelElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Flow Model Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Flow Model Elements</em>' reference list.
   * @see ifml.core.CorePackage#getModule_InteractionFlowModelElements()
   * @model required="true"
   * @generated
   */
  EList<InteractionFlowModelElement> getInteractionFlowModelElements();

} // Module
