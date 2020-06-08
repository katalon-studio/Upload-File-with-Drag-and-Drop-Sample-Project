import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://imgur.com/upload?beta')

def filePath = RunConfiguration.getProjectDir() + '/Katalon-Devices.JPG'

def filePath1 = RunConfiguration.getProjectDir() + '/Katalon-Devices 1.JPG'

def filePath2 = RunConfiguration.getProjectDir() + '/Katalon-Devices 2.JPG'

def concatenatedFilePath = (((filePath + '\n') + filePath1) + '\n') + filePath2

WebUI.uploadFileWithDragAndDrop(concatenatedFilePath)

WebUI.verifyElementPresent(findTestObject('Object Repository/Imgur/Page_Imgur The magic of the Internet/span_3 images saved'), 
    10)

WebUI.delay(5)

WebUI.closeBrowser()