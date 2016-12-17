package lesson13.homework.second;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Astakhov on 12.11.2016.
 */

/*
Задача: Вводить с клавиатуры строки до тех пор пока не будет введена пустая строка, после чего вывести строки в отсортированном порядке (алфавитном)
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        String input = reader.readLine();
        while (!input.isEmpty()){
            list.add(input);
            input = reader.readLine();
        }

        sort(list); //метод для сортировки списка

        for (String s: list) {
            System.out.println(s);
        }
    }

    public static void sort(List<String> list) {
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 1; i < list.size(); i++) {
                if (isGreaterThan(list.get(i - 1), list.get(i))){
                    String s = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, s);
                    swap = true;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
