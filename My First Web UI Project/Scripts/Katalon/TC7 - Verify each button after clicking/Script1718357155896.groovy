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


WebUI.openBrowser("https://demoqa.com/browser-windows")
CustomKeywords.'BrowserCK.refreshBrowser'()


WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newTabbutton'))
WebUI.delay(2)
String newtab = WebUI.getUrl()
if (newtab == "https://demoqa.com/sample") {
	println("https://demoqa.com/sample is opened successfully") 
	WebUI.closeBrowser() }
else {
	println("https://demoqa.com/sample is NOT opened successfully") 
	WebUI.closeBrowser() }



WebUI.openBrowser("https://demoqa.com/browser-windows")


WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newWindowbutton'))
WebUI.delay(2)

WebUI.switchToWindowIndex(1)
String newtab1 = WebUI.getUrl()

println(newtab1)
if (newtab1 == "https://demoqa.com/sample") {
	println("https://demoqa.com/sample is opened successfully") 
	WebUI.closeBrowser() }
else {
	println("https://demoqa.com/sample is NOT opened successfully") 
	WebUI.closeBrowser() }


WebUI.openBrowser("https://demoqa.com/browser-windows")

WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newWindowsMsg'))
WebUI.delay(2)

//WebUI.switchToWindowIndex(1)
WebUI.switchToWindowTitle("about:blank - Google Chrome")
String newtab2 = WebUI.getText(findTestObject('Object Repository/Katalon/browserwindow/newWindowsMsgText')) 
println(newtab2)

if (newtab2 == "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.") {
	println("Text is correct")
	WebUI.closeBrowser() }
else {
	println("Text is NOT correct")
	WebUI.closeBrowser() }


