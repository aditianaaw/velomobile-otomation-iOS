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

Mobile.delay(15)

//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)
Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (23)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Fund Transfer (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Domestic Transfer (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Online (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (57)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Select Source of Fund (3)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (57)'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (13)'), 
    GlobalVariable.G_Debit, 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (16)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Select Destination Account (1)'),
	0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (88)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - RANI FROM BENE'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (14)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (88)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Amount (8)'), '1000000', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (75)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Customer Ref No (5)'), 
    '123123', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (75)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Remarks (7)'), 'Test Automation Katalon iOS', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (75)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.delay(7)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (12)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (54)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.delay(10)
