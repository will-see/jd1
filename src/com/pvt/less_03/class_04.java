package com.pvt.less_03;

import java.util.Arrays;

/**
 * Created by W510 on 29.11.2017.
 */
public class class_04 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (99-10) + 10);

//            System.out.print(array[i] + " ");
            if (i!=0) {
                if (array[i] <= array[i - 1]) {
                    flag = false;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(flag);
    }
}
