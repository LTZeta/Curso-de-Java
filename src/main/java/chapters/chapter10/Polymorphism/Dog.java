package chapters.chapter10.Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void fetch() {
        System.out.println("Fetch is fun!");
    }

}
