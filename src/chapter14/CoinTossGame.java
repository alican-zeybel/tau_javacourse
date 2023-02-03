package chapter14;


import java.util.Scanner;

/*
-CoinTossGame class :
-Creates two players
-Asks Player 1 to choose Heads or Tails
-Ensures that Player 1's guess is valid
-Automatically assigns Player 2's guess to the opposite of what Player 1 chose
-Flips the coin
-Determines winner based on what coin landed on
-Uses methods appropriately
 */
public class CoinTossGame {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Coin coin = new Coin();
        System.out.print("Please enter your name: (Player1) ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Please enter your name: (Player2) ");
        Player player2 = new Player(scanner.nextLine());
        System.out.println("All Player set:");
        System.out.println("Player 1: "+player1.getName());
        System.out.println("Player 2: "+player2.getName());
        System.out.println(player1+" Please choose side: (1 For Tails, 2 For Heads)");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                player1.setGuess(coin.tails);
                player2.setGuess(coin.heads);
                break;
            case 2:
                player1.setGuess(coin.heads);
                player2.setGuess(coin.tails);
                break;
        }
        coin.flipCoin();
        if(player1.getGuess().equals(coin.getSide())){
            System.out.println("Coin flipped and "+coin.getSide()+" come, "+player1.getName()+" won the game.");
        }else if(player2.getGuess().equals(coin.getSide())){
            System.out.println("Coin flipped and "+coin.getSide()+" come, "+player2.getName()+" won the game.");
        }
    }
}
