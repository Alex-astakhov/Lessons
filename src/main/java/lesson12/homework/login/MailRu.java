package lesson12.homework.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class MailRu extends AbstractLogin {
    private WebDriver driver;
    private By email = By.id("mailbox__login");
    private By password = By.id("mailbox__password");
    private By submit = By.id("mailbox__auth__button");
    private final String userEmail = "test";
    private final String userPassword = "testPassword";

    public MailRu(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void getUrl() {
        driver.get("https://mail.ru/");
    }

    @Override
    protected void typeEmail() {
        driver.findElement(this.email).clear();
        driver.findElement(this.email).sendKeys(userEmail);
    }

    @Override
    protected void typePassword() {
        driver.findElement(this.password).clear();
        driver.findElement(this.password).sendKeys(userPassword);
    }

    @Override
    protected void clickSubmit() {
        driver.findElement(this.submit).click();
    }
}
