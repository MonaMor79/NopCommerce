package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P06_SearchProduct;
import utility.Utilities;

import static testcases.TC01_CheckRegistration.email;

public class TC06_SearchProduct extends TestBase {
    P03_LoginPage loginPage;
    P01_HomePage homePage;
    P06_SearchProduct SearchFiled;

    @Test(priority = 1)
    public void insertProSearch() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        SearchFiled = new P06_SearchProduct(driver);
        // TODO: choose login tap in home page
        homePage.ClickLoginTap();

        loginPage.checkLogin(email, "test123");
        SearchFiled.insertProduct();
        // take screenshot
        Utilities.captureScreenshot(driver, "verify the correct product");

    }
}
