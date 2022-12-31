package chapters.chapter3;

import java.util.Scanner;

/*
IF statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String arg[]) {
        //Initialize known values.
        int salary = 1000, bonus = 250, quota = 10;

        //Get values for the unknown.
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners.
        if (sales > quota)
            salary = salary + bonus;

        //Output.
        System.out.println("The employee did " + sales + " sales. The pay is $" + salary + ".");
    }

}