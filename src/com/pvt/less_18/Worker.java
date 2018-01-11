package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 10.01.2018.
 */
public class Worker implements Runnable {

    Svalka svalka;
    String name;
    ArrayList<Parts> crazyList = new ArrayList<>();

    public Worker(Svalka svalka, String name) {
        this.svalka = svalka;
        this.name = name;
    }

    public void get() {
        svalka.getParts(name, crazyList);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        get();
//        for (int i=0;i<svalka.temporalList.size();i++){
//            crazyList.add(svalka.temporalList.get(i));
//        }
//        svalka.temporalList.clear();
////        svalka.workerList.clear();
//        System.out.println(svalka.workerList.size());
        System.out.println(crazyList.size());
    }
}