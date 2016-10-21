package lesson4;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class IncremDecrem {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("Original a value = " + a);
        System.out.println("Post-increment = " + a++);
        System.out.println("After post-increment = " + a);
        System.out.println("Pre-increment = " + ++a);
        System.out.println("After pre-increment = " + a);
    }
}
