package com.pvt.less_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by W510 on 07.01.2018.
 * 1.	Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */
public class Cl_01 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);
        double average = intList.stream()
                .filter((i -> i % 5 == 0))
                .filter((i -> i % 2 != 0))
                .mapToInt((x) -> x)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
