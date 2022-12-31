package chapters.chapter3;

/*
 * LOGICAL OPERATOR:
 * To qualify for a loan, a person must take at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String arg[]) {
        //Initialize know values.

        int requiredSalary = 30000, requiredYearsEmployed = 2;

        //Get unknown values.

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make Decision.

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! you qualify for the loan");
        } else {
            System.out.println("Sorry! you need the both conditions to qualify for the loan. must earn at least $" + requiredSalary + ". And also worked at your current job for " + requiredYearsEmployed + " years.");
        }
    }

}
