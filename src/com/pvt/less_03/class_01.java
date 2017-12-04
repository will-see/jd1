package com.pvt.less_03;

/**
 * Created by W510 on 28.11.2017.
 */
public class class_01 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length-1; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
