package org.example;

import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
            myarr.add(23);
            myarr.add(43);
            myarr.add(43);
            myarr.add(23);
            myarr.add(43);
            myarr.add(43);
        System.out.println(myarr.size());
        int size = myarr.size();
        int x = 8 ;
        Slice.addInArray(size , myarr , x);
    }
}
