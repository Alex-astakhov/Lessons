package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Ukrainian extends Human {

    public Ukrainian(String name) {
        super(name);
    }

    @Override
    public void sayHellow() {
        System.out.println("Здоровеньки були! Я " + super.name);
    }
}
