package exercises.PolymorphismExercises;

import java.util.Scanner;

public class Market {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many calories the fruit have?");
        Fruit fruit = new Banana(scanner.nextInt());

        ((Banana) fruit).calories();
        ((Banana) fruit).peel();
        fruit.makeJuice();

        //Change instance of fruit
        System.out.println("Creating new juice.");
        System.out.println("How many calories the fruit have?");
        fruit = new Watermelon(scanner.nextInt());

        ((Watermelon) fruit).calories();
        ((Watermelon) fruit).cut();
        fruit.makeJuice();

        scanner.close();
    }

}
