package exercises;

public class PhoneBill {

    //Global variables
    private int id;
    private double baseCost;
    private int allowedMinutes;
    private int minUsed;

    //Constructors

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allowedMinutes = 800;
        minUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allowedMinutes = 800;
        minUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allowedMinutes, int minUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allowedMinutes = allowedMinutes;
        this.minUsed = minUsed;
    }

    //end of constructors.

    //Get and set methods

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }



    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }



    public int getAllowedMinutes(){
        return allowedMinutes;
    }

    public void setAllowedMinutes(int allowedMinutes){
        this.allowedMinutes = allowedMinutes;
    }



    public int getMinUsed(){
        return minUsed;
    }

    public void setMinUsed(int minUsed){
        this.minUsed = minUsed;
    }

    //calculators

    public double calculateOverage(){
        if (minUsed <= allowedMinutes){
            return 0;
        }

        double overageRate =  0.25;

        double overageMinutes = minUsed - allowedMinutes;

        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost+calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base cost: $" + baseCost);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }

}