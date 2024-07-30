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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public static void checksort(ArrayList<LocalDateTime> datetime) {
	Collections.sort(datetime);
	System.out.println(datetime + " day so cu da duoc sap xep tang dan");
	for (LocalDateTime increasedatetime : datetime) {
		if (increasedatetime == datetime) {
			
		}
	}
	
	Collections.sort(datetime, Collections.reverseOrder());
	System.out.println(datetime + " day so cu da duoc sap xep giam dan");
	
	
		
}

 


def dateTimeArray = [
	
	"2023-06-11 15:30:00",
	
	"2023-06-10 12:00:00",
	
	"2023-06-11 09:45:00",
	
	"2023-06-12 18:20:00",
	
	"2023-06-09 22:10:00",
	
	"2023-06-10 07:35:00"
	
	];
checksort(dateTimeArray)