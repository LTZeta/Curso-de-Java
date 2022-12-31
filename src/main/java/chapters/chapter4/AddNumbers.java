package chapters.chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers, and them sums up the two numbers.
 * The user should be able to repeat this action until they indicate they are done.
 */

public class AddNumbers {

    public static void main(String args[]) {

        boolean again;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("the sum is: " + sum);

            System.out.println("Would you like to start over? true or false");
            again = scanner.nextBoolean();

        } while (again);

        scanner.close();
    }

}
