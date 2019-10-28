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

WebUI.callTestCase(findTestCase('LoginPage/Login by Email'), [('Email') : findTestData('DataForLogin/CredentialsForLogin').getValue(
            1, 1), ('Password') : findTestData('DataForLogin/CredentialsForLogin').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SideMenu/a_Users'))

checkElementsPresents()
WebUI.setViewPortSize(1024, 750)

checkElementsVisible()

WebUI.setViewPortSize(1920, 1080)

checkElementsVisible()

void checkElementsVisible() {
    WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/a_Create user'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/a_Home'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/button_Admin_btn btn-info btn-circle'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/h4_Users'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/i_Admin_fas fa-user-edit'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/li_Users'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Actions'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Authority'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Avatar'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Email'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Last name'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_Name'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/USERS/USERSpage/th_User group')) 
}

void checkElementsPresents() {
    WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/a_Create user'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/a_Home'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/button_Admin_btn btn-info btn-circle'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/h4_Users'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/i_Admin_fas fa-user-edit'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/li_Users'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Actions'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Authority'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Avatar'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Email'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Last name'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_Name'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/USERSpage/th_User group'), 1)
}


