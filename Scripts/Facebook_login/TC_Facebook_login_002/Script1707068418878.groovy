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

WebUI.navigateToUrl('www.facebook.com')

WebUI.setText(findTestObject('TC_Facebook_login_002_OR/Page_Facebook  log in or sign up/input_Facebook helps you connect and share with the people in your life_email'), 
    'ch.anil9cc@gmail.com')

WebUI.setEncryptedText(findTestObject('TC_Facebook_login_002_OR/Page_Facebook  log in or sign up/input_Facebook helps you connect and share with the people in your life_pass'), 
    'qpR5QGbtPO/Q9OPNRZU6Dg==')

WebUI.click(findTestObject('TC_Facebook_login_002_OR/Page_Facebook  log in or sign up/button_Log in'))

WebUI.closeBrowser()
