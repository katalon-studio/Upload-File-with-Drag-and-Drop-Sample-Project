import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import dragandroputil.UploadWithDragAndDrop

WebUI.openBrowser('')

WebUI.navigateToUrl('https://imgbox.com/')

def filePath = System.getProperty('user.dir') + '/Katalon-Devices.JPG'

def filePath1 = System.getProperty('user.dir') + '/Katalon-Devices 1.JPG'

def filePath2 = System.getProperty('user.dir') + '/Katalon-Devices 2.JPG'

def concatenatedFilePath = (((filePath + '\n') + filePath1) + '\n') + filePath2

WebUI.delay(3)

UploadWithDragAndDrop.uploadWithDragAndDrop(findTestObject('imgbox/Drop Layer'), concatenatedFilePath)

// There will be 3 div corresponding to 3 uploaded files if the method works
List<WebElement> elements = WebUiCommonHelper.findWebElements(findTestObject('imgbox/After Files Uploaded Div'), 
    15)

assert elements.size() == 3

WebUI.closeBrowser()