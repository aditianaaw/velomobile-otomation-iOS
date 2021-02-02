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

Mobile.startApplication(GlobalVariable.G_iOSApp, false)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Not Now (9)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (14)'), GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeSecureTextField - Input Password (9)'), 
    '123456789012', GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (15)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - Done (11)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - LOGIN (16)'), GlobalVariable.G_Timeout)

Mobile.delay(35)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - ic eye hide (1)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - ic eye open (1)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - ic refresh (1)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Velocity Mobile/XCUIElementTypeWindow (1)'), GlobalVariable.G_Timeout)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeStaticText - FUTURE TRANSACTIONS'), GlobalVariable.G_Timeout)

Mobile.delay(15)

Mobile.tap(findTestObject('Velocity Mobile/XCUIElementTypeWindow (1)'), GlobalVariable.G_Timeout)

'Get Device Height and Store in device_height variable'

device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'

device_Width = Mobile.getDeviceWidth()


'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'

int startY = device_Height / 2


'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'

int endY = startY

'Storing the startX value'

int startX = device_Width * 0.70


'Storing the endX value'

int endX = device_Width * 0.30


'Here Y constant for Swipe Vertical Left to Right'

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)


'Test'

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeLink - here'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (2)'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Velocity Mobile/XCUIElementTypeWindow (1)'), 0)

//Mobile.tap(findTestObject('Velocity Mobile/XCUIElementTypeImage (1)'), 0)
//Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (9)'), 0)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - SAVE'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - VIEW ALL ACCOUNTS'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Velocity Mobile/XCUIElementTypeWindow (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage (10)'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeWindow (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeImage'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Velocity Mobile/XCUIElementTypeButton - btn logout'), 0)

Mobile.delay(15)

Mobile.closeApplication()

