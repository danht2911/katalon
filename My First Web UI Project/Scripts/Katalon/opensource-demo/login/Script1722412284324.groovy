
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

// Mở trình duyệt và điều hướng đến trang đăng nhập
WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/database/Page_OrangeHRM/input_txtUsername'), 'Admin')
WebUI.setText(findTestObject('Object Repository/database/Page_OrangeHRM/input_txtPassword'), 'admin123')

TestObject loginButton = new TestObject()
loginButton.addProperty('xpath', ConditionType.EQUALS, '//button[@type="submit"]')
WebUI.click(loginButton)

