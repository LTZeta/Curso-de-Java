package exercises;

import java.util.Random;

public class RollADie {

    public static void main(String args[]){
        Random random = new Random();
        int die = random.nextInt(6) + 1;
        int total = die, i = 1, objective = 20;

        System.out.println("Roll #" + i +": You've rolled a "+ die + ". You're now on space "+ total +" and have "+ (objective-total) +" more to go.");

        for (i=1; i<5; i++){
            die = random.nextInt(6) + 1;
            total = total + die;
            if (total == 20){
                System.out.println("Roll #" + (i+1) +": You've rolled a "+ die + ". You're on space "+ total +". Congrats, you win!");
                break;
            } else if (total > 20) {
                System.out.println("Roll #" + (i+1) +": You've rolled a "+ die + ". You're now on space "+ total +". You exceeded space 20, you lost");
                break;
            } else if (total < 20 && i==4) {
                System.out.println("Roll #" + (i+1) +": You've rolled a "+ die + ". You're now on space "+ total +". After 5 rolls, you didn't reach space 20, you lost.");
                break;
            }
            else{
                System.out.println("Roll #" + (i+1) +": You've rolled a "+ die + ". You're now on space "+ total +" and have "+ (objective-total) +" more to go.");
            }
        }
    }
}