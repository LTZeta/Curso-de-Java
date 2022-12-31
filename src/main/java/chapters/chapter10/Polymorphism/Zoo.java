package chapters.chapter10.Polymorphism;

public class Zoo {

    public static void main(String[] args) {

        chapters.chapter10.Polymorphism.Dog rocky = new chapters.chapter10.Polymorphism.Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new chapters.chapter10.Polymorphism.Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new chapters.chapter10.Polymorphism.Cat();
        sasha.makeSound();
        ((chapters.chapter10.Polymorphism.Cat) sasha).scratch();

        feed(sasha);
    }

    public static void feed(Animal animal) {

        if (animal instanceof chapters.chapter10.Polymorphism.Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof chapters.chapter10.Polymorphism.Cat) {
            System.out.println("here's your cat food");
        }
    }
}