import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys

// Mở trình duyệt và truy cập URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://the-internet.herokuapp.com/basic_auth')

// Đợi một chút để popup xuất hiện
WebUI.delay(2)

// Tạo một đối tượng Actions
WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)

// Nhập username
actions.sendKeys("admin").perform()
actions.sendKeys(Keys.TAB).perform() // Nhấn Tab để chuyển đến password
actions.sendKeys("admin").perform() // Nhập password


WebUI.delay(5)
// Nhấn Enter để đăng nhập
actions.sendKeys(Keys.ENTER).perform()

// Đợi một chút và đóng trình duyệt
WebUI.delay(2)
WebUI.closeBrowser()
