package com.pvt.less_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by W510 on 05.01.2018.
 * 7.	Создать объект LocalDate, представляющий собой сегодняшнюю дату. Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль
 */
public class Cl_07 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        String formatedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        DateTimeFormatter formater = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(new Locale("be"));
        String localDate = date.format(formater);

        System.out.println("Date: " + formatedDate);
        System.out.println("Local Date: " + localDate);
    }
}