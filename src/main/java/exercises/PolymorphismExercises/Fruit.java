package exercises.PolymorphismExercises;

public class Fruit {

    public int calories;

    public void makeJuice(){
        System.out.println("Juice is made");
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

}