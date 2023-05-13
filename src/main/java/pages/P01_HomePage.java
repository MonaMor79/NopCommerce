package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    //ToDo add driver
    private WebDriver driver;
    //ToDo Adding Locator LoginTap
    private final By loginTap = By.xpath("//a[@href='/login?returnUrl=%2F']");
    //ToDo adding Locator RegisterTap
    private final By registerTap = By.xpath("//a[@href='/register?returnUrl=%2F']");

    //ToDo create constructor and initiate driver in constructor
    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }
     //TODO click logintap
    public void clickLogin(){
        driver.findElement(loginTap).click();
    }
    //TODO click RegisterTap
    public void clickRegisterTap(){
        driver.findElement(registerTap).click();
    }


    }




