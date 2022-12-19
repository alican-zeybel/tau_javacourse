package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]){
        double planFee;
        double overageMinutes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        planFee = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        overageMinutes = scanner.nextDouble();
        scanner.close();
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: "+planFee);
        double overage = overageCalculator(overageMinutes);
        double subTotal = overage + planFee;
        double tax = TaxCalculator(subTotal);
        TotalCalculator(subTotal,tax);
    }

    public static double overageCalculator(double overageMinutes){
        double overage = overageMinutes * 0.25;
        System.out.println("Overage: "+String.format("%.2f",overage));
        return overage;
    }
    public static double TaxCalculator(double subTotal){
        double tax = subTotal * 0.15f;
        System.out.println("Tax: "+String.format("%.2f",tax));
        return tax;
    }
    public static void TotalCalculator(double subTotal, double tax){
        double totalFee = subTotal+tax;
        System.out.println("Total: "+String.format("%.2f",totalFee));
    }
}
