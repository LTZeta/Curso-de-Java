package exercises.CoinTossGame;

import java.util.Scanner;

public class CoinTossGame {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        if (choseWord().equalsIgnoreCase("HEADS")){
            player1.setGuess("HEADS");
            player2.setGuess("TAILS");
        }
        else {
            player1.setGuess("TAILS");
            player2.setGuess("HEADS");
        }

        if(announceWinner().equalsIgnoreCase(player1.getGuess())){
            System.out.println("The coin flip... "+ player1.getGuess());
            System.out.println("Congratulations "+ player1.getName() + " You win the game!");
        }
        else{
            System.out.println("The coin flip... "+ player2.getGuess());
            System.out.println("Congratulations "+ player2.getName() + " You win the game!");
        }

        scanner.close();


    }

    private static String announceWinner() {
        Coin coin = new Coin();
        return coin.flip();
    }

    public static String choseWord(){
        String choseWord;
        do {
            System.out.println("Choose HEADS or TAILS:");
            choseWord = scanner.next();
            if(choseWord.equalsIgnoreCase("HEADS") || choseWord.equalsIgnoreCase("TAILS")){
                return choseWord;
            }
        }while (true);
    }
}
