package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_ChForgotPassword {
    private WebDriver driver;
    //TODO adding Locator
    private final By forgotPasswordLocator = new By.ByXPath("(//a)[@href='/passwordrecovery']");
    //Todo Find locator recover Button
    private final By recoverLocator = new By.ByXPath("(//button)[@name='send-email']");
    //Todo Find locator email recover Button
    private final By emailRecoverLocator = new By.ByXPath("(//input)[@class=\"email\"]");
    //Todo Find locator Massage Verify
    private final By massageLocator = new By.ByXPath("//p[@class=\"content\"]");

    //ToDo create constructor and initiate driver in constructor
    public P04_ChForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void checkForgotPass(String email) {
        driver.findElement(this.forgotPasswordLocator).click();
        driver.findElement(emailRecoverLocator).sendKeys(email);
        driver.findElement(this.recoverLocator).click();

    }

    public boolean verifyMassage() {
        if (driver.findElement(this.massageLocator).getText().equals("Email with instructions has been sent to you."))
            return true;
        else
            return false;
    }
}
