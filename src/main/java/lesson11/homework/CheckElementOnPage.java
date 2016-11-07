package lesson11.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 05.11.2016.
 */
public class CheckElementOnPage {

    static By iosLink = By.cssSelector(".ios-link__text");
    static WebDriver driver;

    public static boolean elementPresence(By by){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        try{
            driver.findElement(by);
        }catch (NoSuchElementException e){
            return false;
        }
        finally {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        return true;
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://kismia.com/");
        System.out.println(elementPresence(iosLink));
        driver.quit();
    }
}
