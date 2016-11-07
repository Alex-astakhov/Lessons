package lesson9;

import lesson9.otherPack.Incapsulation;

/**
 * Created by Alex Astakhov on 28.10.2016.
 */
public class TestIncapsulation extends Incapsulation {

    int ddd = prot;

    public static void main(String[] args) {
        Incapsulation inc = new Incapsulation();

       //inc.def = false;

        inc.pub = "";
    }
}
