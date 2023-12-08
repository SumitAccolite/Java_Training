package org.example;

public class Assignment1 {
    static int temp = 1 ;
    private static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for (int i = 0 ; i < 10 ; i++){
                        System.out.println(temp++);
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });t1.start();

            Thread t2 = new Thread(() -> printNumbers(11,20));
            Thread t3 = new Thread(() -> printNumbers(21,30));
            Thread t4 = new Thread(() ->printNumbers(31,40));
            t2.start();
            t3.start();
            t4.start();
            t2.join();
            t3.join();
            t4.join();

        Thread t5 = new Thread(()->{
            for (int i = 0 ; i < 10 ; i++) {
                System.out.println(temp++);
            }
        });
        t5.start();
        t5.join();

    }
    public static void printNumbers(int start, int end){
        synchronized (lock) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
                temp++;
            }
        }
    }
}



