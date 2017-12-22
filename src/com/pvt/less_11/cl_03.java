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

        if (map1.size() > map2.size()) {
            System.out.println(getSum(map1, map2));
        } else {
            System.out.println(getSum(map2, map1));
        }

    }

    static String getSum(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
            Integer key2 = entry2.getKey();

            for (Map.Entry<Integer, Integer> entry1 : map1.entrySet()) {
                Integer key1 = entry1.getKey();

                if (key1 > key2) {
                    map1.put(key2, entry2.getValue());
                    break;
                }
                if (Objects.equals(key1, key2)) {
                    int value = entry1.getValue() + entry2.getValue();

                    if (value == 0) {
                        map1.remove(key1);
                    } else {
                        map1.put(key1, value);
                    }
                    break;
                }
            }
        }

        ArrayList<Integer> keyList = new ArrayList<>(map1.keySet());
        Collections.reverse(keyList);

        boolean isFirstIteration = true;
        for (Integer key : keyList) {
            Integer value = map1.get(key);
            boolean isValuePositive = value > 0;
            String plusString = isValuePositive ? "+" : "-";
            value = Math.abs(value);

            if (!isFirstIteration || !isValuePositive) {
                sb.append(plusString);
            }
            isFirstIteration = false;
            if (key == 0) {
                sb.append(value);
            } else if (key == 1) {
                if (value != 1) {
                    sb.append(value);
                }
                sb.append("x");
            } else {
                if (value != 1) {
                    sb.append(value);
                }
                sb.append("x^").append(key);
            }
        }

        return sb.toString();

    }
}
