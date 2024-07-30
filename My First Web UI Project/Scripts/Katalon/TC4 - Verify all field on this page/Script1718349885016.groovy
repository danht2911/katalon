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

WebUI.openBrowser('https://demoqa.com/select-menu')
	
//WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectValue'))
//WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectValuedata'))
//String text1 = WebUI.getText(findTestObject('Object Repository/Katalon/selectmenu/selectValuecompare'))
//if (text1 != "Group 1, option 1") {
//	KeywordUtil.markFailed("Select option is not the same")
//}

//WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectOne'))
//WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectOnevalue'))
//String text2 = WebUI.getText(findTestObject('Object Repository/Katalon/selectmenu/selectOnevaluecompare'))
//if (text2 != "Prof.") {
//	KeywordUtil.markFailed("Select One is not the same")
//}

WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectOne'))
WebUI.click(findTestObject('Object Repository/Katalon/selectmenu/selectOnevalue'))
String text3 = WebUI.getText(findTestObject('Object Repository/Katalon/selectmenu/selectOnevaluecompare'))
if (text3 != "Prof.") {
	KeywordUtil.markFailed("Select One is not the same")
}