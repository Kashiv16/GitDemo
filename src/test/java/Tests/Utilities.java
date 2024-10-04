package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {
	public void readProperties() throws IOException {
		FileInputStream fis = new FileInputStream("config.Properties");
		Properties property = new Properties();
		property.load(fis);
		BaseTest.URL = property.getProperty("AppURL");
		BaseTest.timeOut = Integer.parseInt(property.getProperty("GlobalTimeout"));
	}

}
