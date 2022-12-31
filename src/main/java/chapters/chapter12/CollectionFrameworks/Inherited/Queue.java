package chapters.chapter12.CollectionFrameworks.Inherited;

import java.util.LinkedList;

public interface Queue {

    static void main(String[] args) {

        /*
         Collection Frameworks, QUEUE (LinkedList) = Ordered elements which can be accessed by position and also be duplicate.
         Typically, follows the FIFO (First-in First-out) algorithm, that means elements are processed in the order in  witch they are entered.
        */
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());
    }
}
