package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex Astakhov on 17.10.2016.
 */
public class Polindrom {
    public static boolean isPolindrom(String input){
        String reverse ="";
        input = input.replace(" ", "").toLowerCase();
        char[] arr = input.toCharArray();
        for (int i = arr.length -1; i >= 0; i--) {
            reverse += arr[i];
        }
        return input.equals(reverse);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (isPolindrom(input)){
            System.out.println("Это полиндром");
        }
        else{
            System.out.println("Это не полиндром");
        }
    }
}
