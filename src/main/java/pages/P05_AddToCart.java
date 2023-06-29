package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P05_AddToCart {

    //ToDo create constructor and initiate driver in constructor
    public P05_AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private WebDriver driver;


    //ToDo Adding Locator
    private final By computerTap = By.xpath("(//a)[@href='/computers']");
    private final By deskTop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    private final By buildLocator = By.xpath("(//a)[@href='/build-your-own-computer' and @title='Show details for Build your own computer']");

    private final By processorLocator = By.xpath("(//select)[@data-attr='1']");
    private final By ramLocator = By.xpath("(//select)[@data-attr='2']");
    private final By hddLocator = By.xpath("(//label)[@for='product_attribute_3_6']");
    private final By osLocator = By.xpath("(//label)[@for='product_attribute_4_9']");
    private final By addToCartLocator = By.xpath("(//button)[@id='add-to-cart-button-1']");


    private final By home = By.xpath("//a[@href=\"/\" and span]");

    public P05_AddToCart ClickComputerTap() {
        driver.findElement(computerTap).click();
        return this;

    }

    public P05_AddToCart ClickDeskTop() {
        driver.findElement(deskTop).click();
        return this;

    }

    public P05_AddToCart ClickBuild() {
        driver.findElement(buildLocator).click();
        return this;
    }

    public P05_AddToCart ClickProcessor() {
        Select select = new Select(driver.findElement(processorLocator));
        select.selectByValue("2");
        return this;

    }

    public P05_AddToCart ClickRam() {
        Select selectRam = new Select(driver.findElement(ramLocator));
        selectRam.selectByValue("4");
        return this;

    }

    public P05_AddToCart ClickHdd() {
        driver.findElement(hddLocator).click();
        return this;

    }

    public P05_AddToCart ClickOs() {
        driver.findElement(osLocator).click();
        return this;

    }

    public P05_AddToCart ClickAddToCart() {
        driver.findElement(addToCartLocator).click();

        return this;


    }

    public P05_AddToCart getHome() {
        driver.findElement(home).click();

        return this;
    }
}




