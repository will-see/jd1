package com.pvt.less_16;

import java.io.Serializable;

/**
 * Created by W510 on 01.01.2018.
 */
public class Computer implements Serializable {
    String name;
    String  cpu;
    int ram;
    int hdd;

    public Computer(String name, String cpu, int ram, int hdd) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

}
