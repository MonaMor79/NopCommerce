package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P04_Click {
    //ToDo add driver
    private WebDriver driver;
    //ToDo Adding Locator computer tap
    private final By computerTap= By.xpath("(//a)[@href='/computers']");
    //ToDo Adding Locator computer tap
    private final By deskTop=By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    //ToDo Adding Locator build pic
    private final By buildLocator=By.xpath("(//a)[@href='/build-your-own-computer' and @title='Show details for Build your own computer']");
    //ToDo create constructor and initiate driver in constructor

    //TODo buy build computer
    //Todo find locator Processor field
    private final By processorLocator=By.xpath("(//select)[@data-attr='1']");
    //Todo find locator Ram field
    private final By ramLocator=By.xpath("(//select)[@data-attr='2']");
    //Todo find locator HDD field
    private final By hddLocator=By.xpath("(//label)[@for='product_attribute_3_6']");
    //Todo find locator OS field
    private final By osLocator=By.xpath("(//label)[@for='product_attribute_4_9']");
    //Todo find locator Add To Cart field
    private final By addToCartLocator=By.xpath("(//button)[@id='add-to-cart-button-1']");




    public P04_Click(WebDriver driver){
        this.driver=driver;
    }
    //TODO click Computer Tap method
    public Void click(){
        driver.findElement(computerTap).click();
        return null;
    }
    //TODO click desktop  method
    public void desktopClick(){
        driver.findElement(deskTop).click();
    }
    //TODO click build pic  method
    public  void buildPic(){
        driver.findElement(buildLocator).click();
    }

    //ToDo select processor method
    public void processorSelect(){
        Select select=new Select(driver.findElement(this.processorLocator));
        select.selectByValue("2");


    }
    //ToDo select Ram Method
    public void ramSelect(){
        Select selectRam=new Select(driver.findElement(this.ramLocator));
        selectRam.selectByValue("4");
    }

    //ToDo select HDD Method
    public void hddMethod(){
        driver.findElement(this.hddLocator).click();
    }
    public void osMethod(){
        driver.findElement(this.osLocator).click();
    }
    public void addToCartMethod(){
        driver.findElement(this.addToCartLocator).click();
    }


}
