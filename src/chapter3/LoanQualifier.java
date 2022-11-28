package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    /*
     * NESTED IFS:
     * To qualify for a loan, a person must make at least $30,000
     * and have been working at their current job for at least 2 years.
     */
    public static void main(String args[]){
        int requiredSalary = 30000;
        int requiredYear=2;
        System.out.println("Please enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Please enter your working year: ");
        int workedYear= scanner.nextInt();
        scanner.close();
        if (salary >= requiredSalary){
            if (workedYear >= requiredYear){
                System.out.println("Congrats, You qualify to loan.");
            }else {
                int needYear = requiredYear - workedYear;
                System.out.println("Sorry, You need work "+needYear+" year to qualify loan.");
            }
        }else {
            double needSalary = requiredSalary - salary;
            System.out.println("Sorry, Your salary is not meeting to qualify loan, Your salary are "+needSalary+" $ short.");
        }
    }
}
