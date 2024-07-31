import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import ch.qos.logback.core.util.Duration
import io.appium.java_client.windows.WindowsDriver

class BrowserCK {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * switch to window basing on name
	 */
	@Keyword
	def switchToOtherWindow(String title) {
		WindowsDriver driver = DriverFactory.getWebDriver()
		int attempt = 0
		int maxAttempt = 5
		while (attempt < maxAttempt) {
			for (String windowHandle : driver.getWindowHandles()) {
				driver.switchTo().window(windowHandle)
				if (driver.getTitle().equals(title)) {
					return
				}
			}
		}
		attempt++
		if (attempt < maxAttempt) {
			WebUI.delay(1)
		}
	}

	@Keyword
	def explicitWait (TestObject yourElementId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("yourElementId")));
		element.click();
	}

	//	2. Check Element Visibility and Enabled State
	//	if (element.isDisplayed() && element.isEnabled()) {
	//		element.click();
	//	} else {
	//		System.out.println("Element is not clickable.");
	//	}
	//
	//	3. Check for Overlapping Elements
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	boolean isVisible = (Boolean) js.executeScript("return arguments[0].offsetParent !== null;", element);
	//	if (isVisible) {
	//		element.click();
	//	} else {
	//		System.out.println("Element is covered by another element.");
	//	}
	//
	//	4. Using JavaScript Click
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].click();", element);
	//
	//	5. Handle Exceptions
	//	try {
	//		element.click();
	//	} catch (ElementClickInterceptedException e) {
	//		System.out.println("Element not clickable due to overlapping element.");
	//	}
	//
	//	6. Verify Click Action Success
	//	// Example: Check if a new element appears after the click
	//	WebElement newElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newElementId")));
	//	if (newElement != null) {
	//		System.out.println("Click action was successful.");
	//	} else {
	//		System.out.println("Click action was not successful.");
	//	}
}