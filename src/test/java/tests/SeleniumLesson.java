package tests;

import lesson5.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 10.10.2016.
 */
public class SeleniumLesson {

    WebDriver driver;

    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void trySelenuum() throws InterruptedException {
        driver.get("https://kismiia.com");
        Assert.assertEquals(driver.getTitle(), Constants.TITLE_KISMIA);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
