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

Mobile.startExistingApplication('com.samsung.ecomm', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(700, 900, 50, 900)

Mobile.tap(findTestObject('MobileObject/getStarted.Button'), 2)

Mobile.tap(findTestObject('MobileObject/closeButton_Popup'), 2)

Mobile.tap(findTestObject('MobileObject/Shop_Button'), 2)

Mobile.tap(findTestObject('MobileObject/ImagePhones'), 2)

Mobile.tap(findTestObject('MobileObject/ImageView - Galaxy Z'), 2)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Random position'
Mobile.tapAtPosition(850, 550)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/ImageView - Galaxy Z Fold4'), 2)

Mobile.tap(findTestObject('MobileObject/TextView_BUY NOW'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('No trade-in ?', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/TextView - No trade-in Get an extra 100 off instantly'), 2)

'Tap at 830,2150 position'
Mobile.tapAtPosition(830, 2150)

Mobile.tap(findTestObject('MobileObject/Skip-add-ons_Button'), 2)

Mobile.tap(findTestObject('MobileObject/TextView - CHECKOUT'), 2)

Mobile.verifyElementText(findTestObject('MobileObject/verifyText - CHECKOUT'), 'CHECKOUT')

