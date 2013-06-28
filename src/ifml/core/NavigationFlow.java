/**
 */
package ifml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifml.core.NavigationFlow#getDataFlows <em>Data Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifml.core.CorePackage#getNavigationFlow()
 * @model
 * @generated
 */
public interface NavigationFlow extends InteractionFlow
{
  /**
   * Returns the value of the '<em><b>Data Flows</b></em>' reference list.
   * The list contents are of type {@link ifml.core.DataFlow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Flows</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Flows</em>' reference list.
   * @see ifml.core.CorePackage#getNavigationFlow_DataFlows()
   * @model ordered="false"
   * @generated
   */
  EList<DataFlow> getDataFlows();

} // NavigationFlow
