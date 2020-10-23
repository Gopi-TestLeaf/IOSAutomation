package iOsPractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SlidersPractice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My device");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("udid", "");
		dc.setCapability("noReset", true);
		AppiumDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.findElementByAccessibilityId("Sliders").click();
//		int height = driver.findElementByXPath("(//XCUIElementTypeSlider)[1]").getLocation().getY();
//		int width = driver.findElementByXPath("(//XCUIElementTypeSlider)[1]").getLocation().getX();
//		System.out.println(height + "---" + width);
//		int startX = width+7;
//		int startY = height+20;
//		int endX = width +50;
//		int endY = height+20;
//		Thread.sleep(5000);
//		TouchAction action = new TouchAction(driver);
//		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//				.moveTo(PointOption.point(endX, endY)).release().perform();
		
		driver.findElementByXPath("(//XCUIElementTypeSlider)[1]").sendKeys("0.2");
//		WebElement ele = driver.findElementByXPath("(//XCUIElementTypeSlider)[1]");
//		System.out.println(((MobileElement) ele).getCenter().getX());;
//		System.out.println(((MobileElement) ele).getCenter().getY());;
	}
	}


