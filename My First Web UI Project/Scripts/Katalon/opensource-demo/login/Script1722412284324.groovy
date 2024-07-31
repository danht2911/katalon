import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Mở trình duyệt và điều hướng đến trang đăng nhập
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/database/Page_OrangeHRM/input_txtUsername'), username)
WebUI.setText(findTestObject('Object Repository/database/Page_OrangeHRM/input_txtPassword'), password)

TestObject loginButton = new TestObject().addProperty('xpath',ConditionType.EQUALS('//button[@type="submit"]'))
WebUI.click(loginButton)

