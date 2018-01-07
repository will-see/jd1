package com.pvt.less_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by W510 on 05.01.2018.
 * Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.
 */
public class Cl_12 {
    public static void main(String[] args) {
        System.out.println("Введите дату: dd.mm.yyyy");
        Scanner in = new Scanner(System.in);
        String date = in.next();
        ArrayList<String> dateArr = new ArrayList<>(Arrays.asList(date.split("[,.]")));

        int dd = Integer.parseInt(dateArr.get(0));
        int mm = Integer.parseInt(dateArr.get(1));
        int yyyy = Integer.parseInt(dateArr.get(2));
        int maxDate = getMaxDate(mm, yyyy);
        int currentMonth = 1;
        int dayCount = 0;

        if (dd < 1 || mm < 1 || yyyy < 1 || dd > maxDate || mm > 12) {
            System.out.println("Ведены неверные данные");
        } else {

            while (mm > currentMonth) {
                dayCount += maxDate;
                currentMonth++;
                maxDate = getMaxDate(mm, yyyy);
            }
            dayCount += dd;
            if (dayCount > 366 / 2) {
                yyyy++;
            }

            System.out.println("Date : " + dateArr.get(0) + "." + dateArr.get(1) + "." + dateArr.get(2));
            System.out.println("New date: 01.01." + yyyy);
            in.close();
        }
    }

    private static int getMaxDate(int mm, int yyyy) {
        boolean xYear = chekXyear(yyyy);
        int maxDate;
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            maxDate = 31;
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            maxDate = 30;
        } else if (mm == 2 && xYear == true)
            maxDate = 29;
        else maxDate = 28;
        return maxDate;
    }

    private static boolean chekXyear(int yyyy) {
        boolean xYear = false;
        if (yyyy % 4 == 0) {
            xYear = true;
            if (yyyy % 100 == 0) {
                xYear = false;
                if (yyyy % 400 == 0)
                    xYear = true;
            }
        }
        return xYear;
    }
}
