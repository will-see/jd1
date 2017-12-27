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
        sb.append(text.substring(0,1));
        for(int i=1; i<text.length();i++){
            if (!text.substring(i-1,i).equals(text.substring(i,i+1))){
                sb.append(text.substring(i,i+1));
            }
        }
        System.out.println(sb);
    }
}
