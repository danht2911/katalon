import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUI


        WebUI.openBrowser('');
        WebUI.maximizeWindow();
        WebUI.navigateToUrl('https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24');

        // Chờ cho đến khi Shadow DOM của pdf-viewer được tải
        // Lấy WebDriver và JavascriptExecutor
        WebDriver driver = DriverFactory.getWebDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Tìm nút download bằng cách duyệt qua Shadow DOM
        String jsCode = "return document.querySelector('body > pdf-viewer').shadowRoot" +
                ".querySelector('#toolbar').shadowRoot" +
                ".querySelector('#downloads').shadowRoot" +
                ".querySelector('#download').shadowRoot" +
                ".querySelector('#icon>cr-icon').shadowRoot" +
                ".querySelector('svg>g>path')";

        // Click vào nút download
        WebElement downloadButton = (WebElement) jsExecutor.executeScript(jsCode);
        downloadButton.click();

        WebUI.closeBrowser();
  

