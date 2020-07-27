/**
 */
package com.example.library;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.library.Processor#getCores <em>Cores</em>}</li>
 *   <li>{@link com.example.library.Processor#getClockSpeed <em>Clock Speed</em>}</li>
 * </ul>
 *
 * @see com.example.library.LibraryPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(int)
	 * @see com.example.library.LibraryPackage#getProcessor_Cores()
	 * @model
	 * @generated
	 */
	int getCores();

	/**
	 * Sets the value of the '{@link com.example.library.Processor#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(int value);

	/**
	 * Returns the value of the '<em><b>Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Speed</em>' attribute.
	 * @see #setClockSpeed(float)
	 * @see com.example.library.LibraryPackage#getProcessor_ClockSpeed()
	 * @model
	 * @generated
	 */
	float getClockSpeed();

	/**
	 * Sets the value of the '{@link com.example.library.Processor#getClockSpeed <em>Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Speed</em>' attribute.
	 * @see #getClockSpeed()
	 * @generated
	 */
	void setClockSpeed(float value);

} // Processor
