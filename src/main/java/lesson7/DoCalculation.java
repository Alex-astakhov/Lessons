package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex Astakhov on 21.10.2016.
 */
public class DoCalculation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter yout expression: ");
        String input = reader.readLine();
        Calculation calculation = new Calculation();
        System.out.println("Result: ");
        calculation.exec(input.replace(" ", ""));
    }
}
