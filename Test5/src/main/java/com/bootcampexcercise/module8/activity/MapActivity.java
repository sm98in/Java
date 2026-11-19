package com.bootcampexcercise.module8.activity;

// Needs to be completed
import java.util.HashMap;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map<String, String> people = new HashMap<>();
        people.put("1", "John");
        people.put("2", "Harry");
        people.put("3", "Daniel");
        people.put("3", "Mike");
        people.put("4", "Ilya");
        people.put("4", "Max");
        people.put("4", "Eva");

        // 2 - Call print method to print the map passed as its parameter.
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)
        MapActivity obj = new MapActivity();
        obj.print(people);
    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}