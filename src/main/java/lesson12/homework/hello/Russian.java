package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class Russian extends Human {

    public Russian(String name) {
        super(name);
    }

    @Override
    public void sayHellow() {
        System.out.println("Привет! Я " + super.name);
    }
}
