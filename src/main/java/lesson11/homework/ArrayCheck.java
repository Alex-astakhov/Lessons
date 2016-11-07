package lesson11.homework;

import netscape.security.ForbiddenTargetException;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 05.11.2016.
 */
public class ArrayCheck {

    static int[] intArray = new int[10];

    static void arrayInit(){
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
    }

    static int getIntFromArray(int index) throws ForbiddenTargetException{
        if (index == 7){
            throw new ForbiddenTargetException("Число 7 запрещенно");
        }
        try{
            return intArray[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Неверный индекс!");
        }
        return -1;
    }

    public static void main(String[] args) {
        arrayInit();
        System.out.print("Введите индекс массива: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println(getIntFromArray(index));
    }
}
