package exercises.InheritanceExercises;

public class TasteTester {

    public static void main(String[] args) {
        normalCake();
        birthdayCake();
        weedingCake();
    }

    public static void normalCake(){
        Cake cake = new Cake();
        cake.setFlavor("Vainilla");
        cake.setPrice(28.49);
        System.out.println("Taste is "+ cake.getFlavor());
        System.out.println("Price is $"+ String.format("%.2f", cake.getPrice()));
    }

    public static void birthdayCake(){
        BirthdayCake cake = new BirthdayCake();
        cake.setFlavor("Chocolate");
        cake.setPrice(29.99);
        cake.setCandles(3);
        System.out.println("Taste is "+ cake.getFlavor());
        System.out.println("Price is $"+ String.format("%.2f", cake.getPrice()));
        System.out.println("The cake have "+ cake.getCandles() +" candles");
        System.out.println("Price x candle(s) $"+ String.format("%.2f", cake.getCandlePrice()));
        System.out.println("Total price is $"+ String.format("%.2f", cake.totalPrice()));
    }

    public static void weedingCake(){
        WeedingCake cake = new WeedingCake();
        cake.setFlavor("Brownie with chocolate");
        cake.setPrice(32.30);
        cake.setTier(3);
        System.out.println("Taste is "+ cake.getFlavor());
        System.out.println("Price is $"+ String.format("%.2f", cake.getPrice()));
        System.out.println("The cake have "+ cake.getTier() +" tier(s)");
        System.out.println("Price x tier(s) $"+ String.format("%.2f", cake.getTierPrice()));
        System.out.println("Total price is $"+ String.format("%.2f", cake.totalPrice()));
    }

}
