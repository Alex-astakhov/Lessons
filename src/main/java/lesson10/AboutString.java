package lesson10;

/**
 * Created by Alex Astakhov on 31.10.2016.
 */
public class AboutString {
    public static void main(String[] args) {
        String output = "Some text";
        int count = 100000;
        for (int i = 0; i < count; i++) {
            output = output + " Some text ";
        }
        System.out.println(output);
    }


}
