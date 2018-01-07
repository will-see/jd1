package com.pvt.less_30;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by W510 on 04.01.2018.
 * 1.	Написать программу, принимающую из консоли одно из значений: "bel", "rus" или "eng" и выводящую в консоль приветствие для пользователя на соответствующем языке.
 */
public class Cl_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Locale locale;
        switch (s) {
            case "rus":
                locale = new Locale("ru", "RU");
                break;
            case "bel":
                locale = new Locale("be", "BY");
                break;
            case "eng":
                locale = new Locale("en", "US");
                break;
            default:
                locale = new Locale("en", "US");
                break;
        }
        ResourceBundle rb = ResourceBundle.getBundle("com/pvt/less_30/Message", locale);
        System.out.println(rb.getString("greet"));
    }
}
