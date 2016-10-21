package lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Astakhov on 03.10.2016.
 */
public class Cycles {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.print(i + " ");
        }

        for (int s = 10; s >= -11; s--) {
            System.out.print(s + " ");
        }

        List<String> names = new ArrayList<String>();
        names.add("Петя");
        names.add("Коля");
        for (String name: names){
            System.out.println(name);
        }

        int i = 1;
        while (i < 5){
            System.out.print(i + " ");
            i++;
        }

        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while (i < 5);

    }
}
