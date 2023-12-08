package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(123,"A");
        mp.put(145,"B");
        mp.put(187,"C");
        mp.put(113,"d");
        mp.put(109,"e");
        mp.put(112,"f");
        mp.put(1097,"g");
        mp.put(1123,"h");
        mp.put(1234,"i");
        System.out.println("Before\n");
        System.out.println(mp);
        Set<Map.Entry<Integer, String>> entries = mp.entrySet();
        Iterator<Map.Entry<Integer, String>> iterableList = entries.iterator();
        List<Map.Entry<Integer, String>> list = new ArrayList<>();
        while(iterableList.hasNext()){
            list.add(iterableList.next());
        }
        Collections.sort(list ,(x,y)->x.getValue().compareTo(y.getValue()));
        Map opMap = new LinkedHashMap();
        for(Map.Entry<Integer, String> entry:list){
            opMap.put(entry.getKey(),entry.getValue()) ;
        }
        System.out.println("After\n");
        System.out.println(opMap);
    }
}