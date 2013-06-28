/**
 */
package ifml.core.impl;

import ifml.core.CorePackage;
import ifml.core.InteractionFlow;
import ifml.core.InteractionFlowExpression;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.InteractionFlowExpressionImpl#getInteractionFlows <em>Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionFlowExpressionImpl extends ExpressionImpl implements InteractionFlowExpression
{
  /**
   * The cached value of the '{@link #getInteractionFlows() <em>Interaction Flows</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionFlows()
   * @generated
   * @ordered
   */
  protected EList<InteractionFlow> interactionFlows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionFlowExpressionImpl()
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
    return CorePackage.Literals.INTERACTION_FLOW_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractionFlow> getInteractionFlows()
  {
    if (interactionFlows == null)
    {
      interactionFlows = new EObjectResolvingEList<InteractionFlow>(InteractionFlow.class, this, CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS);
    }
    return interactionFlows;
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
      case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS:
        return getInteractionFlows();
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
      case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS:
        getInteractionFlows().clear();
        getInteractionFlows().addAll((Collection<? extends InteractionFlow>)newValue);
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
      case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS:
        getInteractionFlows().clear();
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
      case CorePackage.INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOWS:
        return interactionFlows != null && !interactionFlows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractionFlowExpressionImpl
