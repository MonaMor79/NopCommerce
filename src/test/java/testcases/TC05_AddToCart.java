package testcases;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_AddToCart;
import static testcases.TC01_CheckRegistration.email;
public class TC05_AddToCart extends TestBase {
    //TODo buy build computer
    P01_HomePage homePage;
    P03_LoginPage loginPage;
    P05_AddToCart clickPage;
    @Test(priority = 1)
    public void login() {
        // TODO: login to Nop Commerce
        homePage = new P01_HomePage(driver);
        loginPage = new P03_LoginPage(driver);
        clickPage = new P05_AddToCart(driver);
        homePage.ClickLoginTap();
        loginPage.checkLogin(email, "test123");

        //ToDo click on computer tap
        clickPage.ClickComputerTap().ClickDeskTop().ClickBuild();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickProcessor().ClickRam();

        js.executeScript("window.scrollBy(0,500)");

        clickPage.ClickHdd().ClickOs().ClickAddToCart().getHome();
    }
}
