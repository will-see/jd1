package com.pvt.less_15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by W510 on 29.12.2017.
 */
public class Cl_02 {
    public static void main(String[] args) {

        try {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String line;
            ArrayList<String> list = new ArrayList();
            while ((line = reader.readLine()) != null) {
                list.addAll(Arrays.asList(line.split("[\\s.,!?]+")));
            }
            for (String s : list) {
                s.toLowerCase();
                if (s.startsWith("а") |
                        s.startsWith("о") |
                        s.startsWith("у") |
                        s.startsWith("ы") |
                        s.startsWith("э") |
                        s.startsWith("я") |
                        s.startsWith("ё") |
                        s.startsWith("ю") |
                        s.startsWith("и") |
                        s.startsWith("е")) {
                    System.out.println(s);
                }
            }
//            System.out.println(list.size());
//            System.out.println(list);
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
