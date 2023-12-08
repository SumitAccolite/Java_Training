package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumofPair {
    public static void main(String[] args) {

        int sum = 13 ;
        HashSet<Integer> hset = new HashSet<>();
        hset.add(2);
        hset.add(15);
        hset.add(11);
        hset.add(7);
        //List<Integer> st = new ArrayList<>();
        for(Integer i:hset){
            if(hset.contains(sum-i)){
                List<Integer> st = new ArrayList<>();
                st.add(i);
                st.add(sum-i);
                System.out.println(st);
            }
        }
    }
}
