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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.click(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.setText(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/input_customerName'), 'Nitheeshaaa')

WebUI.setText(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/input_email'), '6302737617')

WebUI.click(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/span_US 1'))

WebUI.click(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/a_India 91'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/input_password'), 
    'J8q1Kij5A04=')

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/input_passwordCheck'), 
    'J8q1Kij5A04=')

WebUI.click(findTestObject('Object Repository/Amazon_Registration_OR/Page_Amazon Registration/inputcontinue'))

WebUI.closeBrowser()
