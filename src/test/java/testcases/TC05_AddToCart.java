package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P04_Click;

import static testcases.TC01_CheckRegistration.email;

public class TC04_AddToCart extends TestBase {
    //TODo buy build computer
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P04_Click clickPage;


    @Test(priority = 1)
    public void login() {
        // TODO: login to Nop Commerce
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        homePage.clickLogin();
        loginPage.checkLogin(email, "test123");
    }

    @Test(priority = 2)
    public void CheckAddToCar_P() {
        //ToDo click on computer tap
        clickPage = new P04_Click(driver);
//        pressComTap = new P04_Click(driver);
        clickPage.click();

        //ToDo click on desktop
//        pressDeskTop = new P04_Click(driver);
        clickPage.desktopClick();

        //ToDo click on build pic
//        pressBuidPic = new P04_Click(driver);
        clickPage.buildPic();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on processor
//        process = new P04_Click(driver);
        clickPage.processorSelect();

        //ToDo select on Ram
//        ram = new P04_Click(driver);
        clickPage.ramSelect();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on HDD
//        hdd = new P04_Click(driver);
        clickPage.hddMethod();
        //ToDo select on HDD
//        os = new P04_Click(driver);
        clickPage.osMethod();
        //ToDo click Add to Cart
//        addToCart = new P04_Click(driver);
        clickPage.addToCartMethod();

    }
}
