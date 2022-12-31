package exercises;

/*
 * CHANGE FOR A DOLLAR.
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars, and you use something else that's fine.

So, for an example of this let's say that I ask the user:

How many pennies? - And they said 0.
How many nickels? - 0
How many dimes? - 0
How many quarters? - 4
Then my program would know that, okay quarters are worth 25 cents. There's 4 of these, let me multiply those and get the value. Oh! that equals one dollar, so I let them know that they win. So that's an example of the game.

Good luck!

I will change the coins, because I live in Argentina, pennies = 10 bil, nickels = 20 bil, dimes = 50 bil, quarters = 100 bil, 1 dollar = 300 bil.
 */

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String args[]){
        int dollar = 300, bil10 = 10, bil20 = 20, bil50 = 50, bil100 = 100, total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola! bienvenido al juego, cuantos billetes de 10 quieres?");
        int userBil10 = scanner.nextInt();
        System.out.println("cuantos de 20?");
        int userBil20 = scanner.nextInt();
        System.out.println("cuantos de 50?");
        int userBil50 = scanner.nextInt();
        System.out.println("y de 100?");
        int userBil100 = scanner.nextInt();

        int totalBil10 = bil10 * userBil10;
        int totalBil20 = bil20 * userBil20;
        int totalBil50 = bil50 * userBil50;
        int totalBil100 = bil100 * userBil100;
        total = totalBil10 + totalBil20 + totalBil50 + totalBil100;

        if (total==dollar){
            System.out.println("Genial, tu cambio es exactamente 1 dolar, ganaste!");
        } else if (total<dollar) {
            int porDebajoDe = dollar - total;
            System.out.println("Lo lamento! te falto exactamente $"+ porDebajoDe +" para ganar el juego");
        }
        else {
            int porEncimaDe = total - dollar;
            System.out.println("Lo lamento! te excediste exactamente por $"+ porEncimaDe +" para ganar el juego");
        }

        scanner.close();

    }
}
