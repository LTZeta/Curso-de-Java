package chapters.chapter12.CollectionFrameworks.Inherited;

import java.util.ArrayList;

public interface List {

    static void main(String[] args) {

        // Collection Frameworks, LIST (ArrayList) = Ordered elements which can be accessed by position and also be duplicate.
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
        String[] newList = {"1", "2", "3", "4"};

        // Adding an entire list into the fruit arraylist.
        fruit.addAll(5, java.util.List.of(newList));
        System.out.println(fruit);
        System.out.println(fruit.size());
    }
}
