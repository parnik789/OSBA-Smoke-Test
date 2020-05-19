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

WebUI.click(findTestObject('WorkshopSettings-Lounge/WorkshopTab'))

