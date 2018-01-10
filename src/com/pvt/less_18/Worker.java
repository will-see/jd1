package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 10.01.2018.
 */
public class Worker implements Runnable {

    Svalka svalka;
    String name;

    public Worker(Svalka svalka, String name) {
        this.svalka = svalka;
        this.name = name;
    }

    public void get() {
        int howMuch = (int) (Math.random() * 4+1);
        svalka.getParts(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        get();
    }
}