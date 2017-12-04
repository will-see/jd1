package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 26.11.2017.
 */
public class hw_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = discriminant(a,b,c);
        if (isPositive(d)){
            double x1 = (b*b+Math.sqrt(d))/(2*a);
            double x2 = (b*b-Math.sqrt(d))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (isZero(d)){
            double x = b*b/(2*a);
            System.out.println("x = " +x);
        }else
        System.out.println("net korney");
    }
    static int discriminant(int a, int b, int c){

        int discriminant = b*b - 4*a*c;
        return discriminant;
    }
    static boolean isPositive(int n){
        return n>0;
    }
    static boolean isZero(int n){
        return n==0;
    }
}
