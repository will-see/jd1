package com.pvt.less_08;

/**
 * Created by W510 on 15.12.2017.
 */
public class ShapeUtils {
    static boolean isRectangle(Shape f) {
        if (f instanceof Priamoygolnik) {
            System.out.println("прямоугольник");
            return true;
        }
        return false;
    }

    static boolean isTriangle(Shape f) {
        if (f instanceof Triagle90) {
            System.out.println("треугольник");
            return true;
        }
        return false;
    }
}
