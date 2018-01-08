package com.pvt.less_17;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by W510 on 08.01.2018.
 * 3.	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
public class Cl_03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 3);
        map.put("bbbbbbbb", 8);
        map.put("cccc", 4);
        map.put("eeeee", 5);
        map.put("aaaaaa", 6);

//        int sum = map.entrySet()
//                .stream()
//                .filter( e -> e.getKey().length() < 7)
////                .map(e-> e.getValue())
//                .forEach

        int result = map.entrySet()
                .stream()
                .filter(e -> e.getKey().length() < 7)
//                .forEach(e -> System.out.println(e.getValue()));
                .mapToInt(s->s.getValue())
                .sum();

        System.out.println(result);
    }
}
