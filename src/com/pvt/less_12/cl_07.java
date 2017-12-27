package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 * 7.	Написать метод, который в 50% случаев бросает исключение.
 Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.

 */
public class cl_07 {
    public static void main(String[] args) {
        try {
            throwEx();
            System.out.println("no exception");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("continue");
        }
    }

    private static void throwEx() {
        int randomEx = (int)(Math.random()*2);
        if (randomEx==1) {
            throw new ArithmeticException();
        }
    }
}
