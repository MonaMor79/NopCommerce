package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P012_Order {
    public P012_Order(WebDriver driver) {
        this.driver = driver;
    }

    private final WebDriver driver;
    Select g;


    //To add locator
    private final By shoppingCard = By.xpath("//span[@class=\"cart-label\"]");
    private final By addToCard = By.xpath("//button[@class=\"button-1 cart-button\"]");
    private final By checkOut = By.xpath("//button[@id=\"checkout\"]");

    private final By country = By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]");
    private final By city = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    private final By address = By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    private final By ZipCode = By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]");
    private final By phone = By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    private final By continue1 = By.xpath("//button[@onclick=\"Billing.save()\"]");
    private final By stateDropDown = By.id("BillingNewAddress_StateProvinceId");

    private final By ground = By.xpath("//li[@id='opc-shipping_method']//li[1]");
    private final By continue2 = By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");

    private final By creditCard = new By.ByCssSelector("div[class='payment-details'] label[for='paymentmethod_1']");

    private final By continue3 = By.xpath("//button[@onclick=\"PaymentMethod.save()\"]");

    public P012_Order clickContinue3() {
        driver.findElement(continue3).click();
        return this;
    }

    private final By visa = By.xpath("//select[@class=\"dropdownlists\"]");
    private final By cardName = By.id("CardholderName");
    private final By cardNumber = By.id("CardNumber");
    private final By expireMonth = By.id("ExpireMonth");
    private final By expireYear = By.id("ExpireYear");
    private final By cardCode = By.id("CardCode");
    private final By continue4 = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");
    private final By confirm = By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]");
    private final By terms = By.xpath("//input[@id=\"termsofservice\"]");

    public P012_Order getShoppingCard() {
        PageBase.hoverWebElement(driver, driver.findElement(shoppingCard));
        return this;
    }

    public P012_Order pressAddToCard() {
        driver.findElement(addToCard).click();
        return this;
    }

    public P012_Order pressTerms() {
        driver.findElement(terms).click();
        return this;
    }

    public P012_Order clickCheckOut() {
        driver.findElement(checkOut).click();
        return this;
    }


    public P012_Order selectCountry() {
        g = new Select(driver.findElement(country));
        g.selectByIndex(1);

        return this;
    }

    public P012_Order addCity(String city) {
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    public P012_Order addAddress(String address) {
        driver.findElement(this.address).sendKeys(address);
        return this;
    }

    public P012_Order addZipCode(String ZipCode) {
        driver.findElement(this.ZipCode).sendKeys(ZipCode);
        return this;
    }

    public P012_Order addPhone(String phone) {
        driver.findElement(this.phone).sendKeys(phone);
        return this;
    }

    public P012_Order clickContinue1() {
        driver.findElement(continue1).click();
        return this;
    }

    public P012_Order selectGround() {
        driver.findElement(ground).click();
        return this;
    }

    public P012_Order selectState() throws InterruptedException {
        Thread.sleep(3000);
        g = new Select(driver.findElement(stateDropDown));
        g.selectByIndex(1);
        return this;
    }

    public P012_Order clickContinue2() {
        driver.findElement(continue2).click();
        return this;
    }

    public P012_Order chooseCreditCard() {
        driver.findElement(creditCard).click();
        return this;
    }

    public P012_Order selectVisa() {
        g = new Select(driver.findElement(visa));
        g.selectByIndex(0);
        return this;
    }

    public P012_Order addCardName(String cardName) {
        driver.findElement(this.cardName).sendKeys(cardName);
        return this;
    }

    public P012_Order addCardNumber(String cardNumber) {
        driver.findElement(this.cardNumber).sendKeys(cardNumber);
        return this;
    }

    public P012_Order selectExpireMonth() {
        g = new Select(driver.findElement(expireMonth));
        g.selectByIndex(10);
        return this;
    }

    public P012_Order selectExpireYear() {
        g = new Select(driver.findElement(expireYear));
        g.selectByIndex(1);
        return this;
    }

    public P012_Order addCardCode(String cardCode) {
        driver.findElement(this.cardCode).sendKeys(cardCode);
        return this;
    }

    public P012_Order clickContinue4() {
        driver.findElement(continue4).click();
        return this;
    }

    public P012_Order clickConfirm() {
        driver.findElement(confirm).click();
        return this;
    }

}
