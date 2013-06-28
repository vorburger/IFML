/**
 */
package ifml.core.util;

import ifml.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.MultiplicityElement;
import uml.TemplaetableElement;
import uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ifml.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CorePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CorePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreSwitch<Adapter> modelSwitch =
    new CoreSwitch<Adapter>()
    {
      @Override
      public Adapter caseViewPoint(ViewPoint object)
      {
        return createViewPointAdapter();
      }
      @Override
      public Adapter caseInteractionFlowElement(InteractionFlowElement object)
      {
        return createInteractionFlowElementAdapter();
      }
      @Override
      public Adapter caseNavigationFlow(NavigationFlow object)
      {
        return createNavigationFlowAdapter();
      }
      @Override
      public Adapter caseActionEvent(ActionEvent object)
      {
        return createActionEventAdapter();
      }
      @Override
      public Adapter caseInteractionFlowModel(InteractionFlowModel object)
      {
        return createInteractionFlowModelAdapter();
      }
      @Override
      public Adapter caseParameterBindingGroup(ParameterBindingGroup object)
      {
        return createParameterBindingGroupAdapter();
      }
      @Override
      public Adapter caseParameterBinding(ParameterBinding object)
      {
        return createParameterBindingAdapter();
      }
      @Override
      public Adapter caseContentModel(ContentModel object)
      {
        return createContentModelAdapter();
      }
      @Override
      public Adapter caseViewElement(ViewElement object)
      {
        return createViewElementAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseDynamicBehavior(DynamicBehavior object)
      {
        return createDynamicBehaviorAdapter();
      }
      @Override
      public Adapter caseDataFlow(DataFlow object)
      {
        return createDataFlowAdapter();
      }
      @Override
      public Adapter caseInteractionFlow(InteractionFlow object)
      {
        return createInteractionFlowAdapter();
      }
      @Override
      public Adapter caseViewElementEvent(ViewElementEvent object)
      {
        return createViewElementEventAdapter();
      }
      @Override
      public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object)
      {
        return createInteractionFlowModelElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseExternalEvent(ExternalEvent object)
      {
        return createExternalEventAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseViewComponentPart(ViewComponentPart object)
      {
        return createViewComponentPartAdapter();
      }
      @Override
      public Adapter caseViewContainer(ViewContainer object)
      {
        return createViewContainerAdapter();
      }
      @Override
      public Adapter caseIFMLModel(IFMLModel object)
      {
        return createIFMLModelAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseContentBinding(ContentBinding object)
      {
        return createContentBindingAdapter();
      }
      @Override
      public Adapter caseInteractionFlowExpression(InteractionFlowExpression object)
      {
        return createInteractionFlowExpressionAdapter();
      }
      @Override
      public Adapter caseDataBinding(DataBinding object)
      {
        return createDataBindingAdapter();
      }
      @Override
      public Adapter caseViewComponent(ViewComponent object)
      {
        return createViewComponentAdapter();
      }
      @Override
      public Adapter caseSystemEvent(SystemEvent object)
      {
        return createSystemEventAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseActivationExpression(ActivationExpression object)
      {
        return createActivationExpressionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseConditionalExpression(ConditionalExpression object)
      {
        return createConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseContextDimension(ContextDimension object)
      {
        return createContextDimensionAdapter();
      }
      @Override
      public Adapter caseVisualizationAttribute(VisualizationAttribute object)
      {
        return createVisualizationAttributeAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseUml_Element(uml.Element object)
      {
        return createUml_ElementAdapter();
      }
      @Override
      public Adapter caseTemplaetableElement(TemplaetableElement object)
      {
        return createTemplaetableElementAdapter();
      }
      @Override
      public Adapter caseMultiplicityElement(MultiplicityElement object)
      {
        return createMultiplicityElementAdapter();
      }
      @Override
      public Adapter caseTypedElement(TypedElement object)
      {
        return createTypedElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewPoint <em>View Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewPoint
   * @generated
   */
  public Adapter createViewPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.InteractionFlowElement
   * @generated
   */
  public Adapter createInteractionFlowElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.NavigationFlow <em>Navigation Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.NavigationFlow
   * @generated
   */
  public Adapter createNavigationFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ActionEvent <em>Action Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ActionEvent
   * @generated
   */
  public Adapter createActionEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.InteractionFlowModel <em>Interaction Flow Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.InteractionFlowModel
   * @generated
   */
  public Adapter createInteractionFlowModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ParameterBindingGroup
   * @generated
   */
  public Adapter createParameterBindingGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ParameterBinding <em>Parameter Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ParameterBinding
   * @generated
   */
  public Adapter createParameterBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ContentModel <em>Content Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ContentModel
   * @generated
   */
  public Adapter createContentModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewElement <em>View Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewElement
   * @generated
   */
  public Adapter createViewElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.DynamicBehavior <em>Dynamic Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.DynamicBehavior
   * @generated
   */
  public Adapter createDynamicBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.DataFlow <em>Data Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.DataFlow
   * @generated
   */
  public Adapter createDataFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.InteractionFlow <em>Interaction Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.InteractionFlow
   * @generated
   */
  public Adapter createInteractionFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewElementEvent <em>View Element Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewElementEvent
   * @generated
   */
  public Adapter createViewElementEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.InteractionFlowModelElement
   * @generated
   */
  public Adapter createInteractionFlowModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ExternalEvent <em>External Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ExternalEvent
   * @generated
   */
  public Adapter createExternalEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewComponentPart <em>View Component Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewComponentPart
   * @generated
   */
  public Adapter createViewComponentPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewContainer <em>View Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewContainer
   * @generated
   */
  public Adapter createViewContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.IFMLModel <em>IFML Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.IFMLModel
   * @generated
   */
  public Adapter createIFMLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ContentBinding <em>Content Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ContentBinding
   * @generated
   */
  public Adapter createContentBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.InteractionFlowExpression <em>Interaction Flow Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.InteractionFlowExpression
   * @generated
   */
  public Adapter createInteractionFlowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.DataBinding <em>Data Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.DataBinding
   * @generated
   */
  public Adapter createDataBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ViewComponent <em>View Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ViewComponent
   * @generated
   */
  public Adapter createViewComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.SystemEvent <em>System Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.SystemEvent
   * @generated
   */
  public Adapter createSystemEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.BooleanExpression <em>Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.BooleanExpression
   * @generated
   */
  public Adapter createBooleanExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ActivationExpression <em>Activation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ActivationExpression
   * @generated
   */
  public Adapter createActivationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ConditionalExpression
   * @generated
   */
  public Adapter createConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.ContextDimension <em>Context Dimension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.ContextDimension
   * @generated
   */
  public Adapter createContextDimensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.VisualizationAttribute <em>Visualization Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.VisualizationAttribute
   * @generated
   */
  public Adapter createVisualizationAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.core.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.core.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uml.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uml.Element
   * @generated
   */
  public Adapter createUml_ElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uml.TemplaetableElement <em>Templaetable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uml.TemplaetableElement
   * @generated
   */
  public Adapter createTemplaetableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uml.MultiplicityElement <em>Multiplicity Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uml.MultiplicityElement
   * @generated
   */
  public Adapter createMultiplicityElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uml.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uml.TypedElement
   * @generated
   */
  public Adapter createTypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CoreAdapterFactory
