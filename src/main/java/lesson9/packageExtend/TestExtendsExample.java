package lesson9.packageExtend;

import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 28.10.2016.
 */
public class TestExtendsExample {

    @Test
    public void tryExtends(){
        Parent parent = new Parent("Федя", "21.06.1965");
        Child child = new Child("Саша", "15.07.1979");
        parent.makeSomeNoise();
        System.out.println();
        child.makeSomeNoise();

    }

    @Test
    public void tryExtends2(){
        Parent parent1 = new Child("Саша", "15.07.1979");
        parent1.makeSomeNoise();
    }
}
