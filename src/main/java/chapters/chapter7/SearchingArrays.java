package chapters.chapter7;

import java.util.Arrays;
import java.util.Random;

public class SearchingArrays {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static Random random = new Random();

    public static void main(String args[]) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (binarySearch(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     *
     * @param array             Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {

        /*
         * This is called an enhanced loop.
         * It iterates through 'array' and
         * each time assigns the current element to 'value'
         */

        for (int value : array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        System.out.println("Your ticket is:");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

}
