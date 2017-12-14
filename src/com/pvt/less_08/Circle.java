package com.pvt.less_08;

/**
 * Created by W510 on 13.12.2017.
 */
public class Circle extends Shape{
    private double d;

    public Circle(double d) {
        this.d = d;
    }
    @Override
    public double calcPerimetr() {
        return d*Math.PI;
    }
    @Override
    public double calcSquare() {
        return Math.PI*d*d/4;
    }
}
