package com.pvt.less_03;

/**
 * Created by W510 on 30.11.2017.
 */
public class class_05 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        String arr1[][] = new String[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr1[i][j] = "*";
                    if (j == arr[i].length - 1) {
                        System.out.println(arr1[i][j]);
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                } else {
                    arr1[i][j] = " ";
                    if (j == arr[i].length - 1) {
                        System.out.println(arr1[i][j]);
                    } else {
                        System.out.print(arr1[i][j]);
                    }
                }
            }
        }
    }
}
