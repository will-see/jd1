package com.pvt.less_04.cl_01_time;

/**
 * Created by W510 on 03.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        TimeRange tr1 = new TimeRange(2,55,28);
        tr1.print();
        TimeRange tr2 = new TimeRange(123456);
        tr2.print();
        tr1.parseToSeconds(1,2,3);

    }
}
