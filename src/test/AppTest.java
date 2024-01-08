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
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class AppTest extends Main{
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
        assertEquals("Онлайн пополнение\nбез комиссии", textOfBlock);
    }
    @Test
    public void checkTheLogos() {
        WebElement paymentLogos = driver.findElement(By.className("pay__partners"));
        List<WebElement> imagesList = paymentLogos.findElements(By.tagName("img"));
        assertEquals(false, imagesList.isEmpty());
        for (WebElement image : imagesList) {
            Assert.assertTrue(image.isDisplayed());
        }
    }
    @Test
    public void checkTheURL() {
        cookieClose();
        driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]")).click();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
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
    @Test
    public void checkTheFiledCommunicationServices() { //проверяем надписи в Услугах связи
        cookieClose();
        driver.findElement(By.id("pay-section")).click();
        assertEquals("Номер телефона",
                driver.findElement(placeholderNumber).getAttribute("placeholder"));
        assertEquals("Сумма", driver.findElement(placeholderSum).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", driver.findElement(placeholderEmail)
                .getAttribute("placeholder"));
    }
    @Test
    public void checkTheFieldHomeInternet(){ //проверяем надписи в разделе Домашний интернет
        cookieClose();
        driver.findElement(By.xpath("//p[@class='select__option'][contains(.,'Домашний интернет')]")).isEnabled();
        driver.findElement(By.xpath("//p[@class='select__option'][text()='Домашний интернет']")).isSelected();
        assertEquals("Номер абонента",
                driver.findElement(placeholderNumberInternet).getAttribute("placeholder"));
        assertEquals("Сумма", driver.findElement(placeholderSum).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", driver.findElement(placeholderEmail)
                .getAttribute("placeholder"));
    }
    @Test
    public void checkTheFieldCredit(){ //проверяем надписи в разделе Рассрочка
        cookieClose();
        driver.findElement(By.xpath("//li[@class='select__item active']")).isEnabled();
        driver.findElement(By.xpath("//p[@class='select__option'][text()='Задолженность']")).isSelected();
        assertEquals("Номер счета на 44", driver.findElement(placeholderCredit)
                .getAttribute("placeholder"));
        assertEquals("Сумма", driver.findElement(placeholderSum).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", driver.findElement(placeholderEmail)
                .getAttribute("placeholder"));
    }
    @Test
    public void checkTheFieldDebt(){ //проверяем надписи в разделе Задолженность
        cookieClose();
        driver.findElement(By.xpath("//li[@class='select__item active']")).isEnabled();
        driver.findElement(By.xpath("//p[@class='select__option'][text()='Задолженность']")).isSelected();
        assertEquals("Номер счета на 2073", driver.findElement(placeholderDebt)
                .getAttribute("placeholder"));
        assertEquals("Сумма", driver.findElement(placeholderSum).getAttribute("placeholder"));
        assertEquals("E-mail для отправки чека", driver.findElement(placeholderEmail)
                .getAttribute("placeholder"));
    }
    @Test
    public void checkTheSum(){ //проверяем корректность отображения суммы после клика на кнопку Продолжить
        cookieClose();
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
                (By.xpath("//div/iframe")));
        Assert.assertTrue(driver.findElement(By.xpath("//div/iframe")).isDisplayed());
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
        assertEquals("100.00 BYN", driver.findElement(headerPaymentAmount).getAttribute("outerText"));
        assertEquals("Оплата: Услуги связи Номер:375297777777", driver.findElement(headerPaymentInfo)
                .getAttribute("outerText"));
        assertEquals("Номер карты", driver.findElement(cardNumber).getAttribute("outerText"));
        assertEquals("Google Pay", driver.findElement(buttonGooglePay).getAttribute("ariaLabel"));
        assertEquals("Yandex Pay", driver.findElement(buttonYandexPay).getAttribute("ariaLabel"));
        assertEquals("Срок действия", driver.findElement(durationOfTheCard).getAttribute("outerText"));
        assertEquals("CVC", driver.findElement(cvc).getAttribute("outerText"));
        assertEquals("Имя держателя (как на карте)", driver.findElement(thePersonsName)
                .getAttribute("outerText"));
        assertEquals("Оплатить 100.00 BYN", driver.findElement(buttonSubmit)
                .getAttribute("outerText"));
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
