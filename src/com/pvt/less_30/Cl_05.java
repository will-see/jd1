package com.pvt.less_30;

import java.time.*;
import java.time.format.*;
import java.util.Locale;

/**
 * Created by W510 on 05.01.2018.
 * 5.	Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
 */
public class Cl_05 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,06,24);
        System.out.println(date);

//        String formatedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        DateTimeFormatter formater = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale("be"));
//        String formatedDate1 = date.format(formater);
//
////        LocalDate fromCustomPattern = LocalDate.parse("20.01.2014", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        System.out.println("Date: " + formatedDate);
//        System.out.println(formatedDate1);
    }
}
