package chapters.chapter12.CollectionFrameworks;

import java.util.List;

public class Inmutable {

    public static void main(String[] args) {
        // This is an inmutable object
        List<String> unchangeableList = List.of("apple", "lemon", "banana");
        unchangeableList.add("orange"); //UnsupportedOperationException
        unchangeableList.remove(1); //UnsupportedOperationException
    }
}
