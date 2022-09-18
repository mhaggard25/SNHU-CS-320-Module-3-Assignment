package contactApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ContactTest {
	
	@Test
	void testContactNullArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null, null, null, null, null);
		});
	}

}
