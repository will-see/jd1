package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 * 3.	Создать собственный класс-исключение - наследник класса Exception.
 Создать метод, выбрасывающий это исключение.
 Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.

 */
public class cl_03 {
    public static void main(String[] args) {
        try {
            delit(19, 5);
        } catch (DelenieBezOstatkaException e) {
            e.printStackTrace();
        }
    }

    private static int delit(int i, int i1) throws DelenieBezOstatkaException {
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
