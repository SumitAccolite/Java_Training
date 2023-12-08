package org.example;

import java.util.*;

public class GroupBySalary {
    public static void main(String[] args) {
        List<Grad> allGrads = new ArrayList<>(Arrays.asList(
                new Grad("A", 34, 50000, 2023),
                new Grad("B", 34, 50000, 2023),
                new Grad("C", 34, 50000, 2023),
                new Grad("D", 34, 50000, 2023),
                new Grad("E", 34, 50000, 2023)
        ));

        Map<Integer, List<Grad>> groupedMap = new LinkedHashMap<>();
        for(Grad grad: allGrads) {
            if(groupedMap.containsKey(grad.getSalary())) {


                groupedMap.get(grad.getSalary().add(grad));
            }
            else {
                groupedMap.put(grad.getSalary(), new ArrayList<>(Arrays.asList(grad)));
            }
        }
    }
}
