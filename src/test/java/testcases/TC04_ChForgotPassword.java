package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P04_ChForgotPassword;
import utility.Utilities;

import static testcases.TC01_CheckRegistration.email;

public class TC04_ChForgotPassword extends TestBase {
    // TODO: define page object

    P01_HomePage homePage;
    P03_LoginPage loginPage;

    P04_ChForgotPassword checkPassword;

    @Test(priority = 1)
    public void checkForgot_P() {
        // TODO: initialize page objects
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        checkPassword = new P04_ChForgotPassword(driver);
        // TODO: choose login tap in home page
        homePage.ClickLoginTap();
        checkPassword.checkForgotPass(email);
        checkPassword.verifyMassage();


        // TODO :  assert if Massage email Forgot password  successfully
        Assert.assertTrue(checkPassword.verifyMassage());
        // take screenshot
        Utilities.captureScreenshot(driver, "verify massage");
    }
}
