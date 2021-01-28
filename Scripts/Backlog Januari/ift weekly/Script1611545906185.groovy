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

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (55)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - One Time (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Weekly Transaction (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Weekly Transaction'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Monthly Transaction (1)'), 0)

Mobile.scrollToText('End Date')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (62)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (8)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

