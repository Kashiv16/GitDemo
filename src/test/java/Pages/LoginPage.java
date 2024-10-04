package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(linkText="Signup / Login") WebElement loginSignup;
	@FindBy(name="email") WebElement objemail;
	@FindBy(name="password") WebElement objPassword;
	@FindBy(xpath="//button[@data-qa='login-button']") WebElement login;
	
	
	WebDriver pageDriver;

	public LoginPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this); //this will initialize all the web elements on this class

	}

	public void loginApp(String user, String password) {
		loginSignup.click();
		objemail.sendKeys(user);
		objPassword.sendKeys(password);
		login.click();

	}

}
