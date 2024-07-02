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

WebUI.click(findTestObject(null))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/523f748b-5e50-4201-99bf-36872ab96c34/oauth2/authorize?client_id=00000007-0000-0000-c000-000000000000&response_type=code%20id_token&scope=openid%20profile&state=OpenIdConnect.AuthenticationProperties%3DMAAAAG60QCko4hHvhAYADTpIZc0SFYBz-dFhtlSzLtBrEfg6gijogYHf_nV8r_o0tZN_iwEAAAABAAAACS5yZWRpcmVjdFhodHRwczovL2RibGNxY3RtcC5jcm00LmR5bmFtaWNzLmNvbS9tYWluLmFzcHg_YXBwaWQ9YTVjNmJmY2MtYWE2NS1lZTExLTlhZTctMDAyMjQ4OWRjMjMz%26RedirectTo%3DMAAAAG60QCko4hHvhAYADTpIZc0Dhq3B3Q7fn%252bVxZRzl8QS7ZwgeOdQvB9qMA8hCFeKdGGh0dHBzOi8vZGJsY3FjdG1wLmNybTQuZHluYW1pY3MuY29tLw%253d%253d%26RedirectToForMcas%3Dhttps%253a%252f%252fdblcqctmp.crm4.dynamics.com%252fmain.aspx%253fappid%253da5c6bfcc-aa65-ee11-9ae7-0022489dc233&response_mode=form_post&nonce=638555389749995969.MjU1YzRjOWItZjI2Mi00ZTUzLWE1MGQtMWM1NWM4MWMzYzg5MWIwMDYwNjMtYWVlNy00NzEwLTg3YWMtMTY5ZTFiOTQ1YzZh&redirect_uri=https%3A%2F%2Fdb3--eurcrmlivesg649.crm4.dynamics.com%2F&max_age=86400&x-client-SKU=ID_NET472&x-client-ver=7.5.0.0')

'enter username'
WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'demouser@ldvbsdemo.onmicrosoft.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

'enter password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'v8SzBbhcMdPpCi5Djb+fcw==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_DET Customer Happiness/span_Send feedback to Microsoft_symbolFont _16d4bd'))

'open contacts'
WebUI.click(findTestObject('Object Repository/Page_DET Customer Happiness/div_Contacts'))

' new contact buttom'
WebUI.click(findTestObject('Object Repository/Page_DET Customer Happiness/span_New'))

'enter first name'
WebUI.setText(findTestObject('Object Repository/Page_DET Customer Happiness/input_First Name_id-cc760212-3eab-4009-b5c3_ee8fc1'), 
    'Sondos')

'enter last name'
WebUI.setText(findTestObject('Object Repository/Page_DET Customer Happiness/input_Last Name_id-cc760212-3eab-4009-b5c3-_d15241'), 
    'Wael')

'Source-->events'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DET Customer Happiness/select_--Select--EventsMeetingsCall Center'), 
    '1', true)

'enter email'
WebUI.setText(findTestObject('Object Repository/Page_DET Customer Happiness/input_Email_id-cc760212-3eab-4009-b5c3-ea9c_a4b1a0'), 
    'sondos.wael@linkdev.com')

'enter primary mobile no.'
WebUI.setText(findTestObject('Object Repository/Page_DET Customer Happiness/input_land Islands_iti__tel-input'), '50 505 0505')

'press save buttom'
WebUI.click(findTestObject('Object Repository/Page_DET Customer Happiness/span_Save'))

