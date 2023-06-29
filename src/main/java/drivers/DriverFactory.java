package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;


public class DriverFactory {
    public static WebDriver getNewInstance(String browserName) {

    switch (browserName.toLowerCase()) {
        case "chrome-headless":
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("start-maximized");
            chromeOptions.addArguments("--disable-web-security");
            chromeOptions.addArguments("--no-proxy-server");
            chromeOptions.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(chromeOptions);
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        case "firefox-headless":
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");
            firefoxBinary.addCommandLineOptions("--window-size=1280x720");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(firefoxOptions);
        case "edge":
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        default:
            chromeOptions = new ChromeOptions();
            // TODO: handle browsers options
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            chromeOptions.addArguments("start-maximized");
            chromeOptions.addArguments("--disable-web-security");
            chromeOptions.addArguments("--no-proxy-server");
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.setExperimentalOption("prefs", prefs);
            chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(chromeOptions);
    }
}
}
