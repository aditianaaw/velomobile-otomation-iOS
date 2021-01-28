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

Mobile.startApplication('/Users/admin2/Downloads/Velocity_bandung_uat (5).ipa', true)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Not Now (35)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (36)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (69)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSecureTextField - Input Password (36)'), 
    '123456789012', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (44)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSecureTextField -  (2)'), '123456789012', 
    0)

Mobile.tap(findTestObject(''), 0) //

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (70)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (37)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (54)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Administration (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Account Aliases (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - User Management (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (55)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Beneficiary Management'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - OCBC NISP Fund Transfer (1)'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Domestic Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Online'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - RTGS'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - LLG'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Telegraphic Transfer (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - btn logout (3)'), 0)

Mobile.closeApplication()

