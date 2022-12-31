package exercises.InheritanceExercises;

public class Cake {

    protected String flavor;
    protected double price;

    public Cake(){
        System.out.println("Created Cake");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
