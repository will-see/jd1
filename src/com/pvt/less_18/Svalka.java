package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 09.01.2018.
 */
public class Svalka {

    private boolean allowed = true;
    ArrayList<Parts> parts = new ArrayList<>();
    int today = 0;

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
//        for (int i = 1; i <= 10; i++) {
        if (today<100) {
            today++;
            allowed = true;
            notifyAll();
            int toAdd = (int) (Math.random() * 4 + 1);
            partsAdd(toAdd);
            System.out.println("added " + toAdd);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            try {
//                wait(100);
//            } catch (InterruptedException e) {
//            }
            System.out.println("Next Day");
        }
    }

    public synchronized void getParts(String who, int howMuch) {
        ArrayList<Parts> workerList = new ArrayList<>();
        int got = 0;
        while (allowed) {
            if (parts.size() > howMuch) {
                for (int i = 0; i < howMuch; i++) {
                    int partNumber = (int) (Math.random() * parts.size());
                    workerList.add(parts.get(partNumber));
                    parts.remove(partNumber);
                    got = i + 1;
                    allowed = false;
                }
            } else {
                if (parts.size() > 0) {
                    for (int i = 0; i < parts.size(); i++) {
                        workerList.add(parts.get(0));
                        parts.remove(0);
                        got = i + 1;
                        allowed = false;
                    }
                }
            }
        }
        System.out.println(who + " get " + got + " parts");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
