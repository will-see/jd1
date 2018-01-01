package com.pvt.less_16;

import java.io.*;

/**
 * Created by W510 on 31.12.2017.
 * 2.	Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */
public class Cl_02 {
    public static void main(String[] args) {
        Computer comp = new Computer("MacBook", "i7", 8 * 1024, 1000);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/pvt/less_16/Comp.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/pvt/less_16/Comp.txt"));
        ) {
            oos.writeObject(comp);
            Computer compDeselializated = (Computer) ois.readObject();
            System.out.println(compDeselializated.name + " " + compDeselializated.cpu);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
