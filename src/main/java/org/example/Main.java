package org.example;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.P01_HomePage;
import pages.P02_RegisterPage;
import pages.P03_LoginPage;
import pages.P04_Click;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //ToDo define java faker object
        Faker faker=new Faker();
        //ToDo define new object
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.addArguments("--ignore-certificate-errors");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        // ToDo user click register page from home page
        P01_HomePage homePage=new P01_HomePage(driver);
        homePage.clickRegisterTap();

        //ToDo user enter all data in fields
        P02_RegisterPage registerPage=new P02_RegisterPage(driver);

        //Todo save generated email two variable
        String email=faker.internet().emailAddress();
        registerPage.registerUser(faker.name().firstName(),faker.name().lastName(),4,4,4,email,
              email  ,"test123","test123");
        homePage.clickLogin();

        //ToDo login page
        P03_LoginPage loginPage=new P03_LoginPage(driver);
        loginPage.checkLogin(email,"test123");

        //ToDo click on computer tap
        P04_Click pressComTap=new P04_Click(driver);
        pressComTap.click();

        //ToDo click on desktop
        P04_Click pressDeskTop=new P04_Click(driver);
        pressDeskTop.desktopClick();

        //ToDo click on build pic
        P04_Click pressBuidPic=new P04_Click(driver);
        pressBuidPic.buildPic();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on processor
        P04_Click process=new P04_Click(driver);
        process.processorSelect();

        //ToDo select on Ram
        P04_Click ram=new P04_Click(driver);
        ram.ramSelect();

        //TODO scrolldown page
        js.executeScript("window.scrollBy(0,500)");

        //ToDo select on HDD
        P04_Click hdd=new P04_Click(driver);
        hdd.hddMethod();
        //ToDo select on HDD
        P04_Click os=new P04_Click(driver);
        os.osMethod();
        //ToDo click Add to Cart
        P04_Click addToCart=new P04_Click(driver);
        addToCart.addToCartMethod();












    }
}