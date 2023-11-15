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

Mobile.startApplication('C:\\Users\\Thin Lay\\Downloads\\agent.apk', false)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/not now/android.widget.Button - NOT NOW'), 0)

Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Password (1)'), '156874', 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.view.ViewGroup (3)'), 0)

def actualName = 'Thinmyat';

def expectedName = 'Thinmyat'
if (actualName == expectedName) {
	Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Name () (1)'), actualName, 0)
}else {
Mobile.closeApplication()
}

def actualPh = '095080479'

def expectedPh = '095080479'

if (actualPh == expectedPh) {
	Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Phone Number ()'), actualPh, 0)
}
else {
	Mobile.closeApplication()
}

def actualNRIC = '873893'

def expectedNRIC = '873893'

if (actualNRIC == expectedNRIC) {
	Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - NRIC Number ()'), actualNRIC, 0)
}else {
	Mobile.closeApplication()
}

Mobile.delay(40)

Mobile.scrollToText('depositor')

def actualsentPh = '0912121212'
def expectedsentPh = '0912121212'

if (actualsentPh == expectedsentPh) {
	Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Phone Number () (1)'), actualsentPh,
		0)
}
else {
	Mobile.closeApplication()
}

def actualamount = '3000'


def expectedamount = '3000'

if (actualamount == expectedamount) {
	Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Amount ()'), actualamount, 0)

}
else {
	Mobile.closeApplication()
}


Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Remarks ()'), 'test', 0)

Mobile.setText(findTestObject('Object Repository/cash out/android.widget.EditText - Secret Code ()'), ' 87174668', 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.widget.TextView - Confirm'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText'), 'HeCM15nHKBI=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText (1)'), 'ggNFythgxkw=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText (2)'), 'FkW8c3ilUpA=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText (3)'), '74L4RplaxNs=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText (4)'), '0mP41y2AN8w=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/cash out/android.widget.EditText (5)'), 'abkeNdhXnEA=', 0)

Mobile.tap(findTestObject('Object Repository/cash out/android.view.ViewGroup (6)'), 0)

Mobile.closeApplication()

