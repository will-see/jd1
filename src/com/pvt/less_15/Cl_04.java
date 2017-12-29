package com.pvt.less_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by W510 on 29.12.2017.
 *Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */
public class Cl_04 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String maxNums ="";
                String currentNums;
                Pattern p = Pattern.compile("[0-9]+");
                Matcher matcher = p.matcher(line);
//        System.out.println(matcher.find());
                while (matcher.find()) {
                    currentNums=matcher.group();
                    if(currentNums.length()>maxNums.length()){
                        maxNums=currentNums;
                    }
                }
                System.out.println( line + " maxLenth = " + maxNums.length() + ", maxNums = " + maxNums);
            }
        } catch (IOException e) {
            System.out.println("File not fount");
        }
    }
}
