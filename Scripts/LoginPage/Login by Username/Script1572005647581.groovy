import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://hcc-asset-server.program-ace.net/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginPage/EmailField(Username)'), Username, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('LoginPage/PasswordField'), Password, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('LoginPage/Remember Me Checkbox'))

WebUI.click(findTestObject('LoginPage/button_Login'))

checkElementsVisible()

checkElementsPresents()

void checkElementsVisible() {
    WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/miniAvatarIcon'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/DashboardHeader'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/time'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/TitleOfPage'))
}

void checkElementsPresents() {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/DashboardHeader'), 1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/DashboardHeader'), 1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/time'), 1)

    WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/TitleOfPage'), 1)
}

