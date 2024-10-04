package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExisitingUserPage {
	
	@FindBy(xpath="//a[@href='/login']") WebElement signupLogin;
	@FindBy(xpath="//input[@data-qa='signup-name']") WebElement name;
	@FindBy(xpath="//input[@data-qa='signup-email']") WebElement objemail;
	@FindBy(xpath="//button[@data-qa='signup-button']") WebElement signup;
	
	WebDriver pageDriver;
	public ExisitingUserPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this);
}
	
	public void signupApp(String user, String email) {
		signupLogin.click();
		name.sendKeys(user);
		objemail.sendKeys(email);
		signup.click();
	}

}
