package testcases;

import org.testng.annotations.Test;
import pages.P012_Order;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_AddToCart;

import static testcases.TC01_CheckRegistration.email;

public class TC012_Order extends TestBase {
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P05_AddToCart addToCart;
    P012_Order order;
    @Test(priority = 1)
    public void successfulOrder() throws InterruptedException {
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        addToCart = new P05_AddToCart(driver);
        order = new P012_Order(driver);
        homePage.ClickLoginTap();
        loginPage.addEmail(email).addPassword("test123").clickLogin();
        addToCart.ClickComputerTap().ClickDeskTop().ClickBuild();
        js.executeScript("window.scrollBy(0,500)");
        addToCart.ClickProcessor().ClickRam();
        js.executeScript("window.scrollBy(0,500)");
        addToCart.ClickHdd().ClickOs().ClickAddToCart().getHome();
        order.getShoppingCard().pressAddToCard();
        js.executeScript("window.scrollBy(0,500)");
        order.pressTerms().clickCheckOut().selectCountry().selectState();
        order.addCity(faker.address().city()).addAddress(faker.address().fullAddress()).addZipCode(faker.address().zipCode()).addPhone("0101234568").clickContinue1();
        order.selectGround().clickContinue2();
        order.chooseCreditCard().clickContinue3().selectVisa().addCardName("Test").addCardNumber("4948924115781567");
        order.selectExpireMonth().selectExpireYear().addCardCode("685").clickContinue4().clickConfirm();
    }

}

