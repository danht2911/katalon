import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil
import org.openqa.selenium.By



WebUI.openBrowser('https://demoqa.com/tool-tips')
WebUI.maximizeWindow()

//First Tooltip
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/buttonHovermetosee'))
WebUI.focus(findTestObject('Object Repository/Katalon/tooltip/buttonHovermetosee'))
WebUI.mouseOver(findTestObject('Object Repository/Katalon/tooltip/buttonHovermetosee'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/buttonHovermetoseetooltip'))
String Tooltip1 = WebUI.getText(findTestObject('Object Repository/Katalon/tooltip/buttonHovermetoseetooltip'))
if (Tooltip1 == "You hovered over the Button") {
	println("Correct tooltip: " + Tooltip1)
}
else {
	KeyUtil.markFailed("Incorrect tooltip, it should be: " + Tooltip1)
}

//Second Tooltip
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/inputTT'))
WebUI.focus(findTestObject('Object Repository/Katalon/tooltip/inputTT'))
WebUI.mouseOver(findTestObject('Object Repository/Katalon/tooltip/inputTT'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/inputTTdata'))
String Tooltip2 = WebUI.getText(findTestObject('Object Repository/Katalon/tooltip/inputTTdata'))
if (Tooltip2 == "You hovered over the text field") {
	println("Correct tooltip: " + Tooltip2)
}
else {
	KeyUtil.markFailed("Incorrect tooltip, it should be: " + Tooltip2)
}

//Third Tooltip
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/textTT'))
WebUI.focus(findTestObject('Object Repository/Katalon/tooltip/textTT'))
WebUI.mouseOver(findTestObject('Object Repository/Katalon/tooltip/textTT'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/textTTdata'))
String Tooltip3 = WebUI.getText(findTestObject('Object Repository/Katalon/tooltip/textTTdata'))
expectedTooltip3 = "You hovered over the Contrary"
WebUI.verifyEqual(Tooltip3, expectedTooltip3)


//Forth Tooltip
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/numberTT'))
WebUI.focus(findTestObject('Object Repository/Katalon/tooltip/numberTT'))
WebUI.mouseOver(findTestObject('Object Repository/Katalon/tooltip/numberTT'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/tooltip/numberTTdata'))
String Tooltip4 = WebUI.getText(findTestObject('Object Repository/Katalon/tooltip/numberTTdata'))
expectedTooltip4 = "You hovered over the 1.10.32"
WebUI.verifyEqual(Tooltip4, expectedTooltip4)

WebUI.closeBrowser()

