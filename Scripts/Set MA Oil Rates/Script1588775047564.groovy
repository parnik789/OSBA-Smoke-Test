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

WebUI.setText(findTestObject('MA Rates/Page_Edit - OSBA Administration Portal/input_Username_Username'), 
    GlobalVariable.UsernameMA)

WebUI.setText(findTestObject('MA Rates/Page_Edit - OSBA Administration Portal/input_Password_Password'), 
    GlobalVariable.PasswordMA)

WebUI.click(findTestObject('MA Rates/Page_Edit - OSBA Administration Portal/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c5d8ca'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c5d8ca'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/button_Segment 3 (6-10 Years)_btn btn-defau_99be7f'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/button_Segment 3 (6-10 Years)_btn btn-defau_99be7f'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 4 (10 Years)_glyphicon glyphicon-plus'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 4 (10 Years)_glyphicon glyphicon-plus'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_c116bc'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c546e7'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c546e7'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 3 (6-10 Years)_glyphicon glyph_77dea4'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 4 (10 Years)_glyphicon glyphic_3a316c'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 1 (0-3 Years)_glyphicon glyphi_2c7318'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c546e7'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 2 (3-6 Years)_glyphicon glyphi_c546e7'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 3 (6-10 Years)_glyphicon glyph_b14916'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/span_Segment 3 (6-10 Years)_glyphicon glyph_b14916'))

WebUI.doubleClick(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/button_Segment 3 (6-10 Years)_btn btn-defau_99be7f'))

WebUI.click(findTestObject('Object Repository/MA Rates/Page_Edit - OSBA Administration Portal/button_Segment 3 (6-10 Years)_btn btn-defau_99be7f'))

WebUI.click(findTestObject('MA Rates/Page_Edit - OSBA Administration Portal/button_Save'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

