package com.pvt.less_19;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 * Created by W510 on 11.01.2018.
 */
public class Client implements Runnable {

    Shop shop;
    String name;
    ArrayList<String> shoppingBasket = new ArrayList<>();


    public Client(Shop shop, String name) {
        this.shop = shop;
        this.name = name;
//        this.shoppingBasket = shoppingBasket;
    }

    //    public Shop getShop() {
//        return shop;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<String> getShoppingBasket() {
//        return shoppingBasket;
//    }
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shop.enterShop(name);
        shop.shopping(name, shoppingBasket);

        if (shoppingBasket.size() == 0) {
            shop.exitShop(name);

        } else {
//                shop.paying(name,shoppingBasket);
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

            SEMAPHORE.release();
//            shop.finishShopping(name, shoppingBasket);

            shop.printReciept(name);
//            shop.exitShop(name);
        }
    }

    private void paying() {
        try {
            System.out.println(name + " стал в очередь");
            SEMAPHORE.acquire();
            System.out.println(name + " расчитывается в кассе");
            int timeWaiting = shoppingBasket.size() * 4000;
            Thread.sleep(timeWaiting);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}