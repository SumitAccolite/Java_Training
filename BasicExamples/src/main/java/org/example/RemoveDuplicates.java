package org.example;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "bsuhakhhhsjhh" ;

        Set<Character> st = new LinkedHashSet<>();//LinkedHashSet Maintains the orders and removes all the duplicate elemesnts passed to it
        for(Character c :str.toCharArray()){
            st.add(c);
        }
        String abc = "" ;
        for (Character s:st){
            abc+=s;
        }
        System.out.println(abc);
    }


}
