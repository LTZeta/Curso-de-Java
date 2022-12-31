package chapters.chapter9.Inheritance;

public class Mother extends chapters.chapter9.Inheritance.Woman {

    public static void main(String args[]) {
        Mother mom = new Mother();
        mom.setAge(55);
        mom.setName("Silvina");
        System.out.println("My mom name is " + mom.getName() + ". She age's " + mom.getAge() + ". She is a " + mom.getGender());
    }
}
