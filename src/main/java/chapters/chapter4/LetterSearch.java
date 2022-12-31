package chapters.chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determinate if it contains the letter 'A'.
 */
public class LetterSearch {

    public static void main(String arg[]) {

        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("The text contains the letter 'A'");
        } else {
            System.out.printf("The text doesn't contain the letter 'A'");
        }

    }

}
