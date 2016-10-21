package lesson4;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class MinMax {
    public static void main(String[] args) {
        int ar[] = {2, 3, -1, 6, 6, 6, 7, 8, 9, 0, 1111};
        int max = ar[0], min = ar[0];
        for (int i: ar){
            if (max < i)
                max = i;
            if (min > i)
                min = i;
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
