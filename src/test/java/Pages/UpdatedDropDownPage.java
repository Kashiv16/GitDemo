package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatedDropDownPage {
	@FindBy(name = "ctl00_mainContent_ddl_originStation1_CTXT")WebElement from;
	@FindBy(xpath = "//a[@value='BLR']")WebElement selectcityfrom;
	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")WebElement selectcityto;
	@FindBy(name = "ctl00$mainContent$view_date1")WebElement DateFrom;
	@FindBy(xpath = "//a[@class='ui-state-default'][1]")WebElement DepartDate;
	@FindBy(xpath = "//button[@class='ui-datepicker-trigger'][1]")WebElement ReturnCalendar;
	@FindBy(xpath = "//a[@class='ui-state-default'][1]")WebElement ReturnDate;
	@FindBy(id = "divpaxinfo")WebElement Passengers;
	@FindBy(id = "hrefIncAdt")WebElement AdultCount;

	WebDriver pageDriver;

	public UpdatedDropDownPage(WebDriver driver) {
		pageDriver = driver;
		PageFactory.initElements(driver, this);

	}

	public void updateddropdown() {
		from.click();
		selectcityfrom.click();
		selectcityto.click();
		// DateFrom.click();
		DepartDate.click();
		ReturnCalendar.click();
		ReturnDate.click();
		Passengers.click();

		for (int i = 1; i < 5; i++) {
			AdultCount.click();
		}

	}

}
