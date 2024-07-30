import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

TestObject ojb1 = findTestObject('Object Repository/Katalon/dragndrop/drag')
TestObject ojb2 = findTestObject('Object Repository/Katalon/dragndrop/drop')

WebUI.openBrowser('')
WebUI.navigateToUrl('https://demoqa.com/books')
WebUI.maximizeWindow()
WebUI.delay(2)
WebUI.dragAndDropToObject(ojb1, ojb2)
WebUI.delay(3)
WebUI.closeBrowser()


