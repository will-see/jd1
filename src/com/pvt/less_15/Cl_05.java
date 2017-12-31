package com.pvt.less_15;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by W510 on 29.12.2017.
 * 5. Записать в двоичный файл 20 случайных чисел типа int. Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
public class Cl_05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100+5000));
        }
//        StringBuilder sb = new StringBuilder();
//        for (Integer s : list) {
//            sb.append(s).append(" ");
//        }
        System.out.println("сгенерировано" + list);
        try {

            DataOutputStream os = new DataOutputStream(new FileOutputStream("src\\com\\pvt\\less_15\\fileOut.txt"));

            for (int i : list) {
                os.writeInt(i);
            }
            os.close();
//            os.write(i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream is = new DataInputStream(new FileInputStream("src\\com\\pvt\\less_15\\fileOut.txt"));
            int byteAvailable = is.available();
            StringBuilder input = new StringBuilder();
            int intCount=0;
            int intSumm=0;
            while (byteAvailable>0) {
                intCount++;
                int readFromFile = is.readInt();
                intSumm += readFromFile;
                input = input.append(readFromFile).append("  ");
                byteAvailable-=4;
            }
            is.close();
            System.out.println("прочитано " + input);
            System.out.println("ср. арифметическое " + (intSumm/intCount));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
