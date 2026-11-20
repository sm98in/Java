package com.bootcampexcercise.module10.activity;

import java.util.HashMap;

public class ElectronicItemDetails {

    //TODO 5.1 Create itemHashMap with String name and double price
    HashMap<String, Double> itemHashMap = new HashMap<>();

    //TODO 5.2 Create method to return price of an item
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        } else {
            throw new IllegalArgumentException("Item not found: " + name);
        }
    }

    //TODO 5.3 Main method
    public static void main(String[] args) {

        ElectronicItemDetails details = new ElectronicItemDetails();

        //TODO 5.3.1 Add 4 items in hashmap
        details.itemHashMap.put("TV", 500.00);
        details.itemHashMap.put("Refrigerator", 800.85);
        details.itemHashMap.put("Washing Machine", 450.01);
        details.itemHashMap.put("Laptop", 1000.30);

        //TODO 5.3.2 Print price of TV
        System.out.println("Price of TV is " +
                details.returnPriceOfItem(details.itemHashMap, "TV"));
    }
}
