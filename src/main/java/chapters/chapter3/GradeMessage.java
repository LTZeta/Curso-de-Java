package chapters.chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String arg[]) {
        String grade, message;
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.next();
        scanner.close();


        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Sorry. Invalid Grade!";
        }
        System.out.printf(message);
    }

}
