package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 10.01.2018.
 */
public class Worker implements Runnable {

    Svalka svalka;

    public Worker(Svalka svalka) {
        this.svalka = svalka;
    }

//    ArrayList<Parts> workerList;

    public void get() {
        int howMuch = (int) (Math.random() * 4);
        svalka.getParts("worker", howMuch);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        get();
    }
}
