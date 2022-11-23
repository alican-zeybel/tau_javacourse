package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){

        System.out.println("Please enter year:  ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("How many cup you drink:  ");
        int cup = scanner.nextInt();
        System.out.println("Please enter adjective:  ");
        String adj = scanner.next();
        scanner.close();
        System.out.println("On a "+adj+" "+year+" day, I drink a minimum of "+cup+" cups of coffee ");

    }
}
