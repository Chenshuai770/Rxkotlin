package com.cs;

import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // TODO: 2018/8/28/028 网络请求
                    testNet1();
                }


            });
        }
    }
    synchronized
    private static void testNet1() {
    }
    synchronized
    private static void testNet2() {
    }
    synchronized 
    private static void testNet3() {
    }
}

