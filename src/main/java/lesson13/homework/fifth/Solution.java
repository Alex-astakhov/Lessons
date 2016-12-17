package lesson13.homework.fifth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Alex Astakhov on 12.11.2016.
 */
/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        List<Integer> wordIndexes = new ArrayList<>();
        List<Integer> numIndexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i]))
                numIndexes.add(i);
            else
                wordIndexes.add(i);
        }

        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 1; i < numIndexes.size(); i++) {
                if (Integer.parseInt(array[numIndexes.get(i-1)]) > Integer.parseInt(array[numIndexes.get(i)])){
                    String s = array[numIndexes.get(i)];
                    array[numIndexes.get(i)] = array[numIndexes.get(i-1)];
                    array[numIndexes.get(i-1)] = s;
                    swap = true;
                }
            }
        }
        swap = true;
        while (swap){
            swap = false;
            for (int i = 1; i < wordIndexes.size(); i++) {
                if (isGreaterThan(array[wordIndexes.get(i-1)], array[wordIndexes.get(i)])){
                    String s = array[wordIndexes.get(i)];
                    array[wordIndexes.get(i)] = array[wordIndexes.get(i-1)];
                    array[wordIndexes.get(i-1)] = s;
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


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}