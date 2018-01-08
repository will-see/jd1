package com.pvt.less_30;

import java.time.LocalDate;

/**
 * Created by W510 on 05.01.2018.
 */
public class Cl_11_test {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now().with(new MyAdjuster11());
        System.out.println(date);
    }
}
