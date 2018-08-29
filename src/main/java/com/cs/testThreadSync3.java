package com.cs;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class testThreadSync3 {
    static Vector<Integer> list = new Vector<Integer>();
    static Thread[] threads = new Thread[6];
    static CountDownLatch latch = new CountDownLatch(6);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            int nub = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    list.add(nub);
                    System.out.println(nub + "add.\t");
                    latch.countDown();
                }
            });
            threads[i].start();
            threads[i].join();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }

}
