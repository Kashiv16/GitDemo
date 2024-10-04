package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {
	
	@FindBy(id="ctl00_mainContent_DropDownListCurrency") WebElement currency;
	@FindBy(xpath="//option[@value='AED']") WebElement currencyselect;
		
	WebDriver pageDriver;
	
	public DropDownPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dropdown() {
		currency.click();
		currencyselect.click();
	}

}
