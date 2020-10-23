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

public class WebViewPractice2 {
	
	@Test
	public void myTestCase2() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My device");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("udid", "00008030-001930193682802E");
		dc.setCapability("wdaLocalPort", "8300");
		dc.setCapability("startIWDP", true);
		//dc.setCapability("noReset", true);
		AppiumDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Web View").click();
		//driver.findElementByXPath("//XCUIElementTypeTextField").clear();
//		driver.findElementByAccessibilityId("Continue").click();
		Thread.sleep(7000);
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
