package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegisterPage;

public class TC01_CheckRegistration extends TestBase {
    P01_HomePage homePage;
    P02_RegisterPage registerPage;
    public static String email;

    @Test(priority = 1)
    public void checkValidRegistration_P() {
        // TODO: initialize class objects
        homePage = new P01_HomePage(driver);
        registerPage = new P02_RegisterPage(driver);

        // TODO: register new user
        homePage.ClickRegisterTap();
        //Todo save generated email two variable
        email = faker.internet().emailAddress();
        //TODO: Step1:- register
        registerPage
                .getFirstName(faker.name().firstName())
                .getLastName(faker.name().lastName())
                .getGender()
                .getDayOfBirth(4)
                .getMonthOfBirth(6)
                .getYearOfBirth(6)
                .getEmail(email)
                .getCompanyName(email)
                .getPassword("test123")
                .getConfirmPassword("test123")
                .getRegisterButton()
                .checkConfirmationMessage();


        // TODO : Step2:- assert if register successfully
        Assert.assertTrue(registerPage.checkConfirmationMessage());
    }
}


