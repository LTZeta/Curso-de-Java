package chapters.chapter3;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must take at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String arg[]) {
        //Initialize know values.

        int requiredSalary = 30000, requiredYearsEmployed = 2;

        //Get unknown values.

        System.out.printf("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make Decision.

        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.printf("Congrats! you qualify for the loan");
            } else {
                System.out.println("Sorry!, you must have worked at your current job " + requiredYearsEmployed + " years.");
            }
        } else {
            System.out.printf("Sorry!, you must earn at least " + requiredSalary + " to qualify for the loan.");
        }

    }

}
