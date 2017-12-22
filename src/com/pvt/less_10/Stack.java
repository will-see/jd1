package com.pvt.less_10;

import java.util.ArrayList;

/**
 * Created by W510 on 20.12.2017.
 */
class Stack<E> {
    private int maxLength;
    private int realLength = 0;
    private ArrayList<E> list;

    Stack(int maxLength) {
        this.maxLength = maxLength;
        this.list = new ArrayList<>(maxLength);
    }

    int size() {
        return realLength;
    }

    E pop() {
        realLength--;
        if (realLength >= 0) {
            return list.remove(realLength);
        } else {
                System.out.println("Список пуст!");
           return null;
        }
    }

    boolean push(E element) {
        if (realLength < maxLength) {
            list.add(element);
            realLength++;
        } else {
                System.out.println("Переполнение стека!");
        }

//        realLength++;
        return realLength <= maxLength;
    }
}
