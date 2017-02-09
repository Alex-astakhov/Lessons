package tests.multiplyBrowsers;

import org.testng.annotations.Test;
import testMultiplyBrowsers.BrowserFactory;

/**
 * Created by Alex Astakhov on 23.01.2017.
 */
public class TryMultiplyBrowsers3 extends BrowserFactory {

    @Test
    public void facebook() throws InterruptedException {
        driver().get("https://facebook.com");
        Thread.sleep(5000);
        driver().get("http://rabota.nur.kz");
    }

}
