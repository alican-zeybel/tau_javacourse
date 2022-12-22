package chapter9;

public class BirthdayCake extends Cake{
    private  int candles;
    public BirthdayCake(String flavor) {
        super(flavor);
    }
    public int getCandles() {
        return candles;
    }
    public void setCandles(int candles) {
        candles = this.candles;
    }

}
