package tests.readyState;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import testMultiplyBrowsers.BrowserFactory;

/**
 * Created by Alex Astakhov on 30.01.2017.
 */
public class TestReadyState extends BrowserFactory {

    public static ExpectedCondition pageLoaded(){
        return new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver input) {
                return ((JavascriptExecutor) driver()).executeScript("return document.readyState").equals("complete");
            }

            @Override
            public String toString() {
                return "Page is loading...";
            }
        };

    }

    @Test
    public void waitForPageReady(){
        WebDriverWait wait = new WebDriverWait(driver(), 30);
        driver().get("https://kismia.com");
        wait.until(pageLoaded());
    }
}
