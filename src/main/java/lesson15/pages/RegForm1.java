package lesson15.pages;

import lesson15.User;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.IOException;

/**
 * Created by Alex Astakhov on 21.11.2016.
 */
public class RegForm1 {
    WebDriver driver;

    public RegForm1(WebDriver driver) {
        this.driver = driver;
    }

    private By regTab = By.cssSelector("#form-registration");
    private By iamBoy = By.cssSelector("#[for='iam-boy']");
    private By iamGirl = By.cssSelector("[for='iam-girl']");
    private By findBoy = By.cssSelector("[for='find-boy']");
    private By findGirl = By.cssSelector("[for='find-girl']");

    @Step("Login user {0}")
    public void login(User user){
        Login login = new Login(driver);
        login.userLogin(user.email, user.password);
    }

    @Step
    public void type(By by, String string){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(string);
    }

    public void clickRegTab(){
        driver.findElement(regTab).click();
    }

    public void chooseMyGender(char gender){
        if (gender == 'm'){
            driver.findElement(iamBoy).click();
        }
        else {
            driver.findElement(iamGirl).click();
        }
    }

    public void chooseFindGender(char gender){
        if (gender == 'm'){
            driver.findElement(findBoy).click();
        }
        else {
            driver.findElement(findGirl).click();
        }
    }

    @Step
    public void click(By by){
        driver.findElement(by).click();
    }

    @Attachment(value="{0}", type ="image/png")
    public byte[] makeScreenshot(String name, WebDriver driver) throws IOException {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public class Login{
        WebDriver driver;

        public Login(WebDriver driver) {
            this.driver = driver;
        }

        private By userEmail = By.cssSelector("#user-email");
        private By userPassword = By.cssSelector("#user-password");
        private By submit = By.cssSelector("#sign-in-form .submit");

        public void userLogin(String email, String password){
            type(userEmail, email);
            type(userPassword, password);
            click(submit);
        }
    }
}
