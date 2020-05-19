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

WebUI.setText(findTestObject('Page_Login - OSBA Administration Portal/input_Username_Username'), GlobalVariable.UsernameMA)

WebUI.setText(findTestObject('Page_Login - OSBA Administration Portal/input_Password_Password'), GlobalVariable.PasswordMA)

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/button_Login'))

WebUI.click(findTestObject('Page_Edit - OSBA Administration Portal/a_Retailers'))

WebUI.click(findTestObject('Page_Retailers - OSBA Administration Portal/button_Select Retailer'))

WebUI.click(findTestObject('Page_Edit - OSBA Administration Portal/a_Opening Hours'))

WebUI.scrollToElement(findTestObject('Select A Retailer/Page_Edit - OSBA Administration Portal/SpecificDayView'), 10)

WebUI.click(findTestObject('Select A Retailer/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayToggleClose'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/span_Closed_toggle-handle btn btn-default'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_ Add'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Closing Time_AdHocOpeningHours0date'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Closing Time_AdHocOpeningHours0date'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Closing Time_AdHocOpeningHours0date'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Closing Time_AdHocOpeningHours0date'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/span_Closing Time_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/th_May 2020_next'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/th_May 2020_next'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/th_May 2020_next'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/td_1'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/span_600'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/a_1000'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/select_600700800900100011001200130014001500_9fa71b'), 
    '10:00', true)

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/span_600'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/select_600700800900100011001200130014001500_9fa71b_1'), 
    '16:00', true)

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_Save (1)'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

