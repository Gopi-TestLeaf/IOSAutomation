package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.Given;
import wrappers.WrapperMethods;

public class ActionSheetsPage extends WrapperMethods{
	
	public ActionSheetsPage(AppiumDriver<WebElement> driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		if(!eleIsDisplayed(other)) {
			throw new RuntimeException("Action Sheets page is not displayed");
		}
	}
	
	public ActionSheetsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(id="")
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Other\"]")
	WebElement other;

	
	@Given("Action Sheets page is displayed")
	public ActionSheetsPage actionSheetPageDisplayed() {
		eleIsDisplayed(other);
		return this;
	}
	
}
