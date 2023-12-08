package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Buckets {
    public static void main(String[] args) {
        // Create a binary HashMap
        Map<Integer, List<String>> bMap = new HashMap<>();


        addValue(bMap, 0, "ValueA");
        addValue(bMap, 1, "ValueZ");
        addValue(bMap, 0, "ValueB");
        addValue(bMap, 1, "ValueU");
        addValue(bMap, 0, "ValueC");

        addValue(bMap, 1, "ValueX");
        addValue(bMap, 0, "ValueD");
        addValue(bMap, 1, "ValueY");
        addValue(bMap, 0, "ValueE");
        addValue(bMap, 1, "ValueZ");
       // addValue(bMap, 2, "ValueZ");


        for (Map.Entry<Integer, List<String>> entry : bMap.entrySet()) {
            System.out.println(entry);
        }
    }


    public static void addValue(Map<Integer, List<String>> bMap, int key, String value) {
        // If the key is not present then only it will create a new ArrayList for the key and add the values using .add(value) method
        //if the key is present then it will only execute the .add(Value) method.
        bMap.computeIfAbsent(key, x -> new ArrayList<>()).add(value);

    }
}
