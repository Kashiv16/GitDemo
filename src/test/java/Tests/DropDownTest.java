package Tests;

import org.testng.annotations.Test;

import Pages.DropDownPage;

public class DropDownTest extends BaseTest1 {
	
	@Test
	public void selectDropDown() {
		DropDownPage selectdropdown = new DropDownPage(driver);
		selectdropdown.dropdown();
		
	}

}
