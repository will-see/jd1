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
    public double calcSquare() {
        return Math.PI*d*d/4;
    }

    @Override
    public boolean isAreaEquals(Shape shape) {
        return super.isAreaEquals(shape);
    }
}
