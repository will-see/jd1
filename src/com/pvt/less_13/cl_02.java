package com.pvt.less_13;

/**
 * Created by W510 on 27.12.2017.
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */
public class cl_02 {
    public static void main(String[] args) {
        String text = ":( Это печально :(((( :(:(:(.";
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        text = text.replaceAll(":\\(",":)");
        System.out.println(text);
    }
}
