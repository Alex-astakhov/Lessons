package tests.serialize;

import org.testng.annotations.Test;

/**
 * Created by Asta on 10.02.2017.
 */
public class TestSerial {

    @Test
    public void test1(){
        DataStorage dataStorage = new DataStorage();
        dataStorage.testName = "name1";
        dataStorage.userName = "Jack";
        dataStorage.userAge = 10;
    }
}
