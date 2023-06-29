package testcases;

import org.testng.annotations.Test;
import pages.*;
import utility.Utilities;

import static testcases.TC01_CheckRegistration.email;

public class TC11_Compare extends TestBase {

    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P05_AddToCart clickPage;
    P08_RandomCategory randomCategory;
    P011_Compare compareList;

    @Test(priority = 1)
    public void compare() {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        clickPage = new P05_AddToCart(driver);
        randomCategory = new P08_RandomCategory(driver);
        compareList = new P011_Compare(driver);

        homePage.ClickLoginTap();

        loginPage.addEmail(email).addPassword("test123").clickLogin();

        //TODO Add to wishlist
        clickPage.ClickComputerTap().ClickDeskTop().ClickBuild();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickProcessor().ClickRam();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickHdd().ClickOs();
        clickPage.ClickComputerTap().ClickDeskTop().ClickBuild();
        js.executeScript("window.scrollBy(0,500)");
        clickPage.ClickProcessor().ClickRam();
        js.executeScript("window.scrollBy(0,500)");
        clickPage.ClickHdd().ClickOs();
        compareList.getCompareButton();
        Utilities.captureScreenshot(driver, "check added to CompareList");
        randomCategory.ClickApparel().ClickShoes().ClickNike();
        compareList.getCompareButton();
        Utilities.captureScreenshot(driver, "check added to CompareList");

    }

}
