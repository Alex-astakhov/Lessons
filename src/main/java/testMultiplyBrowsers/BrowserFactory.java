package testMultiplyBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 23.01.2017.
 */
public class BrowserFactory {
    private static WebDriver driver;

    private static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver driver(){
        return DRIVER.get();
    }

    @BeforeTest
    public void startBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        DRIVER.set(driver);
    }

    @AfterTest
    public void tearDown(){
        driver().close();
        driver().quit();
    }
}
