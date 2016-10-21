package lesson4.homework;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 08.10.2016.
 */
public class ConsoleGame {

    public static void main(String[] args) {
        System.out.print("Введите число от 0 до 100: ");
        Scanner scanner = new Scanner(System.in);
        int userNum;
        boolean correct = false;
        do {
            System.out.print("Введите число от 0 до 100: ");
            try {
                userNum = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ошибка ввода");
                return;
            }
            if (userNum >= 0 && userNum <= 100){
                correct = true;
            }
            else
                System.out.println("Вы ввели некорректное число!");
        }while (!correct);

        Random random = new Random();
        int systemNum = random.nextInt(101);
        int computerNum = random.nextInt(101);

        if(Math.abs(userNum - systemNum) < Math.abs(computerNum - systemNum)){
            System.out.println("Результат: победил Игрок! ");
        }
        if(Math.abs(userNum - systemNum) > Math.abs(computerNum - systemNum)){
            System.out.println("Результат: победил Компьютер! ");
        }
        if(Math.abs(userNum - systemNum) == Math.abs(computerNum - systemNum)){
            System.out.println("Ничья! ");
        }
        System.out.println("Программа = " + systemNum + ", Игрок = " + userNum + ", Компьютер = " + computerNum);
    }
}
