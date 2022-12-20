package chapter9;

public class BirthdayCake extends Cake{
    public static int candles;
    BirthdayCake(String flavor) {
        super(flavor);
    }
    public static int getCandles() {
        return candles;
    }
    public static void setCandles(int candles) {
        BirthdayCake.candles = candles;
    }

}
