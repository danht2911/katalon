import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.SearchContext
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

// Mở trình duyệt và điều hướng đến URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24')

// Chờ trang tải xong
WebUI.delay(5) // Hoặc có thể sử dụng WebUI.waitForPageLoad() để chính xác hơn

// Lấy đối tượng WebDriver hiện tại
WebDriver driver = DriverFactory.getWebDriver()

// Xác định phần tử shadow host
WebElement shadowHost = driver.findElement(By.cssSelector('pdf-viewer.viewer > viewer-toolbar.toolbar'))

// Truy cập shadow root bằng JavaScript
SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver).executeScript('return arguments[0].shadowRoot', shadowHost)

// Chờ nút đóng xuất hiện trong shadow root
WebElement closeButton = shadowRoot.findElement(By.cssSelector('button'))

// Thực hiện hành động trên nút đóng nếu cần
// Ví dụ: closeButton.click()

// Đóng trình duyệt
WebUI.closeBrowser()


//cách gọi 1 package riêng
//WebUI.openBrowser("https://www.google.com/")
//CustomKeywords.'pdf.test.testrefreshBrowser'()


//so sanh array vs array nhung truoc het phai sort
//WebUI.verifyEqual(null, null)


/*
TC 5  String input = "DdAaCcbB" Output = "aAbBcCdD"
	String input = "DdAaCcbB";
	// Convert the string to a character array
	char[] charInput = input.toCharArray();
	for(int i =0; i < charInput.length -1; i++){
	  for( int j = i +1; j < charInput.length; j++){
		if (Character.toLowerCase(charInput[j]) < Character.toLowerCase(charInput[i]) || (Character.toLowerCase(charInput[j]) == Character.toLowerCase(charInput[i]) &&	charInput[j] < charInput[i])){
		  char temp = charInput[i];
		  charInput[i] = charInput[j];
		  charInput[j] = temp;
		}
	  }
	}

	String output = new String(charInput);
	System.out.println(output);

*/