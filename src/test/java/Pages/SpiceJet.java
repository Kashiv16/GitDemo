package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpiceJet {

	@FindBy(xpath = "//div[contains(text(), 'DEL')]")
	WebElement FlightFrom;
	@FindBy(xpath = "//div[contains(text(), 'BOM')]")
	WebElement FlightTo;
	@FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
	WebElement DateFrom;
	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar r-icoktb']")
	WebElement DateTo;
	// @FindBy(xpath="//div[@data-testid='undefined-month-May-2023']//div[contains(text(),
	// '17')]") WebElement SelectDate;

	public void dateSelector(String toMonth, int toDate) {
		String datexpath = "//div[@data-testid='undefined-month-" + toMonth + "-2023']//div[contains(text(), '" + toDate
				+ "')]";
		pageDriver.findelement(By.xpath(datexpath)).click();

}
