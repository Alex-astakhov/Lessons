package tests.multiplyBrowsers;

import org.testng.annotations.Test;
import testMultiplyBrowsers.BrowserFactory;

/**
 * Created by Alex Astakhov on 23.01.2017.
 */
public class TryMultiplyBrowsers1 extends BrowserFactory {

    @Test
    public void kismia() throws InterruptedException {
        driver().get("https://kismia.com");
        Thread.sleep(7000);
        driver().get("http://rabota.nur.kz");
    }


}
