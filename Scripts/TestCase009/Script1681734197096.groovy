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

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Log In'))

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Log In_1'))

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/p_My home countryregion Canada. Change'))

WebUI.setText(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_First Name_InputFirstName'), 
    'Mathew')

WebUI.setText(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_Last Name_InputLastName'), 
    'Borg')

WebUI.setText(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_Email Address_InputEmail'), 
    'mborg228@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/input_Password (case sensitive)_password-new'), 
    '6gJzmna8C5GCloIa/mmH/Q==')

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/a_Change'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/select_AfghanistanAland IslandsAlbaniaAlger_e0c357'), 
    'US', true)

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/button_Done'))

WebUI.click(findTestObject('Object Repository/TestCase009/Page_ESPN - Serving Sports Fans. Anytime. Anywhere/form_Disney accountCreate AccountFirst Name_f26279'))

WebUI.closeBrowser()

