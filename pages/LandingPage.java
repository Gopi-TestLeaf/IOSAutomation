package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Given;
import wrappers.WrapperMethods;

public class LandingPage extends WrapperMethods{
	
	public LandingPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		if(!eleIsDisplayed(actionSheets)) {
			throw new RuntimeException("Landing page is not displayed");
		}
	}
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(id="")
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Action Sheets\"]")
	WebElement actionSheets;
	
	@Given("Action Sheets button is clicked")
	public ActionSheetsPage clickActionSheets() {
		clickElement(actionSheets);
		return new ActionSheetsPage(driver);
	}

}
