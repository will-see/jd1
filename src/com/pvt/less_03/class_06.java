package com.pvt.less_03;

import java.util.Scanner;

/**
 * Created by W510 on 30.11.2017.
 */
public class class_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int compareI = sc.nextInt()-1;
        int compareJ = sc.nextInt()-1;
        sc.close();

        equals(compareI, compareJ);


    }

    static void equals(int compareI, int compareJ) {
        int arr1 [][] = new int [][] {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};
        int arr2 [][] = new int [][] {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};

        boolean result = false;
        if(arr1[compareI][compareJ]==arr2[compareI][compareJ])
            result = true;
//        for (int i =0; i<arr1[compareI]; i++){
//            for (int j = 0; j<arr1[compareJ]; j++){
//                if(arr1[i][j]==1){
////              }
//            }
//        }
        System.out.println(result);
//        return result;
    }
}
