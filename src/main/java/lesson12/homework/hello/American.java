package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class American extends Human {

    public American(String name) {
        super(name);
    }

    @Override
    public void sayHellow() {
        System.out.println("Hello! I'm " + super.name);
    }
}
