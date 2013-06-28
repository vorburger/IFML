/**
 */
package ifml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.InteractionFlow#getSrcInteractionFlowElement <em>Src Interaction Flow Element</em>}</li>
 *   <li>{@link ifml.core.InteractionFlow#getTrgtInteractionFlowElement <em>Trgt Interaction Flow Element</em>}</li>
 *   <li>{@link ifml.core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getInteractionFlow()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlow extends InteractionFlowModelElement
{
  /**
   * Returns the value of the '<em><b>Src Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src Interaction Flow Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Interaction Flow Element</em>' reference.
   * @see #setSrcInteractionFlowElement(InteractionFlowElement)
   * @see ifml.core.CorePackage#getInteractionFlow_SrcInteractionFlowElement()
   * @model required="true" ordered="false"
   * @generated
   */
  InteractionFlowElement getSrcInteractionFlowElement();

  /**
   * Sets the value of the '{@link ifml.core.InteractionFlow#getSrcInteractionFlowElement <em>Src Interaction Flow Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src Interaction Flow Element</em>' reference.
   * @see #getSrcInteractionFlowElement()
   * @generated
   */
  void setSrcInteractionFlowElement(InteractionFlowElement value);

  /**
   * Returns the value of the '<em><b>Trgt Interaction Flow Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trgt Interaction Flow Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trgt Interaction Flow Element</em>' reference.
   * @see #setTrgtInteractionFlowElement(InteractionFlowElement)
   * @see ifml.core.CorePackage#getInteractionFlow_TrgtInteractionFlowElement()
   * @model required="true" ordered="false"
   * @generated
   */
  InteractionFlowElement getTrgtInteractionFlowElement();

  /**
   * Sets the value of the '{@link ifml.core.InteractionFlow#getTrgtInteractionFlowElement <em>Trgt Interaction Flow Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trgt Interaction Flow Element</em>' reference.
   * @see #getTrgtInteractionFlowElement()
   * @generated
   */
  void setTrgtInteractionFlowElement(InteractionFlowElement value);

  /**
   * Returns the value of the '<em><b>Parameter Binding Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Binding Group</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Binding Group</em>' containment reference.
   * @see #setParameterBindingGroup(ParameterBindingGroup)
   * @see ifml.core.CorePackage#getInteractionFlow_ParameterBindingGroup()
   * @model containment="true" ordered="false"
   * @generated
   */
  ParameterBindingGroup getParameterBindingGroup();

  /**
   * Sets the value of the '{@link ifml.core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Binding Group</em>' containment reference.
   * @see #getParameterBindingGroup()
   * @generated
   */
  void setParameterBindingGroup(ParameterBindingGroup value);

} // InteractionFlow
