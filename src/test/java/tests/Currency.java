package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 30.09.2016.
 */
public class Currency {

    @Test
    public void getCurrency(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("http://minfin.com.ua/");
        String oil = driver.findElement(By.xpath("(//*[@class='mf-currency-ask'])[3]")).getText();
        oil = oil.replace("$", "");
        float f = Float.parseFloat(oil);
        System.out.println("Oil " + f);
        driver.quit();
    }
}
