package exercises;

import java.util.Scanner;

public class PhoneBillCalculator2 {
    public Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        PhoneBillCalculator2 calculator = new PhoneBillCalculator2();
        int data;

        do {
            System.out.println("What information do you have about the plan?");
            System.out.println("Type 1 for: nothing");
            System.out.println("Type 2 for: Id Only");
            System.out.println("Type 3 for: All the information");
            data = calculator.scanner.nextInt();
            if (data < 1 || data > 3){
                System.out.println("Error. Invalid data");
            }
        } while(data < 1 || data > 3);

        PhoneBill newBill = calculator.createObject(data);
        calculator.scanner.close();
        newBill.printItemizedBill();
    }

    public PhoneBill createObject(int data){
        if (data==1){
            return new PhoneBill();
        }
        if (data==2){
            System.out.println("Enter the ID:");
            int id = scanner.nextInt();
            return new PhoneBill(id);
        }
        else {
            System.out.println("Enter the ID:");
            int id = scanner.nextInt();
            System.out.println("Enter the base cost of the plan:");
            double baseCost = scanner.nextDouble();
            System.out.println("Enter the allowed minutes:");
            int allowedMinutes = scanner.nextInt();
            System.out.println("Enter the used minutes:");
            int minUsed = scanner.nextInt();
            return new PhoneBill(id, baseCost, allowedMinutes, minUsed);
        }
    }

}