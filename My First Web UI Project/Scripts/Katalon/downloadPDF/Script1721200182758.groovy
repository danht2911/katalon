import java.awt.Desktop
import java.awt.Robot
import java.awt.event.KeyEvent

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Mở URL trong trình duyệt mặc định của hệ thống
//Desktop.getDesktop().browse(new URI("https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24")); // JAVA

WebUI.openBrowser("https://investor.iconplc.com/static-files/59f123fd-ad38-405d-bc57-630c7d332e24")
//WebUI.waitForElementClickable()

Robot robot = new Robot()	

robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_S);
robot.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(1000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

						