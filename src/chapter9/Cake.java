package chapter9;

public class Cake {
    public static String flavor;
    public static double price;
    Cake(String flavor){
        flavor = this.flavor;
    }
    public static String getFlavor() {
        return flavor;
    }
    public static void setFlavor() {
        Cake.flavor = flavor;
    }
    public static double getPrice() {
        return price;
    }
    public static void setPrice(double price) {
        Cake.price = price;
    }



}
