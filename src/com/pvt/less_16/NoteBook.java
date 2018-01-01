package com.pvt.less_16;

import java.io.Serializable;

/**
 * Created by W510 on 01.01.2018.
 */
public class NoteBook extends Computer implements Serializable {
    transient int weight;
    int buttons;
    TouchPad <Integer> touchPad = new TouchPad<>(buttons);

    public NoteBook(String name, String cpu, int ram, int hdd, int weight, int buttons) {
        super(name, cpu, ram, hdd);
        this.weight = weight;
        this.buttons = buttons;
    }
}
