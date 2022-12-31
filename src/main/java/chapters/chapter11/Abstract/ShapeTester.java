package chapters.chapter11.Abstract;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        rectangle.calculateArea();
    }
}
