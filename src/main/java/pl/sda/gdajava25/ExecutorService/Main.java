package pl.sda.gdajava25.ExecutorService;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pulaWatkow = Executors.newCachedThreadPool();

        for (int i = 0; i < 10000; i++) {
            int finalI = i;
            pulaWatkow.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(new Random().nextInt(5));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(finalI);
                }
            });


        }
    }
}
