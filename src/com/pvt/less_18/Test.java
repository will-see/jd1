package com.pvt.less_18;

/**
 * Created by W510 on 09.01.2018.
 */
public class Test {
    public static void main(String[] args) {
        Svalka svalka = new Svalka();
        Producer producer = new Producer(svalka);
        new Thread(producer).start();
        Worker worker1 = new Worker(svalka);
        new Thread(worker1).start();
//        svalka.add20();
//        new Thread(svalka).start();
//        svalka.run();
    }
}
