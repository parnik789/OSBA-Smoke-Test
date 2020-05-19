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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Page_Login - OSBA Administration Portal/input_Username_Username'), GlobalVariable.UsernameMA)

WebUI.setText(findTestObject('Page_Login - OSBA Administration Portal/input_Password_Password'), GlobalVariable.PasswordMA)

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/button_Login'))

WebUI.click(findTestObject('Page_Edit - OSBA Administration Portal/a_Retailers'))

WebUI.click(findTestObject('Page_Retailers - OSBA Administration Portal/button_Select Retailer'))

WebUI.click(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/a_Advanced Settings tab'))

WebUI.click(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/label_Sage Pay'))

WebUI.setText(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/input_PayPal Merchant Id_PayPalMerchantId'), 
    'KU8E2KESUAWGU')

WebUI.setText(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/input_PayPal Signature_PayPalSignature'), 
    'AFcWxV21C7fd0v3bYYYRCpSSRl31AT8In0P0a4RelPrdlJ7yGIctwzSS')

WebUI.setText(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/input_PayPal Username_PayPalUsername'), 
    'sam.touray-facilitator_api1.uk.rapp.com')

WebUI.setText(findTestObject('AdvanceSettingPaypal/Page_Edit - OSBA Administration Portal/input_PayPal Password_PayPalPassword'), 
    ' MDT3H2VAR3HF2QE5')

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_Save (1)'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

