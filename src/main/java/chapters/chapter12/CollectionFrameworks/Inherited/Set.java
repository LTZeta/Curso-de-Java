package chapters.chapter12.CollectionFrameworks.Inherited;

import java.util.HashSet;

public interface Set {

    static void main(String[] args) {

        // Collection Frameworks, SET = Unordered UNIQUE elements.
        HashSet<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }
}
