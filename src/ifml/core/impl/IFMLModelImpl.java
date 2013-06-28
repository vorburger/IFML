/**
 */
package ifml.core.impl;

import ifml.core.ContentModel;
import ifml.core.CorePackage;
import ifml.core.IFMLModel;
import ifml.core.InteractionFlowModel;
import ifml.core.ViewPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifml.core.impl.IFMLModelImpl#getInteractionFlowModel <em>Interaction Flow Model</em>}</li>
 *   <li>{@link ifml.core.impl.IFMLModelImpl#getContentModel <em>Content Model</em>}</li>
 *   <li>{@link ifml.core.impl.IFMLModelImpl#getInteractionFlowModelViewPoints <em>Interaction Flow Model View Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLModelImpl extends NamedElementImpl implements IFMLModel
{
  /**
   * The cached value of the '{@link #getInteractionFlowModel() <em>Interaction Flow Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionFlowModel()
   * @generated
   * @ordered
   */
  protected InteractionFlowModel interactionFlowModel;

  /**
   * The cached value of the '{@link #getContentModel() <em>Content Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentModel()
   * @generated
   * @ordered
   */
  protected ContentModel contentModel;

  /**
   * The cached value of the '{@link #getInteractionFlowModelViewPoints() <em>Interaction Flow Model View Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractionFlowModelViewPoints()
   * @generated
   * @ordered
   */
  protected EList<ViewPoint> interactionFlowModelViewPoints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IFMLModelImpl()
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
    return CorePackage.Literals.IFML_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionFlowModel getInteractionFlowModel()
  {
    return interactionFlowModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteractionFlowModel(InteractionFlowModel newInteractionFlowModel, NotificationChain msgs)
  {
    InteractionFlowModel oldInteractionFlowModel = interactionFlowModel;
    interactionFlowModel = newInteractionFlowModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, oldInteractionFlowModel, newInteractionFlowModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractionFlowModel(InteractionFlowModel newInteractionFlowModel)
  {
    if (newInteractionFlowModel != interactionFlowModel)
    {
      NotificationChain msgs = null;
      if (interactionFlowModel != null)
        msgs = ((InternalEObject)interactionFlowModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, null, msgs);
      if (newInteractionFlowModel != null)
        msgs = ((InternalEObject)newInteractionFlowModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, null, msgs);
      msgs = basicSetInteractionFlowModel(newInteractionFlowModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL, newInteractionFlowModel, newInteractionFlowModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentModel getContentModel()
  {
    return contentModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContentModel(ContentModel newContentModel, NotificationChain msgs)
  {
    ContentModel oldContentModel = contentModel;
    contentModel = newContentModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__CONTENT_MODEL, oldContentModel, newContentModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentModel(ContentModel newContentModel)
  {
    if (newContentModel != contentModel)
    {
      NotificationChain msgs = null;
      if (contentModel != null)
        msgs = ((InternalEObject)contentModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__CONTENT_MODEL, null, msgs);
      if (newContentModel != null)
        msgs = ((InternalEObject)newContentModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_MODEL__CONTENT_MODEL, null, msgs);
      msgs = basicSetContentModel(newContentModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODEL__CONTENT_MODEL, newContentModel, newContentModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ViewPoint> getInteractionFlowModelViewPoints()
  {
    if (interactionFlowModelViewPoints == null)
    {
      interactionFlowModelViewPoints = new EObjectContainmentEList<ViewPoint>(ViewPoint.class, this, CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS);
    }
    return interactionFlowModelViewPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
        return basicSetInteractionFlowModel(null, msgs);
      case CorePackage.IFML_MODEL__CONTENT_MODEL:
        return basicSetContentModel(null, msgs);
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS:
        return ((InternalEList<?>)getInteractionFlowModelViewPoints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
        return getInteractionFlowModel();
      case CorePackage.IFML_MODEL__CONTENT_MODEL:
        return getContentModel();
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS:
        return getInteractionFlowModelViewPoints();
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
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
        setInteractionFlowModel((InteractionFlowModel)newValue);
        return;
      case CorePackage.IFML_MODEL__CONTENT_MODEL:
        setContentModel((ContentModel)newValue);
        return;
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS:
        getInteractionFlowModelViewPoints().clear();
        getInteractionFlowModelViewPoints().addAll((Collection<? extends ViewPoint>)newValue);
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
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
        setInteractionFlowModel((InteractionFlowModel)null);
        return;
      case CorePackage.IFML_MODEL__CONTENT_MODEL:
        setContentModel((ContentModel)null);
        return;
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS:
        getInteractionFlowModelViewPoints().clear();
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
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL:
        return interactionFlowModel != null;
      case CorePackage.IFML_MODEL__CONTENT_MODEL:
        return contentModel != null;
      case CorePackage.IFML_MODEL__INTERACTION_FLOW_MODEL_VIEW_POINTS:
        return interactionFlowModelViewPoints != null && !interactionFlowModelViewPoints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IFMLModelImpl
