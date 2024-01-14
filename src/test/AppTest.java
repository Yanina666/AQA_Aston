import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AppTest {
    private WebDriver driver = BrowserFactory.getDriver();
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver.get("https://www.mts.by/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    public void cookieClose() {
        WebElement cookieClose = driver.findElement(By.xpath("//button[@id='cookie-agree']"));
        if (cookieClose.isDisplayed()) {
            cookieClose.click();
        }
    }
    @Test
    public void checkTheName() {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(.,'Онлайн пополнение без комиссии')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(blockTitle).perform();
        wait.until(ExpectedConditions.visibilityOf(blockTitle));
        String textOfBlock = blockTitle.getText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", textOfBlock);
    }
    @Test
    public void checkTheLogos() {
        WebElement paymentLogos = driver.findElement(By.className("pay__partners"));
        List<WebElement> imagesList = paymentLogos.findElements(By.tagName("img"));
        Assert.assertEquals(false, imagesList.isEmpty());
        for (WebElement image : imagesList) {
            Assert.assertTrue(image.isDisplayed());
        }
    }
    @Test
    public void checkTheURL() {
        cookieClose();
        driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]")).click();
        Assert.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                driver.getCurrentUrl());
    }
    @Test
    public void checkTheInput() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        phone.clear();
        phone.sendKeys("297777777");
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        sumInput.sendKeys("100");
        WebElement email = driver.findElement(By.id("connection-email"));
        email.sendKeys("Yanina@gmail.com");
        cookieClose();
        WebElement form = driver.findElement(By.id("pay-connection"));
        WebElement button = form.findElement(By.xpath(".//button[contains(@class, 'button button__default') " +
                "and text()='Продолжить']"));
        button.click();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated
                        (By.className("container-fluid")));
        Assert.assertTrue(driver.findElement(By.className("container-fluid")).isDisplayed());
    }
}
