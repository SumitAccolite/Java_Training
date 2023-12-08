package org.example;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IneffHash {
    static List<String> keys = new ArrayList<>();
    static List<String> values = new ArrayList<>();

    static void put(String key , String value){
        keys.add(key);
        values.add(value);
    }

    static String get(String key){
        for(int i = 0 ; i < keys.size();i++){
            if(Objects.equals(keys.get(i),key)){

                return values.get(i);

            }
        }
        return null;
    }
}
