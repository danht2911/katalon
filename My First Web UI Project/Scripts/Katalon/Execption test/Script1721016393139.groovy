import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

 try {
    WebUI.openBrowser('')
    WebUI.navigateToUrl('katalon.com')

    if (WebUI.getText(findTestObject('Object Repository/txt_singin')).length() < 0) {
        throw new com.kms.katalon.core.exception.StepFailedException('Value required')
    }
    }
catch  (Exception  e) {
	this.println(e)
    } 

