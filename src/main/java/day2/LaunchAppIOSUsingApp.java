package day2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppIOSUsingApp {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		// Json Object -> Key with value
		
				// Simulator
				DesiredCapabilities dc  = new DesiredCapabilities();
				// automation Name - XCUITest >= 10
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
				dc.setCapability("automationName", "XCUITest");
				dc.setCapability("platformName", "iOS");
				dc.setCapability("platformVersion", "14.0");
				dc.setCapability("deviceName", "iPhone 11");
				dc.setCapability("udid", "71C2BE3E-FAA5-4025-A395-7209AF5582C8");
				
				dc.setCapability("app", "/Users/gopinathjayakumar/Library/Developer/Xcode/DerivedData"
						+ "/UICatalog-cgasmyjxupgdxbhacmzpafidgtyr/"
						+ "Build/Products/Debug-iphonesimulator/UICatalog.app");
				
				// Launch the app
				URL url = new URL("http://localhost:4723/wd/hub");
				IOSDriver<WebElement> driver = new IOSDriver<WebElement>(url, dc);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				Thread.sleep(2000);
				driver.findElementByAccessibilityId("Action Sheets").click();
				Thread.sleep(2000);
				
				driver.findElementByAccessibilityId("Other").click();
				Thread.sleep(2000);
				
				driver.findElementByAccessibilityId("Safe Choice").click();
				Thread.sleep(2000);
				
				System.out.println("finished");
				
				
				
				
		
	}

}
