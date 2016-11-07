package tests.lesson8;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 27.10.2016.
 */
public class Homework8 {

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test
    public void test4(){
        System.out.println("test4");
    }

    @Test(parameters = {"param"})
    public void test5(@Optional("xxx") String param){
        System.out.println("test5, param = " + param);
    }
}
