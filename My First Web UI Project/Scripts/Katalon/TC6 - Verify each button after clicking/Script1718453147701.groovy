import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://demoqa.com/buttons')
WebUI.doubleClick(findTestObject('Object Repository/Katalon/buttons/doubleclick'))
String txt1 = WebUI.getText(findTestObject('Object Repository/Katalon/buttons/doubleclickmsg'))
if (txt1!="You have done a double click") {
	KeywordUtil.markFailed("Double click button NOT successfully.") }

WebUI.rightClick(findTestObject('Object Repository/Katalon/buttons/rightclick'))
String txt2 = WebUI.getText(findTestObject('Object Repository/Katalon/buttons/rightclickmsg'))
if (txt2!="You have done a right click") {
	KeywordUtil.markFailed("Right click button NOT successfully.") }

WebUI.click(findTestObject('Object Repository/Katalon/buttons/clickme'))
String txt3 = WebUI.getText(findTestObject('Object Repository/Katalon/buttons/clickmemsg'))
if (txt3!="You have done a dynamic click") {
	KeywordUtil.markFailed("Click me  button NOT successfully.") }


