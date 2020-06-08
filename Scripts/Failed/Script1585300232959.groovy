import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('file:///Users/thanhto/Downloads/tmp/tmp.html')

def filePath = System.getProperty('user.dir') + '/Katalon-Devices.JPG'

//WebUI.uploadFile(findTestObject('tmp'), filePath)

DriverFactory.getWebDriver().findElement(By.cssSelector("body > input[type=file]"));

// WebUI.closeBrowser()
