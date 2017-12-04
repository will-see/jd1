package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 26.11.2017.
 */
public class hw_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        sc.close();
        Boolean result = false;
        if (a+c <=e){
            if (b<=f && d<=f)
                result = true;
        }if (a+d <=e){
            if (b<=f && c<=f)
                result = true;
        }if (a+c <=f){
            if (b<=e && d<=e)
                result = true;
        }if (a+d <=f){
            if (b<=e && c<=e)
                result = true;
        }
        System.out.println(result);
    }
}
