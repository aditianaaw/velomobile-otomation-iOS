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

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (61)'), 0)

//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)
Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (23)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Fund Transfer (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - OCBC NISP Fund Transfer (3)'), 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (6)'), 
    GlobalVariable.G_Debit, 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (12)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (16)'),
	GlobalVariable.G_OFT_Credit, 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (13)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Amount (2)'), '1000123', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (53)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Customer Ref No'), '123123', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (53)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Remarks (2)'), 'Test Automation Velo Mobile', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (53)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - One Time'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Weekly Transaction'), 0)

Mobile.scrollToText('End Date')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (54)'), 0)

//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)
Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (23)'), 0)

Mobile.delay(10)


