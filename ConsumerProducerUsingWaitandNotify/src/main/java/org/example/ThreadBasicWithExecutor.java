package org.example;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBasicWithExecutor {
        public static void main(String[] args) {
            int numberOfThreads = 10 ;
            ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

            for (int i = 0; i < 100; i++) {
                executorService.submit(new ThreadBasicDemoWithExecutor());
            }
            executorService.shutdown();
        }
    }


    class ThreadBasicDemoWithExecutor implements Runnable {
        public void run() {
            try {
                System.out.println("Name of Thread is-> " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}

