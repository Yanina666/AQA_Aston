package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        return driver;
    }
    public void tearDown() {
        driver.quit();
    }
}
