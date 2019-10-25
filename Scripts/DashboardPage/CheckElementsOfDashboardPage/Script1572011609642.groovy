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

WebUI.callTestCase(findTestCase('LoginPage/Login by Username'), [('Username') : findTestData('DataForLogin/CredentialsForLogin').getValue(
            1, 1), ('Password') : findTestData('DataForLogin/CredentialsForLogin').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

checkElementsPresents()

WebUI.setViewPortSize(1920, 1080)

checkElementsVisible()

WebUI.setViewPortSize(1024, 750)

checkElementsVisible()

void checkElementsVisible() {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/DashboardHeader'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/miniAvatarIcon'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/time'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/TitleOfPage'))
}

void checkElementsPresents() {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/DashboardHeader'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/miniAvatarIcon'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/time'), 1)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/TitleOfPage'), 1)
}

