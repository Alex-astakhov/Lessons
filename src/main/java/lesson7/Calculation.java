package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex Astakhov on 21.10.2016.
 */
public class Calculation {
    private double sum(double x, double y){
        return x + y;
    }

    private double minus(double x, double y){
        return x - y;
    }

    private double multip(double x, double y){
        return x * y;
    }

    private double sep(double x, double y){
        return  x / y;
    }

    public String calc(String input){
        input = input.replace("+-", "-");
        input = input.replace("--", "+");
        int multiplier = 1;
        String[] exp = {"*", "/", "*-", "/-"};
        String[] exp1 = {"+","-"};
        int indexOfMult = input.indexOf(firstOperator(input,exp));
        int indexOfSum = input.indexOf(firstOperator(input.substring(1), exp1));
        if (input.charAt(0) == '-' && (indexOfMult < indexOfSum)) {
            multiplier = -1;
            input = input.substring(1);
        }


        if (input.contains("*") || input.contains("/") || input.contains("*-") || input.contains("/-")){


            String operator = firstOperator(input, exp);
            double x, y;
            int indexX, indexY;
            switch (operator){
                case "*":
                    x = findNumLeft(input, input.indexOf("*")) * multiplier;
                    indexX = findIndexLeft(input, input.indexOf("*"));
                    y = findNumRight(input, input.indexOf("*"));
                    indexY = findIndexRight(input, input.indexOf("*"));
                    return input.substring(0, indexX) + multip(x, y) + input.substring(indexY, input.length());
                case "/":
                    x = findNumLeft(input, input.indexOf("/")) * multiplier;
                    indexX = findIndexLeft(input, input.indexOf("/"));
                    y = findNumRight(input, input.indexOf("/"));
                    indexY = findIndexRight(input, input.indexOf("/"));
                    return input.substring(0, indexX) + sep(x, y) + input.substring(indexY, input.length());
                case "*-":
                    x = findNumLeft(input, input.indexOf("/")) * multiplier;
                    indexX = findIndexLeft(input, input.indexOf("/"));
                    y = findNumRight(input, input.indexOf("-"));
                    indexY = findIndexRight(input, input.indexOf("-"));
                    return input.substring(0, indexX) + multip(x, y * (-1)) + input.substring(indexY, input.length());
                case "/-":
                    x = findNumLeft(input, input.indexOf("/")) * multiplier;
                    indexX = findIndexLeft(input, input.indexOf("/"));
                    y = findNumRight(input, input.indexOf("-"));
                    indexY = findIndexRight(input, input.indexOf("-"));
                    return input.substring(0, indexX) + minus(x, y * (-1)) + input.substring(indexY, input.length());
            }
        }


        int targetIndex;

        if (input.contains("+") || input.contains("-")){

            if (input.contains("+") && input.contains("-")){
                int[] indexList = new int[2];
                indexList[0] = input.indexOf("+");
                indexList[1] = input.indexOf("-");
                Arrays.sort(indexList);
                targetIndex = indexList[0];
            }else {
                if (input.contains("+"))
                    targetIndex = input.indexOf("+");
                else
                    targetIndex = input.indexOf("-");
            }


            if (input.charAt(targetIndex) == '+'){
                double x = findNumLeft(input, input.indexOf("+")) * multiplier;
                int indexX = findIndexLeft(input, input.indexOf("+"));
                double y = findNumRight(input, input.indexOf("+"));
                int indexY = findIndexRight(input, input.indexOf("+"));
                return input.substring(0, indexX) + sum(x, y) + input.substring(indexY, input.length());
            }
            else {
                double x = findNumLeft(input, input.indexOf("-")) * multiplier;
                int indexX = findIndexLeft(input, input.indexOf("-"));
                double y = findNumRight(input, input.indexOf("-"));
                int indexY = findIndexRight(input, input.indexOf("-"));
                return input.substring(0, indexX) + minus(x, y) + input.substring(indexY, input.length());
            }
        }
        return "";
    }

    public void dooo(String input){
        while (input.contains("*") || input.contains("+") || input.contains("-") || input.contains("/")){
            if (input.matches("^-[0-9]+\\.[0-9]+$"))
                break;
                input = calc(input);

                    }
        System.out.println(input);
    }

    private double findNumLeft(String input, int index){
        input = input.substring(0, index);
        char[] arr = input.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '+' || arr[i] == '*' || arr[i] == '-' || arr[i] == '/'){
                return Double.parseDouble(input.substring(i + 1, input.length()));
            }
        }
        return Double.parseDouble(input.substring(0, input.length()));
    }

    private int findIndexLeft(String input, int index){
        input = input.substring(0, index);
        char[] arr = input.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '+' || arr[i] == '*' || arr[i] == '-' || arr[i] == '/'){
                return i + 1;
            }
        }
        return 0;
    }

    private double findNumRight(String input, int index){
        input = input.substring(index +1, input.length());
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '*' || arr[i] == '-' || arr[i] == '/') {
                return Double.parseDouble(input.substring(0, i));
            }
        }
        return Double.parseDouble(input.substring(0, input.length()));
    }

    private int findIndexRight(String input, int index){
        char[] arr = input.toCharArray();
        for (int i = index + 1; i < input.length(); i++) {
            if (arr[i] == '+' || arr[i] == '*' || arr[i] == '-' || arr[i] == '/') {
                return i;
            }
        }
        return input.length();
    }

    private String firstOperator(String input, String[] operators){
        List<String> exp = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
           if (input.contains(operators[i])){
               exp.add(operators[i]);
           }
        }

        if (exp.isEmpty()) return "";
        List<Integer> indexes = new ArrayList<>();
        for (String s: exp){
            indexes.add(input.indexOf(s));
        }

        int min = indexes.get(0);
        String targetOperator = exp.get(0);
        for (int i = 0; i < indexes.size(); i++) {
            if (min > indexes.get(i)) {
                min = indexes.get(i);
                targetOperator = exp.get(i);
            }
        }
        return targetOperator;
    }
}
