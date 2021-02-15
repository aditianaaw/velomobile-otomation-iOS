package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_iOSApp
     
    /**
     * <p></p>
     */
    public static Object G_Org_ID
     
    /**
     * <p></p>
     */
    public static Object G_Usr_ID
     
    /**
     * <p></p>
     */
    public static Object G_Password
     
    /**
     * <p></p>
     */
    public static Object G_SMS_Otp
     
    /**
     * <p></p>
     */
    public static Object G_Email
     
    /**
     * <p></p>
     */
    public static Object G_Handphone
     
    /**
     * <p></p>
     */
    public static Object G_SWToken
     
    /**
     * <p></p>
     */
    public static Object G_Debit
     
    /**
     * <p></p>
     */
    public static Object G_OFT_Credit
     
    /**
     * <p></p>
     */
    public static Object G_IFT_Credit
     
    /**
     * <p></p>
     */
    public static Object G_RTGS_Credit
     
    /**
     * <p></p>
     */
    public static Object G_LLG_Credit
     
    /**
     * <p></p>
     */
    public static Object G_RTGS_BCredit
     
    /**
     * <p></p>
     */
    public static Object G_LLG_BCredit
     
    /**
     * <p></p>
     */
    public static Object G_OT_Credit
     
    /**
     * <p></p>
     */
    public static Object G_OT_BCredit
     
    /**
     * <p></p>
     */
    public static Object G_RTGS_BCabang
     
    /**
     * <p></p>
     */
    public static Object G_LLG_BCabang
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_iOSApp = selectedVariables['G_iOSApp']
            G_Org_ID = selectedVariables['G_Org_ID']
            G_Usr_ID = selectedVariables['G_Usr_ID']
            G_Password = selectedVariables['G_Password']
            G_SMS_Otp = selectedVariables['G_SMS_Otp']
            G_Email = selectedVariables['G_Email']
            G_Handphone = selectedVariables['G_Handphone']
            G_SWToken = selectedVariables['G_SWToken']
            G_Debit = selectedVariables['G_Debit']
            G_OFT_Credit = selectedVariables['G_OFT_Credit']
            G_IFT_Credit = selectedVariables['G_IFT_Credit']
            G_RTGS_Credit = selectedVariables['G_RTGS_Credit']
            G_LLG_Credit = selectedVariables['G_LLG_Credit']
            G_RTGS_BCredit = selectedVariables['G_RTGS_BCredit']
            G_LLG_BCredit = selectedVariables['G_LLG_BCredit']
            G_OT_Credit = selectedVariables['G_OT_Credit']
            G_OT_BCredit = selectedVariables['G_OT_BCredit']
            G_RTGS_BCabang = selectedVariables['G_RTGS_BCabang']
            G_LLG_BCabang = selectedVariables['G_LLG_BCabang']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
