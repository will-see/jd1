package com.pvt.less_19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.Semaphore;

/**
 * Created by W510 on 11.01.2018.
 */
public class Shop {

    Good beer = new Good(1, "beer", 1.1, 0.05, 50);
    Good vodka = new Good(2, "vodka", 6, 0.05, 50);
    Good cheeps = new Good(3, "cheeps", 3, 0.05, 50);
    Good bread = new Good(4, "bread", 1.2, 0.05, 50);
    Good milk = new Good(5, "milk", 1.3, 0.05, 50);
    Good fish = new Good(6, "fish", 5, 0.05, 50);
    Good kefir = new Good(7, "kefir", 1.3, 0.05, 50);
    Good witeBread = new Good(8, "witeBread", 1.2, 0.05, 50);
    Good gre4ka = new Good(9, "gre4ka", 1, 0.05, 50);
    Good kolbaski = new Good(10, "kolbaski", 8, 0.05, 50);
    Good jogurt = new Good(11, "jogurt", 0.5, 0.05, 50);
    Good bulo4ka = new Good(12, "bulo4ka", 0.5, 0.05, 50);

    List<Good> goodsList = Arrays.asList(beer, vodka, cheeps, bread, milk, fish, kefir, witeBread, gre4ka, kolbaski, jogurt, bulo4ka);

    public synchronized void enterShop(String who) {
        System.out.println(" <===== " + who + " пришел в магаз");
    }

    public void shopping(Client client) {
        System.out.println(client.getName() + " совершает покупки, думает, выбирает");
        int countKindProducts = ((int) (Math.random() * 12));
        if (countKindProducts > 0) {
            int nO = 0;
            for (int getKindProducts = 0; getKindProducts < countKindProducts; getKindProducts++) {
                nO++;
                int tempNumber = ((int) (Math.random() * 11));
                while (!client.getMapSoppingBasket().containsKey(goodsList.get(tempNumber).getName())) {
                    getPerchases(client,tempNumber, nO);
                }
            }
        }
    }

    private synchronized void getPerchases(Client client, int tempNumber, int nO) {
        int countPcsProducts = ((int) (Math.random() * 20));
        Item item = new Item(nO, goodsList.get(tempNumber), countPcsProducts, goodsList.get(tempNumber).getPrice(), goodsList.get(tempNumber).getDiscount(), countPcsProducts * goodsList.get(tempNumber).getPrice() * (1 - goodsList.get(tempNumber).getDiscount()));
        client.getListItem().add(item);
        client.getMapSoppingBasket().put((goodsList.get(tempNumber).getName()), countPcsProducts);
        System.out.println(client.getName() + " положил в корзину " + (goodsList.get(tempNumber)).getName() + " - " + countPcsProducts + " шт.");
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
    int idReceipt;

    public synchronized void printReciept(String who, Map<String, Integer> mapShoppingBasket, int casseNo, List<Item> listItem) {
        System.out.println("\n-=-=-=- Чек покупателя: " + who + " -=-=-=-");
//        System.out.println(mapShoppingBasket);
        idReceipt++;
        double totalSum = 0;
        for (int i = 0; i < listItem.size(); i++) {
            totalSum += listItem.get(i).getDiscountAmount();
        }
        double change = (totalSum+ 20 - (totalSum%10))-totalSum;


        Receipt receipt = new Receipt(idReceipt, LocalDate.now(), casseNo, listItem, totalSum, change);
        System.out.println(receipt);
        exitShop(who);
    }

    public void exitShop(String who) {
        System.out.println(" <===== " + who + " ушел из магазина");
    }
}
