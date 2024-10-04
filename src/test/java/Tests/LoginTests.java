package Tests;

import org.openqa.selenium.By;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTests extends BaseTest{

	String errorText = "//p[contains(text(),'Your email or password is incorrect!')]";

	@Test
	public void Successfullogin() {
		LoginPage login = new LoginPage(driver);
		login.loginApp("abcd@example.com", "abcd");
System.out.println(URL);
	}

	@Test
	public void UnsuccessfulLogin() {
		LoginPage login = new LoginPage(driver);
		login.loginApp("ggfgf@gmail.com", "ghghgh");
		Assert.assertEquals(driver.findElement(By.xpath(errorText)).isDisplayed(), true);
	}

}
