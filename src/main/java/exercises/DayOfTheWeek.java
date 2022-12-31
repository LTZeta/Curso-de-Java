package exercises;

import java.util.Scanner;

public class DayOfTheWeek {

    private static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);
    private static int day;

    public static void main(String args[]){

        System.out.println("Enter a number for the day of the week:");
        int index = scanner.nextInt();

        System.out.println(week[index-1]);

        scanner.close();
    }
}
