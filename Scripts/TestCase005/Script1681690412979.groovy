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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.espn.com/')

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Log In'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Log In_1'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Need help logging in'))

WebUI.setText(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_Email or Username_OtpInputLoginValue'), 
    'mborg0020@gmail.com')

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Continue'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/div_Visit ESPN Support_loading-indicator st_d87a80'))

WebUI.setText(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_Code_InputRedeemOTP'), 
    '352862')

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Continue'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Continue'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Done'))

WebUI.click(findTestObject('Object Repository/TestCase005/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Done'))

WebUI.closeBrowser()

