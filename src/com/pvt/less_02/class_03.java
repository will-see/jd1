package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 27.11.2017.
 */
public class class_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yyyy = in.nextInt();
        int maxDate;
        boolean xYear = false;
        if(yyyy%4==0){
            xYear=true;
            if(yyyy%100==0){
                xYear=false;
                if(yyyy%400==0)
                    xYear = true;
            }
        }
        if (xYear==true){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }
}
