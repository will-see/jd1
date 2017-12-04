package com.pvt.less_03;

import java.util.Scanner;

/**
 * Created by W510 on 01.12.2017.
 */
public class class_09 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            if (i == 1 || i == 2) {
                flag = true;
            } else {
                flag = true;
                for (int j = 2; j < i / 2 + 1; j++) {
                    if (i % j == 0) {
                        flag = false;
                    }
                }
            }
        }
        System.out.println(i + " " + flag);
    }
}
