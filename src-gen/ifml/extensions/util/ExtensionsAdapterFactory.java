/**
 */
package ifml.extensions.util;

import ifml.core.BooleanExpression;
import ifml.core.Constraint;
import ifml.core.ContextDimension;
import ifml.core.Element;
import ifml.core.Event;
import ifml.core.Expression;
import ifml.core.InteractionFlowElement;
import ifml.core.InteractionFlowModelElement;
import ifml.core.NamedElement;
import ifml.core.ViewComponent;
import ifml.core.ViewComponentPart;
import ifml.core.ViewContainer;
import ifml.core.ViewElement;
import ifml.core.ViewElementEvent;

import ifml.extensions.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.TemplaetableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ifml.extensions.ExtensionsPackage
 * @generated
 */
public class ExtensionsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExtensionsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExtensionsPackage.eINSTANCE;
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
  protected ExtensionsSwitch<Adapter> modelSwitch =
    new ExtensionsSwitch<Adapter>()
    {
      @Override
      public Adapter caseForm(Form object)
      {
        return createFormAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseSelectionField(SelectionField object)
      {
        return createSelectionFieldAdapter();
      }
      @Override
      public Adapter caseValidationRule(ValidationRule object)
      {
        return createValidationRuleAdapter();
      }
      @Override
      public Adapter caseSlot(Slot object)
      {
        return createSlotAdapter();
      }
      @Override
      public Adapter caseSortAttribute(SortAttribute object)
      {
        return createSortAttributeAdapter();
      }
      @Override
      public Adapter caseSelectEvent(SelectEvent object)
      {
        return createSelectEventAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseSimpleField(SimpleField object)
      {
        return createSimpleFieldAdapter();
      }
      @Override
      public Adapter caseSubmitEvent(SubmitEvent object)
      {
        return createSubmitEventAdapter();
      }
      @Override
      public Adapter caseSelector(Selector object)
      {
        return createSelectorAdapter();
      }
      @Override
      public Adapter caseDevice(Device object)
      {
        return createDeviceAdapter();
      }
      @Override
      public Adapter casePosition(Position object)
      {
        return createPositionAdapter();
      }
      @Override
      public Adapter caseUserRole(UserRole object)
      {
        return createUserRoleAdapter();
      }
      @Override
      public Adapter caseDetails(Details object)
      {
        return createDetailsAdapter();
      }
      @Override
      public Adapter caseWindow(Window object)
      {
        return createWindowAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object)
      {
        return createInteractionFlowModelElementAdapter();
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
      public Adapter caseInteractionFlowElement(InteractionFlowElement object)
      {
        return createInteractionFlowElementAdapter();
      }
      @Override
      public Adapter caseViewElement(ViewElement object)
      {
        return createViewElementAdapter();
      }
      @Override
      public Adapter caseViewComponent(ViewComponent object)
      {
        return createViewComponentAdapter();
      }
      @Override
      public Adapter caseViewComponentPart(ViewComponentPart object)
      {
        return createViewComponentPartAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanExpression(BooleanExpression object)
      {
        return createBooleanExpressionAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseViewElementEvent(ViewElementEvent object)
      {
        return createViewElementEventAdapter();
      }
      @Override
      public Adapter caseContextDimension(ContextDimension object)
      {
        return createContextDimensionAdapter();
      }
      @Override
      public Adapter caseViewContainer(ViewContainer object)
      {
        return createViewContainerAdapter();
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
   * Creates a new adapter for an object of class '{@link ifml.extensions.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Form
   * @generated
   */
  public Adapter createFormAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.SelectionField <em>Selection Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.SelectionField
   * @generated
   */
  public Adapter createSelectionFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.ValidationRule <em>Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.ValidationRule
   * @generated
   */
  public Adapter createValidationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Slot <em>Slot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Slot
   * @generated
   */
  public Adapter createSlotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.SortAttribute <em>Sort Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.SortAttribute
   * @generated
   */
  public Adapter createSortAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.SelectEvent <em>Select Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.SelectEvent
   * @generated
   */
  public Adapter createSelectEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.SimpleField <em>Simple Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.SimpleField
   * @generated
   */
  public Adapter createSimpleFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.SubmitEvent <em>Submit Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.SubmitEvent
   * @generated
   */
  public Adapter createSubmitEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Selector
   * @generated
   */
  public Adapter createSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Device <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Device
   * @generated
   */
  public Adapter createDeviceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Position
   * @generated
   */
  public Adapter createPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.UserRole <em>User Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.UserRole
   * @generated
   */
  public Adapter createUserRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Details <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Details
   * @generated
   */
  public Adapter createDetailsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ifml.extensions.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ifml.extensions.Window
   * @generated
   */
  public Adapter createWindowAdapter()
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

} //ExtensionsAdapterFactory
