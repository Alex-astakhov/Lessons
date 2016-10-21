package lesson1.fb_vk_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alex Astakhov on 26.09.2016.
 */
public class Login {
    By vkLoginField = By.xpath(".//*[@id='index_email']");
    By vkPassField = By.xpath(".//*[@id='index_pass']");
    By vkEnterButton = By.xpath(".//*[@id='index_login_button']");
    String LoginText = "sasha-asta@ukr.net";
    String PassText = "aleksa85";

    By fbLoginField = By.xpath(".//*[@id='email']");
    By fbPassField = By.xpath(".//*[@id='pass']");
    By fbEnterButton = By.xpath(".//*[@id='u_0_l']");


    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 20);


    @BeforeTest
    public void init(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

    }

    @Test
    public void vkCheck(){
        driver.get("https://vk.com/");
        type(vkLoginField, LoginText);
        type(vkPassField, PassText);
        driver.findElement(vkEnterButton).click();
        wait.until(ExpectedConditions.urlContains("feed"));
        System.out.println(driver.getTitle());
    }

    @Test
    public void fbCheck(){
        driver.get("https://www.facebook.com/");
        type(fbLoginField, LoginText);
        type(fbPassField, PassText);
        driver.findElement(fbEnterButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='q']")));
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

    public void type(By by, String string){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(string);
    }
}
