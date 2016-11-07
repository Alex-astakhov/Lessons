package tests;

import lesson5.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 10.10.2016.
 */
public class Login {

    WebDriver driver;

    private String email = "bevov@divismail.ru";
    private String pass = "ahtung";



    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void trySelenuum() throws InterruptedException {
        driver.get("https://kismia.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.login(email, pass);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("/u"));
        Assert.assertTrue(driver.getCurrentUrl().contains("u18330465"));
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
