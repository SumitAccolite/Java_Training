package org.example;

import java.util.ArrayList;
import java.util.List;

//import static org.graalvm.compiler.nodes.calc.BinaryArithmeticNode.ReassociateMatch.x;

public class SumArray {
    public static void main(String[] args) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        innerList.add(4);
        lst.add(innerList);
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(7);
        innerList1.add(6);
        innerList1.add(1);
        innerList1.add(6);
        lst.add(innerList1);

        int rows = lst.size();
        //for(int i = 0; i < rows)

    }
}
