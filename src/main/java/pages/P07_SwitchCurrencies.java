package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P07_SwitchCurrencies {
    //ToDo create constructor and initiate driver in constructor
    public P07_SwitchCurrencies(WebDriver driver) {
        this.driver = driver;
    }

    //ToDo add driver
    private WebDriver driver;
    //TODO adding Locator

    private final By currencyLocator = new By.ByXPath("//select[@id=\"customerCurrency\"]");

    public void selectCur() {
        Select dropCurrency = new Select(driver.findElement(currencyLocator));
        dropCurrency.selectByIndex(1);

    }
}

