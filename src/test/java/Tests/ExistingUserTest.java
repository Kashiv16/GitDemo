package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ExisitingUserPage;

public class ExistingUserTest extends BaseTest{
	
	String errorText = "//p[@style='color: red;']";
	
	@Test
	public void existinguser() {
		ExisitingUserPage signup = new ExisitingUserPage(driver);
		signup.signupApp("xyz", "xyz@gmail.com");
		Assert.assertEquals(driver.findElement(By.xpath(errorText)).isDisplayed(), true);
	}

}
