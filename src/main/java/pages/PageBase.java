package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageBase {
    // TODO: hover over web element
    public static void hoverWebElement(WebDriver driver, WebElement element) {
        // Creating object of an Actions class
        Actions action = new Actions(driver);
        // Performing the mouse hover action on the target element.
        action.moveToElement(element).perform();
    }
}
