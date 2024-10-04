package Tests;

import org.testng.annotations.Test;

import Pages.ContactUsPage;

public class ContactUsTest extends BaseTest{
	
	@Test
	public void successfulsubmit() {
		ContactUsPage contact = new ContactUsPage(driver);
		contact.contactPage("Kashish", "abcd@example.com", "Test Page", "Hello! This is my first test");
		
	}
	

}
