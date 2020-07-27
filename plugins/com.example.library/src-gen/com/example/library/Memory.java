/**
 */
package com.example.library;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.library.Memory#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see com.example.library.LibraryPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see com.example.library.LibraryPackage#getMemory_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link com.example.library.Memory#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Memory
