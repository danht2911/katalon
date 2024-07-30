import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.google.com/')
WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)

TestObject testObject = findTestObject('Object Repository/Ex/ggKeyboard')
WebElement elementToHold = WebUI.findWebElement(testObject)

actions.clickAndHold(elementToHold).perform()
WebUI.delay(2)
actions.release().perform()

WebUI.delay(2)
WebUI.closeBrowser()