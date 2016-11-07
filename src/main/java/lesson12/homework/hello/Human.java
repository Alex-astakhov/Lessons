package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public abstract class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void sayHellow();
}
