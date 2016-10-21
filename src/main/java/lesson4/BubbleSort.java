package lesson4;

import java.util.Arrays;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5, 7, 2, 76, 4, 7, 3, 5, 6, 42, 10};
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < (ar.length - 1); i++) {
                if (ar[i] > ar[i+1]) {
                    swap = true;
                    int m = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = m;
                }
            }
        }while (swap);
        System.out.println(Arrays.toString(ar));
    }
}
