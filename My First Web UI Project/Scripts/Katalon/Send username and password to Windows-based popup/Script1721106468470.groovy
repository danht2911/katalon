//import com.kms.katalon.core.windows.driver.WindowsDriverFactory
//import com.kms.katalon.core.windows.keyword.helper.WindowsActionHelper
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//
////so sanh 2 array
////int[] danh1 = [2,3]
////int[] danh2 = [2,3]
////
////Boolean result = Arrays.equals(danh1,danh2)
////println(result)
//
//
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import com.kms.katalon.core.windows.driver.WindowsDriverFactory
//import com.kms.katalon.core.windows.driver.WindowsSession
//import java.nio.file.Paths
//
//// Bước 1: Khởi chạy ứng dụng Windows
//String appPath = "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe" // Đường dẫn tới ứng dụng của bạn
//Windows.startApplicationWithTitle(appPath, "")
//
//// Bước 2: Chụp ảnh màn hình
//String screenshotLocation = "D:/full_screenshot.png"
//WindowsSession windowsSession = WindowsDriverFactory.getWindowsSession()
//if (windowsSession != null && windowsSession.getRunningDriver() != null) {
//	windowsSession.getRunningDriver().getScreenshotAs(OutputType.FILE).renameTo(new File(screenshotLocation))
//	println("Screenshot saved at: " + screenshotLocation)
//} else {
//	println("Error: Windows session is not initialized.")
//}

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


//// Function to paste data from clipboard
//def pasteFromClipboard(Robot robot) {
//	robot.keyPress(KeyEvent.VK_CONTROL)
//	robot.keyPress(KeyEvent.VK_V)
//	robot.keyRelease(KeyEvent.VK_CONTROL)
//	robot.keyRelease(KeyEvent.VK_V)
//	WebUI.delay(1) // Slight delay to ensure paste operation is completed
//}


//Function to set clipboard data
def setClipboardData(String text) {
	StringSelection stringSelection = new StringSelection(text)
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
	clipboard.setContents(stringSelection, null)
}

WebUI.openBrowser('') // Open browser and navigate to the URL
WebUI.navigateToUrl('https://the-internet.herokuapp.com/basic_auth')

WebUI.delay(2) // Wait for the authentication dialog to appear
Robot robot = new Robot() // Use the Robot class to handle the dialog

setClipboardData('admin') // username
robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_V)
robot.keyRelease(KeyEvent.VK_CONTROL)
robot.keyRelease(KeyEvent.VK_V)
robot.keyPress(KeyEvent.VK_TAB)
robot.keyRelease(KeyEvent.VK_TAB)

setClipboardData('admin') // password
robot.keyPress(KeyEvent.VK_CONTROL)
robot.keyPress(KeyEvent.VK_V)
robot.keyRelease(KeyEvent.VK_CONTROL)
robot.keyRelease(KeyEvent.VK_V)
robot.keyPress(KeyEvent.VK_ENTER)
robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.delay(2) // Wait for some time to ensure login is successful
WebUI.closeBrowser()

//how to truyen user passowrd vao popup khi vao 1 link
//There are some ways:
//1. Use built in keyword WebUI.Authenticate(URL, userName, password)
//2. Send userName and password on URL: http://userName:password@url
//3. Use Toolkit and clipboard
//4. Use robot


