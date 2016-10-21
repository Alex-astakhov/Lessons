package lesson2.homework;

import java.util.Scanner;

/**
 * Created by Alex Astakhov on 30.09.2016.
 */
public class ConvertVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Считывание из консоли int - переобразование в символ. Вывести на экран соответствующий символ.
        System.out.println("Введите int:");
        String input = scanner.nextLine();
        int i = Integer.parseInt(input);
        char c = (char) i;
        System.out.println(c);

        // 2. Считывание из консоли float - переобразование в символ. Вывод на экран
        System.out.println("Введите float:");
        input = scanner.nextLine();
        float f = Float.parseFloat(input.replace(',','.'));
        c = (char) f;
        System.out.println(c);

        // 3. Считывание из конслои float - Переобразование в char и int - Вывести на экран int.
        System.out.println("Введите float:");
        input = scanner.nextLine();
        f = Float.parseFloat(input.replace(',','.'));
        c = (char) f;
        i = c;
        System.out.println(i);

    }
}
