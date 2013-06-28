/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.DataFlow;
import ifml.core.NavigationFlow;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.NavigationFlowImpl#getDataFlows <em>Data Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationFlowImpl extends InteractionFlowImpl implements NavigationFlow
{
  /**
   * The cached value of the '{@link #getDataFlows() <em>Data Flows</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataFlows()
   * @generated
   * @ordered
   */
  protected EList<DataFlow> dataFlows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigationFlowImpl()
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
    return CorePackage.Literals.NAVIGATION_FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataFlow> getDataFlows()
  {
    if (dataFlows == null)
    {
      dataFlows = new EObjectResolvingEList<DataFlow>(DataFlow.class, this, CorePackage.NAVIGATION_FLOW__DATA_FLOWS);
    }
    return dataFlows;
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
      case CorePackage.NAVIGATION_FLOW__DATA_FLOWS:
        return getDataFlows();
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
      case CorePackage.NAVIGATION_FLOW__DATA_FLOWS:
        getDataFlows().clear();
        getDataFlows().addAll((Collection<? extends DataFlow>)newValue);
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
      case CorePackage.NAVIGATION_FLOW__DATA_FLOWS:
        getDataFlows().clear();
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
      case CorePackage.NAVIGATION_FLOW__DATA_FLOWS:
        return dataFlows != null && !dataFlows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NavigationFlowImpl
