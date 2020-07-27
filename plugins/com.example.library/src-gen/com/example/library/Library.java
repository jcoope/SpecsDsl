/**
 */
package com.example.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.library.Library#getProcessors <em>Processors</em>}</li>
 *   <li>{@link com.example.library.Library#getMotherboards <em>Motherboards</em>}</li>
 *   <li>{@link com.example.library.Library#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @see com.example.library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.library.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' containment reference list.
	 * @see com.example.library.LibraryPackage#getLibrary_Processors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processor> getProcessors();

	/**
	 * Returns the value of the '<em><b>Motherboards</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.library.Motherboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motherboards</em>' containment reference list.
	 * @see com.example.library.LibraryPackage#getLibrary_Motherboards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motherboard> getMotherboards();

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.library.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see com.example.library.LibraryPackage#getLibrary_Memories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memory> getMemories();

} // Library
