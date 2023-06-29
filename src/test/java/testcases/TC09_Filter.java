package testcases;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P09_Filter;
import utility.Utilities;
import static testcases.TC01_CheckRegistration.email;

public class TC09_Filter extends TestBase {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P09_Filter filter;

    @Test(priority = 1)
    public void filterColor() {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        filter = new P09_Filter(driver);

        homePage.ClickLoginTap();

        loginPage.addEmail(email).addPassword("test123").clickLogin();

        filter.ClickApparel().ClickShoes().ClickRed();

        // take screenshot
        Utilities.captureScreenshot(driver, "Filter with color");
    }
}
