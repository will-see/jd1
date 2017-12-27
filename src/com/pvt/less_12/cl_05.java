package com.pvt.less_12;

/**
 * Created by W510 on 26.12.2017.
 * 5.	Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,указав в качестве причины отловленное.
 */
public class cl_05 {
    public static void main(String[] args) throws Exception{
        try {
            throwEx();
        } catch (NullPointerException e) {
            throw new DelenieBezOstatkaRuntimeException("перехват исключения " + e);
        }
    }

    private static void throwEx() {
        throw new NullPointerException();
    }
}
