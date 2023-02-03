package chapter14;

import java.util.Random;

/*
A field called side.
Encapsulation.
Constant variables for heads and tails.
A method called flip which randomly chooses heads or tails and assigns value to side.
*/
public class Coin {
    private String side;
    public final String heads = "Heads";
    public final String tails = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    //Flipping to coin choose side of coin. This method doing it with simple math.
    public void flipCoin() {
        Random rand = new Random();
        switch (rand.nextInt(3)){
            case 1:
                setSide(tails);
                break;
            case 2:
                setSide(heads);
                break;
            default:
                flipCoin();
        }
    }
}
