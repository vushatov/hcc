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

WebUI.openBrowser('http://hcc-asset-server.program-ace.net/')
checkElementsPresents()
WebUI.setViewPortSize(1920, 1080)
checkElementsVisible()
WebUI.setViewPortSize(1024, 750)
checkElementsVisible()


void checkElementsVisible() {
    WebUI.verifyElementVisible(findTestObject('StartPage/div_XR Expo 2019'))

    WebUI.verifyElementVisible(findTestObject('StartPage/LoginButton'))

    WebUI.verifyElementVisible(findTestObject('StartPage/RealDigitalSolutions'))
}
void checkElementsPresents(){
	WebUI.verifyElementPresent(findTestObject('StartPage/div_XR Expo 2019'), 1)
	WebUI.verifyElementPresent(findTestObject('StartPage/LoginButton'), 1)
	WebUI.verifyElementPresent(findTestObject('StartPage/RealDigitalSolutions'), 1)
	
}
