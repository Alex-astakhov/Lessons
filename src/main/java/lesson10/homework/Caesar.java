package lesson10.homework;

import java.util.Scanner;

/**
 * Created by Alex Astakhov on 01.11.2016.
 */
public class Caesar {
    static final char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
            'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', ',', ';', ' ', ':', '!', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'К', 'Л', 'М',
            'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};



    static String encode(String text, int step){
        char[] encoding = text.toCharArray();
        for (int i = 0; i < encoding.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (encoding[i] == alphabet[j]){
                    int index = Math.abs((j + step) % alphabet.length);
                    encoding[i] = alphabet[index];
                    break;
                }
            }
        }
        String result = "";
        for (char c: encoding){
            result += c;
        }
        return result;
    }

    static String decode(String text, int step){
        char[] decoding = text.toCharArray();
        for (int i = 0; i < decoding.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (decoding[i] == alphabet[j]){
                    int index = j - step;
                    if (index < 0)
                        index = alphabet.length - Math.abs(index);
                    decoding[i] = alphabet[index];
                    break;
                }
            }
        }
        String result = "";
        for (char c: decoding){
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String text = scanner.nextLine();
        System.out.println("Выберите действие: ");
        System.out.println("1 - кодировать");
        System.out.println("2 - декодировать");
        String var = scanner.nextLine();
        System.out.print("Введите шаг кодирования (от 1 до " + (alphabet.length - 1) + "): ");
        int step = scanner.nextInt();
        if (step < 1 || step > (alphabet.length - 1)){
            System.out.println("Некорректный шаг!");
            return;
        }
        switch (var){
            case "1":
                System.out.println(encode(text, step));
                break;
            case "2":
                System.out.println(decode(text, step));
                break;
            default: return;
        }
    }
}
