package chapters.chapter3;

import java.util.Scanner;

/*
IF ELSE
 * All Salespeople are expected to make at least 10 sales each week.
 * For those who do, the receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String arg[]) {
        //Initialize values we know.
        int quota = 10;

        //Get unknown values.
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output.
        if (sales >= quota) {
            System.out.println("Congratulations!, you've met your quota");
        } else {
            int salesShor = quota - sales;
            System.out.println("Oh! :(, you did not make your quota. You were " + salesShor + " sales short");
        }
    }

}