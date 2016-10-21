package lesson2.homework;

import java.util.Scanner;

/**
 * Created by Alex Astakhov on 30.09.2016.
 */
public class FromArticle {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    /* 1. В переменных q и w хранятся два натуральных числа. Создайте программу,
    выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):
      21 / 8 = 2 и 5 в остатке
     */
    private static void task1(){
        int a, b;
        System.out.println("Введите делимое:");
        a = scanner.nextInt();
        System.out.println("Введите делитель:");
        b = scanner.nextInt();
        System.out.println(a + " / " + b + " = " + (a / b) + " и " + (a % b) + " в остатке");
    }

    /* 2. В переменной n хранится натуральное двузначное число. Создайте программу,
    вычисляющую и выводящую на экран сумму цифр числа n.
     */
    private static void task2(){
        System.out.println("Введите двузначное число:");
        int num = scanner.nextInt();
        System.out.println("Сумма цифр: " + ((num / 10) + (num % 10)));
    }

    /* 3. В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */
    private static void task3(){
        System.out.println("Введите вещественное число:");
        String input = scanner.nextLine();
        double inputNum = Double.parseDouble(input.replace(',','.'));
        System.out.println(Math.round(inputNum));
    }

    /* 4. В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
    */
    private static void task4(){
        System.out.println("Введите трехзначное число:");
        int num = scanner.nextInt();
        System.out.println("Сумма цифр: " + ((num / 100) + ((num / 10) % 10) + (num % 10)));
    }
}
