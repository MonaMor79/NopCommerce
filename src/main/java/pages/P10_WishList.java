package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_WishList {
    //ToDo create constructor and initiate driver in constructor
    public P10_WishList(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private final WebDriver driver;
    //TODO adding Locators


    private final By wishlist = By.xpath("//button[@id=\"add-to-wishlist-button-1\"]");
    private final By massageVerify = By.xpath("//span[@class=\"wishlist-qty\"]");

    public P10_WishList ClickWishlist() {
        driver.findElement(wishlist).click();

        return this;
    }


}