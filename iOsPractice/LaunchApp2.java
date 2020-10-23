package iOsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class LaunchApp2 {
	
	@Test
	public void myTestCase1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My device");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("udid", "00008030-001930193682802E");
		dc.setCapability("wdaLocalPort", "8300");
		//dc.setCapability("noReset", true);
		AppiumDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.findElementByAccessibilityId("Date Picker").click();
//		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    Map<String, Object> params = new HashMap();
	    params.put("order", "next");
	    params.put("offset", 0.155);
	    params.put("element", driver.findElementByXPath("(//XCUIElementTypePickerWheel)[1]"));
	    for (int i=0;i<10;i++) {
	    	js.executeScript("mobile: selectPickerWheelValue", params);
	    }
//		driver.findElementByXPath("(//XCUIElementTypePickerWheel)[1]").sendKeys("Sun Oct 28");
//		driver.findElementByXPath("(//XCUIElementTypePickerWheel)[4]").sendKeys("PM");
//		driver.findElementByXPath("(//XCUIElementTypePickerWheel)[2]").sendKeys("3");
//		driver.findElementByXPath("(//XCUIElementTypePickerWheel)[3]").sendKeys("59");
//

		
	}

}
