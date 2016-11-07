package lesson12.homework.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Gmail extends AbstractLogin {
    private WebDriver driver;
    private By email = By.id("Email");
    private By password = By.id("Passwd");
    private By next = By.id("next");
    private By submit = By.id("signIn");
    private final String userEmail = "test@email.com";
    private final String userPassword = "testPassword";

    public Gmail(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void getUrl() {
        driver.get("https://mail.google.com");
    }

    @Override
    protected void typeEmail() {
        driver.findElement(this.email).clear();
        driver.findElement(this.email).sendKeys(userEmail);
        driver.findElement(next).click();
    }

    @Override
    protected void typePassword() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.password));
        driver.findElement(this.password).clear();
        driver.findElement(this.password).sendKeys(userPassword);
    }

    @Override
    protected void clickSubmit() {
        driver.findElement(this.submit).click();
    }
}
