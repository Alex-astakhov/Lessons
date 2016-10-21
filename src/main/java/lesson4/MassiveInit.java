package lesson4;


import java.util.Arrays;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class MassiveInit {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] intArray = new int[5];
        byte byteArray[] = new byte[5];
        char[] charArray = new char[SIZE];
        double[] doubleArray = {1.2, 4.2, -0,5};
        System.out.println(Arrays.toString(doubleArray));
        charArray[0] = 'a';
        charArray[1] = 'b';
        System.out.println(charArray);
    }
}
