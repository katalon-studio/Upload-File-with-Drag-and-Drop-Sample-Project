import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pasteboard.co/')

def filePath = RunConfiguration.getProjectDir() + '/Katalon-Devices.JPG'

def filePath1 = RunConfiguration.getProjectDir() + '/Katalon-Devices 1.JPG'

def filePath2 = RunConfiguration.getProjectDir() + '/Katalon-Devices 2.JPG'

def concatenatedFilePath = (((filePath + '\n') + filePath1) + '\n') + filePath2

WebUI.uploadFileWithDragAndDrop(findTestObject('Object Repository/pasteboard/input_TPUCapture_file'), concatenatedFilePath)

WebUI.verifyElementPresent(findTestObject('Object Repository/pasteboard/Page_Pasteboard  Easy Image Uploads/button_Delete'), 0)

WebUI.delay(5)

WebUI.closeBrowser()