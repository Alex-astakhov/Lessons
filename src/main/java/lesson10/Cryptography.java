package lesson10;

import org.apache.xpath.SourceTree;

import java.util.Scanner;

/**
 * Created by Alex Astakhov on 31.10.2016.
 */
public class Cryptography {
    static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";
    static String encode =   "qw8ertyui opasdfghj1k2lzxcvb5nmQW3ERTYUI9OPA4SDFGHJK6L0ZXCV7BNM";

    static String doEncode(String input){
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            int index = alphabet.indexOf(input.charAt(i));
            str.setCharAt(i, encode.charAt(index));
        }
        return str.toString();
    }

    static String doDecode(String input){
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            int index = encode.indexOf(input.charAt(i));
            str.setCharAt(i, alphabet.charAt(index));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some string:");
        String text = scanner.nextLine();
        System.out.println("1 - encode");
        System.out.println("2 - decode");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println(doEncode(text));
                break;
            case 2:
                System.out.println(doDecode(text));
                break;
            default:
                return;
        }
    }
}
