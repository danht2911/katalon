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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.YearMonth;


//WebUI.openBrowser("https://demoqa.com/date-picker")
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDate'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/date-picker/selectDatepopup'))
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDateYeardropdown'))
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDate1985year'))
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDateMonthdropdown'))
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDate12month'))
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDate9day'))
//
//String dateString = WebUI.getAttribute(findTestObject('Object Repository/Katalon/date-picker/selectDate'), 'value')
//DateTimeFormatter originalFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
//LocalDate date = LocalDate.parse(dateString, originalFormatter)
//
//int dayOfMonth = date.getDayOfMonth()
//int month = date.getMonthValue()
//int year = date.getYear()
//
//WebUI.click(findTestObject('Object Repository/Katalon/date-picker/selectDate'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/date-picker/selectDatepopup'))
//String selectedDay = WebUI.getText(findTestObject('Object Repository/Katalon/date-picker/selectDateSelectedDay'))
//int intselectedDay = Integer.parseInt(selectedDay)
//
//String selectedMonthYear = WebUI.getText(findTestObject('Object Repository/Katalon/date-picker/selectDateSelectedMonthYear'))
//DateTimeFormatter selectedFormatter = DateTimeFormatter.ofPattern("MMMM yyyy")
//YearMonth setdate = YearMonth.parse(selectedMonthYear,selectedFormatter)
//
//int intselectedmonth = setdate.getMonthValue()
//int intselectedyear = setdate.getYear()
//
//if (dayOfMonth==intselectedDay && month==intselectedmonth && year==intselectedyear) {
//	println("Select Date TC is correct") 
//	WebUI.closeBrowser() }
//else {
//	println("Select Date TC is NOT correct") 
//	WebUI.closeBrowser() }


WebUI.openBrowser("https://demoqa.com/date-picker")

//WebUI.doubleClick(findTestObject('Object Repository/Katalon/date-picker/selectDate'))
//WebUI.doubleClick(findTestObject('Object Repository/Katalon/date-picker/selectDate'))
//WebUI.clearText(findTestObject('Object Repository/Katalon/date-picker/selectDate'))
WebUI.setText(findTestObject('Object Repository/Katalon/date-picker/selectDate'), "11/29/1985")







