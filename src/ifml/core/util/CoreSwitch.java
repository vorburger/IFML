/**
 */
package ifml.core.util;

import ifml.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.MultiplicityElement;
import uml.TemplaetableElement;
import uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ifml.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CorePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CorePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CorePackage.VIEW_POINT:
      {
        ViewPoint viewPoint = (ViewPoint)theEObject;
        T result = caseViewPoint(viewPoint);
        if (result == null) result = caseNamedElement(viewPoint);
        if (result == null) result = caseElement(viewPoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.INTERACTION_FLOW_ELEMENT:
      {
        InteractionFlowElement interactionFlowElement = (InteractionFlowElement)theEObject;
        T result = caseInteractionFlowElement(interactionFlowElement);
        if (result == null) result = caseNamedElement(interactionFlowElement);
        if (result == null) result = caseInteractionFlowModelElement(interactionFlowElement);
        if (result == null) result = caseTemplaetableElement(interactionFlowElement);
        if (result == null) result = caseElement(interactionFlowElement);
        if (result == null) result = caseUml_Element(interactionFlowElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.NAVIGATION_FLOW:
      {
        NavigationFlow navigationFlow = (NavigationFlow)theEObject;
        T result = caseNavigationFlow(navigationFlow);
        if (result == null) result = caseInteractionFlow(navigationFlow);
        if (result == null) result = caseInteractionFlowModelElement(navigationFlow);
        if (result == null) result = caseElement(navigationFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.ACTION_EVENT:
      {
        ActionEvent actionEvent = (ActionEvent)theEObject;
        T result = caseActionEvent(actionEvent);
        if (result == null) result = caseEvent(actionEvent);
        if (result == null) result = caseInteractionFlowElement(actionEvent);
        if (result == null) result = caseNamedElement(actionEvent);
        if (result == null) result = caseInteractionFlowModelElement(actionEvent);
        if (result == null) result = caseTemplaetableElement(actionEvent);
        if (result == null) result = caseElement(actionEvent);
        if (result == null) result = caseUml_Element(actionEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.INTERACTION_FLOW_MODEL:
      {
        InteractionFlowModel interactionFlowModel = (InteractionFlowModel)theEObject;
        T result = caseInteractionFlowModel(interactionFlowModel);
        if (result == null) result = caseNamedElement(interactionFlowModel);
        if (result == null) result = caseElement(interactionFlowModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.PARAMETER_BINDING_GROUP:
      {
        ParameterBindingGroup parameterBindingGroup = (ParameterBindingGroup)theEObject;
        T result = caseParameterBindingGroup(parameterBindingGroup);
        if (result == null) result = caseInteractionFlowModelElement(parameterBindingGroup);
        if (result == null) result = caseElement(parameterBindingGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.PARAMETER_BINDING:
      {
        ParameterBinding parameterBinding = (ParameterBinding)theEObject;
        T result = caseParameterBinding(parameterBinding);
        if (result == null) result = caseInteractionFlowModelElement(parameterBinding);
        if (result == null) result = caseElement(parameterBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONTENT_MODEL:
      {
        ContentModel contentModel = (ContentModel)theEObject;
        T result = caseContentModel(contentModel);
        if (result == null) result = caseNamedElement(contentModel);
        if (result == null) result = caseElement(contentModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VIEW_ELEMENT:
      {
        ViewElement viewElement = (ViewElement)theEObject;
        T result = caseViewElement(viewElement);
        if (result == null) result = caseInteractionFlowElement(viewElement);
        if (result == null) result = caseNamedElement(viewElement);
        if (result == null) result = caseInteractionFlowModelElement(viewElement);
        if (result == null) result = caseTemplaetableElement(viewElement);
        if (result == null) result = caseElement(viewElement);
        if (result == null) result = caseUml_Element(viewElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseInteractionFlowElement(action);
        if (result == null) result = caseNamedElement(action);
        if (result == null) result = caseInteractionFlowModelElement(action);
        if (result == null) result = caseTemplaetableElement(action);
        if (result == null) result = caseElement(action);
        if (result == null) result = caseUml_Element(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.DYNAMIC_BEHAVIOR:
      {
        DynamicBehavior dynamicBehavior = (DynamicBehavior)theEObject;
        T result = caseDynamicBehavior(dynamicBehavior);
        if (result == null) result = caseContentBinding(dynamicBehavior);
        if (result == null) result = caseViewComponentPart(dynamicBehavior);
        if (result == null) result = caseInteractionFlowElement(dynamicBehavior);
        if (result == null) result = caseNamedElement(dynamicBehavior);
        if (result == null) result = caseInteractionFlowModelElement(dynamicBehavior);
        if (result == null) result = caseTemplaetableElement(dynamicBehavior);
        if (result == null) result = caseElement(dynamicBehavior);
        if (result == null) result = caseUml_Element(dynamicBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.DATA_FLOW:
      {
        DataFlow dataFlow = (DataFlow)theEObject;
        T result = caseDataFlow(dataFlow);
        if (result == null) result = caseInteractionFlow(dataFlow);
        if (result == null) result = caseInteractionFlowModelElement(dataFlow);
        if (result == null) result = caseElement(dataFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.INTERACTION_FLOW:
      {
        InteractionFlow interactionFlow = (InteractionFlow)theEObject;
        T result = caseInteractionFlow(interactionFlow);
        if (result == null) result = caseInteractionFlowModelElement(interactionFlow);
        if (result == null) result = caseElement(interactionFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VIEW_ELEMENT_EVENT:
      {
        ViewElementEvent viewElementEvent = (ViewElementEvent)theEObject;
        T result = caseViewElementEvent(viewElementEvent);
        if (result == null) result = caseEvent(viewElementEvent);
        if (result == null) result = caseInteractionFlowElement(viewElementEvent);
        if (result == null) result = caseNamedElement(viewElementEvent);
        if (result == null) result = caseInteractionFlowModelElement(viewElementEvent);
        if (result == null) result = caseTemplaetableElement(viewElementEvent);
        if (result == null) result = caseElement(viewElementEvent);
        if (result == null) result = caseUml_Element(viewElementEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.INTERACTION_FLOW_MODEL_ELEMENT:
      {
        InteractionFlowModelElement interactionFlowModelElement = (InteractionFlowModelElement)theEObject;
        T result = caseInteractionFlowModelElement(interactionFlowModelElement);
        if (result == null) result = caseElement(interactionFlowModelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = caseElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.EXTERNAL_EVENT:
      {
        ExternalEvent externalEvent = (ExternalEvent)theEObject;
        T result = caseExternalEvent(externalEvent);
        if (result == null) result = caseEvent(externalEvent);
        if (result == null) result = caseInteractionFlowElement(externalEvent);
        if (result == null) result = caseNamedElement(externalEvent);
        if (result == null) result = caseInteractionFlowModelElement(externalEvent);
        if (result == null) result = caseTemplaetableElement(externalEvent);
        if (result == null) result = caseElement(externalEvent);
        if (result == null) result = caseUml_Element(externalEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseBooleanExpression(constraint);
        if (result == null) result = caseExpression(constraint);
        if (result == null) result = caseInteractionFlowModelElement(constraint);
        if (result == null) result = caseElement(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VIEW_COMPONENT_PART:
      {
        ViewComponentPart viewComponentPart = (ViewComponentPart)theEObject;
        T result = caseViewComponentPart(viewComponentPart);
        if (result == null) result = caseInteractionFlowElement(viewComponentPart);
        if (result == null) result = caseNamedElement(viewComponentPart);
        if (result == null) result = caseInteractionFlowModelElement(viewComponentPart);
        if (result == null) result = caseTemplaetableElement(viewComponentPart);
        if (result == null) result = caseElement(viewComponentPart);
        if (result == null) result = caseUml_Element(viewComponentPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VIEW_CONTAINER:
      {
        ViewContainer viewContainer = (ViewContainer)theEObject;
        T result = caseViewContainer(viewContainer);
        if (result == null) result = caseViewElement(viewContainer);
        if (result == null) result = caseInteractionFlowElement(viewContainer);
        if (result == null) result = caseNamedElement(viewContainer);
        if (result == null) result = caseInteractionFlowModelElement(viewContainer);
        if (result == null) result = caseTemplaetableElement(viewContainer);
        if (result == null) result = caseElement(viewContainer);
        if (result == null) result = caseUml_Element(viewContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.IFML_MODEL:
      {
        IFMLModel ifmlModel = (IFMLModel)theEObject;
        T result = caseIFMLModel(ifmlModel);
        if (result == null) result = caseNamedElement(ifmlModel);
        if (result == null) result = caseElement(ifmlModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseInteractionFlowElement(event);
        if (result == null) result = caseNamedElement(event);
        if (result == null) result = caseInteractionFlowModelElement(event);
        if (result == null) result = caseTemplaetableElement(event);
        if (result == null) result = caseElement(event);
        if (result == null) result = caseUml_Element(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONTENT_BINDING:
      {
        ContentBinding contentBinding = (ContentBinding)theEObject;
        T result = caseContentBinding(contentBinding);
        if (result == null) result = caseViewComponentPart(contentBinding);
        if (result == null) result = caseInteractionFlowElement(contentBinding);
        if (result == null) result = caseNamedElement(contentBinding);
        if (result == null) result = caseInteractionFlowModelElement(contentBinding);
        if (result == null) result = caseTemplaetableElement(contentBinding);
        if (result == null) result = caseElement(contentBinding);
        if (result == null) result = caseUml_Element(contentBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.INTERACTION_FLOW_EXPRESSION:
      {
        InteractionFlowExpression interactionFlowExpression = (InteractionFlowExpression)theEObject;
        T result = caseInteractionFlowExpression(interactionFlowExpression);
        if (result == null) result = caseExpression(interactionFlowExpression);
        if (result == null) result = caseInteractionFlowModelElement(interactionFlowExpression);
        if (result == null) result = caseElement(interactionFlowExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.DATA_BINDING:
      {
        DataBinding dataBinding = (DataBinding)theEObject;
        T result = caseDataBinding(dataBinding);
        if (result == null) result = caseContentBinding(dataBinding);
        if (result == null) result = caseViewComponentPart(dataBinding);
        if (result == null) result = caseInteractionFlowElement(dataBinding);
        if (result == null) result = caseNamedElement(dataBinding);
        if (result == null) result = caseInteractionFlowModelElement(dataBinding);
        if (result == null) result = caseTemplaetableElement(dataBinding);
        if (result == null) result = caseElement(dataBinding);
        if (result == null) result = caseUml_Element(dataBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VIEW_COMPONENT:
      {
        ViewComponent viewComponent = (ViewComponent)theEObject;
        T result = caseViewComponent(viewComponent);
        if (result == null) result = caseViewElement(viewComponent);
        if (result == null) result = caseInteractionFlowElement(viewComponent);
        if (result == null) result = caseNamedElement(viewComponent);
        if (result == null) result = caseInteractionFlowModelElement(viewComponent);
        if (result == null) result = caseTemplaetableElement(viewComponent);
        if (result == null) result = caseElement(viewComponent);
        if (result == null) result = caseUml_Element(viewComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.SYSTEM_EVENT:
      {
        SystemEvent systemEvent = (SystemEvent)theEObject;
        T result = caseSystemEvent(systemEvent);
        if (result == null) result = caseEvent(systemEvent);
        if (result == null) result = caseInteractionFlowElement(systemEvent);
        if (result == null) result = caseNamedElement(systemEvent);
        if (result == null) result = caseInteractionFlowModelElement(systemEvent);
        if (result == null) result = caseTemplaetableElement(systemEvent);
        if (result == null) result = caseElement(systemEvent);
        if (result == null) result = caseUml_Element(systemEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = caseExpression(booleanExpression);
        if (result == null) result = caseInteractionFlowModelElement(booleanExpression);
        if (result == null) result = caseElement(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.ACTIVATION_EXPRESSION:
      {
        ActivationExpression activationExpression = (ActivationExpression)theEObject;
        T result = caseActivationExpression(activationExpression);
        if (result == null) result = caseBooleanExpression(activationExpression);
        if (result == null) result = caseExpression(activationExpression);
        if (result == null) result = caseInteractionFlowModelElement(activationExpression);
        if (result == null) result = caseElement(activationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseInteractionFlowModelElement(expression);
        if (result == null) result = caseElement(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseInteractionFlowModelElement(parameter);
        if (result == null) result = caseMultiplicityElement(parameter);
        if (result == null) result = caseTypedElement(parameter);
        if (result == null) result = caseNamedElement(parameter);
        if (result == null) result = caseElement(parameter);
        if (result == null) result = caseUml_Element(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONDITIONAL_EXPRESSION:
      {
        ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
        T result = caseConditionalExpression(conditionalExpression);
        if (result == null) result = caseExpression(conditionalExpression);
        if (result == null) result = caseViewComponentPart(conditionalExpression);
        if (result == null) result = caseInteractionFlowElement(conditionalExpression);
        if (result == null) result = caseInteractionFlowModelElement(conditionalExpression);
        if (result == null) result = caseNamedElement(conditionalExpression);
        if (result == null) result = caseTemplaetableElement(conditionalExpression);
        if (result == null) result = caseElement(conditionalExpression);
        if (result == null) result = caseUml_Element(conditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = caseElement(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.CONTEXT_DIMENSION:
      {
        ContextDimension contextDimension = (ContextDimension)theEObject;
        T result = caseContextDimension(contextDimension);
        if (result == null) result = caseNamedElement(contextDimension);
        if (result == null) result = caseElement(contextDimension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.VISUALIZATION_ATTRIBUTE:
      {
        VisualizationAttribute visualizationAttribute = (VisualizationAttribute)theEObject;
        T result = caseVisualizationAttribute(visualizationAttribute);
        if (result == null) result = caseViewComponentPart(visualizationAttribute);
        if (result == null) result = caseInteractionFlowElement(visualizationAttribute);
        if (result == null) result = caseNamedElement(visualizationAttribute);
        if (result == null) result = caseInteractionFlowModelElement(visualizationAttribute);
        if (result == null) result = caseTemplaetableElement(visualizationAttribute);
        if (result == null) result = caseElement(visualizationAttribute);
        if (result == null) result = caseUml_Element(visualizationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseInteractionFlowModelElement(module);
        if (result == null) result = caseElement(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = caseInteractionFlowElement(port);
        if (result == null) result = caseNamedElement(port);
        if (result == null) result = caseInteractionFlowModelElement(port);
        if (result == null) result = caseTemplaetableElement(port);
        if (result == null) result = caseElement(port);
        if (result == null) result = caseUml_Element(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CorePackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewPoint(ViewPoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFlowElement(InteractionFlowElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigationFlow(NavigationFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionEvent(ActionEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFlowModel(InteractionFlowModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterBindingGroup(ParameterBindingGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterBinding(ParameterBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentModel(ContentModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewElement(ViewElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dynamic Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dynamic Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDynamicBehavior(DynamicBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataFlow(DataFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFlow(InteractionFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewElementEvent(ViewElementEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFlowModelElement(InteractionFlowModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalEvent(ExternalEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Component Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Component Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewComponentPart(ViewComponentPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewContainer(ViewContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IFML Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IFML Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIFMLModel(IFMLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContentBinding(ContentBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interaction Flow Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractionFlowExpression(InteractionFlowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataBinding(DataBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewComponent(ViewComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemEvent(SystemEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivationExpression(ActivationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExpression(ConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextDimension(ContextDimension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visualization Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visualization Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisualizationAttribute(VisualizationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUml_Element(uml.Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Templaetable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Templaetable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplaetableElement(TemplaetableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicityElement(MultiplicityElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedElement(TypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CoreSwitch
