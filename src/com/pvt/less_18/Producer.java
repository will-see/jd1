package com.pvt.less_18;

/**
 * Created by W510 on 10.01.2018.
 */
public class Producer implements Runnable {
    Svalka svalka;

    public Producer(Svalka svalka) {
        this.svalka = svalka;
    }

    //создаем 20 элементов
    public void produce20() {
        svalka.partsAdd(20);
        System.out.println(svalka.parts);
    }

    @Override
    public void run() {
        produce20();
        for (int i = 1 ; i <= svalka.days ; i++) svalka.nexdDay();
//        svalka.nexdDay();
    }
}
