package exercises;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double charge = 0.25;
    static double tax = 0.15;


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter the overage minutes:");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        double overageFees = calculateOverageFees(overageMinutes);

        double totalTax = calculateTax((baseCost + overageFees));

        calculateAndPrintBill(baseCost, overageFees, totalTax);
    }

    public static double calculateTax(double costPlan){
        double totalTax = costPlan*tax;
        return totalTax;
    }

    public static double calculateOverageFees(int overageMinutes){
        double overageFees = overageMinutes * charge;
        return overageFees;
    }

    public static void calculateAndPrintBill(double baseCost, double overageFees, double totalTax){
        double total = baseCost + totalTax + overageFees;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overageFees));
        System.out.println("Tax: $" + String.format("%.2f", totalTax));
        System.out.println("Total: $" + String.format("%.2f", total));

    }
}
