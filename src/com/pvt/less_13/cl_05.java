package com.pvt.less_13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by W510 on 27.12.2017.
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */
public class cl_05 {
    public static void main(String[] args) {
        String  text = "aa b.    cccc  d e!f?";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(text.split("[\\s,.!?]+")));
        System.out.println(list.size());
        System.out.println(list);
    }
}

