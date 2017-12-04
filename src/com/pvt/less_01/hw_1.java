package com.pvt.less_01;

import java.util.Scanner;

/**
 * Created by W510 on 26.11.2017.
 */
public class hw_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dd = readDay();
        while (dd<1||dd>31){
            System.out.println("введено неверное число");
            dd = readDay();
        }
//        int dd = in.nextInt();
//        int mm = in.nextInt();
//        int yyyy = in.nextInt();
//        System.out.println(dd +"."+ mm + "." + yyyy);
        in.close();
    }
    static int readDay(){
        Scanner in = new Scanner(System.in);
        System.out.println("введите день");
        int dd = in.nextInt();
        return dd;
    }
    static int readMonth(){
        Scanner in = new Scanner(System.in);
        System.out.println("введите месяц");
        int mm = in.nextInt();
        return mm;
    }
}
