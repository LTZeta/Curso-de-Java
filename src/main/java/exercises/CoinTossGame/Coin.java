package exercises.CoinTossGame;

import java.util.Random;

public class Coin {

    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        Random random = new Random(System.currentTimeMillis());

        if (random.nextBoolean()){
            setSide(HEADS);
        }
        else {
            setSide(TAILS);
        }

        return getSide();
    }
}
