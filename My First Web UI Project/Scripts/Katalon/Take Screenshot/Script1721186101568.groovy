import java.awt.AWTException
import java.awt.Rectangle
import java.awt.Robot
import java.awt.Toolkit
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import com.kms.katalon.core.annotation.Keyword
import java.io.File
import java.io.IOException

@Keyword
def takeFullScreenShot(String filePath) {
		try {				
				Robot robot = new Robot() // Tạo đối tượng Robot để chụp màn hình
				Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) // Lấy kích thước màn hình hiện tại
				BufferedImage screenFullImage = robot.createScreenCapture(screenRect) // Chụp màn hình
				ImageIO.write(screenFullImage, "png", new File(filePath)) // Lưu ảnh chụp màn hình vào đường dẫn chỉ định
				println("A full screenshot saved at: " + filePath)
		} catch (AWTException | IOException ex) {
				println("An error occurred during screenshot capture: " + ex.getMessage())
		}
}

takeFullScreenShot("D:/full_screenshot.png") // Gọi hàm takeFullScreenShot với đường dẫn lưu ảnh



// Đảm bảo bạn đang sử dụng phiên bản Katalon Studio Ultimate, vì chỉ phiên bản này mới hỗ trợ Windows Application Testing.
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.windows.driver.WindowsDriverFactory
import java.text.SimpleDateFormat
import java.util.Date

String screenshotLocation = 'D://Screenshots/' // Đường dẫn để lưu ảnh chụp màn hình
new File(screenshotLocation).mkdirs() // Tạo thư mục nếu chưa tồn tại
String applicationName = WindowsDriverFactory.getWindowsSession().getCapabilities().getCapability("app").toString() // Lấy tên ứng dụng hiện tại
String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) // Lấy thời gian hiện tại
String screenshotFileName = screenshotLocation + applicationName + "_" + dateTime + ".png" // Tạo tên file ảnh chụp màn hình
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotFileName) // Chụp ảnh màn hình và lưu nó
println("Screenshot saved at: " + screenshotFileName)


