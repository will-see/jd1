package com.pvt.less_30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by W510 on 05.01.2018.
 * 6.	Создать объект LocalDate, представляющий собой сегодняшнюю дату. Используя этот объект, создать другой объект LocalTime, представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.
 */
public class Cl_06 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate newDate = date.plusMonths(3);
//        LocalTime time = LocalTime.of(LocalDate);
        LocalDateTime time = LocalDateTime.of(LocalDate.now(),LocalTime.MIDNIGHT).plusMonths(3);

        System.out.println(newDate);
        System.out.println(time);
    }
}
