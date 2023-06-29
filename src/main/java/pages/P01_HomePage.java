package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    //ToDo create constructor and initiate driver in constructor
    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private WebDriver driver;

    //ToDo Adding Locator LoginTap
    private final By loginTap = By.xpath("//a[@href='/login?returnUrl=%2F']");

    //ToDo adding Locator RegisterTap
    private final By registerTap = By.xpath("//a[@href='/register?returnUrl=%2F']");


    //TODO click logintap
    public P01_HomePage ClickLoginTap() {
        driver.findElement(loginTap).click();
        return this;
    }

    public P01_HomePage ClickRegisterTap() {
        driver.findElement(registerTap).click();
        return this;
    }
}





