package chapters.chapter11.Interfaces;

public class Customer {

    public static void main(String[] args) {
        Book book = new Book();

        book.setAuthor("Leonel");
        book.setPrice(9.99);
        book.setColor("Red");
        book.setName("All the things i never talk");
        book.setPages(93);
        book.setIsbn("I don't know wtf is this");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getColor());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        System.out.println(book.getBarcode());
        System.out.println(book.getIsbn());
    }
}
