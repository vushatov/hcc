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

WebUI.verifyElementPresent(findTestObject('Object Repository/SideMenu/TitleWhenOpenedMenu'), 1)
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/SideMenu/SizeOfMenu'), 'class', 'navbar-nav bg-gradient-dark sidebar sidebar-dark accordion', 1) //full

WebUI.click(findTestObject('Object Repository/SideMenu/HideMenuButton'))
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/SideMenu/SizeOfMenu'), 'class', 'navbar-nav bg-gradient-dark sidebar sidebar-dark accordion toggled', 1) //minimized

WebUI.click(findTestObject('SideMenu/a_Users'))
CheckURL('http://hcc-asset-server.program-ace.net/admin/users')

WebUI.click(findTestObject('SideMenu/a_User Groups'))
CheckURL('http://hcc-asset-server.program-ace.net/admin/groups')

WebUI.click(findTestObject('SideMenu/a_Applications'))
CheckURL('http://hcc-asset-server.program-ace.net/applications')

WebUI.click(findTestObject('SideMenu/a_Assets'))
CheckURL('http://hcc-asset-server.program-ace.net/assets')

WebUI.click(findTestObject('SideMenu/a_Banned IPs'))
CheckURL('http://hcc-asset-server.program-ace.net/admin/banned')

WebUI.click(findTestObject('SideMenu/a_Dashboard'))
CheckURL('http://hcc-asset-server.program-ace.net/admin')



void CheckURL(String expected) {
    String actual = WebUI.getUrl()

    if (actual.compareTo(expected) == 0) {
        System.out.println('Correct page is opened!')
    } else {
        assert false : 'Wrong page is opened!!'
    }
}

