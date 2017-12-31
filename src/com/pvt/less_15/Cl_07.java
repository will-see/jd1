package com.pvt.less_15;

import java.io.*;

/**
 * Created by W510 on 29.12.2017.
 * Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */
public class Cl_07 {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src\\com\\pvt\\less_15\\Cl_07.java")));
//            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src\\com\\pvt\\less_15\\reverseProgramm.txt")));
            String line;
            String revLine;
            while ((line = reader.readLine()) != null) {
                StringBuilder sb = new StringBuilder();
                revLine = sb.append(line).reverse().toString();
                writer.write(revLine+ "\n");
            System.out.println(revLine);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
