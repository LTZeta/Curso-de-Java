package chapters.chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'Instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore() {

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary)
            return true;
        return false;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You're been approved.");
        } else {
            System.out.println("Sorry. You're been declined.");
        }
    }
}
