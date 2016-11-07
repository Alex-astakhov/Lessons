package lesson12.homework.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Vk extends AbstractLogin {
    private WebDriver driver;
    private By email = By.id("index_email");
    private By password = By.id("index_pass");
    private By submit = By.id("index_login_button");
    private final String userEmail = "test@email.com";
    private final String userPassword = "testPassword";

    public Vk(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void getUrl() {
        driver.get("https://vk.com");
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
