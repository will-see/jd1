package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 27.11.2017.
 */
public class class_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        sc.close();
        if (money%100==11) {
            System.out.println(money + " рублей");
        }else if (money%10 == 0 ){
            System.out.println(money + " рублей");
        }else if (money%10 == 1 ){
            System.out.println(money + " рубль");
        }else if (money%10 == 2 ){
            System.out.println(money + " рубля");
        }else if (money%10 == 3 ){
            System.out.println(money + " рубля");
        }else if (money%10 == 4 ){
            System.out.println(money + " рубля");
        }else if (money%10 == 5 ){
            System.out.println(money + " рублей");
        }else if (money%10 == 6 ){
            System.out.println(money + " рублей");
        }else if (money%10 == 7 ){
            System.out.println(money + " рублей");
        }else if (money%10 == 8 ){
            System.out.println(money + " рублей");
        }else if (money%10 == 9 ){
            System.out.println(money + " рублей");
        }
    }
}
