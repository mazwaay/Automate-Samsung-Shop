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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.startExistingApplication('com.samsung.ecomm', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(700, 900, 50, 900)

Mobile.tap(findTestObject('MobileObject/getStarted.Button'), 10)

Mobile.tap(findTestObject('MobileObject/closeButton_Popup'), 10)

Mobile.tap(findTestObject('MobileObject/Shop_Button'), 10)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/ImagePhones'), 10)

Mobile.tap(findTestObject('MobileObject/ImageView - Galaxy Z'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Random position'
Mobile.tapAtPosition(850, 550)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/ImageView - Galaxy Z Fold4'), 10)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/TextView_BUY NOW'), 10)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(550, 1900, 550, 125)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(550, 1900, 550, 250)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/noTrade'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Tap button Continue'
Mobile.tapAtPosition(830, 2130)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Tap button Skip add-ons'
Mobile.tapAtPosition(330, 2170)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileObject/TextView - CHECKOUT'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('MobileObject/verifyText - CHECKOUT'), 'CHECKOUT')

