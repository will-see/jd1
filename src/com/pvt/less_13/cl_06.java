package com.pvt.less_13;

/**
 * Created by W510 on 27.12.2017.
 * Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.

 Пример: aaabbcdeef ->abcdef

 */
public class cl_06 {
    public static void main(String[] args) {
        String text = "aaabbcdeef";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<text.length();i++){
//            System.out.print(text.substring(i-1,i));
//            System.out.print(text.substring(i,i+1));

            if (!text.substring(i-1,i).equals(text.substring(i,i+1))){
//                System.out.println(" false");
                sb.append(text.substring(i-1,i));
            }
        }
//        text= text.replace("\\1{1,}", "$1");
        System.out.println(sb);
    }
}
