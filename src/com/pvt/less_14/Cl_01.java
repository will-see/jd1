package com.pvt.less_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 28.12.2017.
 * Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
 Возможные домены верхнего уровня: .org .com

 */
public class Cl_01 {
    public static void main(String[] args) {
//        System.out.println("info_r@info.com".matches("\\b[a-zA-Z]+_?[a-zA-Z]*@\\w+.(com|org)\\b"));
        Pattern p = Pattern.compile("\\b[a-zA-Z]+_?[a-zA-Z]*@\\w+.(com|org)\\b");
        Matcher matcher = p.matcher("gbtbr 2gmail.com @ 2ulr@tut.by losbel@mail.ru petrov.dmi3@gmail.com info_r@info.com 2info_r@info.com info__r@info.com");
        System.out.println(matcher.find());
        System.out.println(matcher.group());
    }
}
