package exercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        //1. Get an Adjective
        System.out.println("Enter an Adjective:");
        String adjective= scanner.next();

        //2. Get one season of the year
        System.out.println("Enter one season of the year:");
        String season= scanner.next();

        //3. Get a whole number
        System.out.println("Enter a Whole number:");
        float wholeNumber= scanner.nextFloat();
        scanner.close();

        //4. Display all like this: "On a "+[Adjective]+" "+[Season of the Year]+ " day, I drink a minimum of "+[Whole Number]+ " cups of Coffee."
        System.out.println("On a "+adjective+" "+season+ " day, I drink a minimum of "+wholeNumber+ " cups of Coffee.");
    }
}
