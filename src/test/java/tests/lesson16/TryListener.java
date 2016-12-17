package tests.lesson16;

import listeners.DriverListener;
import listeners.TestListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 25.11.2016.
 */
@Listeners(TestListener.class)
public class TryListener {
    WebDriver driver;
    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testListener(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver = new EventFiringWebDriver(driver).register(new DriverListener());
        driver.get("https://google.com");
    }

    @Test(testName = "JACK")
    public void failTest(){
        Assert.fail("alala");
    }
}
