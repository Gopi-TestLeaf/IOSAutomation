package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class LaunchAppiOS {
	
	public static void main(String[] args) throws MalformedURLException {
		
		// Json Object -> Key with value
		
		// Simulator
		DesiredCapabilities dc  = new DesiredCapabilities();
		// automation Name - XCUITest >= 10
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("deviceName", "iPhone 11 Pro Max");
		dc.setCapability("udid", "5EAE399C-F263-4FBA-9D9C-02919DBC3209");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		
		// Launch the app
		URL url = new URL("http://localhost:4723/wd/hub");
		IOSDriver<WebElement> driver = new IOSDriver<WebElement>(url, dc);
		
		
		
		

		
	}

}
