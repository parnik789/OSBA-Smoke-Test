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

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/WorkshopCapacity'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/span_Express Only Bays_glyphicon glyphicon-plus'))

WebUI.sendKeys(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Max days_MaxmimumDaysAbleToBookInFuture'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Max days_MaxmimumDaysAbleToBookInFuture'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Max days_MaxmimumDaysAbleToBookInFuture'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/input_Max days_MaxmimumDaysAbleToBookInFuture'), 
    '90')

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/a_Lounge Time Slots'))

WebUI.scrollToPosition(55, 922)

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_None selectedMonday'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tick19.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tick 11.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tick 14.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_None selectedMonday'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/TuesdayLTC'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tuesday 9.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tuesday 12.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Tuesday 14.15'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/LoungeTimeControl'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayLTCDropdown'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondatLTC 9.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Mondaybutton_1830'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/Mondaya_1530'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayLTCMOT 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayMOT 10'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayMOT 18.30'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayMOT 16.30'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayDiag8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayDiag 10'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayDiag 16.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayDiag 16.30'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayRepairs 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/MondayRepairs 10.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayService 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayService Nothing'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayService14.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayService Nothing 2'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayMot 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayMOT Nothing'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayMOT 14.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayMOT Nothing 2'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayDiag 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayDiag Nothing'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayDiag 12.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayDiag Nothing2'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayRepairs 8.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayRepairs Nothing'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayRepairs 12.00'))

WebUI.click(findTestObject('WorkshopSettings-Lounge/Page_Edit - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/SaturdayReparirs Nothing2'))

WebUI.click(findTestObject('Object Repository/Retailer Opening Hours/Page_Retailers - OSBA Administration Portal/Page_Edit - OSBA Administration Portal/button_Save (1)'))

WebUI.mouseOver(findTestObject('Page_Login - OSBA Administration Portal/LogoutImage'))

WebUI.click(findTestObject('Page_Login - OSBA Administration Portal/Logout button'))

WebUI.closeBrowser()

