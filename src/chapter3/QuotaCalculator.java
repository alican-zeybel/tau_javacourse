package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    /*
     * IF ELSE
     * All salespeople are expected to make at least 10 sales each week.
     * For those who do, they receive a congratulatory message.
     * For those who don't, they are informed of how many sales they were short.
     */

    public static void main(String args[]){

        int quota = 10;
        System.out.println("Please enter Employee's sales on this week = ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        scanner.close();

        if(salary >= quota){
            System.out.println("Congrats! You fulled this week quota.");
        }else{
            int need = quota - salary;
            System.out.println("Sorry,You need "+need+" salary on this week to end quota.");
        }

    }
}
