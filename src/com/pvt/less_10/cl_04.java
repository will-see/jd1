package com.pvt.less_10;

import java.util.Scanner;

/**
 * Created by W510 on 20.12.2017.
 *
 * 4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
 •	Задать размер стека.
 •	Внести цифру в стек.
 •	Извлечь цифру из стека.
 Вывести число, у которого цифры идут в обратном порядке.
 */
public class cl_04 {
    public static void main(String[] args) {
        int size = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        String number = sc.next();
        int stackCoutn = 0;
        Stack<String> stack = new Stack<>(size);
        while (stackCoutn<number.length()) {
                stack.push(number.substring(stackCoutn, stackCoutn + 1));
            stackCoutn++;
        }
        while (stack.size() > 0) {
//            if(number.length()<=size)
            System.out.print(stack.pop());
        }
    }
}
