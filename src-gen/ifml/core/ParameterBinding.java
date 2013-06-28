/**
 */
package ifml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link ifml.core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends InteractionFlowModelElement
{
  /**
   * Returns the value of the '<em><b>Source Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Parameter</em>' reference.
   * @see #setSourceParameter(Parameter)
   * @see ifml.core.CorePackage#getParameterBinding_SourceParameter()
   * @model required="true" ordered="false"
   * @generated
   */
  Parameter getSourceParameter();

  /**
   * Sets the value of the '{@link ifml.core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Parameter</em>' reference.
   * @see #getSourceParameter()
   * @generated
   */
  void setSourceParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Target Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Parameter</em>' reference.
   * @see #setTargetParameter(Parameter)
   * @see ifml.core.CorePackage#getParameterBinding_TargetParameter()
   * @model required="true" ordered="false"
   * @generated
   */
  Parameter getTargetParameter();

  /**
   * Sets the value of the '{@link ifml.core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Parameter</em>' reference.
   * @see #getTargetParameter()
   * @generated
   */
  void setTargetParameter(Parameter value);

} // ParameterBinding
