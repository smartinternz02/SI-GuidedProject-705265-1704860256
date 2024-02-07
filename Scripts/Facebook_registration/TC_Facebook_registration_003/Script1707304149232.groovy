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

// open the browser

WebUI.openBrowser('')

// give thr URL

WebUI.navigateToUrl("www.facebook.com")

// click the create new account

WebUI.click(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/a_Create new account'))

// give the first name

WebUI.setText(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/input_firstname'),"anil")

// give the last name

WebUI.setText(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/input_lastname'),"chelimilla")

// give the emailid

WebUI.setText(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/input_reg_email__'),"ch.anil9cc@gmail.com")

// again give the emailid

WebUI.setText(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/input_reg_email_confirmation__'),"ch.anil9cc@gmail.com")

// set a password

WebUI.setEncryptedText(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/input_reg_passwd__'),"qpR5QGbtPO/Q9OPNRZU6Dg==")

// select the day

WebUI.selectOptionByLabel(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/select_day'),"16",true)

// select the month

WebUI.selectOptionByValue(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/select_month'),"5",true)

// select the year

WebUI.selectOptionByIndex(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/select_year'),"23")

// select the gender

WebUI.click(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/label_Male'))

//click on the sign Up

WebUI.click(findTestObject('Object Repository/TC_Facebook_registration_002_OR/Page_Facebook  log in or sign up/button_Sign Up'))

// close the browser

WebUI.closeBrowser()