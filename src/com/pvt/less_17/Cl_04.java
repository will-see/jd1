package com.pvt.less_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by W510 on 08.01.2018.
 * 4.	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */
public class Cl_04 {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);

        String str = intList.stream()
                .map(e -> e.toString())
                .reduce("", String::concat);
//                .reduce((p) -> p.append(""));
//                .collect(Collectors.joining(": ", "<b> ", " </b>"))

        System.out.println(str);
    }
}
