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

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Not Now (41)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (82)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSecureTextField - Input Password (42)'),
	'123456789012', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (52)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (83)'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (61)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Fund Transfer (2)'), 0)

Mobile.delay(10)

/*
Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - OCBC NISP Fund Transfer (3)'),
	0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (6)'),
	'FREDY', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - FREDY IRAWAN  S Komp (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - 10810088368 DAN Roby (3)'), 0)

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

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeOther (19)'), '135135', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (54)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.delay(10)

*/

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Domestic Transfer (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - RTGS (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (57)'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (18)'), 0)

//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Select Source of Fund'), 0)

/*
Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeOther (22)'), 0)
*/
Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (57)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSearchField - Type here to search (6)'), 
    'FREDY', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - FREDY IRAWAN  S Komp (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Select Destination Account'), 0)
/*

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transfer to a new beneficiary (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (67)'), 0)

Mobile.tap(findTestObject(''), 0)

*/

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - New rtgs 24jun'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Amount (5)'), '1000000123', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (63)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Customer Ref No (2)'), 
    '123123', 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (63)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Input Remarks (4)'), 'Test Automation Velocity Mobile Ios', 
    0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (63)'), 0)

Mobile.scrollToText('Resident Status')

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField - Choose Resident Status'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Resident'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - CONTINUE (8)'), 0)

/*
Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (58)'), 0)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeTextField (1)'), '135135', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (64)'), 0)

*/

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

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeOther (19)'), '135135', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (45)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - DONE (54)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - Transactions (4)'), 0)

Mobile.delay(10)

Mobile.closeApplication()

