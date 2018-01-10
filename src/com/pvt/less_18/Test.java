package com.pvt.less_18;

/**
 * Created by W510 on 09.01.2018.
 */
public class Test {
    public static void main(String[] args) {
        Svalka svalka = new Svalka();
        Producer producer = new Producer(svalka);
        new Thread(producer).start();
        Worker worker1 = new Worker(svalka,"w1");
        Worker worker2 = new Worker(svalka,"w2");
        new Thread(worker1).start();
        new Thread(worker2).start();
    }
}

