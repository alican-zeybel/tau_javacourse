package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    DayOfTheWeek(){
        day = 0;
    }
    private static final int daysInWeek = 7;
    private static String dayOfWeeK;
    private int day;


    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
        if (day >= 7 || day<=0) System.out.println("You entered wrong number");

    }

    /*
    Days for week.
     */
    public String week() {
        switch (day) {
            case 1:
                dayOfWeeK = "Monday";
                break;
            case 2:
                dayOfWeeK = "Tuesday";
                break;
            case 3:
                dayOfWeeK = "Wednesday";
                break;
            case 4:
                dayOfWeeK = "Thursday";
                break;
            case 5:
                dayOfWeeK = "Friday";
                break;
            case 6:
                dayOfWeeK = "Saturday";
                break;
            case 7:
                dayOfWeeK = "Sunday";
                break;
            default:
                System.out.println("You entered wrong number");
                break;

        }
        return dayOfWeeK;
    }

    public void writeDay(String dayOfWeeK) {
        System.out.println(dayOfWeeK + " Day of this week.");

    }

}



