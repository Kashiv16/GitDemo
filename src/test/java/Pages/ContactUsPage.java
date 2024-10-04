package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	@FindBy(xpath="//a[@href='/contact_us']") WebElement contactUs;
	@FindBy(xpath="//input[@data-qa='name']") WebElement name;
	@FindBy(xpath="//input[@data-qa='email']") WebElement objemail;
	@FindBy(xpath="//input[@data-qa='subject']") WebElement subject;
	@FindBy(name="message") WebElement body;
	@FindBy(xpath="//input[@type='submit']") WebElement submit;
		
	WebDriver pageDriver;
	
	public ContactUsPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this); ////this will initialize all the web elements on this class
				
	}
	
	public void contactPage(String user, String email, String info, String content) {
		contactUs.click();
		name.sendKeys(user);
		objemail.sendKeys(email);
		subject.sendKeys(info);
		body.sendKeys(content);
		submit.click();
		pageDriver.switchTo().alert().accept();
		
	}
	

}
