package com.pvt.less_19;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by W510 on 13.01.2018.
 */
public class Receipt {
    int id;
    LocalDate date;
    int casseNo;
    List<Item> list;
    double totalSum;
    double change;

    public Receipt(int id, LocalDate date, int casseNo, List<Item> list, double totalSum, double change) {
        this.id = id;
        this.date = date;
        this.casseNo = casseNo;
        this.list = list;
        this.totalSum = totalSum;
        this.change = change;
    }

    String pattern = "##0.00";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

    @Override
    public String toString() {
        String receipt = id + "\n" + date + "\n" + "KACCA №" + casseNo + "\n" + list.toString() +"\n" + "total " + decimalFormat.format(totalSum) + "\n" + "change " + decimalFormat.format(change);
        return receipt;
    }
}
