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

    public double calcDiagonal() {
        return Math.sqrt(a*a+b*b);
    }

    @Override
    public double calcSquare() {
        return a*b;
    }

    @Override
    public boolean isAreaEquals(Shape shape) {
        return super.isAreaEquals(shape);
    }
}
