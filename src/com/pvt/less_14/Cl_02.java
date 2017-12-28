package com.pvt.less_14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 28.12.2017.
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class Cl_02 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b0x[0-9a-fA-F]+\\b");
        Matcher matcher = p.matcher("5 5f f5 5h abc ferrum 0x0 0xh 0x5f");
//        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
