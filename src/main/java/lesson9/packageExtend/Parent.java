package lesson9.packageExtend;

/**
 * Created by Alex Astakhov on 28.10.2016.
 */
public class Parent {
    public String name = "Domatin";
    public String birthday = "10.02.1950";

    public Parent(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void makeSomeNoise(){
        System.out.println("FUUUUU");
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }

}
