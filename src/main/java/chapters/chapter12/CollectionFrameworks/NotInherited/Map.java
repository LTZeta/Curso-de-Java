package chapters.chapter12.CollectionFrameworks.NotInherited;

import java.util.HashMap;

public interface Map {

    static void main(String[] args) {

        // Map not inherit anything from Collection class, isn't a true collection.

        HashMap<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 12);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);
    }
}
