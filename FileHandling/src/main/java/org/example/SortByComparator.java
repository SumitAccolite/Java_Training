package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByComparator {
    static List<String> sortLine(List<String> lines) {
        //Collections.sort(lines , (x,y)-> y.length()-x.length());
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
        Collections.sort(lines,comparator);
        return lines;
    }
}
