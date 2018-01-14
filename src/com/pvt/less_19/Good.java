package com.pvt.less_19;

/**
 * Created by W510 on 13.01.2018.
 */
public class Good {
    int id;
    String name;
    double price;
    double discount;
    int available;

    public Good(int id, String name, double price, double discount, int available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
