package com.pvt.less_08;

/**
 * Created by W510 on 13.12.2017.
 */
public class Priamoygolnik extends Shape{
    private int a;
    private int b;

    public Priamoygolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcPerimetr() {
        return (a+b)*2;
    }

    @Override
    public double calcSquare() {
        return a*b;
    }
}
