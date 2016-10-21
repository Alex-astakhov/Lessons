package lesson4.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Alex Astakhov on 08.10.2016.
 */
public class Krest {
    private static char[][] game = new char[3][3];
    private static Scanner scanner = new Scanner(System.in);

    private static void init(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = ' ';
            }
        }
    }

    private static void print(){
        System.out.println("Результат:");
        for (int i = 0; i < 3; i++) {
            System.out.println(game[i][0] + "|" + game[i][1] + "|" + game[i][2]);
            if (i ==2)
                break;
            System.out.println("-----");
        }

    }

    private static void userTurn(){
        System.out.println("Сделайте ход:");
        boolean b;
        do {
            b = false;
            System.out.print("Введите координату x: ");
            int x = scanner.nextInt();
            System.out.print("Введите координату y: ");
            int y = scanner.nextInt();
            if (isEmpty(y, x))
                game[y][x] = 'X';
            else {
                b = true;
                System.out.println("Эта клетка уже занята!");
            }
        }while (b);
    }

    private static void compTurn(){
        System.out.println("Ход компьютера...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (isEmpty(1, 1)){
            game[1][1] = 'O';
            return;
        }

        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                if (game[j][i] == 'X')
                    count++;
            }
            if (count == 2)
                for (int j = 0; j < 3; j++) {
                    if (isEmpty(j, i)){
                        game[j][i] = 'O';
                        return;
                    }
                }
        }
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                if (game[i][j] == 'X')
                    count++;
            }
            if (count == 2)
                for (int j = 0; j < 3; j++) {
                    if (isEmpty(i, j)){
                        game[i][j] = 'O';
                        return;
                    }
                }
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
                if (game[i][i] == 'X')
                    count++;
            if (count == 2)
                for (int j = 0; j < 3; j++) {
                    if (isEmpty(j, j)){
                        game[j][j] = 'O';
                        return;
                    }
                }

        }

        if (game[2][0] == 'X' && game[1][1] == 'X'){
            game[0][2] = 'O';
            return;
        }
        if (game[0][2] == 'X' && game[1][1] == 'X'){
            game[2][0] = 'O';
            return;
        }
        if (game[2][0] == 'X' && game[0][2] == 'X'){
            game[1][1] = 'O';
            return;
        }

        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while (!isEmpty(y,x));
        game[y][x] = 'O';
    }

   private static char endGame(){
       if (game[0][0] == game[0][1] && game[0][1] == game[0][2] && game[0][2] != ' ')
           return game[0][0];
       if (game[1][0] == game[1][1] && game[1][1] == game[1][2] && game[1][2] != ' ')
           return game[1][0];
       if (game[2][0] == game[2][1] && game[2][1] == game[2][2] && game[2][2] != ' ')
           return game[2][0];

       if (game[0][0] == game[1][0] && game[1][0] == game[2][0] && game[2][0] != ' ')
           return game[0][0];
       if (game[0][1] == game[1][1] && game[1][1] == game[2][1] && game[2][1] != ' ')
           return game[0][1];
       if (game[0][2] == game[1][2] && game[1][2] == game[2][2] && game[2][2] != ' ')
           return game[0][2];

       if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[2][2] != ' ')
           return game[0][0];
       if (game[2][0] == game[1][1] && game[1][1] == game[0][2] && game[0][2] != ' ')
           return game[2][0];
       boolean b = false;
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if(isEmpty(i, j)){
                   b = true;
               }
           }
       }
       if (!b)
           return 'N';
       return ' ';
   }

    private static boolean isEmpty(int y, int x){
        return game[y][x] == ' ';
    }

    private static void result(){
        switch (endGame()){
            case 'X':
                System.out.println("Игрок победил!");
                break;
            case 'O':
                System.out.println("Компьютер победил!");
                break;
            case 'N':
                System.out.println("Ничья!");
        }
    }

    public static void main(String[] args) {
        init();
        print();
        while (endGame() == ' '){
            userTurn();
            print();
            if (endGame() != ' ') {
                result();
                return;
            }
            compTurn();
            print();
            if (endGame() != ' ') {
                result();
                return;
            }
        }
    }
}
