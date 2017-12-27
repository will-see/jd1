package com.pvt.less_13;

/**
 * Created by W510 on 27.12.2017.
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class cl_03 {
    public static void main(String[] args) {
        String text = "mama mila ramy";
        System.out.println(compare(text,"mama"));
    }

    private static boolean compare(String text, String mama) {
        if(text.startsWith(mama)){
            return true;
        }else return false;
    }
}
