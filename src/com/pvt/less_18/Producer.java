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
    }

    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++) svalka.nexdDay();
    }
}
