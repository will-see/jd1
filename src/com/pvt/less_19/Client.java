package com.pvt.less_19;

import java.util.ArrayList;

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

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shop.enterShop(name);
        shop.shopping(name,shoppingBasket);
        shop.finishShopping(name,shoppingBasket);
    }
}

