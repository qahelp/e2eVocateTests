import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def now = System.nanoTime()

String uniqueUser = ('szymon+student' + now) + '@vocate.me'

WebUI.openBrowser('http://app.master.tests.vocate.me/')

WebUI.click(findTestObject('Page_Sign In/a_Sign up'))

WebUI.click(findTestObject('Page_Signup/label_Student'))

WebUI.setText(findTestObject('Page_Signup/input_email'), uniqueUser)

WebUI.setText(findTestObject('Page_Signup/input_password1'), 'test123')

WebUI.click(findTestObject('Page_Signup/button_Sign Up'))

WebUI.setText(findTestObject('BasicSignUpForm1stStep/input_first_name'), 'Szymon')

WebUI.setText(findTestObject('BasicSignUpForm1stStep/input_last_name'), 'Student')

WebUI.setText(findTestObject('BasicSignUpForm1stStep/input_google-maps-select-input'), 'San f')

WebUI.click(findTestObject('BasicSignUpForm1stStep/li_San Francisco CA'))

'Clicking on College input'
WebUI.click(findTestObject('BasicSignUpForm1stStep/div_Select_field_eQ2-s'))

WebUI.setText(findTestObject('BasicSignUpForm1stStep/input_Select_input_36WPz'), 'calif')

WebUI.click(findTestObject('BasicSignUpForm1stStep/div_ornia College of the Arts'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/Major select'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/button_Electronic Arts'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/Minor select1'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/button_Electrical Engineering'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/Graduation date not selected yet'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/Calendar back button'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/button_September'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('BasicSignUpForm1stStep/nextButtonOnSignUp'), 1000)

WebUI.click(findTestObject('BasicSignUpForm1stStep/nextButtonOnSignUp'))

WebUI.click(findTestObject('BasicSignUpForm1stStep/nextButtonOnSignUp'))

WebUI.click(findTestObject('Page_ (2)/a_Complete'))

WebUI.click(findTestObject('studentDetailPreferences/Complete detail preferences box'))

WebUI.click(findTestObject('studentDetailPreferences/firstListElementDetailedPreferencesLocation'))

WebUI.click(findTestObject('studentDetailPreferences/nextButtonOnDetailedPreferenceView'))

WebUI.click(findTestObject('studentDetailPreferences/firstListElementDetailedPreferencesInterests'))

WebUI.click(findTestObject('studentDetailPreferences/nextButtonOnDetailedPreferenceView'))

WebUI.click(findTestObject('studentDetailPreferences/2nd'))

WebUI.click(findTestObject('studentDetailPreferences/jobAttributeLocation'))

WebUI.click(findTestObject('studentDetailPreferences/nextButtonOnDetailedPreferenceView'))

WebUI.click(findTestObject('studentDetailPreferences/okButtonOnCompletionOfCompeteDetailPreferences'))

WebUI.click(findTestObject('studentDetailProfilePicture/studentTimelineProfileImageBox'))

WebUI.uploadFile(findTestObject('studentDetailProfilePicture/inputUpload'), '/Users/si/Katalon Studio/testsuite/testfile/1.jpg')

WebUI.click(findTestObject('studentDetailProfilePicture/nextButtonOnStudentProfilePictureView'))

WebUI.click(findTestObject('studentDetailProfilePicture/okButtonOnCompletionOfProfilePicture'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('studentUploadResume/uploadResumeBox'))

WebUI.uploadFile(findTestObject('studentUploadResume/resumeUpload'), '/Users/si/Katalon Studio/testsuite/testfile/1.pdf')

WebUI.click(findTestObject('studentUploadResume/nextButtonOnStudentResumeView'))

WebUI.click(findTestObject('studentUploadResume/okButtonOnCompletionOfResume'))

not_run: WebUI.click(findTestObject(null))

not_run: WebUI.click(findTestObject(null))

not_run: WebUI.closeBrowser()

