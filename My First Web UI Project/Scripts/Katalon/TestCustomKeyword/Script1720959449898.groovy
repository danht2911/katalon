import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

RequestObject request = findTestObject('Object Repository/API/Get') // Tìm API request object từ Object Repository
def response = WS.sendRequest(request) // Gửi request và nhận response

int statusCode = response.getStatusCode() // Kiểm tra status code của response
if (statusCode == 200) {
	KeywordUtil.logInfo("API call successful")
} else {
	KeywordUtil.markFailed("API call failed with status code: " + statusCode)
}

KeywordUtil.logInfo(response.getResponseText())


//WebUI.openBrowser("https://demoqa.com/browser-windows")
//WebUI.click(findTestObject('Object Repository/Katalon/browserwindow/newWindowbutton'))
//CustomKeywords.'BrowserCK.switchToOtherWindow'('DEMOQA')
//WebUI.closeBrowser()

WebUI.findWebElements(findTestObject, statusCode)

//dropdown