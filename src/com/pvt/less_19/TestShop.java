package com.pvt.less_19;

/**
 * Created by W510 on 11.01.2018.
 */
public class TestShop {
    public static void main(String[] args) {

    Shop shop = new Shop();
    Client cl1 = new Client(shop, "Клиент 1");
    new Thread(cl1).start();
    Client cl2 = new Client(shop, "Клиент 2");
    new Thread(cl2).start();
    Client cl3 = new Client(shop, "Клиент 3");
    new Thread(cl3).start();
    Client cl4 = new Client(shop, "Клиент 4");
    new Thread(cl4).start();
    Client cl5 = new Client(shop, "Клиент 5");
    new Thread(cl5).start();
    }
}
