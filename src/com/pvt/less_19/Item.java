package com.pvt.less_19;

import java.text.DecimalFormat;

/**
 * Created by W510 on 13.01.2018.
 */
public class Item {
    int nO;
    Good good;
    int quantity;
    double cost;
    double discount;
    double discountAmount;

    public Item(int nO, Good good, int quantity, double cost, double discount, double discountAmount) {
        this.nO = nO;
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
        this.discountAmount = discountAmount;
    }

    public int getnO() {
        return nO;
    }

    public Good getGood() {
        return good;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
    String pattern = "##0.00";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    @Override
    public String toString() {
        return "\n" + nO + " " + good.getName() + " " + quantity + "шт. " + cost + "руб. " + "скидка:" + discount + "% " + " итого:" + decimalFormat.format(discountAmount) + "руб.";
    }
}
