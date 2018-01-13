package com.pvt.less_18;

import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println(name + " собрано деталей " + crazyList.size());


        ArrayList<Parts> partsList = new ArrayList<>();
//
//        int counBody = Collections.frequency(crazyList, Parts.BODY);
//        int countCPU = Collections.frequency(crazyList, Parts.CPU);
//        int countHDD = Collections.frequency(crazyList, Parts.HDD);
//        int countHead = Collections.frequency(crazyList, Parts.HEAD);
//        int countLeftHand = Collections.frequency(crazyList, Parts.LEFT_HAND);
//        int countRightHand = Collections.frequency(crazyList, Parts.RIGHT_HAND);
//        int countLeftLeg = Collections.frequency(crazyList, Parts.LEFT_LEG);
//        int countRightLeg = Collections.frequency(crazyList, Parts.LEFT_LEG);
//        int countRam = Collections.frequency(crazyList, Parts.RAM);

        partsList.add(Parts.BODY);
        partsList.add(Parts.CPU);
        partsList.add(Parts.HDD);
        partsList.add(Parts.HEAD);
        partsList.add(Parts.LEFT_HAND);
        partsList.add(Parts.RIGHT_HAND);
        partsList.add(Parts.LEFT_LEG);
        partsList.add(Parts.LEFT_LEG);
        partsList.add(Parts.RAM);

        int count=0;
        int minCount=Collections.frequency(crazyList, Parts.BODY);
        for (int i = 0; i < partsList.size(); i++) {
            count = Collections.frequency(crazyList, partsList.get(i));
            if (count<minCount)minCount=count;
        }

        System.out.println(name + " собрано роботов " + count);
    }
}