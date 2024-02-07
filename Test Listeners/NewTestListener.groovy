import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		
		WebUI.click(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/a_Create new account'))
		
		WebUI.setText(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_firstname'),'anil')
		
		WebUI.setText(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_lastname'),'chelimilla')
		
		WebUI.setText(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_reg_email__'),'ch.anil9cc@gmail.com')
		
		WebUI.setText(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_reg_email_confirmation__'),'ch.anil9cc@gmail.com')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_reg_passwd__'),'qpR5QGbtPO/Q9OPNRZU6Dg==')
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/select_123456789101112131415161718192021222_566da4'),'7', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/select_123456789101112131415161718192021222_566da4'),'16', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/select_JanFebMarAprMayJunJulAugSepOctNovDec'),'5', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/select_202420232022202120202019201820172016_7237a8'),'2022', true)
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/select_202420232022202120202019201820172016_7237a8'),'2001', true)
		
		WebUI.click(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/input_sex'))
		
		WebUI.click(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook  log in or sign up/button_Sign Up'))
		
		
		
		//println testCaseContext.getTestCaseId()
		//println testCaseContext.getTestCaseVariables()
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		
		WebUI.click(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook/circle_xbh8q5q x1pwv2dq xvlca1e'))
		
		WebUI.click(findTestObject('Object Repository/TC_logout_test listener_OR/Page_Facebook/span_Log out'))
		
		//println testCaseContext.getTestCaseId()
		//println testCaseContext.getTestCaseStatus()
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.

	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	/*
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}   */
}