package com.pvt.less_30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * Created by W510 on 05.01.2018.
 */
public class MyAdjuster11 implements TemporalAdjuster {

//    @Override
//    public Temporal adjustInto(Temporal temporal) {
//        return null;
//    }
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(42,(ChronoUnit.DAYS));
    }
}
