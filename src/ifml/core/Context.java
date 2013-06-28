/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.Context#getContextDimensions <em>Context Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Element
{
  /**
   * Returns the value of the '<em><b>Context Dimensions</b></em>' reference list.
   * The list contents are of type {@link ifml.core.ContextDimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context Dimensions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context Dimensions</em>' reference list.
   * @see ifml.core.CorePackage#getContext_ContextDimensions()
   * @model
   * @generated
   */
  EList<ContextDimension> getContextDimensions();

} // Context
