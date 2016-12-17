package tests.lesson17;

import lesson17.TryAllurePage;
import lesson6.User;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 28.11.2016.
 */
public class TryAllure {
    User user = new User();
    @Test
    public void testAllure(){
        TryAllurePage tryAllurePage = new TryAllurePage();
        tryAllurePage.step1();
        tryAllurePage.ste2();
        tryAllurePage.ste3();
        tryAllurePage.login("Alex", "myPass");
        tryAllurePage.registration(user);
    }
}
