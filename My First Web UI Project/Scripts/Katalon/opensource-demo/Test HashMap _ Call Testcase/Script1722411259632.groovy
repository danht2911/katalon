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

// Tạo một Map chứa các tham số cần truyền vào test case 'Katalon/aa'
Map<String, String> params = new HashMap()

params.put('username', 'Admin')

params.put('password', 'admin123')

// Gọi test case 'Katalon/aa' với các tham số
WebUI.callTestCase(findTestCase('Katalon/opensource-demo/login'), params, FailureHandling.STOP_ON_FAILURE)

// Thực hiện các bước kiểm thử khác sau khi đăng nhập thành công
WebUI.click(findTestObject('database/Page_OrangeHRM/Adminbutton'))

WebUI.verifyElementPresent(findTestObject('database/Page_OrangeHRM/Admin_RecordFound'), 10)

// Đóng trình duyệt
WebUI.closeBrowser()

