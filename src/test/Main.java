import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
    public static WebDriver driver;
    public By placeholderNumber = By.xpath("//input[@placeholder='Номер телефона']");
    public By placeholderSum = By.xpath("//input[@placeholder='Сумма']");
    public By placeholderEmail = By.xpath("//input[@placeholder='E-mail для отправки чека']");
    public By placeholderNumberInternet = By.xpath("//input[@placeholder='Номер абонента']");
    public By placeholderCredit = By.xpath("//input[@placeholder='Номер счета на 44']");
    public By placeholderDebt = By.xpath("//input[@placeholder='Номер счета на 2073']");
    public By headerPaymentAmount = By.xpath("//p[contains(@class,'payment-amount')]");
    public By headerPaymentInfo = By.xpath("//p[@class='header__payment-info']");
    public By cardNumber = By.xpath("//div[@class='content ng-tns-c47-1']");
    public By buttonGooglePay = By.xpath("//button[@class='gpay-button black plain short ru']");
    public By buttonYandexPay = By.xpath("//button[@class='ya-pay-button ya-pay-button_black']");
    public By durationOfTheCard = By.xpath("//div[@class='content ng-tns-c47-4']/label");
    public By cvc = By.xpath("//div[@class='content ng-tns-c47-5']/label");
    public By thePersonsName = By.xpath("//div[@class='content ng-tns-c47-3']/label");
    public By buttonSubmit = By.xpath("//button[@class='colored disabled ng-star-inserted']");
}
