package lesson10;

/**
 * Created by Alex Astakhov on 31.10.2016.
 */
public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        int count = 100000;
        for (int i = 0; i < count; i++) {
            output.append("Some text ");
        }
        System.out.println(output);
        char[] charArray = {'a', 'b', 'c', 'd'};
        StringBuilder builder = new StringBuilder();
        for (char value: charArray){
            builder.append(value);
        }
    }
}
