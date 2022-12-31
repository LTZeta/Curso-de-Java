package chapters.chapter9.Inheritance;

public class InheritanceTester {

    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.print();
        chapters.chapter9.Inheritance.Square square = new chapters.chapter9.Inheritance.Square();
        square.print("square");

        testSquareOverride();
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        System.out.println(rectangle.calculatePerimeter());
        chapters.chapter9.Inheritance.Square square = new chapters.chapter9.Inheritance.Square();
        square.setLength(8);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }
}
