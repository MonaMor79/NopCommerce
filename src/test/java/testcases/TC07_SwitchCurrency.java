package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P07_SwitchCurrencies;

import static testcases.TC01_CheckRegistration.email;

public class TC07_SwitchCurrency extends TestBase {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P07_SwitchCurrencies sCurrency;

    @Test(priority = 1)
    public void switchC() {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        sCurrency = new P07_SwitchCurrencies(driver);
        homePage.ClickLoginTap();
        loginPage.checkLogin(email, "test123");
        sCurrency.selectCur();
    }
}
