package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_LoginPage {

    private WebDriver driver;

    //ToDo adding Locator email
    private final   By email=By.xpath("//input [@class='email']");
    //ToDo adding Locator password
    private final   By password=By.xpath("//input [@class='password']");
    //TODO adding Locator Login Button
    private final By loginButton=By.xpath("//button[@type='submit' and @class='button-1 login-button']");
    //ToDo create constructor and initiate driver in constructor
    public P03_LoginPage (WebDriver driver){
        this.driver=driver;}
    //ToDo insert email and password and press login
    public void checkLogin(String email,String password){
        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    }
