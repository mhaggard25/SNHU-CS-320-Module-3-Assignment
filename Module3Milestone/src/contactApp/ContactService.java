package contactApp;

import java.util.Vector;

public class ContactService {
	
	// Create a vector to store contacts.
	private Vector<Contact> myContacts = new Vector<Contact>();
	
	// Create an int counter to store the number of contacts.
	private int numContacts = 0;
	
	// Getter for numContacts
	public int GetNumContacts() {
		return numContacts;
	}
	
	// Getter for the list of contacts.
	public Vector<Contact> getContactLIst(){
		return myContacts;
	}
	
	// Function to add a contact to the list.
	public void addContact(String contactID, String fName, String lName, String phoneNumber, String contactAddress) {
		// Create a new contact
		Contact newContact = new Contact(contactID, fName, lName, phoneNumber, contactAddress);
		
		// Add the contact to the list of contacts.
		myContacts.add(newContact);
		
		// Increment the number of contacts.
		numContacts++;
	}
	
	public void addContact(Contact contact) {
		// Add the contact to the list of contacts.
		myContacts.add(contact);
		
		// Increment the number of contacts.
		numContacts++;
	}
	
	// Function to add a contact to the list.
	public void removeContact(String contactID) {
		
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if (myContacts.isEmpty()) {
			throw new IllegalArgumentException("There are no contacts saved.");
		}
		
		int index = -1;
		for (Contact c: myContacts) {
			if (c.getContactID() == contactID) {
				index = myContacts.indexOf(c);
			}
		}
		
		if (index == -1) {
			System.out.println("Not found.");
			return;
		}
		
		else {
			myContacts.remove(index);
			numContacts--;
			System.out.println("Removed.");
		}
	}
	
	public void removeContact(Contact contact) {
		myContacts.remove(contact);
		numContacts --;
	}
	
	// Update contact
	
}
