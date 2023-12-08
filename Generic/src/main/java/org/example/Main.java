package org.example;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student<String> t1 = new Student() ;
        Student<Integer> t2 = new Student();

        t1.setObj("Sumit");
        t2.setObj(7501);

        System.out.println(t1.getObj());
        System.out.println(t2.getObj());
    }
}