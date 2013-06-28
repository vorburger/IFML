/**
 */
package ifml.core.impl;

import ifml.core.Context;
import ifml.core.ContextDimension;
import ifml.core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.ContextImpl#getContextDimensions <em>Context Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends ElementImpl implements Context
{
  /**
   * The cached value of the '{@link #getContextDimensions() <em>Context Dimensions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextDimensions()
   * @generated
   * @ordered
   */
  protected EList<ContextDimension> contextDimensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextImpl()
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
    return CorePackage.Literals.CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContextDimension> getContextDimensions()
  {
    if (contextDimensions == null)
    {
      contextDimensions = new EObjectResolvingEList<ContextDimension>(ContextDimension.class, this, CorePackage.CONTEXT__CONTEXT_DIMENSIONS);
    }
    return contextDimensions;
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
      case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
        return getContextDimensions();
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
      case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
        getContextDimensions().clear();
        getContextDimensions().addAll((Collection<? extends ContextDimension>)newValue);
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
      case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
        getContextDimensions().clear();
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
      case CorePackage.CONTEXT__CONTEXT_DIMENSIONS:
        return contextDimensions != null && !contextDimensions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContextImpl
