package com.pvt.less_18;

/**
 * Created by W510 on 09.01.2018.
 */
public class Test {
    public static void main(String[] args) {
        Svalka svalka = new Svalka();
        svalka.add20();
        new Thread(svalka).start();
    }
}
