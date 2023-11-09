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

Mobile.startApplication('C:\\Users\\Thin Lay\\Downloads\\Merchant_18102023.apk', false)

Mobile.tap(findTestObject('Object Repository/start merchant app/android.widget.Button - NOT NOW'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/start merchant app/android.widget.EditText - User ID'), 'HABa0f/u4dCoZYSUSSx+Uw==', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/start merchant app/android.widget.EditText - Phone Number'), 'OgxmtjoevXwdlbVlKVruTg==', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/start merchant app/android.widget.EditText - Password'), 'V6Cwp/XGRAQ=', 
    0)

Mobile.tap(findTestObject('Object Repository/start merchant app/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/start merchant app/android.widget.EditText'), '0', 0)

Mobile.setText(findTestObject('Object Repository/start merchant app/android.widget.EditText (1)'), '0', 0)

Mobile.setText(findTestObject('Object Repository/start merchant app/android.widget.EditText (2)'), '0', 0)

Mobile.setText(findTestObject('Object Repository/start merchant app/android.widget.EditText (3)'), '0', 0)

Mobile.closeApplication()

