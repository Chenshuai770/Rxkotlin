package com.cs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test2 {

    static Thread t1 = new Thread(new Runnable() {

        @Override
        public void run() {
            System.out.println("t1");
        }
    }, "t1");

    static Thread t2 = new Thread(new Runnable() {

        @Override
        public void run() {
            try {
                t1.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("t2");
        }
    }, "t2");

    static Thread t3 = new Thread(new Runnable() {

        @Override
        public void run() {
            try {
                t2.join();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("t3");
        }
    }, "t3");

    public static void main(String[] args) {

        Thread t1 = null;

        for (int i = 0; i < 12; i++) {
            try {
                int finalI = i;
                Callable<String> callable = new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return finalI + "";
                    }
                };
                FutureTask futureTask = new FutureTask<>(callable);
                Thread thread = new Thread(futureTask);
                thread.start();
                thread.join();
                String s = (String) futureTask.get();
                System.out.println(">>>"+s);
                if (s.equals("4")){
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }

    }


}
