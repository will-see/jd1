package com.pvt.less_03;

import java.util.Arrays;

/**
 * Created by W510 on 28.11.2017.
 */
public class class_02 {
    public static void main(String[] args) {
        int array[] = new int[100];
        int j = 0;
        for (int i = 1; i != 0; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                if (j < 100) {
                    array[j] = i;
                    j++;
//                    System.out.print(i + " ");
                } else {
//                    System.out.println(" ");
                    for (int v : array)
                        System.out.print(v + " ");
                    break;
                }
            }
        }
    }
}
