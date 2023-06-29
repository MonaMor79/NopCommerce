package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.javafaker.Faker;
import drivers.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utility.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;

public class TestBase {

    protected Faker faker;
    protected WebDriver driver;

    //  define properties object
    FileInputStream readProperty;
    Properties properties;
    private static String PROJECT_NAME;
    private static String PROJECT_URL;
    protected JavascriptExecutor js;
    protected static ExtentSparkReporter htmlReporter;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeSuite
    public void defineSuiteElements() throws IOException {

        // initialize the HtmlReporter
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/testReport.html");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // call set project method
        setProjectProperties();

        // initialize test
        test = extent.createTest(PROJECT_NAME + " Test Automation Project");

        //configuration items to change the look and fee add content, manage tests etc
        htmlReporter.config().setDocumentTitle(PROJECT_NAME + " Test Automation Report");
        htmlReporter.config().setReportName(PROJECT_NAME + " Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    private void setProjectProperties() throws IOException {
        // TODO: Step1: define object of properties file
        // initialize property file
        readProperty = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/property/property.properties");
        properties = new Properties();
        properties.load(readProperty);

        // define project name from properties file
        PROJECT_NAME = properties.getProperty("project_name");
        PROJECT_URL = properties.getProperty("url");

    }

    @Parameters("browser")
    @BeforeMethod
    public void setupDriver(String browser) throws IOException {
        //ToDo define java faker object
        faker = new Faker();

        //ToDo define new object
        driver = DriverFactory.getNewInstance(browser);
        setDriver(driver);

        js = (JavascriptExecutor) driver;

        // TODO: Open url
        driver.get(PROJECT_URL);

        //TODO: manage window maximization
        driver.manage().window().maximize();

        // TODO: manage implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
        if (driver != null)
            driver.quit();
    }

    @AfterSuite
    public void tearDown() throws IOException {
        extent.flush();
        //start html report after test end
        Utilities.startHtmlReport(System.getProperty("user.dir"), "testReport.html");
        // clear screenshots in screenshot folder
//       Utilities.DeleteScreenshots();
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, result.getName() + " failed with the following error: " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, result.getName());
        } else
            test.log(Status.SKIP, result.getName());
    }

}
