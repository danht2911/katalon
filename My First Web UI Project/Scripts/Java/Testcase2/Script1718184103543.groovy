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

import java.util.ArrayList
import java.util.Collections
import java.util.HashSet

public uniquenumberandsort (ArrayList numbers) {
		Collections.sort (numbers)
		println(numbers + " day so cu da duoc sap xep" )	
		ArrayList newnumbers = []
		
						
		for (int i = 0;i < numbers.size()-1;i++) {
			int nextnumber=numbers.get(i+1)
			int number = numbers.get(i)
			println(number + " " + nextnumber)
					
			
			if (number != nextnumber) {
				newnumbers.add(number)
				println(newnumbers + " day so moi rut gon" ) }
				
			else {
				continue 
				}
			
		}

		println(numbers + " day so cu da duoc sap xep" )
		println(newnumbers + " day so moi rut gon" )

}


def	numbers = [1, 5, 7, 5, 4, 3, 4, 4]
uniquenumberandsort(numbers)



