package Tests;

import Pages.SubscriptionPage;

public class SubscriptionTest extends BaseTest{

	public void successfulSubscribe() {
		SubscriptionPage subscribe = new SubscriptionPage(driver);
		subscribe.subscription("abcd@example.com");
	}
	
}
