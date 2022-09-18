package contactApp;

public class Contact{
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	
	// constructor
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	// getters
	public String getContactID() {
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getContactAddress() {
		return this.contactAddress;
	}
	
	// setters
	public void setContactID(String newId) {
		contactID = newId;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	public void setContactAddress(String newContactAddress) {
		contactAddress = newContactAddress;
	}
	
	
}
