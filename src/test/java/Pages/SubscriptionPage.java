package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SubscriptionPage {
	
	@FindBy(xpath="//a[@href='/login']") WebElement signup;
	@FindBy(name = "Subscription") WebElement subscription;
	@FindBy(xpath = "//input[@id='susbscribe_email']") WebElement email;
	@FindBy(xpath = "//button[@id='subscribe']") WebElement subscriptionbutton;

	WebDriver pageDriver;
	
	public SubscriptionPage(WebDriver driver) {
		pageDriver = driver;
	}
	
	public void subscription(String useremail) {
		signup.click();
		Assert.assertEquals(subscription, true);
		email.sendKeys(useremail);
		subscriptionbutton.click();
	}
}
