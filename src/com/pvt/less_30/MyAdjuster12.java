package com.pvt.less_30;

/**
 * Created by W510 on 08.01.2018.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MyAdjuster12 implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate date = LocalDate.from(temporal);
        if (LocalDate.from(temporal).isAfter(LocalDate.ofYearDay(date.getYear(),183))){
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        } else {
            return temporal.plus(1, ChronoUnit.YEARS).with(TemporalAdjusters.firstDayOfYear());
        }
    }
}