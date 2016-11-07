package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Franchman extends Human {

    public Franchman(String name) {
        super(name);
    }

    @Override
    public void sayHellow() {
        System.out.println("Salut! I " + super.name);
    }
}
