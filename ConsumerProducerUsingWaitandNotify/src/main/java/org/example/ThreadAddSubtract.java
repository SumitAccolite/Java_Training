package org.example;

import java.lang.Thread ;
public class ThreadAddSubtract{
    static int count1 = 0 ;

    public static void main(String[] args) throws InterruptedException{
        /*Count inc = new Count();
        Count dec = new Count();*/

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        for (int i = 0; i < 100; i++) {
                            //inc.add();
                            count1++;
                            System.out.println(count1);
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (this) {
                    try {
                        for (int i = 0; i < 100; i++) {
                            //dec.subtract();
                            count1--;
                            System.out.println(count1);
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.sleep(1000);
        System.out.println("---------------------T1 Done-----------------------");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("\n--------------Value after Add And Subtract--------------\n\n"+count1);
    }

}
/*class Count{
    public static int count1 = 0 ;
    public static void add(){
        count1++;
    }
    public static void subtract(){
        count1--;
    }
}*/

