package lesson4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 08.10.2016.
 */
public class Tasks {
    public static Scanner scanner = new Scanner(System.in);
    // 1. Создайте массив, содержащий 10 первых нечетных чисел.
    // Выведете элементы массива на консоль в одну строку, разделяя запятой.
    public static void task1(){
        int[] mas = new int[10];
        int n = 1;
        for (int i = 0; i < 10; i++) {
            mas[i] = n;
            n += 2;
        }
        System.out.println(Arrays.toString(mas));
    }

    // 2. Дан массив размерности N,  найти наименьший элемент массива и вывести на консоль
    // (если наименьших элементов несколько — вывести их все).
    public static void task2(){
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        int min = mas[0];
        System.out.print("Минимальные элементы: " + min);
        for (int i = 1; i < n-1; i++) {
            if (min == mas[i])
                System.out.print(", " + mas[i]);
        }
    }

    // 3. В массиве из задания 2. найти наибольший элемент.
    public static void task3(){
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        Random random = new Random();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        int max = mas[n-1];
        System.out.print("Максимальные элементы: " + max);
        for (int i = n-2; i > 0; i--) {
            if (max == mas[i])
                System.out.print(", " + mas[i]);
        }
    }

    // 4. Поменять наибольший и наименьший элементы массива местами.
    // Пример: дан массив {4, -5, 0, 6, 8}.  После замены будет выглядеть {4, 8, 0, 6, -5}.
    public static void task4(int[] mas){
        System.out.println(Arrays.toString(mas));
        int min = mas[0];
        int max = mas[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
                minIndex = i;
            }
            if (max < mas[i]) {
                max = mas[i];
                maxIndex = i;
            }
        }
            System.out.println("Min = " + min + ", Max = " + max);
            int temp = mas[minIndex];
            mas[minIndex] = mas[maxIndex];
            mas[maxIndex] = temp;
            System.out.println(Arrays.toString(mas));
    }

    // 5. Найти среднее арифметическое всех элементов массива.
    public static void task5(int[] mas){
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Среднее арифметическое = " + sum / (double) mas.length);
    }

    // 6. Delete not alphabetical symbols from char array
    public static void task6(char[] charArray){
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (((int) charArray[i] >= 65) && ((int) charArray[i] <= 1103))
                newCharArray[i] = charArray[i];
        }
        System.out.println(Arrays.toString(newCharArray));
    }

    // 7. Написать 4х мерный массив размерности 10, 10, 10, 10 заполнить его числами по возростанию
    // и вывести его в консоль. (пример массив 2, 2, 2):
    public static void task7(){
        int n = 0;
        int[][][][] mas = new int[10][10][10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        mas[i][j][k][l] = n++;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(Arrays.toString(mas[i][j][k]));
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // 8. Написать программу для транслитерации. Пример: вы вводите в консоль слово на русском “Привет”,
    // вам программа выводит: “Privet” (Данную программу делать с помощью 2х массивов с символами)
    public static void task8() throws IOException {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'К',
                'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        char[] eng = {'a', 'b', 'v', 'g', 'd', 'e', 'e', 'j', 'z', 'i', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'f',
                'h', 'c', '4', 'w', 'w', '\'', 'y', '\'', 'e', 'u', '6', 'A', 'B', 'V', 'G', 'D', 'E', 'E', 'J', 'Z', 'I', 'K',
                'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'F', 'H', 'C', '4', 'W', 'W', '\'', 'Y', '\'', 'E', 'U', '6'};

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String input = buf.readLine();
        char c = input.toCharArray()[0];
        boolean isRussian = false;
        for (int i = 0; i < rus.length; i++) {
            if (c == rus[i])
                isRussian = true;
        }
        char[] charArray = input.toCharArray();
        char[] trans = new char[input.length()];
        int count = 0;
        boolean swapped;
        if (isRussian){
            for (char ch: charArray){
                swapped = false;
                for (int i = 0; i < rus.length; i++) {
                    if (ch == rus[i]){
                        trans[count] = eng[i];
                        swapped = true;
                        break;
                    }
                }
                if (!swapped)
                    trans[count] = ch;
                count++;
            }
        }
        else {
            for (char ch: charArray){
                swapped = false;
                for (int i = 0; i < eng.length; i++) {
                    if (ch == eng[i]){
                        trans[count] = rus[i];
                        swapped = true;
                        break;
                    }
                }
                if (!swapped)
                    trans[count] = ch;
                count++;
            }
        }
        for (char ch: trans){
            System.out.print(ch);
        }

    }



    public static void main(String[] args) throws IOException {
        //task1();
        //task2();
        //task3();
        int[] intArray = {645,234,240,767,322,87};
        //task4(intArray);
        //task5(intArray);
        char[] charArray = {'2', 'a', 'A', '1', 'Я', 'я'};
        //task6(charArray);
        //task7();
        task8();
    }
}
