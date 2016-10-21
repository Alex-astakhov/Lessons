package lesson6;


/**
 * Created by Alex Astakhov on 17.10.2016.
 */
public class StringExample {
    public static void main(String[] args) {
        String stringToDisplay = "";
        char[] charArray = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < charArray.length; i++) {
            stringToDisplay += charArray[i];
        }
        System.out.println(stringToDisplay);

        stringToDisplay = stringToDisplay.replace('c', 'C');
        System.out.println(stringToDisplay);
        stringToDisplay = "            " + stringToDisplay;
        System.out.println(stringToDisplay);
        stringToDisplay = stringToDisplay.trim();
        System.out.println(stringToDisplay);

        double d = 1000.01;
        stringToDisplay = String.valueOf(d);
        long l = 225645466;
        stringToDisplay = String.valueOf(l);

        String str1 = "abc";
        String str2 = "cba";
        System.out.println(str1.compareTo(str2));
    }

}
