package Tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import Pages.SearchProductPage;

public class SearchProductTest extends BaseTest {

	@Test
	public void Successfulsearch() {
		boolean found = false;
		SearchProductPage searchP = new SearchProductPage(driver);
		found = searchP.searchResult("Blue Top");
		AssertJUnit.assertTrue(found);

	}

}
