package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P02_RegisterPage {
    //ToDo create constructor and initiate driver in constructor
    public P02_RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private final WebDriver driver;

    //ToDO find locator gender
    private final By gender = By.xpath("//label[@class='forcheckbox' and @for='gender-female']");


    //ToDO find locator First Name
    private final By firstName = By.xpath("//input[@id='FirstName']");
    //ToDO find locator Last Name
    private final By lastName = By.xpath("//input[@id='LastName']");
    //ToDo find locator Day of birth
    private final By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    //ToDo find locator Month of birth
    private final By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    //ToDo find locator Year of birth
    private final By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    //TODo find locator Email
    private final By email = By.xpath("//input[@id='Email']");
    //ToDo find locator Company name
    private final By companyName = By.xpath("//input[@id='Company']");
    //ToDo find locator Password
    private final By password = By.xpath("//input[@id='Password']");
    //ToDo find locator Confirm Password
    private final By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    //ToDo find locator register button
    private final By registerButton = By.xpath("//button[@id='register-button']");

    // TODO: get Confirmation message
    private final By confirmationMessage = By.xpath("//div[@class='result']");

    public P02_RegisterPage getGender() {
        driver.findElement(gender).click();
        return this;
    }

    public P02_RegisterPage getFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public P02_RegisterPage getLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public P02_RegisterPage getDayOfBirth(int dayOfBirth) {
        Select select = new Select(driver.findElement(this.dayOfBirth));
        select.selectByIndex(dayOfBirth);

        return this;
    }

    public P02_RegisterPage getMonthOfBirth(int monthOfBirth) {
        Select select = new Select(driver.findElement(this.monthOfBirth));
        select.selectByIndex(monthOfBirth);

        return this;
    }

    public P02_RegisterPage getYearOfBirth(int yearOfBirth) {
        Select select = new Select(driver.findElement(this.yearOfBirth));
        select.selectByIndex(yearOfBirth);

        return this;
    }

    public P02_RegisterPage getEmail(String email) {
        driver.findElement(this.email).sendKeys(email);

        return this;
    }

    public P02_RegisterPage getCompanyName(String companyName) {
        driver.findElement(this.companyName).sendKeys(companyName);
        return this;
    }

    public P02_RegisterPage getPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public P02_RegisterPage getConfirmPassword(String confirmPassword) {
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        return this;
    }

    public P02_RegisterPage getRegisterButton() {
        driver.findElement(this.registerButton).click();
        return this;
    }


    public boolean checkConfirmationMessage() {
        if (driver.findElement(this.confirmationMessage).getText().equals("Your registration completed"))
            return true;
        else
            return false;
    }


}
