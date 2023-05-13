package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P02_RegisterPage {
    //ToDo add driver
    private WebDriver driver;

    //ToDO find locator gender
    private final By gender=By.xpath("//label[@class='forcheckbox' and @for='gender-female']");
    //ToDO find locator First Name
    private final By firstName=By.xpath("//input[@id='FirstName']");
    //ToDO find locator Last Name
    private final By lastName=By.xpath("//input[@id='LastName']");
    //ToDo find locator Day of birth
    private final By dayOfBirth=By.xpath("//select[@name='DateOfBirthDay']");
    //ToDo find locator Month of birth
    private final By monthOfBirth=By.xpath("//select[@name='DateOfBirthMonth']");
    //ToDo find locator Year of birth
    private final By yearOfBirth=By.xpath("//select[@name='DateOfBirthYear']");
    //TODo find locator Email
    private final By email=By.xpath("//input[@id='Email']");
    //ToDo find locator Company name
    private final By companyName=By.xpath("//input[@id='Company']");
    //ToDo find locator Password
    private final By password=By.xpath("//input[@id='Password']");
    //ToDo find locator Confirm Password
    private final By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    //ToDo find locator register button
    private final By registerButton=By.xpath("//button[@id='register-button']");

    //ToDo create constructor and initiate driver in constructor
    public P02_RegisterPage(WebDriver driver){
        this.driver=driver;
    }

    //ToDo public method to access locators
    public void registerUser(String firstName,String lastName,int dayOfBirth,int monthOfBirth,int yearOfBirth,
                             String email,String companyName,String password,String confirmPassword){
        //TODO:  1- fill data
        // click gender female
        driver.findElement(this.gender).click();
        //ToDo insert first name
        driver.findElement(this.firstName).sendKeys(firstName);
        //ToDo insert last name
        driver.findElement(this.lastName).sendKeys(lastName);
        //ToDo handle select (dropdown) in selenium
        Select select=new Select(driver.findElement(this.dayOfBirth));
        select.selectByIndex(dayOfBirth);
        select=new Select(driver.findElement(this.monthOfBirth));
        select.selectByIndex(monthOfBirth);
        select=new Select(driver.findElement(this.yearOfBirth));
        select.selectByIndex(yearOfBirth);
        //ToDo insert Email
        driver.findElement(this.email).sendKeys(email);
        //ToDo insert Company name
        driver.findElement(this.companyName).sendKeys(companyName);
        //ToDo insert Password
        driver.findElement(this.password).sendKeys(password);
        //ToDo insert Confirm Password
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        //ToDo click button register
        driver.findElement(this.registerButton).click();
        //ToDo click continue button
        driver.findElement(By.xpath("//a[@href='/' and @class='button-1 register-continue-button']")).click();


    }

}
