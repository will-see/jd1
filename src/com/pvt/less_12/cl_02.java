package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 */
public class cl_02 {
    public static void main(String[] args) {
        int [] arr = new int [5];
        try {
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
