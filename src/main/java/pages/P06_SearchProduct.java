package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class P06_SearchProduct {
    //ToDo create constructor and initiate driver in constructor
    public P06_SearchProduct(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private WebDriver driver;
    //TODO adding Locator

    private final By searchLocator = new By.ByXPath("(//input)[@id=\"small-searchterms\"]");

    private final By buttonSLocator = new By.ByXPath("(//button)[@type=\"submit\"]");


    //TODO click search method
    public void insertProduct() throws InterruptedException {
        driver.findElement(searchLocator).sendKeys("App");
        Thread.sleep(3000);
        driver.findElement(searchLocator).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(buttonSLocator).click();
    }

}