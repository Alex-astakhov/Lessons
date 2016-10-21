package lesson3;

/**
 * Created by Alex Astakhov on 03.10.2016.
 */
public class Methods {
    public static void foo(){
        // Тело метода
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(5.2, 5.5));
    }


}
