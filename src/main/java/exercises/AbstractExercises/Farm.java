package exercises.AbstractExercises;

public class Farm {

    public static void main(String[] args) {
        Pig pig = new Pig();

        pig.makeSound();
        pig.eat();

        Duck duck = new Duck();

        duck.makeSound();
        duck.eat();
    }
}
