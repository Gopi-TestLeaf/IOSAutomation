package iOsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class WebViewPractice {
	
	@Test
	public void myTestCase() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My device");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("udid", "E78AB421-5DED-4C70-B260-D1B1ADB287F7");
		dc.setCapability("wdaLocalPort", "8200");
		dc.setCapability("startIWDP", true);
		//dc.setCapability("noReset", true);
		AppiumDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Web View").click();
		//driver.findElementByXPath("//XCUIElementTypeTextField").clear();
//		driver.findElementByAccessibilityId("Continue").click();
		Thread.sleep(5000);
//		driver.findElementByAccessibilityId("Learn more about iPhone 12 Pro").click();
		Set<String> contextHandles = driver.getContextHandles();
		for (String string : contextHandles) {
			System.out.println(string);
			if(string.contains("WEBVIEW_")) {
				driver.context(string);
			}
		}
		driver.findElementByLinkText("Continue").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Learn more").click();
		
	}

}
