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

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.Button - NOT NOW'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/contact in transfer to Business/android.widget.EditText - Password'), 
    'V6Cwp/XGRAQ=', 0)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.TextView - Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.TextView - Transfer to Business'), 
    0)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/contact in transfer to Business/android.widget.TextView - Aung Wai Htet'), 
    0)

Mobile.delay(5);

Mobile.closeApplication()

