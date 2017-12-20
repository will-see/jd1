package com.pvt.less_10;

import java.util.ArrayList;

/**
 * Created by W510 on 20.12.2017.
 * 5.	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 */
public class cl_05 {
    public static void main(String[] args) {
        ArrayList<Integer> mn1 = new ArrayList<>();
        for(int i=0; i<10; i++){
            mn1.add(i);
        }
        ArrayList<Integer> mn2 = new ArrayList<>();
        for(int i=0; i<10; i++){
            mn2.add(i+5);
        }
        System.out.println(mn1);
        System.out.println(mn2);
        System.out.println("summ" + summ(mn1, mn2));
        System.out.println("cross" + cross(mn1, mn2));
//        System.out.println(mn1);
//        System.out.println(mn2);
    }

    public static  ArrayList<Integer> cross(ArrayList<Integer> mn1, ArrayList<Integer> mn2) {
        int i=0;
        ArrayList<Integer> cross = new ArrayList<>(mn1);
        while (i<cross.size()){
            if (!mn2.contains(cross.get(i))){
                cross.remove(i);
            } else {
                i++;
            }
        }
        return cross;
    }

    private static ArrayList<Integer> summ (ArrayList<Integer> mn1, ArrayList<Integer> mn2) {
        int i=0;
        ArrayList<Integer> summ = new ArrayList<>(mn1);
        while (i<mn2.size()){
            if (!summ.contains(mn2.get(i))){
                summ.add(mn2.get(i));
            } else {
                i++;
            }
        }
        return summ;
    }

}