package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 03.10.2016.
 */
public class Homework {

    // 1. Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.
    public static int task1(int a, int b, int c, int d){
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }

    // 2. Вывести на консоль сумму максимальных чисел среди этих четырех.
    public static int task2(int a, int b, int c, int d){
        return a + b + c + d - task1(a, b, c, d);
    }

    // 3. Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
    public static void task3(int a, int b, int c, int d, int e){
        int[] mas = {a, b, c, d, e};
        Arrays.sort(mas);
        System.out.println("Наименьшее: " + mas[0]);
        System.out.println("Наибольшее: " + mas[4]);
    }

    // 4. Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
    public static void task4(String name1, String name2){
        if (name1.equals(name2)){
            System.out.println("Они тезки!");
        }
    }

    // 5. Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        public static void task5(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер месяца: ");
            int m = scanner.nextInt();
            switch (m){
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Нет такого месяца!");
            }
        }

    // 6. Вывести на консоль сумму всех чисел среди этих четырех без найменьшего числа.
    // (пример: ввели 4, 1 , 3, 2 , сумма чисел (2 + 3 +4 = 9))
    public static void task6(int a, int b, int c, int d){
        System.out.println(a + b + c + d - task1(a, b, c, d));
    }

    // 7. Написать программу: вводите в консоль название месяца на английском языке,
    // а в ответ выводит числовое значение месяца. (пример -  ввод: “June” вывод: “номер месяца June = 6”
    public static void task7(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца с большой буквы: ");
        String m = scanner.nextLine();
        switch (m){
            case "January":
                System.out.println("номер месяца " + m + " = " + 1);
                break;
            case "February":
                System.out.println("номер месяца " + m + " = " + 2);
                break;
            case "March":
                System.out.println("номер месяца " + m + " = " + 3);
                break;
            case "April":
                System.out.println("номер месяца " + m + " = " + 4);
                break;
            case "May":
                System.out.println("номер месяца " + m + " = " + 5);
                break;
            case "June":
                System.out.println("номер месяца " + m + " = " + 6);
                break;
            case "July":
                System.out.println("номер месяца " + m + " = " + 7);
                break;
            case "August":
                System.out.println("номер месяца " + m + " = " + 8);
                break;
            case "September":
                System.out.println("номер месяца " + m + " = " + 9);
                break;
            case "October":
                System.out.println("номер месяца " + m + " = " + 10);
                break;
            case "November":
                System.out.println("номер месяца " + m + " = " + 11);
                break;
            case "December":
                System.out.println("номер месяца " + m + " = " + 12);
                break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    // 8. Вывести на экран (с помощью циклов) таблицу умножения 10*10.
    public static void task8(){
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    // 9. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    public static void task9(){
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i + " ");
        }
    }

    // 10. Дано число n при помощи цикла for посчитать факториал n!
    public static void task10(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! = " + result);
    }

    // 11. Перепишите программы с использованием цикла while.
    public static void task11(){
        int i = 1;
        int j = 1;
        while (i < 11){
            while (j < 11){
                System.out.print((i * j) + " ");
                j++;
            }
            i++;
            j = 1;
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int result = 1;
        i = 2;
        while (i <= n){
            result *= i;
            i++;
        }
        System.out.println(n + "! = " + result);
    }


    public static void main(String[] args) {
        //System.out.println(task1(4,5,7,9));
        //System.out.println(task2(4, 5, 7, 9));
        //task3(54, 76, 22, 77, 34);
        //task4("Vasia", "Vasia");
        //task5();
        //task6(5, 3, 7, 5);
        //task7();
        //task8();
        //task9();
        //task10();
        task11();
    }
}
