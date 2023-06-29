package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P011_Compare {
    //ToDo create constructor and initiate driver in constructor
    public P011_Compare(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private final WebDriver driver;


    //To Add locator
    private final By compareButton = By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]");


    private final By massageCompare = By.xpath("//p[@class=\"content\"]");


    //Method

    public P011_Compare getCompareButton() {
        driver.findElement(compareButton).click();
        return this;
    }

    public boolean verifyMassageCompare() {
        if (driver.findElement(massageCompare).getText().equals("The product has been added to your "))
            return true;
        else
            return false;

    }
}
