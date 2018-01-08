package com.pvt.less_30;

import java.time.LocalDate;

/**
 * Created by W510 on 08.01.2018.
 */
public class Cl_12test {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018,07,24);
        System.out.println(date.with(new MyAdjuster12()));
    }
}
