package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;

import static testcases.TC01_CheckRegistration.email;

public class TC02_CheckLogin extends TestBase {
    // TODO: define page object
    P01_HomePage homePage;
    P03_LoginPage loginPage;

    @Test(priority = 1)
    public void checkLogin_P() {
        // TODO: initialize page objects
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        // TODO: choose login tap in home page
        homePage.ClickLoginTap();

        // TODO: fill email & password and click login

        loginPage
                .addEmail(email)
                .addPassword("test123")
                .clickLogin();


    }


}
