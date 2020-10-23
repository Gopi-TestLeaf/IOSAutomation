package wrappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class WrapperMethods {

	//For Cucumber
	public static AppiumDriver<WebElement> driver;

	//For POM
	//public AppiumDriver<WebElement> driver;
	public void launchApp(String platformName) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			if (platformName.equalsIgnoreCase("android")) {
				driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			} else {
				dc.setCapability("deviceName", "My device");
				dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
				dc.setCapability("automationName", "XCUITest");
				dc.setCapability("udid", "E78AB421-5DED-4C70-B260-D1B1ADB287F7");
				driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void launchApp(String platformName, String udid, String systemPort, String wdaLocalPort) {
		try {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "My device");
			dc.setCapability("udid", udid);
			if (platformName.equalsIgnoreCase("android")) {
				driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			} else {
				dc.setCapability("wdaLocalPort", wdaLocalPort);
				dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
				dc.setCapability("automationName", "XCUITest");
				driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void clickElement(WebElement ele) {
		ele.click();
	}
	
	public boolean eleIsDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

}
