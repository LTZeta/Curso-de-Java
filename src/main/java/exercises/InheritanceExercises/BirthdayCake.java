package exercises.InheritanceExercises;

public class BirthdayCake extends Cake{

    private int candles;
    private final double CANDLEPRICE=0.25;

    public BirthdayCake(){
        System.out.println("The cake now is a birthday cake");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public double getCandlePrice(){
        return candles * CANDLEPRICE;
    }

    public double totalPrice(){
        return getPrice() + getCandlePrice();
    }
}
