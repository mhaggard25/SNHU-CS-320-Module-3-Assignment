package contactApp;

public class ContactService {
	
	Contact myContact = new Contact();
	
	// Add contacts
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {
		
		// Get user input for the contact information.
		
		// Add contact information using the setters from the Contact class.
		myContact.setFirstName(firstName);
		myContact.setLastName(lastName);
		myContact.setPhoneNumber(phoneNumber);
		myContact.setContactAddress(address);
	}
	
	// Remove contacts using the contact ID
		public void removeContact(String ID) {
		// This doesn't do anything yet.
	}
	
	// Update contacts per ID (only update firstName, lastName, phoneNumber, contactAddress)
		public void updateContact(String ID) {
			// This doesn't do anything yet.
		}
	
	// Display contact for debug purposes
	public void displayContact() {
		System.out.println(myContact.getContactID() + ": " + myContact.getFirstName() + "  " + myContact.getLastName() + " | " + myContact.getPhoneNumber() + " | " + myContact.getContactAddress());
	}
	
	// If contactID is greater than 10 characters or null throw error
	// If firstName is greater than 10 characters or null throw error
	// If lastName is greater than 10 characters or null throw error
	// If phoneNumber is greater than 10 or less than 10 characters or null throw error
	// If contact address is greater than 30 characters or null throw error

}
