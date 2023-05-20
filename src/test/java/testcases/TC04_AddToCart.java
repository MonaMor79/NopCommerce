package testcases;

import org.testng.annotations.Test;
import pages.P04_Click;

public class TC04_AddToCart extends TestBase {
    //TODo buy build computer
    P04_Click pressComTap;
    P04_Click pressDeskTop;
    P04_Click pressBuidPic;
    P04_Click process;
    P04_Click ram;
    P04_Click hdd;
    P04_Click os;
    P04_Click addToCart;
@Test(priority =3)
    public void CheckAddToCar_P() {
        //ToDo click on computer tap
        pressComTap = new P04_Click(driver);
        pressComTap.click();

        //ToDo click on desktop
        pressDeskTop = new P04_Click(driver);
        pressDeskTop.desktopClick();

        //ToDo click on build pic
        pressBuidPic = new P04_Click(driver);
        pressBuidPic.buildPic();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on processor
        process = new P04_Click(driver);
        process.processorSelect();

        //ToDo select on Ram
        ram = new P04_Click(driver);
        ram.ramSelect();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on HDD
        hdd = new P04_Click(driver);
        hdd.hddMethod();
        //ToDo select on HDD
        os = new P04_Click(driver);
        os.osMethod();
        //ToDo click Add to Cart
        addToCart = new P04_Click(driver);
        addToCart.addToCartMethod();

      }}


