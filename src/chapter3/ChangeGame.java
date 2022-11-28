package chapter3;

import java.util.Scanner;

public class ChangeGame {

    public static void main(String args[]){

        int requiredChange = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Penny you have ? ");
        int yourPenny = scanner.nextInt();
        System.out.println("How many Nickel you have ? ");
        int yourNickel = scanner.nextInt();
        System.out.println("How many Dime you have ? ");
        int yourDime = scanner.nextInt();
        System.out.println("How many Quarter you have ? ");
        int yourQuarter = scanner.nextInt();
        double sum = (yourPenny * 0.01) + (yourNickel * 0.05) + (yourDime * 0.10) + (yourQuarter * 0.25);
        if (sum == 1){
            System.out.println("You win!!");
        }else if(sum < 1){
            double sumShort = 1-sum;
            System.out.println("You went under "+sumShort+" $");
        }else if(sum > 1){
            double sumLong = sum-1;
            System.out.println("You went over "+sumLong+" $");
        }else{
            System.out.println("You entered something wrong!");
        }

    }
}
