package tests.lesson8;

import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 24.10.2016.
 */
public class TestNgTestClass {

    @Test(priority = 3)
    public void aTest(){
        System.out.println("aTest");
    }

    @Test(priority = 2, expectedExceptions = NullPointerException.class)
    public void bTest(){
        System.out.println("bTest");
        NullPointerException e = new NullPointerException();
        throw e;
    }

    @Test(priority = 1, invocationCount = 1)
    public void cTest(){
        System.out.println("cTest");
    }

    @Test(dependsOnMethods = "bTest")
    public void dTest(){
        System.out.println("dTest");
    }



}
