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

WebUI.click(findTestObject('WorkshopSettings-Lounge/WorkshopTab'))

WebUI.click(findTestObject('WorkshopSettings-Available slots/Available slots tab'))

WebUI.scrollToPosition(0, 800)

WebUI.click(findTestObject('WorkshopSettings-Available slots/Plus sign drive'))

WebUI.click(findTestObject('WorkshopSettings-Available slots/plus sign collect'))

WebUI.click(findTestObject('WorkshopSettings-Available slots/minus sign MOT'))

WebUI.click(findTestObject('WorkshopSettings-Available slots/minus sign diag'))

WebUI.click(findTestObject('WorkshopSettings-Available slots/minus sign repairs'))

WebUI.sendKeys(findTestObject('WorkshopSettings-Available slots/FridayDrive'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('WorkshopSettings-Available slots/FridayDrive'), '3')

WebUI.sendKeys(findTestObject('WorkshopSettings-Available slots/FridayMOT'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('WorkshopSettings-Available slots/FridayMOT'), '3')

WebUI.doubleClick(findTestObject('WorkshopSettings-Available slots/SaturdayMot minus'))

WebUI.doubleClick(findTestObject('WorkshopSettings-Available slots/SaturdayDiag minus'))

WebUI.doubleClick(findTestObject('WorkshopSettings-Available slots/SaturayRepairs minus'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_Save (1)'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

