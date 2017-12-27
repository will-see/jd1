package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 * 4.	Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 Добавить вконструктор своего класса возможность указания сообщения.

 */
public class cl_04 {
    public static void main(String[] args) {
//        try {
            delit(19, 5);
//        } catch (Exception e) {
//            System.out.println("stack");
//            e.printStackTrace();
//        }
    }

    private static int delit(int i, int i1) {
        int result;
        if (i % i1 == 0) {
            result = i / i1;
        } else {
            throwEx();
            result = 0;
        }

        return result;
    }

    private static void throwEx() throws DelenieBezOstatkaRuntimeException {
        throw new DelenieBezOstatkaRuntimeException("Деление с остатком");
    }
}
