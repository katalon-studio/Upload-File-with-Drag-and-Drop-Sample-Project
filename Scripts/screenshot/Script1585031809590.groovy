import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://screenshot.net/free-image-uploader.html')

def filePath = RunConfiguration.getProjectDir() + '/Katalon-Devices.JPG'

def filePath1 = RunConfiguration.getProjectDir() + '/Katalon-Devices 1.JPG'

def filePath2 = RunConfiguration.getProjectDir() + '/Katalon-Devices 2.JPG'

def concatenatedFilePath = (((filePath + '\n') + filePath1) + '\n') + filePath2

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/screenshot/dropzone'), filePath)

WebUI.verifyElementPresent(findTestObject('Object Repository/screenshot/Page_Free Image Uploader  Host and Share Your Images with Safety/button_Save'), 5)

WebUI.delay(5)

WebUI.closeBrowser()