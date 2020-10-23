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
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TouchActionPractice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "My device");
		dc.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
		dc.setCapability("automationName", "XCUITest");
		dc.setCapability("udid", "00008030-001930193682802E");
		AppiumDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println(height + "---" + width);
		int startX = width / 2;
		int startY = (int) (height * 0.8);
		int endX = width / 2;
		int endY = (int) (height * 0.3);
		String capability = driver.getCapabilities().getCapability("platformName").toString();
		System.out.println(capability);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
		Thread.sleep(3000);
		action.press(PointOption.point(endX, endY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		.moveTo(PointOption.point(startX, startY)).release().perform();
//		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//		Sequence swipe = new Sequence(finger, 1);
//		swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
//		                    PointerInput.Origin.viewport(), startX, startY));
//		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
//		swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000),
//		                    PointerInput.Origin.viewport(),endX, endY));
//		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
//		driver.perform(Arrays.asList(swipe));


	}

}
