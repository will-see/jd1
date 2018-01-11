package com.pvt.less_19;

import java.util.ArrayList;

/**
 * Created by W510 on 11.01.2018.
 */
public class Shop {
    public synchronized void enterShop(String who){
        System.out.println(who + " пришел в магаз");
    }
    public synchronized void exitShop(String who, ArrayList<String> shoppingBasket){
//        if (shopBasket.size=0) {
            System.out.println(who + " ушел из магазина");
//        } else {
//        System.out.println(who + " стал в очередь");
//        }
    }
}
