package chapters.chapter9.Inheritance;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}