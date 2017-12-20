package com.pvt.less_10;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by W510 on 19.12.2017.
 * 3.	Вывести учеников из списка в обратном порядке. (2 варианта решения)
 */
public class cl_03 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("aaa");
        students.add("bbb");
        students.add("ccc");
        students.add("ddd");
        students.add("eee");
        students.add("fff");
        System.out.println(students);

        ListIterator<String>iter = students.listIterator();
        while(iter.hasNext()){
            iter.next();
        }
        while(iter.hasPrevious()){
            System.out.print(iter.previous() + ", ");
        }
        System.out.println();
        for (int i=students.size()-1;i>-1;i--) {
            System.out.print(students.get(i) + ", ");
        }
    }
}
