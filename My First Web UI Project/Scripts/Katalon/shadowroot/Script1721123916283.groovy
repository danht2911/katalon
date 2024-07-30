import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24')

WebUI.delay(5)
WebDriver driver = DriverFactory.getWebDriver()
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver
String simulateActionScript = """
var event = new MouseEvent('contextmenu', {
    bubbles: true,
    cancelable: true,
    view: window
});
document.querySelector('body').dispatchEvent(event);
"""
jsExecutor.executeScript(simulateActionScript)


String jsCode = "return document.querySelector(""body>pdf-viewer"").shadowRoot.querySelector(""#toolbar"").shadowRoot.querySelector(""#downloads"").shadowRoot.querySelector(""#download"").shadowRoot.querySelector(""#icon>cr-icon"").shadowRoot.querySelector(""svg>g>path"")";
WebElement downloadButton = (WebElement) WebUI.executeJavaScript(jsCode, null);
downloadButton.click()	

WebUI.closeBrowser()