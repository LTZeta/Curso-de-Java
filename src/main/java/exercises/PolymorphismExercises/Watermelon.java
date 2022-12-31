package exercises.PolymorphismExercises;

public class Watermelon extends Fruit {

    public Watermelon(int calories){
        System.out.println("Watermelon created");
        setCalories(calories);
    }

    public void calories(){
        System.out.println("The watermelon have "+ getCalories() +" calories");
    }

    public void cut(){
        System.out.println("Watermelon successfully cut!");
    }
    @Override
    public void makeJuice() {
        System.out.println("Juice of watermelon is made");
    }

}