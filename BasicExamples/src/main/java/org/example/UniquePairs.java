package org.example;

import java.util.*;

public class UniquePairs {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String,String> mp = new LinkedHashMap<>();//Hashmap doesn't allow duplicate keys
        for(int i = 0 ; i < 3 ;i++){
            String s1 = sc.next();
            String s2 = sc.next() ;
            if(s1.equals(s2)){
                System.out.println("S1 and S2 should not be equal");
                break;
            }
            mp.put(s1,s2);
        }
        System.out.println(mp);
        System.out.println(mp.size());
        Set<String> Keys = new HashSet<>();

        System.out.println(Keys  = mp.keySet());
        Collection<String> Values;
        System.out.println(Values  =  mp.values());
    }
}
