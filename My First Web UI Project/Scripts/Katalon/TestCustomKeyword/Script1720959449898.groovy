import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

RequestObject request = findTestObject('Object Repository/API/Get' // Tìm API request object từ Object Repository
    )

def response = WS.sendRequest(request // Gửi request và nhận response
    )

int statusCode = response.getStatusCode( // Kiểm tra status code của response
    )

if (statusCode == 200) {
    KeywordUtil.logInfo('API call successful')
} else {
    KeywordUtil.markFailed('API call failed with status code: ' + statusCode)
}

KeywordUtil.logInfo(response.getResponseText())

//WebUI.openBrowser("https://demoqa.com/browser-windows")
//WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newWindowbutton'))
//CustomKeywords.'BrowserCK.switchToOtherWindow'('DEMOQA')
//WebUI.closeBrowser()
WebUI.findWebElements(findTestObject, statusCode)

WebUI.callTestCase(findTestCase('Katalon/aa'), [:], FailureHandling.STOP_ON_FAILURE)

