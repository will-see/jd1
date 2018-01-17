package com.pvt.less_20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by W510 on 15.01.2018.
 */
public class Cl_01 {

    static volatile boolean enable = true;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Scanner sc = new Scanner(System.in);
            System.out.println("введите число");
        while (enable) {
            int timeToSleap=sc.nextInt();
            if (timeToSleap!=-1) {
                service.submit(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " спал " + timeToSleap );
                        System.out.println("введите число");
                    }
                });
            }else enable=false;
        }
        service.shutdown();
    }
}
