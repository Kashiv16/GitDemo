package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public WebDriver driver;

	public static String URL; 
	public static int timeOut;
	@BeforeSuite
	
	public void initialization() throws IOException {
		Utilities utility = new Utilities();
		utility.readProperties();
 }

	
	@BeforeMethod
	public void BrowserLaunch() throws IOException {

		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
		

	}

	@AfterMethod
	public void CloseBrowser() {
		driver.close();
		// driver.quit();
	}

}
