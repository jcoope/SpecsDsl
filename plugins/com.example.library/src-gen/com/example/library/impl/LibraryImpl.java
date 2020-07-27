/**
 */
package com.example.library.impl;

import com.example.library.Library;
import com.example.library.LibraryPackage;
import com.example.library.Memory;
import com.example.library.Motherboard;
import com.example.library.Processor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.library.impl.LibraryImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link com.example.library.impl.LibraryImpl#getMotherboards <em>Motherboards</em>}</li>
 *   <li>{@link com.example.library.impl.LibraryImpl#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends NamedElementImpl implements Library {
	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getMotherboards() <em>Motherboards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotherboards()
	 * @generated
	 * @ordered
	 */
	protected EList<Motherboard> motherboards;

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
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this,
					LibraryPackage.LIBRARY__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Motherboard> getMotherboards() {
		if (motherboards == null) {
			motherboards = new EObjectContainmentEList<Motherboard>(Motherboard.class, this,
					LibraryPackage.LIBRARY__MOTHERBOARDS);
		}
		return motherboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Memory> getMemories() {
		if (memories == null) {
			memories = new EObjectContainmentEList<Memory>(Memory.class, this, LibraryPackage.LIBRARY__MEMORIES);
		}
		return memories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LibraryPackage.LIBRARY__PROCESSORS:
			return ((InternalEList<?>) getProcessors()).basicRemove(otherEnd, msgs);
		case LibraryPackage.LIBRARY__MOTHERBOARDS:
			return ((InternalEList<?>) getMotherboards()).basicRemove(otherEnd, msgs);
		case LibraryPackage.LIBRARY__MEMORIES:
			return ((InternalEList<?>) getMemories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LibraryPackage.LIBRARY__PROCESSORS:
			return getProcessors();
		case LibraryPackage.LIBRARY__MOTHERBOARDS:
			return getMotherboards();
		case LibraryPackage.LIBRARY__MEMORIES:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LibraryPackage.LIBRARY__PROCESSORS:
			getProcessors().clear();
			getProcessors().addAll((Collection<? extends Processor>) newValue);
			return;
		case LibraryPackage.LIBRARY__MOTHERBOARDS:
			getMotherboards().clear();
			getMotherboards().addAll((Collection<? extends Motherboard>) newValue);
			return;
		case LibraryPackage.LIBRARY__MEMORIES:
			getMemories().clear();
			getMemories().addAll((Collection<? extends Memory>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case LibraryPackage.LIBRARY__PROCESSORS:
			getProcessors().clear();
			return;
		case LibraryPackage.LIBRARY__MOTHERBOARDS:
			getMotherboards().clear();
			return;
		case LibraryPackage.LIBRARY__MEMORIES:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LibraryPackage.LIBRARY__PROCESSORS:
			return processors != null && !processors.isEmpty();
		case LibraryPackage.LIBRARY__MOTHERBOARDS:
			return motherboards != null && !motherboards.isEmpty();
		case LibraryPackage.LIBRARY__MEMORIES:
			return memories != null && !memories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
