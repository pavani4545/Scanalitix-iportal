package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverUtils;

public class BaseTest {



         public WebDriver driver;

        @BeforeClass
        public void setUp() {
            // Use WebDriverManager to set up the Chrome driver
            driver= WebDriverUtils.initializeDriver();
            driver.get("https://qa.iviscloud.net/alarms");
        }

        @AfterClass
        public void tearDown() {
//            if (driver != null) {
//                driver.quit(); // Close the browser after tests
//            }
        }
    }


