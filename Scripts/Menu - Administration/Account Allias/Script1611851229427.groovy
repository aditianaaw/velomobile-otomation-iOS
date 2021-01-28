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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/admin2/Downloads/Velocity_bandung_uat (5).ipa', false)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Not Now (32)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - LOGIN (6)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSecureTextField - Input Password (33)'), 
    '123456789012', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (37)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (64)'), 0)

Mobile.delay(10) //

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (32)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (10)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Administration'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Account Aliases'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (32)'), 0)

//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - 000-000-65371-8'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - USD'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - EDIT'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Account Alias Name'), 
	
    'Test Katalon', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (38)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - CONTINUE'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - CONFIRM'), 0)

Mobile.closeApplication()

