package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 04.11.2016.
 */
public class ExceptionsExample {
    static WebDriver driver = new ChromeDriver();
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://kismia.com");
        try{
            driver.findElement(By.cssSelector(".alala"));
            System.out.println("Эта строка уже не выполнится");
        }catch (NoSuchElementException e){
            System.out.println("Нифига нет");
            e.printStackTrace();
        }

    }

    @Test
    public void example2(){
        int result;
        try {
            result = 4 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e1){}
        finally {
            System.out.println("Это выполнится в любом случае!");
        }
    }

    public int actionAfterReturn(int i){
        try {
            return i + 5;
        }
        finally {
            System.out.println("Этот код выполнится уже после команды return");
        }
    }

    @Test
    public void checkSearchResults() throws Exception {
        driver.get("https://google.com");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("Jack Sparrow");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#sblsbb")).click();
        Thread.sleep(3000);
        if (driver.findElements(By.cssSelector(".g h3")).size() > 8){
            throw new Exception("Jack is more then 8");
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
