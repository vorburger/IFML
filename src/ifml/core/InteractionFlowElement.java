/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

import uml.TemplaetableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.InteractionFlowElement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ifml.core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}</li>
 *   <li>{@link ifml.core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getInteractionFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlowElement extends NamedElement, InteractionFlowModelElement, TemplaetableElement
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see ifml.core.CorePackage#getInteractionFlowElement_Parameters()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>In Interaction Flows</b></em>' reference list.
   * The list contents are of type {@link ifml.core.InteractionFlow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Interaction Flows</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Interaction Flows</em>' reference list.
   * @see ifml.core.CorePackage#getInteractionFlowElement_InInteractionFlows()
   * @model ordered="false"
   * @generated
   */
  EList<InteractionFlow> getInInteractionFlows();

  /**
   * Returns the value of the '<em><b>Out Interaction Flows</b></em>' containment reference list.
   * The list contents are of type {@link ifml.core.InteractionFlow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Interaction Flows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Interaction Flows</em>' containment reference list.
   * @see ifml.core.CorePackage#getInteractionFlowElement_OutInteractionFlows()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<InteractionFlow> getOutInteractionFlows();

} // InteractionFlowElement
