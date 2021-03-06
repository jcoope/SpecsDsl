/**
 * generated by Xtext 2.21.0
 */
package com.example.specs.specsDsl.impl;

import com.example.specs.specsDsl.Memory;
import com.example.specs.specsDsl.Motherboard;
import com.example.specs.specsDsl.Processor;
import com.example.specs.specsDsl.Spec;
import com.example.specs.specsDsl.SpecsDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.specs.specsDsl.impl.SpecImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.impl.SpecImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.impl.SpecImpl#getMotherboard <em>Motherboard</em>}</li>
 *   <li>{@link com.example.specs.specsDsl.impl.SpecImpl#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecImpl extends MinimalEObjectImpl.Container implements Spec
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessor()
   * @generated
   * @ordered
   */
  protected Processor processor;

  /**
   * The cached value of the '{@link #getMotherboard() <em>Motherboard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMotherboard()
   * @generated
   * @ordered
   */
  protected Motherboard motherboard;

  /**
   * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemories()
   * @generated
   * @ordered
   */
  protected EList<Memory> memories;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpecImpl()
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
    return SpecsDslPackage.Literals.SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecsDslPackage.SPEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Processor getProcessor()
  {
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs)
  {
    Processor oldProcessor = processor;
    processor = newProcessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecsDslPackage.SPEC__PROCESSOR, oldProcessor, newProcessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcessor(Processor newProcessor)
  {
    if (newProcessor != processor)
    {
      NotificationChain msgs = null;
      if (processor != null)
        msgs = ((InternalEObject)processor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecsDslPackage.SPEC__PROCESSOR, null, msgs);
      if (newProcessor != null)
        msgs = ((InternalEObject)newProcessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecsDslPackage.SPEC__PROCESSOR, null, msgs);
      msgs = basicSetProcessor(newProcessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecsDslPackage.SPEC__PROCESSOR, newProcessor, newProcessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Motherboard getMotherboard()
  {
    return motherboard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMotherboard(Motherboard newMotherboard, NotificationChain msgs)
  {
    Motherboard oldMotherboard = motherboard;
    motherboard = newMotherboard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecsDslPackage.SPEC__MOTHERBOARD, oldMotherboard, newMotherboard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMotherboard(Motherboard newMotherboard)
  {
    if (newMotherboard != motherboard)
    {
      NotificationChain msgs = null;
      if (motherboard != null)
        msgs = ((InternalEObject)motherboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecsDslPackage.SPEC__MOTHERBOARD, null, msgs);
      if (newMotherboard != null)
        msgs = ((InternalEObject)newMotherboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecsDslPackage.SPEC__MOTHERBOARD, null, msgs);
      msgs = basicSetMotherboard(newMotherboard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpecsDslPackage.SPEC__MOTHERBOARD, newMotherboard, newMotherboard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Memory> getMemories()
  {
    if (memories == null)
    {
      memories = new EObjectContainmentEList<Memory>(Memory.class, this, SpecsDslPackage.SPEC__MEMORIES);
    }
    return memories;
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
      case SpecsDslPackage.SPEC__PROCESSOR:
        return basicSetProcessor(null, msgs);
      case SpecsDslPackage.SPEC__MOTHERBOARD:
        return basicSetMotherboard(null, msgs);
      case SpecsDslPackage.SPEC__MEMORIES:
        return ((InternalEList<?>)getMemories()).basicRemove(otherEnd, msgs);
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
      case SpecsDslPackage.SPEC__NAME:
        return getName();
      case SpecsDslPackage.SPEC__PROCESSOR:
        return getProcessor();
      case SpecsDslPackage.SPEC__MOTHERBOARD:
        return getMotherboard();
      case SpecsDslPackage.SPEC__MEMORIES:
        return getMemories();
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
      case SpecsDslPackage.SPEC__NAME:
        setName((String)newValue);
        return;
      case SpecsDslPackage.SPEC__PROCESSOR:
        setProcessor((Processor)newValue);
        return;
      case SpecsDslPackage.SPEC__MOTHERBOARD:
        setMotherboard((Motherboard)newValue);
        return;
      case SpecsDslPackage.SPEC__MEMORIES:
        getMemories().clear();
        getMemories().addAll((Collection<? extends Memory>)newValue);
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
      case SpecsDslPackage.SPEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpecsDslPackage.SPEC__PROCESSOR:
        setProcessor((Processor)null);
        return;
      case SpecsDslPackage.SPEC__MOTHERBOARD:
        setMotherboard((Motherboard)null);
        return;
      case SpecsDslPackage.SPEC__MEMORIES:
        getMemories().clear();
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
      case SpecsDslPackage.SPEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpecsDslPackage.SPEC__PROCESSOR:
        return processor != null;
      case SpecsDslPackage.SPEC__MOTHERBOARD:
        return motherboard != null;
      case SpecsDslPackage.SPEC__MEMORIES:
        return memories != null && !memories.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SpecImpl
