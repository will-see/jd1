package com.pvt.less_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by W510 on 05.01.2018.
 * 8.	Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
 */
public class Cl_08 {
    public static void main(String[] args) {
        String dateStr = "26-03-2014";
        LocalDate fromCustomPattern = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(fromCustomPattern);
    }
}
