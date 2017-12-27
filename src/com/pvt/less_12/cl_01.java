package com.pvt.less_12;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by W510 on 26.12.2017.
 * 1.	Объявите переменную со значением null. Вызовите метод у этой переменной.
 Отловите возникшее исключение.

 */
public class cl_01 {
    public static void main(String[] args) {
        String n = null;
        try {
            n.split("");
        } catch (NullPointerException e) {
            System.out.println("exception");;
        }

//        System.out.println(concatanate(i,n));
//    }
//
//    private static int concatanate(int i, String n) {
//
//        i = i + n;
//     return i  ;
    }
}
