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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://demoqa.com/alerts')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Katalon/alerts/firstClickme'))
WebUI.waitForAlert(1)
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Katalon/alerts/2ndClickme'))
WebUI.waitForAlert(6)
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Katalon/alerts/3Clickme'))
WebUI.waitForAlert(1)
WebUI.dismissAlert()
WebUI.click(findTestObject('Object Repository/Katalon/alerts/3Clickme'))
WebUI.waitForAlert(1)
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Katalon/alerts/4Clickme'))
WebUI.verifyAlertPresent(2)
WebUI.setAlertText("Danh Tran Thanh")
WebUI.dismissAlert()
WebUI.click(findTestObject('Object Repository/Katalon/alerts/4Clickme'))
WebUI.waitForAlert(1)
WebUI.setAlertText("Tran Thanh Danh")
WebUI.acceptAlert()

WebUI.closeBrowser()