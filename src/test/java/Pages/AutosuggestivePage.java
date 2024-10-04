package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutosuggestivePage {
	@FindBy(id = "autosuggest")WebElement autotext;
	// @FindBy(xpath = "//li[@class='ui-menu-item'] /a")WebElement selectvalue;

	List<WebElement> options;

	WebDriver pageDriver;

	public AutosuggestivePage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this);
		

	}

	public void AutoSuggestion(String country) throws InterruptedException {
		autotext.sendKeys(country);
		Thread.sleep(2000);
		options = pageDriver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				Thread.sleep(4000);
				break;

			}
		}
	}
}
