package com.pvt.less_30;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by W510 on 04.01.2018.
 * 1.	Написать программу, принимающую из консоли одно из значений: "bel", "rus" или "eng" и выводящую в консоль приветствие для пользователя на соответствующем языке.
 */
public class Cl_01_test {
    public static void main(String[] args) {
//        Locale loc = new Locale("ru","RU");
//        System.out.println(loc.getDisplayName());
//
//        ResourceBundle rb = ResourceBundle.getBundle("mess");
//        System.out.println(rb.getString("greet"));

// en_US
        System.out.println("Current Locale: " + Locale.getDefault());
        ResourceBundle mybundle = ResourceBundle.getBundle("mess");

        // read MyLabels_en_US.properties
        System.out.println("Say how are you in US English: " + mybundle.getString("how_are_you"));


        // read MyLabels_ms_MY.properties
        System.out.println("Current Locale: " + Locale.getDefault());
        mybundle = ResourceBundle.getBundle("MyLabels");
        System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("how_are_you"));
    }
}
