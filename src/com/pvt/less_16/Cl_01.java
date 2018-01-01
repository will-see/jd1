package com.pvt.less_16;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by W510 on 31.12.2017.
 * 1.	Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не буфиризированого символьного ввода вывода.
 */
public class Cl_01 {
    public static void main(String[] args) {

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("src/com/pvt/less_16/test1Mb.db"));
            Reader reader2 = new FileReader("src/com/pvt/less_16/test1Mb.db");
            BufferedWriter writer1 = new BufferedWriter(new FileWriter("src/com/pvt/less_16/testWrBuff_1Mb.db"));
            Writer writer2 = new FileWriter("src/com/pvt/less_16/testWrNobuff_1Mb.db");

            //чтение буффером
            String buff;
            StringBuilder sbBuff = new StringBuilder();
            long timeStartReadingBuff = System.currentTimeMillis();
            while ((buff = reader1.readLine()) != null) {
                sbBuff.append(buff);
            }
            long timeStopReadingBuff = System.currentTimeMillis();
            long timeReadingBuff = timeStopReadingBuff - timeStartReadingBuff;
            System.out.println("timeReadingBuff " + timeReadingBuff);

            //Запись буффером
            long timeStartWritingBuff = System.currentTimeMillis();
            writer1.write(sbBuff.toString());
            long timeStopWritingBuff = System.currentTimeMillis();
            long timeWritingBuff = timeStopWritingBuff - timeStartWritingBuff;
            System.out.println("timeWritingBuff " + timeWritingBuff);

            //Чтение без буффера
            int noBuff;
            StringBuilder sbNoBuff = new StringBuilder();
            long timeStartReading = System.currentTimeMillis();
            while ((noBuff = reader2.read()) >= 0) {
                sbNoBuff.append(noBuff);
            }
            long timeStopReading = System.currentTimeMillis();
            long timeReading = timeStopReading - timeStartReading;
            System.out.println("timeReading " + timeReading);

            //Запись без буффера
            long timeStartWriting = System.currentTimeMillis();
            writer2.write(sbNoBuff.toString());
            long timeStopWriting = System.currentTimeMillis();
            long timeWriting = timeStopWriting - timeStartWriting;
            System.out.println("timeWriting " + timeWriting);

        } catch (IOException e) {
            System.out.println("file not found");
        }

    }
}
