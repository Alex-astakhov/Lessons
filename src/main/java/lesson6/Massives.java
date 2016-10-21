package lesson6;

/**
 * Created by Alex Astakhov on 17.10.2016.
 */
public class Massives {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
