package com.pvt.less_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by W510 on 29.12.2017.
 * Задан файл с текстом, найти и вывести в консоль все слова,  для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
public class Cl_03 {
    public static void main(String[] args) {

        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            BufferedReader reader = new BufferedReader(new FileReader("src/com/pvt/less_15/text.txt"));
            String line;
            ArrayList<String> list = new ArrayList();
            while ((line = reader.readLine()) != null) {
                list.addAll(Arrays.asList(line.split("[\\s.,!?]+")));
            }
//            list.partsAdd("mama");
//            list.partsAdd("amlet");
//            list.partsAdd("tort");
//            list.partsAdd("moloko");
            if (list.size() > 2) {

                System.out.println(list);
                for (int i = 1; i < list.size(); i++) {
                    if (list.get(i).length() > 1) {
                        if (list.get(i - 1).toLowerCase().endsWith(list.get(i).substring(0, 1).toLowerCase())) {
//                    if(list.get(i-1).substring(list.get(i-1).length()-1,list.get(i-1).length()).equals(list.get(i).substring(0,1))){
                            System.out.println(list.get(i - 1) + " " + list.get(i));
                        }
                    } else {
                        if (list.get(i - 1).toLowerCase().endsWith(list.get(i).toLowerCase())) {
                            System.out.println(list.get(i - 1) + " " + list.get(i));
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
