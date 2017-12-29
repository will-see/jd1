package com.pvt.less_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 29.12.2017.
 * Написать метод, который проверяет, является ли строка адресом IPv4.
 */
public class Cl_05 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\b((\\b[0-9]{1}\\b)|(\\b[1-9][0-9]{1}\\b)|(\\b(1[0-9]{2})|(2[0-4][0-9])|(25[0-5])\\b))\\b(\\.|\\b)){4}");
        Matcher matcher = p.matcher(
                "002.168.0.1\n" +
                "a2.168.0.1\n" +
                "02.168.0.51\n" +
                "255.200.0.1\n" +
                "249.240.0.256\n" +
                "12.168.0.3\n" +
                "90.168.0.2\n" +
                "0..0.0.270\n" +
                "260.168.00.1\n" +
                "1222.168.0.1");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
