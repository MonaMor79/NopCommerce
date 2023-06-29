package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_RandomCategory {
    public P08_RandomCategory(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private final WebDriver driver;

    //TODO adding Locators
    private final By computerTap = By.xpath("(//a)[@href='/computers']");
    private final By home = By.xpath("//a[@title='Home']");

    private final By deskTop = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    private final By AddToCart = By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    private final By camera = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
    private final By nikon = By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    private final By shoes = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
    private final By nike = By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By digital = By.xpath("//a[@href=\"/digital-downloads\"]");
    private final By ifYouWant = By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By book = By.xpath("//a[@href=\"/books\"]");
    private final By firstPrize = By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    private final By flower = By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]");
    private final By shoppingCard = By.xpath("//span[@class=\"cart-label\"]");
    private final By massage = By.xpath("//span[@class='cart-qty']");


    public P08_RandomCategory ClickComputerTap() {
        PageBase.hoverWebElement(driver, driver.findElement(computerTap));

        return this;
    }

    public P08_RandomCategory ClickDeskTop() {
        driver.findElement(deskTop).click();
        return this;
    }

    public P08_RandomCategory ClickAddToCart() {
        driver.findElement(AddToCart).click();
        return this;
    }

    public P08_RandomCategory ClickHome() {
        driver.findElement(home).click();
        return this;
    }

    public P08_RandomCategory ClickElectronics() {
        PageBase.hoverWebElement(driver, driver.findElement(electronics));


        return this;
    }

    public P08_RandomCategory ClickCamera() {
        driver.findElement(camera).click();

        return this;
    }

    public P08_RandomCategory ClickNikon() {
        driver.findElement(nikon).click();

        return this;
    }

    public P08_RandomCategory ClickApparel() {
        PageBase.hoverWebElement(driver, driver.findElement(apparel));


        return this;
    }

    public P08_RandomCategory ClickShoes() {
        driver.findElement(shoes).click();
        return this;
    }

    public P08_RandomCategory ClickNike() {
        driver.findElement(nike).click();

        return this;
    }

    public P08_RandomCategory ClickDigital() {
        driver.findElement(digital).click();

        return this;
    }

    public P08_RandomCategory ClickIfYouWant() {
        driver.findElement(ifYouWant).click();

        return this;
    }

    public P08_RandomCategory ClickBook() {
        driver.findElement(book).click();

        return this;
    }

    public P08_RandomCategory ClickFirstPrize() {
        driver.findElement(firstPrize).click();

        return this;
    }

    public P08_RandomCategory ClickJewelry() {
        driver.findElement(jewelry).click();

        return this;
    }

    public P08_RandomCategory ClickFlower() {
        driver.findElement(flower).click();

        return this;
    }

    public P08_RandomCategory ClickShoppingCard() {
        PageBase.hoverWebElement(driver, driver.findElement(shoppingCard));

        return this;
    }

    public boolean verifyMassage() {
        if (driver.findElement(this.massage).getText().equals("(7)"))
            return true;
        else
            return false;
    }

}
