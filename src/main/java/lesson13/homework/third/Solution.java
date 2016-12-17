package lesson13.homework.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 12.11.2016.
 */
/* Минимальное из n чисел
1. Ввести с клавиатуры число n.
2. Считать n целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        int min;
        if (!list.isEmpty()){
            min = list.get(0);
            for (int i: list) {
                if (i < min)
                    min = i;
            }
            return min;
        }
        return 0;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n: ");
        int n = Integer.parseInt(reader.readLine());
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intList.add(Integer.parseInt(reader.readLine()));
        }
        return intList;
    }
}
