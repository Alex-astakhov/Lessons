package tests.lesson15;

import lesson15.pages.RegForm1;
import lesson5.Constants;
import lesson15.User;
import logger.TryLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.MainPage;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.events.TestCaseEvent;
import ru.yandex.qatools.allure.model.Parameter;
import ru.yandex.qatools.allure.model.ParameterKind;
import ru.yandex.qatools.allure.model.TestCaseResult;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 21.11.2016.
 */
public class LoginTest {
    WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(TryLogger.class);

    private static Parameter parameter(String name, String value) {
        Parameter param = new Parameter();
        param.setName(name);
        param.setValue(value);
        param.setKind(ParameterKind.ENVIRONMENT_VARIABLE);
        return param;
    }

    public static void fireAllureParameterVariable(final String name, final String value) {
        logger.info(name+": "+value);
        Allure.LIFECYCLE.fire(new TestCaseEvent() {
            @Override
            public void process(TestCaseResult testCaseResult) {
                testCaseResult.getParameters().add(parameter(name, value));

            }
        });
    }

    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException, IOException {
        fireAllureParameterVariable("Browser", "Chrome");
        driver.get("https://kismia.com");
        RegForm1 regForm = new RegForm1(driver);
        regForm.makeScreenshot("Before", driver);
        User user = new User("bevov@divismail.ru", "ahtung");
        fireAllureParameterVariable("User", user.toString());
        regForm.login(user);
        Assert.assertTrue(driver.findElement(By.cssSelector("[href='/sign/out']")).isDisplayed(), "Не залогинился!");
        regForm.makeScreenshot("After", driver);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
