package lesson4;

import java.util.Arrays;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class Massives {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        char c[] = {'a', 'b', 'c'};
        boolean b[] = {true, true, false};
        String str = "aa|||bb|||cc";
        String[] arr = str.split("|||");
        System.out.println(Arrays.toString(arr));
    }
}
