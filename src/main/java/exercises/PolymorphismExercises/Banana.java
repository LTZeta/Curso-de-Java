package exercises.PolymorphismExercises;

public class Banana extends Fruit {

    public Banana(int calories){
        System.out.println("Banana created");
        setCalories(calories);
    }

    public void calories(){
        System.out.println("The banana have "+ getCalories() +" calories");
    }

    public void peel(){
        System.out.println("The banana is successfully peeled");
    }
    @Override
    public void makeJuice() {
        System.out.println("Juice of banana is made");
    }

}