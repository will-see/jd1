package com.pvt.less_15;

import java.io.*;

/**
 * Created by W510 on 29.12.2017.
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */
public class Cl_01 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/com/pvt/less_15/text.txt")));
//            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        }catch (IOException e){
            System.out.println("file not found");
        }
    }
}
