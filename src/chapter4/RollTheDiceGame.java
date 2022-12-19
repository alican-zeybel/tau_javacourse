package chapter4;

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            sum = sum +die;
            int left = 20 - sum;
            if(sum <= 20){

                if (sum < 20){
                    System.out.println("Roll #"+i+": You've rolled a "+die+" You are now on space "+sum+" and have "+left+" more to go.");

                }else if(sum == 20){
                    System.out.println("Roll #"+i+": You've rolled a "+die+" You're on space 20. Congrats, you win!");

                }

                if (i==5 && sum<20){
                    System.out.println("Sorry, You the lost game.");
                }

            }else if(left < 1){
                System.out.println("Roll #"+i+": You've rolled a "+die+" Your total number: "+sum+". Sorry, You lost the game.");
                break;
            }
        }
    }

}
