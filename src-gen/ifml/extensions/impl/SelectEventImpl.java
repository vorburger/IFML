/**
 */
package ifml.extensions.impl;

import ifml.core.impl.ViewElementEventImpl;

import ifml.extensions.ExtensionsPackage;
import ifml.extensions.SelectEvent;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class SelectEventImpl extends ViewElementEventImpl implements SelectEvent
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectEventImpl()
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
    return ExtensionsPackage.Literals.SELECT_EVENT;
  }

} //SelectEventImpl
