package com.pvt.less_18;

import java.util.ArrayList;

/**
 * Created by W510 on 09.01.2018.
 */
public class Svalka implements Runnable{

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

    public void add20() {
        partsAdd(20);
    }

    public void run() {
        for (int i = 1 ; i <= 100 ; i++) {
            int toAdd = (int)(Math.random()*4+1);
            partsAdd(toAdd);
            System.out.println("added " +toAdd);
            try {
                wait(100);
            } catch (InterruptedException e) {
            }
        }
    }

}
