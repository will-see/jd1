package com.pvt.less_16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by W510 on 01.01.2018.
 * 3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */
public class Cl_03 {
    public static void main(String[] args) {
        NoteBook book = new NoteBook("Lenovo", "i5", 4, 500, 5, 2);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/pvt/less_16/note.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/pvt/less_16/note.txt"));
        ) {
            oos.writeObject(book);
            NoteBook bookDeselializated = (NoteBook) ois.readObject();
            System.out.println(book.name + " " + book.weight + " " + book.buttons+ " " + book.touchPad.buttons);
            System.out.println(bookDeselializated.name + " " + bookDeselializated.weight + " " + bookDeselializated.buttons+ " " + bookDeselializated.touchPad.buttons);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
