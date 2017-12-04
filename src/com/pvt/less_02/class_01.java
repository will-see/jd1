package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 27.11.2017.
 */
public class class_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        sc.close();

        if (text1.equals(text2)){
            System.out.println("Отлично! Слова одинаковы");
        }else if (text1.equalsIgnoreCase(text2)){
            System.out.println("Хорошо. Почти одинаковы");
        } else if (text1.length()==text2.length()){
            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}
