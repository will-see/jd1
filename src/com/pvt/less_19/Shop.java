package com.pvt.less_19;

import java.util.ArrayList;

/**
 * Created by W510 on 11.01.2018.
 */
public class Shop {
    public synchronized void enterShop(String who) {
        System.out.println(who + " пришел в магаз");
    }

    public void shopping(String who, ArrayList<String> shoppingBasket) {
        System.out.println(who + " совершает покупки");

        int countKindProducts = ((int) (Math.random() * 3));
        if (countKindProducts > 0) {
            shoppingBasket.add("Корзина заполнена"); //?????
        }
        int countPcsProducts = ((int) (Math.random() * 10 - 1));
        getPercheses(who, shoppingBasket, countKindProducts, countPcsProducts);
    }

    private synchronized void getPercheses(String who, ArrayList<String> shoppingBasket, int countKindProducts, int countPcsProducts) {
        for (int i = 0; i < countKindProducts; i++) {
            System.out.println(who + " положил в корзину " + countKindProducts + " - " + countPcsProducts + " шт.");
        }
    }

    public synchronized void finishShopping(String who, ArrayList<String> shoppingBasket) {
        if (shoppingBasket.size() == 0) {
            exitShop(who);
        } else {
            goQueue(who);
        }
    }

    private void goQueue(String who) {
        System.out.println(who + " стал в очередь");
        printReciept(who);
    }

    private void printReciept(String who) {
        System.out.println("Чек покупателя: " + who);
        exitShop(who);
    }

    private void exitShop(String who) {
        System.out.println(who + " ушел из магазина");
    }
}
