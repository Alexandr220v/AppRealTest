import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    protected WebDriver getDriver(String browser) {

        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("chromedriver"));
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("firefoxdriver"));
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("iedriver"));
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(System.getProperty("url"));
        return driver;
    }

    @AfterTest
    protected void tearDown() {
        if(driver != null)
            driver.quit();
    }
}
