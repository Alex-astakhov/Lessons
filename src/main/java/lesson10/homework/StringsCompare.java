package lesson10.homework;

/**
 * Created by Alex Astakhov on 01.11.2016.
 */
public class StringsCompare {

    static void testString(){
        String res = "text";
        for (int i = 0; i < 100000; i++) {
            res += "text";
        }
    }

    static void testStringBuffer(){
        StringBuffer buffer = new StringBuffer("test");
        for (int i = 0; i < 100000; i++) {
            buffer.append("test");
        }
    }

    static void testStringBuilder(){
        StringBuilder builder = new StringBuilder("test");
        for (int i = 0; i < 100000; i++) {
            builder.append("test");
        }
    }

    public static void main(String[] args) {
        long start, stop;
        System.out.println("Test StringBuffer...");
        start = System.currentTimeMillis();
        testStringBuffer();
        stop = System.currentTimeMillis();
        System.out.println("Estimated time: " + (stop - start) + " millis");
        System.out.println("Test StringBuilder...");
        start = System.currentTimeMillis();
        testStringBuilder();
        stop = System.currentTimeMillis();
        System.out.println("Estimated time: " + (stop - start) + " millis");
        System.out.println("Test String...");
        start = System.currentTimeMillis();
        testString();
        stop = System.currentTimeMillis();
        System.out.println("Estimated time: " + (stop - start) + " millis");
    }
}
