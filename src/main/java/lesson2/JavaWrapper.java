package lesson2;

/**
 * Created by Alex Astakhov on 30.09.2016.
 */
public class JavaWrapper {
    public static void main(String[] args){
        String str = "43525";
        int i = Integer.parseInt(str);
        System.out.println(str + i);

        String strInt = Integer.toString(i);
    }
}
