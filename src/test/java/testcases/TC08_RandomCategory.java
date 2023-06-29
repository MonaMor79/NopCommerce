package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P08_RandomCategory;
import utility.Utilities;

import static testcases.TC01_CheckRegistration.email;

public class TC08_RandomCategory extends TestBase {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P08_RandomCategory randomCategory;

    @Test(priority = 1)
    public void testRandomCategory() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        randomCategory = new P08_RandomCategory(driver);
        homePage.ClickLoginTap();
        loginPage
                .addEmail(email).addPassword("test123").clickLogin();
        randomCategory
                .ClickComputerTap().ClickDeskTop().ClickAddToCart().ClickHome().ClickElectronics().ClickCamera().ClickNikon().ClickHome()
                .ClickApparel().ClickShoes().ClickNike().ClickHome().ClickDigital().ClickIfYouWant().ClickHome().ClickBook().ClickFirstPrize()
                .ClickHome().ClickJewelry().ClickFlower().ClickHome().ClickShoppingCard().verifyMassage();
        // take screenshot
        Utilities.captureScreenshot(driver, "check sopping card");
        // assert result
        Assert.assertTrue(randomCategory.verifyMassage());

    }
}
