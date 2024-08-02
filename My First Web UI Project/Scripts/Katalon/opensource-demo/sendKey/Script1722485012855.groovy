import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys

WebUI.callTestCase(findTestCase('Katalon/opensource-demo/Test HashMap _ Call Testcase'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow()

TestObject userNameSearch = new TestObject()
userNameSearch.addProperty('xpath',ConditionType.EQUALS,'//div[@class="oxd-form-row"]//input[@class="oxd-input oxd-input--active"]')

WebUI.sendKeys(userNameSearch, 'Admin')
WebUI.delay(2)
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'a'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'c'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'v'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'v'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'v'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'v'))
WebUI.sendKeys(userNameSearch, Keys.chord(Keys.CONTROL,'v'))


