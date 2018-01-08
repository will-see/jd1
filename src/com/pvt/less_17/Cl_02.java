package com.pvt.less_17;

import java.util.Arrays;
import java.util.List;

/**
 * Created by W510 on 07.01.2018.
 * 2.	Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */
public class Cl_02 {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("aaa", "bbbbbbbbbbbbbbbb", "cc", "dd", "ee", "FFF", "ddddddddddddddddd", "aaa", "bbbbbbbbbbbbbbbb", "cc");
        long count = strList.stream()
                .filter(s -> s.length()>8)
                .distinct()
                .count();
//                .forEach(System.out::println);
        System.out.println(count);
    }
}
