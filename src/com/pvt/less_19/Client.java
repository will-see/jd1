package com.pvt.less_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * Created by W510 on 11.01.2018.
 */
public class Client implements Runnable {

    Shop shop;
    String name;
    Map<String,Integer> mapSoppingBasket = new HashMap<>();
    int casseNo;
    List<Item> listItem = new ArrayList<>();
    boolean basketIsEmpty=true;

    public Client(Shop shop, String name) {
        this.shop = shop;
        this.name = name;
//        this.shoppingBasket = shoppingBasket;
    }

    public Shop getShop() {
        return shop;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMapSoppingBasket() {
        return mapSoppingBasket;
    }

    public List<Item> getListItem() {
        return listItem;
    }

    public int getCasseNo() {
        return casseNo;
    }

    private static final Semaphore SEMAPHORE = new Semaphore(3, true);
    private static final boolean[] CASH_POINT = new boolean[3];

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shop.enterShop(name);
        shop.shopping(this);

        if (mapSoppingBasket.size() == 0) {
//        if (basketIsEmpty==true) {
            shop.exitShop(name);

        } else {
            paying();
//            try {
//                System.out.println(name + " стал в очередь");
//                SEMAPHORE.acquire();
//                System.out.println(name + " расчитывается в кассе");
//                int timeWaiting = shoppingBasket.size() * 4000;
//                Thread.sleep(timeWaiting);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            SEMAPHORE.release();
//            shop.finishShopping(name, shoppingBasket);

            shop.printReciept(name, mapSoppingBasket, casseNo, listItem);
//            shop.exitShop(name);
        }
    }

    private void paying() {
        try {
            System.out.println(name + " стал в очередь");
            SEMAPHORE.acquire();

            int cashPoint = -1;

            //Ищем свободную кассу
            synchronized (CASH_POINT) {
                for (int i = 0; i < 3; i++)
                    if (!CASH_POINT[i]) {      //Если касса свободно
                        CASH_POINT[i] = true;  //переходим в кассу
                        cashPoint = i;         //Наличие свободного места, гарантирует семафор
                        casseNo=i+1;
                        System.out.println(name + " расчитывается в кассе № " + i++);
                        break;
                    }
            }
//            System.out.println(name + " расчитывается в кассе");
            int timeWaiting = listItem.size() * 1000;
            Thread.sleep(timeWaiting);
            synchronized (CASH_POINT) {
                CASH_POINT[cashPoint] = false;//Освобождаем кассу
            }
            SEMAPHORE.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}