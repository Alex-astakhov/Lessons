package tests.multiplyBrowsers;

import org.testng.annotations.Test;
import testMultiplyBrowsers.BrowserFactory;

/**
 * Created by Alex Astakhov on 23.01.2017.
 */
public class TryMultiplyBrowsers2 extends BrowserFactory {

    @Test
    public void google() throws InterruptedException {
        driver().get("https://google.com");
        Thread.sleep(10000);
        driver().get("http://rabota.nur.kz");
    }



}
