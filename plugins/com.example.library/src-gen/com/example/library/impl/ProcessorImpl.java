/**
 */
package com.example.library.impl;

import com.example.library.LibraryPackage;
import com.example.library.Processor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.example.library.impl.ProcessorImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link com.example.library.impl.ProcessorImpl#getClockSpeed <em>Clock Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends NamedElementImpl implements Processor {
	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected int cores = CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockSpeed() <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_SPEED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClockSpeed() <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected float clockSpeed = CLOCK_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCores(int newCores) {
		int oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.PROCESSOR__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getClockSpeed() {
		return clockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClockSpeed(float newClockSpeed) {
		float oldClockSpeed = clockSpeed;
		clockSpeed = newClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.PROCESSOR__CLOCK_SPEED, oldClockSpeed,
					clockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LibraryPackage.PROCESSOR__CORES:
			return getCores();
		case LibraryPackage.PROCESSOR__CLOCK_SPEED:
			return getClockSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LibraryPackage.PROCESSOR__CORES:
			setCores((Integer) newValue);
			return;
		case LibraryPackage.PROCESSOR__CLOCK_SPEED:
			setClockSpeed((Float) newValue);
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
		case LibraryPackage.PROCESSOR__CORES:
			setCores(CORES_EDEFAULT);
			return;
		case LibraryPackage.PROCESSOR__CLOCK_SPEED:
			setClockSpeed(CLOCK_SPEED_EDEFAULT);
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
		case LibraryPackage.PROCESSOR__CORES:
			return cores != CORES_EDEFAULT;
		case LibraryPackage.PROCESSOR__CLOCK_SPEED:
			return clockSpeed != CLOCK_SPEED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cores: ");
		result.append(cores);
		result.append(", clockSpeed: ");
		result.append(clockSpeed);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
