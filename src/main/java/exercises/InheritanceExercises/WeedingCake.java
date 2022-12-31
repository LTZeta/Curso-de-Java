package exercises.InheritanceExercises;

public class WeedingCake extends Cake{

    private int tier;
    private final double tierPrice = 1.20;

    public WeedingCake(){
        System.out.println("The cake now is a weeding cake");
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public double getTierPrice(){
        return tier * tierPrice;
    }

    public double totalPrice(){
        return getPrice() + getTierPrice();
    }
}
