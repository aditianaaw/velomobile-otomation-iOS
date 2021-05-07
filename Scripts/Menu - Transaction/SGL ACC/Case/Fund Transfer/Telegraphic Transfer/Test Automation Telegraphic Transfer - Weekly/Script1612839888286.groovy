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

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Fund Transfer (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Telegraphic Transfer (4)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (105)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Select Source of Fund'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (105)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (7)'),
	GlobalVariable.G_Debit, 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (20)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Select Destination Account'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (105)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (21)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (19)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (105)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Resident Status (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Resident (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Category'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - A0-INDIVIDUAL (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Country'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (21)'),
	'INDONESIA', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (22)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Status'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - G-COMPANY IN 1 (ONE) GROUP'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Category (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - A0-INDIVIDUAL (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Country (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (21)'),
	'INDONESIA', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (22)'), 0)

//Mobile.scrollToText('Choose Purpose')
//
//Mobile.scrollToText('Choose Purpose')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Purpose'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeCell (22)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (20)'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Amount (9)'), '1000',
	0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (84)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Charge Method'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Shared'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Customer Ref No (6)'),
	'123123', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (84)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Remarks (8)'), 'Test Automation Katalon Velocity iOS',
	0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (84)'), 0)

Mobile.scrollToText('Transfer Frequency')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - One Time (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Weekly Transaction (2)'), 0)

Mobile.scrollToText('End Date')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Transaction Every'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Tuesday'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (19)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (86)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Date (20)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (86)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (66)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - ic check off (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (2)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeOther (19)'), GlobalVariable.G_SWToken, 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (54)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

