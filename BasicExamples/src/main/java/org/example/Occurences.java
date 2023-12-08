package org.example;

import java.util.HashMap;

public class Occurences {
    public static void main(String[] args) {


        String str = "hvsjhaaaaskjss";
        HashMap<Character, Integer> hmap = new HashMap<>();
        int n =0;
        for(int i =0 ; i < str.length();i++){
            char ch = str.charAt(i);
//            if(hmap.containsKey(ch)){
//                hmap.put(ch,hmap.get(ch)+1);
//            }
//            else {
//                hmap.put(ch,1);
//            }
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap);
    }
}

