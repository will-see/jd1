package com.pvt.less_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 28.12.2017.
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
 * с помощью регулярных выражений и выводящую их на страницу.
 */
public class Cl_03 {
    public static void main(String[] args) {
        String s = "<p id =\\\"p1\\\">sdf <p><p\\\"p1\\\"> <<p\\\"pwdwdw<1\\\">>>p>><ps>";
        System.out.println(s.replaceAll("<p[^>].*?>","<p>"));
    }
}
