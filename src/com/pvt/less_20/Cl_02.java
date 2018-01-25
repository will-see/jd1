package com.pvt.less_20;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by W510 on 17.01.2018.
 */
public class Cl_02 {

    static volatile int maxValue = 0;

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();
        for (long i = 0; i < 1000000; i++) {
            list.add((int) (Math.random() * 300));
        }
        long timeStart = System.currentTimeMillis();
        int maxValue = list.stream()
                .mapToInt((x) -> x)
                .max()
                .getAsInt();
        long timeEnd = System.currentTimeMillis();
        long timeDelta = timeEnd - timeStart;
        System.out.println("max:" + maxValue + " найдено за время:" + timeDelta);

//        maxValue = 0;
//        ExecutorService service = Executors.newFixedThreadPool(10);
//        long timeStart = System.currentTimeMillis();
//
//        service.submit(new Runnable() {
//            public void run() {
//                maxValue = list.stream()
//                        .mapToInt((x) -> x)
//                        .max()
//                        .getAsInt();
//                long timeEnd = System.currentTimeMillis();
//                long timeDelta = timeEnd - timeStart;
//                System.out.println("max:" + maxValue + " найдено за время:" + timeDelta);
//                service.shutdown();
//            }
//        });
    }
}
