package com.pvt.less_10;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by W510 on 18.12.2017.
 *
 1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.

 */
public class cl_01 {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<Integer>();
        for(int i = 0; i <20; i++) {
            students.add((int)(Math.random()*10));
        }
        System.out.println(students.toString());
        ListIterator <Integer> iter = students.listIterator();
        while(iter.hasNext()){
            if(iter.next()<=3){
                iter.remove();
            }
        }
        System.out.println(students.toString());
    }

}
