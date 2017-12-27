package com.pvt.less_11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by W510 on 22.12.2017.
 */
public class cl_04 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20 - 10));
        }
        System.out.println(list);
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<list.size();i++){
            set.add(list.get(i));
        }
        System.out.println(set);
        System.out.println(minMax(set,3,5));
    }

    private static String minMax(Set<Integer> set, int min, int max) {
//        int [] arr = set.toArray(new int[set.size()]);
        if(min > set.size()||max > set.size()){
            return "Введенные значения превышают размер черного ящика.";
        } else {
            ArrayList<Integer> treeList = new ArrayList<>(set);
            int minValue = treeList.get(min - 1);
            int maxValue = treeList.get(treeList.size() - (max));
            String minMax = min + "-е минимальное значение " + minValue + ", " + max + "-е ммаксимальное значение " + maxValue;
            return minMax;
        }
    }
}
