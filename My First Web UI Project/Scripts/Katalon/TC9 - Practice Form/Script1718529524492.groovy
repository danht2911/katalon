import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('https://demoqa.com/automation-practice-form')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Katalon/automation-practice-form/firstname'), 'danh')
WebUI.setText(findTestObject('Object Repository/Katalon/automation-practice-form/lastname'), 'danh')
WebUI.setText(findTestObject('Object Repository/Katalon/automation-practice-form/email'),'test@google.com')

WebDriver driver = DriverFactory.getWebDriver()
Actions actionkey = new Actions(driver)
actionkey.sendKeys(Keys.PAGE_DOWN).perform()

WebUI.click(findTestObject('Object Repository/Katalon/automation-practice-form/maleradio'))

//WebElement subjectBox = driver.findElement(By.xpath('//div[@class="subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"]'))

//TestObject testObject = findTestObject('Object Repository/Katalon/automation-practice-form/subjectbox')
//WebElement subjectBox = WebUiCommonHelper.findWebElement(testObject, 30)
//subjectBox.click()
//String subjectText = "danh"
//actionkey.sendKeys(subjectText).perform()

WebUI.click(findTestObject('Object Repository/Katalon/automation-practice-form/hobbies'))
//TestObject hobbyoj = findTestObject('Object Repository/Katalon/automation-practice-form/hobbies')
//WebElement hobbybox = WebUiCommonHelper.findWebElement(hobbyoj, 30)
//hobbybox.click() 

WebUI.setText(findTestObject('Object Repository/Katalon/automation-practice-form/currentadd'),'testing')
WebUI.setText(findTestObject('Object Repository/Katalon/automation-practice-form/mobilenumber'),'0908081773')
WebUI.waitForElementPresent(findTestObject('Object Repository/Katalon/automation-practice-form/uploadpic'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/Katalon/automation-practice-form/uploadpic'))

// Tìm phần tử upload pic bằng cách sử dụng WebDriver
WebElement uploadButton = driver.findElement(By.xpath('//input[@id="uploadPicture"]'))

// Gửi đường dẫn tệp đến phần tử upload
String filePath = "D:/you.bmp"
uploadButton.sendKeys(filePath)



// Chờ đến khi phần tử `state` xuất hiện
WebUI.waitForElementPresent(findTestObject('Object Repository/Katalon/automation-practice-form/state'), 10)

// Tìm element của dropdown
WebElement stateDropdown = driver.findElement(By.xpath('//div[@id="state"]'))
stateDropdown.click()

// Chờ cho các options hiện ra và chọn NCR
WebElement ncrOption = driver.findElement(By.xpath('//div[contains(text(), "NCR")]'))
ncrOption.click()

// Kiểm tra lại giá trị đã được chọn
String selectedOption = stateDropdown.getText()
assert selectedOption.contains('NCR')

WebUI.waitForElementPresent(findTestObject('Object Repository/Katalon/automation-practice-form/city'), 10)
WebElement cityDropdown = driver.findElement(By.xpath('//div[@id="city"]'))
cityDropdown.click()
WebElement delhiOption = driver.findElement(By.xpath('//div[contains(text(), "Delhi")]'))
delhiOption.click()

WebUI.click(findTestObject('Object Repository/Katalon/automation-practice-form/submit'))
WebUI.click(findTestObject('Object Repository/Katalon/automation-practice-form/closebt'))
WebUI.closeBrowser()
