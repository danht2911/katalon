import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Tải xuống thư viện WebDriverManager (chrome version suitable- webdrivermanager): Bạn có thể tải xuống file JAR từ Maven Repository: https://mvnrepository.com/search?q=WebDriverManager
//WebDriverManager.chromedriver().setup()

// Set the system properties for ChromeDriver and GeckoDriver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ttdanh\\Katalon Studio\\My First Web UI Project\\Drivers\\chromedriver.exe")
System.setProperty("webdriver.gecko.driver", "C:\\Users\\ttdanh\\Katalon Studio\\My First Web UI Project\\Drivers\\geckodriver.exe")

WebDriver chromeDriver = new ChromeDriver()
DriverFactory.changeWebDriver(chromeDriver)
WebUI.navigateToUrl('http://www.google.com')
WebUI.delay(2)

WebDriver ffDriver = new FirefoxDriver()
DriverFactory.changeWebDriver(ffDriver)
WebUI.navigateToUrl('http://www.google.com')
WebUI.delay(2) 
WebUI.closeBrowser()

DriverFactory.changeWebDriver(chromeDriver)
WebUI.delay(2)
WebUI.closeBrowser()

