package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//List Examples and methods
public class Main {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(234);
        ls.add(209);
        ls.add(29);
        ls.add(25);
        ls.add(3);
        ls.add(3,1234);
        ls.add(3);ls.add(3);ls.add(3);
        //ls.add(10,192);
        //does not delete th evalues if we add at the same index but shifts to right
        //ls.set(1,100);//replaces the value from the 1 index value and replaces with the given value
       // ls.remove(4);removes from the index value
        //ls.remove(new Integer(234));//if we have to remove the value then we can use the new Integer in remove but in here it will create new object instead we can also do the following
       // ls.remove(Integer.valueOf(29));//removes without creating a new object
        System.out.println(ls);
        ls.removeAll(Collections.singleton(3));
        //System.out.println("After: "+ls);
        //Other Method
        List<Integer> elementsToRemove = new ArrayList<>(Arrays.asList(3));
        List<Integer> remove = new ArrayList<>();

        ls.removeAll(elementsToRemove);
        for(Integer a:ls){
            if(a == 3){
                remove.add(a);
            }
        }
        ls.removeAll(remove) ;
        System.out.println(ls);
    }
}