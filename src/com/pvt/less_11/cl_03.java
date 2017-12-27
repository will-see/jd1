package com.pvt.less_11;

import java.util.*;

/**
 * Created by W510 on 22.12.2017.
 */
public class cl_03 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(6, 8);
        map1.put(3, 2);
        map1.put(2, 1);
        map1.put(1, 2);
        map1.put(0, 3);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(5, 4);
        map2.put(3, -3);
        map2.put(2, 4);
        map2.put(0, -5);

        System.out.println(getSSum(map1, map2));

    }

    private static StringBuilder getSSum(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        String s = "";
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> reverseSet = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            set.add(entry.getKey());
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            set.add(entry.getKey());
        }
        reverseSet = (TreeSet) set.descendingSet();
//        System.out.println(reverseSet);

        Iterator<Integer> iter = reverseSet.iterator();
        String znak = " + ";
        while (iter.hasNext()) {
            int currentKey = iter.next();
            int val1 = 0;
            int val2 = 0;
            if (map1.containsKey(currentKey)) {
                val1 = map1.get(currentKey);
            }
            if (map2.containsKey(currentKey)) {
                val2 = map2.get(currentKey);
            }
            int sumValues = val1 + val2;
            if (sumValues < 0) {
                znak = " - ";
            } else {
                znak = " + ";
            }
            if (sumValues != 0) {
                switch (currentKey) {
                    case 0:
//                        s += znak + Math.abs(sumValues);
                        sb.append(znak).append(Math.abs(sumValues));
                        break;
                    case 1:
//                        s += znak + Math.abs(sumValues) + "x";
                        sb.append(znak).append(Math.abs(sumValues)).append("x");
                        break;
                    default:
//                        if (s.isEmpty()) {
                        if (sb.length() == 0) {
//                            s += Math.abs(sumValues) + "x^" + currentKey;
                            sb.append(Math.abs(sumValues)).append("x^").append(currentKey);
                        } else {
//                            s += znak + Math.abs(sumValues) + "x^" + currentKey;
                            sb.append(znak).append(Math.abs(sumValues)).append("x^").append(currentKey);
                        }
                }
            }
        }
//        System.out.println(sb);
        return sb;
    }
}