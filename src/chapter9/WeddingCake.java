package chapter9;

public class WeddingCake extends Cake{
    public static int tiers;
    WeddingCake(String flavor){
        super(flavor);
    }
    public static int getTiers() {
        return tiers;
    }
    public static void setTiers(int tiers) {
        WeddingCake.tiers = tiers;
    }

}
