package tests.lesson8;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 24.10.2016.
 */
public class TestClassWithParam {

    @Test
    @Parameters({"email","password"})
    public void aTest(@Optional("haha") String email, @Optional("haha1") String password){
        System.out.println(email);
        System.out.println(password);
    }
}
