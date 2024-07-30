import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser("https://demoqa.com/browser-windows")

WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newWindowsMsg'))
WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()
println(driver.getWindowHandles().size())
driver.switchTo().window("about:blank - Google Chrome")

//WebUI.switchToWindowIndex(1)
//WebUI.switchToWindowTitle("about:blank - Google Chrome")
String newtab2 = WebUI.getText(findTestObject('Object Repository/Katalon/browserwindow/newWindowsMsgText'))
println(newtab2)

if (newtab2 == "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.") {
	println("Text is correct")
	WebUI.closeBrowser() }
else {
	println("Text is NOT correct")
	WebUI.closeBrowser() }