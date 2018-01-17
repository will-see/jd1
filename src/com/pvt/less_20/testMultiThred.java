package com.pvt.less_20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by W510 on 17.01.2018.
 */
public class testMultiThred {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 100; i++) {
            service.submit(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        service.shutdown();
    }
}