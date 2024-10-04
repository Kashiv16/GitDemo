package Tests;

import org.testng.annotations.Test;

import Pages.AutosuggestivePage;

public class AutosuggestiveTest extends BaseTest1 {
	@Test
	public void AutoSuggestion() throws InterruptedException {
		AutosuggestivePage country = new AutosuggestivePage(driver);
		country.AutoSuggestion("Ind");	
			
	}
	

}
