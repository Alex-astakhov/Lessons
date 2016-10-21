package lesson3.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 04.10.2016.
 */
public class AdditionalHW {
    static Scanner scanner = new Scanner(System.in);
    // 1.  Написать программу которая считает 4 числа c клавиатуры и выведет на экран самое большое из них.
    public static void task1(){
        int[] mas = new int[4];
        System.out.println("Введите поочереди четыре числа:");
        for (int i = 0; i < 4; i++) {
            mas[i] = scanner.nextInt();
        }
        Arrays.sort(mas);
        System.out.println("Наибольшее число: " + mas[3]);
    }

    // 2. Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
    // На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры, и выведет на экран на каком этаже,
    // какого подъезда расположенна эта квартира. Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю.
    public static void task2(){
        System.out.print("Введите номер квартиры: ");
        int n = scanner.nextInt();
        if (n < 1 || n > 144){
            System.out.println("Такой квартиры в доме нет!");
            return;
        }
        int door = (int) Math.ceil(n / 36d);
        int floor = (int) Math.ceil(n / 4d) - 9 * (door - 1);
        System.out.println("Этаж: " + floor + ", подъезд: " + door);
    }

    /* 3. С помощью циклов нарисовать  «обои». Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
        ***+++***+++***+++***
        ***+++***+++***+++***
        ***+++***+++***+++***
        ***+++***+++***+++***
        ***+++***+++***+++***
    */
    public static void task3(){
        System.out.print("Введите кол-во полос для обоев: ");
        boolean b = true;
        int lines = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < lines; j++) {
                for (int k = 0; k < 3; k++) {
                    if (b)
                        System.out.print('*');
                    else
                        System.out.print('+');
                }
                b = !b;
            }
            System.out.println();
        }
    }

    // 4. Уже было.

    // 5. Есть круг с центром в начале координат и радиусом 4.
    // Пользователь вводит с клавиатуры координаты точки x и y.
    // Написать программу которая определит лежит ли эта точка внутри круга или нет.
    public static void task5(){
        System.out.print("Введите координату X: ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату Y: ");
        double y = scanner.nextDouble();
        boolean check = (x*x + y*y) <= 16; // если расстояние до центра меньше радиуса
        if (check)
            System.out.println("Точка находится в круге");
        else
            System.out.println("Точка не находится в круге");
    }

    // 6. Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1).
    // Пользователь вводит с клавиатуры координаты точки x и y.
    // Написать программу которая определит лежит ли эта точка внутри треугольника или нет.

    public static void task6(){
        double ab = line(0, 0, 4, 4);
        double ac = line(0, 0, 6, 1);
        double bc = line(4, 4, 6, 1);
        double abc = triangleArea(ab, ac, bc);

        System.out.print("Введите координату X: ");
        double x = scanner.nextDouble();
        System.out.print("Введите координату Y: ");
        double y = scanner.nextDouble();
        double abp = triangleArea(ab, line(4, 4, x, y), line(0, 0, x, y));
        double acp = triangleArea(ac, line(6, 1, x, y), line(0, 0, x, y));
        double bcp = triangleArea(bc, line(4, 4, x, y), line(6, 1, x, y));
        if (Math.abs((abp + acp + bcp) - (abc)) < 0.0001)
            System.out.println("Точка находится в треугольнике");
        else
            System.out.println("Точка не находится в треугольнике");
    }

    public static double line(double x1, double y1, double x2, double y2){  // длина сторны между двумя точками
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    public static double triangleArea(double a, double b, double c){// определение площади треугольника по формуле Герона
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /* 7. С помощью цикла (только одного) нарисовать такую фигуру.
    Причем максимальная высота этой фигуры вводиться с клавиатуры (в примере максимальная высота - 4)
    *
    **
    ***
    ****
    ***
    **
    *
        */
    public static void task7(){
        System.out.print("Введите выстоу фигуры: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height*2-1; i++) {
            int h = height - Math.abs(i - height);
                System.out.println(StringUtils.rightPad("", h, '*'));
        }
    }

    // 4. С помощью циклов вывести на экран все простые числа от 1 до 100.
    // Простое число — число которое делиться нацело только на единицу или само на себя.
    // Первые простые числа это — 2,3,5,7...
    public static void task8(){
        for (int i = 2; i <= 100; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    simple = false;
            }
            if (simple)
                System.out.print(i +" ");
        }
    }



    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task5();
        task6();
        //task7();
        //task8();
    }
}
