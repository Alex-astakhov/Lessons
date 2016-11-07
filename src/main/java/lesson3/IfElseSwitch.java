package lesson3;

/**
 * Created by Alex Astakhov on 03.10.2016.
 */
public class IfElseSwitch {
    public static void main(String[] args) {
        boolean b = true;
        if (b){
            System.out.println("b - истина");
        }

        if (b){
            System.out.println("b - истина");
        }else{
            System.out.println("b - ложь");
        }

        int x = 1;
        int y = 2;
        System.out.println(x == y ? " равны" : "неравны"); // сокращенный  if-otherPack

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("Цикл прерван!");


    }

    void logicExpressions(){
        int a = 4;
        int b = 5;
        boolean result;

        result = a == b;
        result = a != b;
        result = a < b;
        result = a > b;
        result = a <=b;
        result = a >=b;
        result = a > b || a < b;
        result = a > b && a < b;
        result = !result;
    }

    void stringEquals(){
        String str1 = new String("Привет");
        String str2 = new String("Привет");
        String sameStr = str1;
        boolean b1 = str1 == str2;
        boolean b2 = str1.equals(str2);
        boolean b3 = str1 == sameStr;
    }
}
