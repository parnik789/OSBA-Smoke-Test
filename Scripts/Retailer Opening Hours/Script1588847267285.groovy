import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Retailer Opening Hours/Page_Login - OSBA Administration Portal/input_Username_Username'), 
    GlobalVariable.UsernameMA)

WebUI.setText(findTestObject('Object Repository/Retailer Opening Hours/Page_Login - OSBA Administration Portal/input_Password_Password'), 
    GlobalVariable.PasswordMA)

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Login - OSBA Administration Portal/button_Login'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Edit - OSBA Administration Portal/a_Retailers'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/button_Select Retailer'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Edit - OSBA Administration Portal/a_Opening Hours'))

WebUI.scrollToElement(findTestObject('Retailer Opening Hours/Sunday'), 10)

WebUI.click(findTestObject('Object Repository/Select A Retailer/Page_Edit - OSBA Administration Portal/span_Monday_caret'))

WebUI.selectOptionByValue(findTestObject('Select A Retailer/Page_Edit - OSBA Administration Portal/MondayClosing'), '17:00', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Select A Retailer/Page_Edit - OSBA Administration Portal/select_0600                        0630    _ba2413'), 
    '08:30', true)

WebUI.selectOptionByValue(findTestObject('Select A Retailer/Page_Edit - OSBA Administration Portal/WednesdayOpening'), '08:00', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Select A Retailer/Page_Edit - OSBA Administration Portal/select_0600                        0630    _ba2413_1'), 
    '09:30', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Select A Retailer/Page_Edit - OSBA Administration Portal/select_0600                        0630    _ba2413_1_2'), 
    '09:30', true)

WebUI.click(findTestObject('Object Repository/Select A Retailer/Page_Edit - OSBA Administration Portal/button_Save'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

