package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Utilities {
    // TODO: Capture Screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")
                    + "/src/test/resources/Screenshots/" + screenshotName + System.currentTimeMillis() + ".png"));
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: delete screenshots after running


        public static void DeleteScreenshots() {
            // specify the directory where your screenshots are stored
            String directoryPath = "C:\\Selenium Projects\\TaskNopcommerce\\src\\test\\resources\\Screenshots";

            // create a File object for the directory
            File directory = new File(directoryPath);

            // get a list of all files in the directory
            File[] files = directory.listFiles();

            // loop through the files and delete all files with ".png" extension
            for (File file : files) {
                if (file.getName().endsWith(".png")) {
                    file.delete();
                }
            }
        }


    // TODO: Scroll with specific amount over web page
    public static void scrollWithSpecificSize(WebDriver driver, int sizeX, int sizeY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String jsCommand = String.format("window.scrollBy('%s','%s')", sizeX, sizeY);
        js.executeScript(jsCommand, "");
    }

    // TODO: Scroll to view Element
    public static void scrollToViewElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    // TODO: start html report
    public static void startHtmlReport(String reportDirName, String reportFileName) throws IOException {
        String path = System.getProperty("user.dir") + "/target/HtmlReports";

        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd " + reportDirName + " && " + reportFileName);
        builder.redirectErrorStream(true);
        Process p = builder.start();

    }

    // TODO: generate random vis number
    public static String generateRandomVisaNumber() {

        // Get the Visa card number prefix.
        String prefix = "4";

        // Generate a random number for the rest of the digits.
        Random random = new Random();
        int[] digits = new int[16];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(10);
        }

        // Calculate the check digit.
        int checkDigit = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            if ((i + 1) % 2 == 0) {
                checkDigit += digits[i] * 2;
            } else {
                checkDigit += digits[i];
            }
        }
        checkDigit %= 10;
        checkDigit = 10 - checkDigit;

        // Create the Visa card number.
        String number = prefix;
        for (int i = 0; i < digits.length; i++) {
            number += digits[i];
        }
        number += checkDigit;

        return number;
    }


}