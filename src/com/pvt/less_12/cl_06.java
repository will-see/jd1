package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 * 6.	Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
 Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.

 */
public class cl_06 {
    public static void main(String[] args) {
        try {
            throwEx();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    private static void throwEx() {
        int randomEx = (int)(Math.random()*3);
        switch (randomEx){
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new NullPointerException();
            default:
                throw new ArrayIndexOutOfBoundsException();
        }
    }
}
