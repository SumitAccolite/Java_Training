package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Slice {
    static int size ;
    static void addInArray(int s,ArrayList<Integer> myarr , int newAdd){
             size = s*2;
        ArrayList<Integer> myarr1 = new ArrayList<Integer>(size);
        //System.out.println(myarr1.size());
        for(int i =0 ;i < s/2 ; i++){
            myarr1.add(myarr.get(i));
        }
        myarr1.add(newAdd);
        System.out.println(myarr1);
        System.out.println(myarr1.size());
        //System.out.println(getArrayListCapacity(myarr1));


    }
    /*private static int getArrayListCapacity(ArrayList<?> arrayList) {
        try {
            Field elementData = ArrayList.class.getDeclaredField("elementData");
            elementData.setAccessible(true);
            Object[] internalArray = (Object[]) elementData.get(arrayList);
            return internalArray.length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        }
    }*/


}
