package com.pvt.less_11;

import java.util.*;

/**
 * Created by W510 on 22.12.2017.
 */
public class cl_03_bkp {
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

    private static String getSSum(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
        String s = "";
        int maxKey = 0;
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> reverseSet = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            set.add(entry.getKey());
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            set.add(entry.getKey());
        }
        reverseSet = (TreeSet) set.descendingSet();
        System.out.println(reverseSet);

        Iterator<Integer> iter = reverseSet.iterator();
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
            if (sumValues != 0) {
                switch (currentKey) {
                    case 0:
                        s += " + " + sumValues;
                        break;
                    case 1:
                        s += " + " + sumValues + "x";
                        break;
                    default:
                        if (s.isEmpty()) {
                            s += sumValues + "x^" + currentKey;
                        } else {
                            s += " + " + sumValues + "x^" + currentKey;
                        }
                }
            }
        }
        System.out.println(s);
        return s;
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
