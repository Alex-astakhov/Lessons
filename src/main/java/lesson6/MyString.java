package lesson6;

/**
 * Created by Alex Astakhov on 17.10.2016.
 */
public class MyString {
    public static void main(String[] args) {
        String myString = "JACK";
        myString.concat(" SPARROW");
        System.out.println(myString);

        myString = myString.concat(" SPARROW");
        System.out.println(myString);
    }
}
