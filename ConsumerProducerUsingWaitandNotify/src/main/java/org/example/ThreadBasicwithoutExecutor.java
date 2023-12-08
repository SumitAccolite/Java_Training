package org.example;

public class ThreadBasicwithoutExecutor {
    public static void main(String[] args) {
        for(int i = 0 ; i < 100 ; i++){
            //ThreadBasicDemo obj = new ThreadBasicDemo();
            Thread obj = new Thread(new ThreadBasicDemo());
            obj.start();
        }
    }
}
class ThreadBasicDemo extends Thread{
   public void run(){
        try{
            System.out.println("Name of Thread is-> "+Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
