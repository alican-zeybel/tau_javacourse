package chapter9;

import java.awt.*;

public class TasteTester {

    public static void main(String args[]){
        BirthdayCake birthdayCake = new BirthdayCake("Black");
        WeddingCake weddingCake = new WeddingCake("White");
        birthdayCake.setPrice(13.99);
        weddingCake.setPrice(15.99);
        System.out.println("Birthday Cake flavor = "+birthdayCake.getFlavor());
        System.out.println("Wedding Cake flavor = "+weddingCake.getFlavor());
        System.out.println("Birthday Cake price = "+birthdayCake.getPrice());
        System.out.println("Wedding Cake price = "+weddingCake.getPrice());
    }
}
