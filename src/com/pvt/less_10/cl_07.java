package com.pvt.less_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by W510 on 20.12.2017.
 * 7.	Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.
 */
public class cl_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 20 - 10));
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Set<Integer> set = new TreeSet<>();
//        for(int i=0; i<list2.size();i++){
//            set.partsAdd(list2.get(i));
//        }
//        System.out.println(set);
        int i = 0;
        int cicleCount = list.size();
        while (cicleCount >0) {
            if (list.get(i) < 0) {
                list.add(0, list.get(i));
                list.remove(i + 1);
                i++;
            } else if (list.get(i) > 0) {
                list.add(list.get(i));
                list.remove(i);
            }else {
                i++;
            }
            cicleCount--;
        }
        System.out.println(list);
//        System.out.println(set);
    }
}