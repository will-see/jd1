package com.pvt.less_30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

/**
 * Created by W510 on 05.01.2018.
 * 9.	Создать объект LocalDate, представляющий собой сегодняшнюю дату. Создать объект LocalDate, представляющий собой дату 25.06.2020. Используя созданные объекты, найти количество дней между этими двумя датами.
 * 10.	Даны два объекта LocalDate из предыдущего задания. Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
 */
public class Cl_09 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2020,06,25);
        long daysBetween = ChronoUnit.DAYS.between(today, date);
        long secondsBetween1 = ChronoUnit.SECONDS.between(today.atStartOfDay(),date.atStartOfDay());
        long secondsBetween2 = daysBetween*24*60*60;
        System.out.println(daysBetween);
        System.out.println(secondsBetween1);
        System.out.println(secondsBetween2);
        System.out.println(daysBetween*LocalTime.MAX.toSecondOfDay());

        LocalDateTime time1 = LocalDateTime.of(today,LocalTime.MIDNIGHT);
        LocalDateTime time2 = LocalDateTime.of(date,LocalTime.MIDNIGHT);
        long secondsBetween3 = ChronoUnit.SECONDS.between(time1,time2);
        System.out.println(secondsBetween3);
    }
}
