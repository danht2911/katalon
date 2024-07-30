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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

def checksort(ArrayList<String> dateTimeArray) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    ArrayList<LocalDateTime> datetime = new ArrayList<>()
    
    for (String dateTimeStr : dateTimeArray) {
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter)
        datetime.add(dateTime)
    }
    
    Collections.sort(datetime)
    ArrayList<LocalDateTime> increasedatetime = new ArrayList<LocalDateTime>(datetime)
    
    println(increasedatetime + " day so cu da duoc sap xep tang dan")
}

def dateTimeArray = [
    "2023-06-11 15:30:00",
    "2023-06-10 12:00:00",
    "2023-06-11 09:45:00",
    "2023-06-12 18:20:00",
    "2023-06-09 22:10:00",
    "2023-06-10 07:35:00"
]

checksort(dateTimeArray)