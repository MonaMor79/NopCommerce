package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegisterPage;

public class TC01_CheckRegistration extends TestBase{
    P01_HomePage homePage;
    P02_RegisterPage registerPage;
    public static String email;
   @Test(priority = 1)
    public void checkValidRegistration_P(){
       // TODO: initialize class objects
       homePage=new P01_HomePage(driver);
       registerPage=new P02_RegisterPage(driver);

       // TODO: registrer new user
       // ToDo user click register page from home page
       homePage.clickRegisterTap();
       //ToDo user enter all data in fields
       //Todo save generated email two variable
      email=faker.internet().emailAddress();
       registerPage.registerUser(faker.name().firstName(),faker.name().lastName(),4,4,4,email,
               email  ,"test123","test123");
   }
}
