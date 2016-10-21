package lesson4;

/**
 * Created by Alex Astakhov on 07.10.2016.
 */
public class MassivesCycle {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(intArray[i]);
        }

        for (int i: intArray){           // for-each
            System.out.println(i);
        }

    }
}
