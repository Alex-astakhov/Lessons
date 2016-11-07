package lesson12.homework.hello;

/**
 * Created by Alex Astakhov on 07.11.2016.
 */
public class SayHello {
    public static void main(String[] args) {
        American american = new American("Jack");
        Franchman franchman = new Franchman("Jean");
        Russian russian = new Russian("Иван");
        Ukrainian ukrainian = new Ukrainian("Петро");

        american.sayHellow();
        franchman.sayHellow();
        russian.sayHellow();
        ukrainian.sayHellow();
    }
}
