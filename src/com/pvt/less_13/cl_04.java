package com.pvt.less_13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by W510 on 27.12.2017.
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
 в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

 */
public class cl_04 {
    public static void main(String[] args) {
        String  fio = "петров Дмитрий АНАТОЛЬЕВИЧ";
        StringBuilder sb = new StringBuilder();
        ArrayList<String> text = new ArrayList<>(Arrays.asList(fio.split("[\\s,.!?]+")));
        for (int i=0;i<text.size();i++){
            sb.append(text.get(i).toUpperCase().charAt(0)).append(".");
        }
        System.out.println(sb);
    }
}
