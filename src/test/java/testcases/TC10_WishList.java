package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_AddToCart;
import pages.P10_WishList;
import utility.Utilities;

import static testcases.TC01_CheckRegistration.email;

public class TC10_WishList extends TestBase {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P10_WishList wish;
    P05_AddToCart clickPage;

    @Test(priority = 1)
    public void addWishList() {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        wish = new P10_WishList(driver);
        clickPage = new P05_AddToCart(driver);

        homePage.ClickLoginTap();
        loginPage.addEmail(email).addPassword("test123").clickLogin();
        //TODO Add to wishlist
        clickPage.ClickComputerTap().ClickDeskTop().ClickBuild();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickProcessor().ClickRam();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickHdd().ClickOs();

        wish.ClickWishlist();

        Utilities.captureScreenshot(driver, "check added to wishlist");
    }
}
