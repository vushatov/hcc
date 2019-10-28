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
import java.io.File as File

String name

String email

String password

int randomdigit = 1 + ((Math.random() * ((1000 - 1) + 1)) as int)

String randomdigit1 = Integer.toString(randomdigit)

name = ('admin' + randomdigit1)

email = (('admin' + randomdigit1) + '@gmail.com')

password = ('password' + randomdigit1)

/*f = new File("D://Log"+randomdigit1+".csv")
	f.append("Email: "+email+"\nName: "+name+"\nPassword: "+password); */
WebUI.callTestCase(findTestCase('LoginPage/Login by Email'), [('Email') : findTestData('DataForLogin/CredentialsForLogin').getValue(
            1, 1), ('Password') : findTestData('DataForLogin/CredentialsForLogin').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://hcc-asset-server.program-ace.net/admin/users/create')

WebUI.verifyElementPresent(findTestObject('Object Repository/USERS/CreateUser(Create)/CreateUserHeader'), 1)

WebUI.setText(findTestObject('Object Repository/USERS/CreateUser(Create)/NameFieldbreadcrambHOME'), name)

WebUI.setText(findTestObject('Object Repository/USERS/CreateUser(Create)/EmailField'), email)

WebUI.selectOptionByValue(findTestObject('Object Repository/USERS/CreateUser(Create)/AuthorityPopUp'), 'Admin', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/USERS/CreateUser(Create)/UserGroupPopUp                                                                                                                                                1'), 
    '2', false)

WebUI.setText(findTestObject('Object Repository/USERS/CreateUser(Create)/PasswordField'), password)

WebUI.click(findTestObject('Object Repository/USERS/CreateUser(Create)/CreateUserButton(OnCreatePage)'))

WebUI.verifyTextPresent(name, false)

WebUI.verifyTextPresent(email, false)

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(null)

