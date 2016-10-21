package lesson6.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex Astakhov on 19.10.2016.
 */
public class Homework {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static void task1() throws IOException {
        System.out.print("Input some string: ");
        String input = reader.readLine();
        System.out.println(input.replace(" ", ""));

    }

    static void task2() throws IOException {
        System.out.print("Input some string: ");
        String input = reader.readLine();
        if (input.contains("new")){
            System.out.println(input.substring(input.indexOf("new") + 3));
        }
    }

    static void task3() throws IOException {
        System.out.print("Enter some numbers: ");
        try {
            String[] input = reader.readLine().replace(" ", "").split(",");
            int sum = 0;
            for (String s: input){
                sum += Integer.parseInt(s);
            }
            System.out.println("Sum = " + sum);
        }catch (NumberFormatException e){
            System.out.println("Incorrect input!");
        }
    }

    static void task4() throws IOException {
        System.out.print("Введите строку: ");
        String str1 = reader.readLine();
        System.out.println("Выберите действие:");
        System.out.println("1 - Сравнить строки на равенство.");
        System.out.println("2 - Сравнить строки без учета регистра.");
        System.out.println("3 - Сравнить строки без учета пробелов между буквами/словами.");
        String choice = reader.readLine();
        System.out.print("Введите строку для сравнения: ");
        String str2 = reader.readLine();

        switch (choice){
            case "1":
                if (str1.equals(str2))
                    System.out.println("Строки равны!");
                else
                    System.out.println("Строки не равны!");
                break;
            case "2":
                if (str1.compareToIgnoreCase(str2) == 0)
                    System.out.println("Строки без учета регистра равны!");
                else
                    System.out.println("Строки без учета регистра не равны!");
                break;
            case "3":
                if (str1.replace(" ", "").equals(str2.replace(" ", "")))
                    System.out.println("Строки без учета пробелов равны!");
                else
                    System.out.println("Строки без учета пробелов не равны!");
        }
    }

    public static void main(String[] args) throws IOException {
        //task1();
        //task2();
        //task3();
        task4();
    }
}
