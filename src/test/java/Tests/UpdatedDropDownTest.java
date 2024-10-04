package Tests;

import org.testng.annotations.Test;

import Pages.UpdatedDropDownPage;

public class UpdatedDropDownTest extends BaseTest1 {
@Test
	public void newDropDown() {
		UpdatedDropDownPage DropDown = new UpdatedDropDownPage(driver);
		DropDown.updateddropdown();
	}

}
