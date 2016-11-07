package lesson12.homework.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Hotmail extends AbstractLogin {
    private WebDriver driver;
    private By email = By.id("i0116");
    private By password = By.id("i0118");
    private By next = By.id("idSIButton9");
    private By submit = By.id("idSIButton9");
    private final String userEmail = "test@email.com";
    private final String userPassword = "testPassword";

    public Hotmail(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void getUrl() {
        driver.get("https://login.live.com/");
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
