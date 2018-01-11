package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 09.01.2018.
 */
public class Svalka {

    //    private boolean allowed = true;
    int days = 100;
    int today = 0;
    ArrayList<Parts> parts = new ArrayList<>();

    public void partsAdd(int count) {
        for (int i = 0; i < count; i++) {
            int part = (int) (Math.random() * 9);
            switch (part) {
                case 0: {
                    parts.add(Parts.BODY);
                    break;
                }
                case 1: {
                    parts.add(Parts.HEAD);
                    break;
                }
                case 2: {
                    parts.add(Parts.LEFT_HAND);
                    break;
                }
                case 3: {
                    parts.add(Parts.RIGHT_HAND);
                    break;
                }
                case 4: {
                    parts.add(Parts.LEFT_LEG);
                    break;
                }
                case 5: {
                    parts.add(Parts.RIGHT_LEG);
                    break;
                }
                case 6: {
                    parts.add(Parts.CPU);
                    break;
                }
                case 7: {
                    parts.add(Parts.RAM);
                    break;
                }
                case 8: {
                    parts.add(Parts.HDD);
                    break;
                }
            }
        }
//        System.out.println(parts);
    }


    public synchronized void nexdDay() {
        today++;
        try {
            wait(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int toAdd = (int) (Math.random() * 4 + 1);
        partsAdd(toAdd);
        System.out.println("added " + toAdd);
//        System.out.println(parts);
        System.out.println("--------------- Next Day " + today + "----------------------");
        notifyAll();
    }

    public synchronized void getParts(String who, ArrayList<Parts> crazyList) {
        ArrayList<Parts> workerList = new ArrayList<>();
        for (int i = 0; i < days; i++) {
            System.out.println("size :" + parts.size());
            int get = (int) (Math.random() * 4 + 1);
            if (get < parts.size()) {
                for (int j = 0; j < get; j++) {
                    int partNumber = (int) (Math.random() * parts.size());
//                    workerList.add(parts.get(partNumber));
                    crazyList.add(parts.get(partNumber));
                    parts.remove(partNumber);
                }
                System.out.println(who + " get " + get + " parts");
            } else {
                System.out.println(who + " get " + parts.size() + " parts");
                for (int j = 0; j < parts.size(); j++) {
//                    workerList.add(parts.get(0));
                    crazyList.add(parts.get(0));
                    parts.remove(0);
                }
            }

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println(parts);
    }
}
