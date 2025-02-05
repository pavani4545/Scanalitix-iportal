package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverUtils {
    public static WebDriver initializeDriver() {
        WebDriver driver = null;
        String browser = System.getProperty("browser", "chrome").toLowerCase();  // Default to chrome if not specified

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                // Add any custom Chrome options if necessary
                chromeOptions.addArguments("--start-maximized");  // Example option
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                // Add any custom Firefox options if necessary
                driver = new FirefoxDriver(firefoxOptions);
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                // Add any custom Edge options if necessary
                driver = new EdgeDriver(edgeOptions);
                break;

            default:
                System.out.println("Browser not supported. Defaulting to Chrome.");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }

        return driver;
    }

    /**
     * Example method for maximizing the browser window
     */
    public static void maximizeWindow(WebDriver driver) {
        if (driver != null) {
            driver.manage().window().maximize();
        }
    }

    /**
     * Example method for closing the browser
     */
    public static void quitDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}

