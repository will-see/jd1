package com.pvt.less_08;

/**
 * Created by W510 on 13.12.2017.
 */
public class Triagle90 extends Shape {
    private int a;
    private int b;
//    private int c;

    public Triagle90(int a, int b) {
        this.a = a;
        this.b = b;
//        this.c = c;
    }

    @Override
    public double calcSquare() {
        return a*b/2;
    }
}
