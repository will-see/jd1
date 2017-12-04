package com.pvt.less_03;

import java.util.Scanner;

/**
 * Created by W510 on 01.12.2017.
 */
public class class_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        long factFor=1;
        long factWhile=1;
        for (int i=1; i<=j; i++){
            factFor = factFor*i;
        }
        System.out.println(factFor);
        int i =1;
        while (i<=j){
            factWhile = factWhile*i;
            i++;
        }
        System.out.println(factWhile);
    }
}
