package org.example;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.P01_HomePage;
import pages.P02_RegisterPage;
import pages.P03_LoginPage;

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
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        // ToDo user click register page from home page
        P01_HomePage homePage=new P01_HomePage(driver);
        homePage.clickRegisterTap();
        //ToDo user enter all data in fields
        P02_RegisterPage registerPage=new P02_RegisterPage(driver);
        //Todo save genreted email two variable
        String email=faker.internet().emailAddress();

        registerPage.registerUser(faker.name().firstName(),faker.name().lastName(),4,4,4,email,
              email  ,"test1234","test1234");
        homePage.clickLogin();
        //ToDo login page
        P03_LoginPage loginPage=new P03_LoginPage(driver);
        loginPage.checkLogin(email,"test1234");





    }
}