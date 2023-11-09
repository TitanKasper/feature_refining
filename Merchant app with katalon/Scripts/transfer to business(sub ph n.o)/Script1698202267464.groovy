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

Mobile.delay(5);
Mobile.tap(findTestObject('Object Repository/start merchant app/android.widget.Button - NOT NOW'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/start merchant app/android.widget.EditText - Password'), 'V6Cwp/XGRAQ=',
	0)

Mobile.tap(findTestObject('Object Repository/start merchant app/android.view.ViewGroup'), 0)


Mobile.tap(findTestObject('Object Repository/transfer to business(all right)/android.widget.TextView - Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/transfer to business(all right)/android.view.ViewGroup'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.widget.EditText - Enter Business Mobile Number'), 
    'VGP+SOvvrfhz9OzU0hzVKA==', 0)

Mobile.tap(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.view.ViewGroup'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.widget.Button - OK'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.widget.EditText - Amount'), 
    '33gDU9Iig3Q=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.widget.EditText - Remarks'), 
    'P9ET2sDE0SE=', 0)

Mobile.tap(findTestObject('Object Repository/transfer to business(sub ph n.o)/android.view.ViewGroup (1)'), 0)

//Mobile.tap(findTestObject(''), 0)

Mobile.delay(5)

Mobile.closeApplication()

