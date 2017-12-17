package com.pvt.less_08;

/**
 * Created by W510 on 15.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(6);
        

        if (circle.isAreaEquals(circle1)){
            System.out.println("yes");
        }else System.out.println("no");

        Quad q = new Quad(5,5);
        Quad q1 = new Quad(5,5);

        if (q.isAreaEquals(q1)){
            System.out.println("yes");
        }else System.out.println("no");
    }

}
