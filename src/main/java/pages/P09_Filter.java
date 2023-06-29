package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_Filter {
    //ToDo create constructor and initiate driver in constructor
    public P09_Filter(WebDriver driver){
        this.driver=driver;

    }
    //ToDo add driver
    private final WebDriver driver;
    //TODO adding Locators
    private final By apparel= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    private final By shoes= By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
    private final By red= By.xpath("//input[@id=\"attribute-option-15\"]");
    public P09_Filter ClickApparel() {
        PageBase.hoverWebElement(driver,driver.findElement(apparel));


        return this;
    }

    public P09_Filter ClickShoes() {
        driver.findElement(shoes).click();
        return this;
    }
    public P09_Filter ClickRed() {
        driver.findElement(red).click();
        return this;
    }
}
