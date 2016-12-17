package lesson15;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.IOException;

/**
 * Created by Alex Astakhov on 21.11.2016.
 */
public class User {
    public String email;
    public String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString(){
        return "Email: " + email + ", password: " + password;
    }


}
