package com.pvt.less_03;

/**
 * Created by W510 on 29.11.2017.
 */
public class class_03 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 1, 4, 5, 2};
        int min = array[0];
        int minI = 0;
        int max = array[0];
        int maxI = 0;
        for (int i : array) {
            if (array[i] > max) {
                max = array[i];
                maxI = i;
            }
            if (array[i] < min) {
                min = array[i];
                minI = i;
            }
        }
        System.out.println(max + " " + min);
        System.out.println(maxI + " " + minI);
        int sum = 0;
        if(maxI == minI) {
        }else if (maxI > minI) {
//            for (int i = minI + 1; i == maxI - 1; i++) {
            for (int i = minI + 1; i < maxI; i++) {
                sum += array[i];
            }
        } else {
            for (int i = maxI + 1; i < minI; i++) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
