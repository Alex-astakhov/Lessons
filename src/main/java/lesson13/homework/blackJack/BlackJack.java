package lesson13.homework.blackJack;

import java.util.*;

/**
 * Created by Alex Astakhov on 12.11.2016.
 */
public class BlackJack {


    public static void main(String[] args) {
        List<String> deck = deckInit();
        deck = shuffle(deck);
        System.out.println("Раздача карт:");
        List<String> dealer = new ArrayList<>();
        List<String> player = new ArrayList<>();
        player.add(deck.remove(0));
        player.add(deck.remove(0));
        dealer.add(deck.remove(0));
        printCurrentStatus(dealer, player);
        System.out.println("Ход игрока...");
        if (sumPoints(player) < 21) {
            System.out.println("Сколько карт вы хотите взять?");
            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                String card = deck.remove(0);
                player.add(card);
                System.out.print(card + "  ");
            }
            System.out.println();
        }
        if (sumPoints(player) > 21){
            printCurrentStatus(dealer, player);
            System.out.println("Игрок: " + sumPoints(player) + " очков - игрок проиграл!");
            return;
        }
        System.out.println("Ход диллера...");
        int count = (21 - sumPoints(dealer)) / 7;
        for (int i = 0; i < count; i++) {
            String card = deck.remove(0);
            dealer.add(card);
            System.out.print(card + "  ");
        }
        System.out.println("\n");
        printCurrentStatus(dealer, player);

        printFinalResult(dealer, player);
    }

    static List<String> deckInit(){
        List<String> deck = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            deck.add("♠ " + i);
        }
        deck.add("♠ J");
        deck.add("♠ Q");
        deck.add("♠ K");
        deck.add("♠ A");

        for (int i = 2; i < 11; i++) {
            deck.add("♣ " + i);
        }
        deck.add("♣ J");
        deck.add("♣ Q");
        deck.add("♣ K");
        deck.add("♣ A");

        for (int i = 2; i < 11; i++) {
            deck.add("♥ " + i);
        }
        deck.add("♥ J");
        deck.add("♥ Q");
        deck.add("♥ K");
        deck.add("♥ A");

        for (int i = 2; i < 11; i++) {
            deck.add("♦ " + i);
        }
        deck.add("♦ J");
        deck.add("♦ Q");
        deck.add("♦ K");
        deck.add("♦ A");
        return deck;
    }

    static List<String> shuffle(List<String> deck){
        List<String> shuffled = new ArrayList<>();
        Random random = new Random();
        while (!deck.isEmpty()){
            shuffled.add(deck.remove(random.nextInt(deck.size())));
        }
        return shuffled;
    }

    static int sumPoints(List<String> cards){
        int sum = 0;
        for (String s: cards) {
            if (s.contains("J") || s.contains("Q") || s.contains("K") || s.contains("10")){
                sum += 10;
            }else if (s.contains("A")){
                sum += 11;
            }else {
                sum += Integer.parseInt(s.substring(2));
            }
        }
        return sum;
    }

    static void printCurrentStatus(List<String> dealer, List<String> player){
        System.out.println("Диллер:");
        for (String s: dealer) {
            System.out.print(s + "   ");
        }
        System.out.println("\n");

        System.out.println("Игрок:");
        for (String s: player) {
            System.out.print(s + "   ");
        }
        System.out.println("\n");
    }

    static void printFinalResult(List<String> dealer, List<String> player){
        int playerPoints = sumPoints(player);
        int dealerPoints = sumPoints(dealer);
        if (dealerPoints <= 21){
            if (dealerPoints > playerPoints){
                System.out.println("Казино выигрывает! (Игрок: " + playerPoints + ", диллер: " + dealerPoints + ")");
                return;
            }
            if (dealerPoints < playerPoints){
                System.out.println("Игрок выигрывает! (Игрок: " + playerPoints + ", диллер: " + dealerPoints + ")");
                return;
            }
            if (dealerPoints == playerPoints){
                System.out.println("Ничья! (Игрок: " + playerPoints + ", диллер: " + dealerPoints + ")");
                return;
            }
        }
        else {
            System.out.println("Игрок выигрывает! (Игрок: " + playerPoints + ", диллер: " + dealerPoints + ")");
        }
    }
}
