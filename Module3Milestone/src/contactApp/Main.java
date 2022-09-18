package contactApp;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// Declare variables
        List<Contact> myContacts =new ArrayList<>();
		ContactService service = new ContactService();
		
		String userInputFirstName;
		String userInputLastName;
		String userInputPhoneNumber;
		String userInputAddress;
		
		// Get user input to to add to the contact
		
		// Add information to the contact
		service.addContact("Matthew", "Haggard", "1234567890,", "1234 Anywhere St");
		
		// Add contact to the contacts arraylist 
		
		// Assign the arraylist index to the contactID? - Should this be how it is implemented?
		
		// debug
		service.displayContact();
		
	}
	
	

}
