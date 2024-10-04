package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class SearchProductPage {
	// @FindBy(xpath="//ul[@class='nav navbar-nav']") WebElement verify;
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchInput;
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement searchButton;
	@FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")
	WebElement searchedProducts;
	@FindBy(xpath = "//div[@id='dismiss-button']")
	WebElement popup;

	WebDriver pageDriver;

	public SearchProductPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean searchResult(String search) {
		products.click();
		List<WebElement> searchresults = pageDriver.findElements(By.xpath("//iframe[@id='aswift_4']"));
		if (searchresults.size() > 0) {
			pageDriver.switchTo().frame(0);
			if (popup.isDisplayed() == true) {
				popup.click();
			}
			pageDriver.switchTo().defaultContent();
		}
		// popup.click();
		searchInput.sendKeys(search);
		searchButton.click();
		return searchedProducts.isDisplayed();

	}
}
