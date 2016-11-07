package tests.lesson12.homework;

import lesson12.homework.login.*;
import lesson5.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class TestLogin {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @DataProvider
    public Object[][] targets(){
        return new Object[][]{
                {new Vk(driver)},
                {new MailRu(driver)},
                {new Facebook(driver)},
                {new Gmail(driver)},
                {new Hotmail(driver)}
        };
    }

    @Test(dataProvider = "targets")
    public void login(AbstractLogin abstractLogin) throws InterruptedException {
        abstractLogin.login();
        Thread.sleep(2000);
    }
}
