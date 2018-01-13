package com.pvt.less_19;

import java.util.ArrayList;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.Semaphore;

/**
 * Created by W510 on 11.01.2018.
 */
public class Shop {
    public synchronized void enterShop(String who) {
        System.out.println(" <===== " + who + " пришел в магаз");
    }

    public void shopping(String who, ArrayList<String> shoppingBasket) {
        System.out.println(who + " совершает покупки, думает, выбирает");
        int countKindProducts = ((int) (Math.random() * 5));
        if (countKindProducts > 0) {
            shoppingBasket.add("Корзина заполнена"); //?????
            for (int getKindProducts = 0; getKindProducts < countKindProducts; getKindProducts++) {
                getPerchases(who, shoppingBasket, getKindProducts);
            }
        }
    }

    private synchronized void getPerchases(String who, ArrayList<String> shoppingBasket, int getKindProducts) {
        int countPcsProducts = ((int) (Math.random() * 20));
        System.out.println(who + " положил в корзину " + getKindProducts + " - " + countPcsProducts + " шт.");

    }


//    private static final Semaphore SEMAPHORE = new Semaphore(3, true);
//    public void paying(String who, ArrayList shoppingBasket){
//    try {
//        System.out.println(who + " стал в очередь");
//        SEMAPHORE.acquire();
//        System.out.println(who + " расчитывается в кассе");
//        int timeWaiting = shoppingBasket.size() * 4000;
//        Thread.sleep(timeWaiting);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }}

    public void printReciept(String who) {
        System.out.println("-=-=-=- Чек покупателя: " + who + " -=-=-=-");
        exitShop(who);
    }

    public void exitShop(String who) {
        System.out.println(" <===== " + who + " ушел из магазина");
    }
}
