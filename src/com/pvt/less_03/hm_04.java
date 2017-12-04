package com.pvt.less_03;

import java.util.Arrays;

/**
 * Created by W510 on 01.12.2017.
 */
public class hm_04 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        int arrLine[] = new int[arr.length * arr[0].length];
        arrLine = linearize(arr);
        System.out.println(Arrays.toString(arrLine));
    }

    private static int[] linearize(int[][] arr) {
        int arrLine[] = new int[arr.length * arr[0].length];
        int iArrLine = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrLine[iArrLine] = arr[i][j];
                iArrLine++;
            }
        }
        return arrLine;
    }
}
