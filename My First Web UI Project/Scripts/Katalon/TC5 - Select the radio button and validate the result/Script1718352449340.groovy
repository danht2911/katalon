import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser("https://demoqa.com/radio-button")
WebUI.click(findTestObject('Object Repository/Katalon/radiobutton/yesbutton'))
String text1 = WebUI.getText(findTestObject('Object Repository/Katalon/radiobutton/confirmselection'))
if (text1 != "Yes") {
	keywordUtil.markFailed("TC is failed with Yes Radio")
}	

WebUI.click(findTestObject('Object Repository/Katalon/radiobutton/impressivebutton'))
String text2 = WebUI.getText(findTestObject('Object Repository/Katalon/radiobutton/confirmselection'))
if (text2 != "Impressive") {
	keywordUtil.markFailed("TC is failed with Impressive Radio")
}

Boolean isDisabled = WebUI.getAttribute(findTestObject('Object Repository/Katalon/radiobutton/nobutton'), 'class').contains('disabled')
if (!isDisabled) {
KeywordUtil.markFailed("TC is failed with No Radio") }

WebUI.closeBrowser()
