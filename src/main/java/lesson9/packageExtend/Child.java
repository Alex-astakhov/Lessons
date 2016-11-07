package lesson9.packageExtend;

/**
 * Created by Alex Astakhov on 28.10.2016.
 */
public class Child extends Parent {

    public Child(String name, String birthday) {
        super(name, birthday);
    }

    @Override
    public void makeSomeNoise(){
        super.makeSomeNoise();
        System.out.println("alalala");
    }

    public void peeee(){
        System.out.println("peeee");
    }
}
