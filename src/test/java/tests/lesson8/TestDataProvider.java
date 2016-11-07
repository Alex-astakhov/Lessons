package tests.lesson8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 24.10.2016.
 */
public class TestDataProvider {

    @DataProvider
    public Object[][] emails(){
        return new Object[][]{
                {"bdfbdf.com", "111"},
                {"bdfxfbdbdf.com", "222"},
                {"bddvdsdffbdf.com", "333"},
                {"bdbcbfbdf.com", "444"},
                {"bdfbgnbnbnfdf.com", "555"}
        };
    }

    @Test(dataProvider = "emails")
    public void emailValidate(String email, String pass){
        System.out.println(email);
        System.out.println(pass);
        System.out.println();
    }
}
