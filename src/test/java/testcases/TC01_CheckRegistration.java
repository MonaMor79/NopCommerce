package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegisterPage;

public class TC extends TestBase {
    P01_HomePage homePage;
    P02_RegisterPage registerPage;
    public static String email;

    @Test(priority = 1)
    public void checkValidRegistration_P() {
        // TODO: initialize class objects
        homePage = new P01_HomePage(driver);
        registerPage = new P02_RegisterPage(driver);

        // TODO: registrer new user
        homePage.ClickRegisterTap();
        //Todo save generated email two variable
        email = faker.internet().emailAddress();
        //TODO: Step1:- register
        registerPage
                .getFirstName(faker.name().firstName())
                .getLastName(faker.name().lastName())
                .getDayOfBirth(4)
                .getMonthOfBirth(6)
                .getYearOfBirth(6)
                .getEmail(email)
                .getCompanyName(email)
                .getPassword("test123")
                .getConfirmPassword("test123")
                .getRegisterButton()
                .checkConfirmationMessage();


        //registerPage.registerUser(faker.name().firstName(), faker.name().lastName(), 4, 4, 4, email,
        //       email, "test123", "test123");

        // TODO : Step2:- assert if register successfully
        Assert.assertTrue(registerPage.checkConfirmationMessage());}}

//        // TODO: Step3:- click continue button
//        registerPage.clickContinueButton();
//    }

