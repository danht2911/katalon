import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebElement
import java.util.Arrays

// Mở trình duyệt và điều hướng đến URL
WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://demoqa.com/dynamic-properties') // Thay thế bằng URL thực tế của bạn

// Tìm phần tử với thời gian chờ là 10 giây
WebElement webElement = WebUI.findWebElement(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//button[@id="colorChange"]'), 10)

// Thực thi JavaScript để click vào phần tử
WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(webElement))
WebUI.delay(5)

// Lấy màu RGB của phần tử
String rgbColor = WebUI.executeJavaScript("return window.getComputedStyle(arguments[0]).getPropertyValue(arguments[1]);", Arrays.asList(webElement, "color"))

// In ra giá trị màu RGB để kiểm tra
println("RGB Color: " + rgbColor)

// Định nghĩa hàm rgbToHex và chuyển đổi màu RGB sang Hex
String rgbToHexScript = '''
function rgbToHex(rgb) {
    var rgbArr = rgb.match(/^rgb\\((\\d+),\\s*(\\d+),\\s*(\\d+)\\)$/);
    return "#" + 
           ("0" + parseInt(rgbArr[1],10).toString(16)).slice(-2) +
           ("0" + parseInt(rgbArr[2],10).toString(16)).slice(-2) +
           ("0" + parseInt(rgbArr[3],10).toString(16)).slice(-2);
}
return rgbToHex(arguments[0]);
'''

String hexColor = WebUI.executeJavaScript(rgbToHexScript, Arrays.asList(rgbColor))

// In ra giá trị màu Hex để kiểm tra
println("Hex Color: " + hexColor)

// Kiểm tra giá trị màu
WebUI.verifyEqual(hexColor, "#dc3545")

WebElement webElement1 = WebUI.findWebElement(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[contains(text(),"Web Tables")]'), 10)
WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(webElement1))
WebUI.delay(5)

// Đóng trình duyệt
WebUI.closeBrowser()
