package chapter7;

import java.util.Scanner;

public class QueryDayOfWeek {

    public static void main(String args[]){
        int day;
        DayOfTheWeek day1 = new DayOfTheWeek();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number Day of the week: ");
        day = scanner.nextInt();
        day1.setDay(day);
        String day2 = day1.week();
        day1.writeDay(day2);
    }
}
