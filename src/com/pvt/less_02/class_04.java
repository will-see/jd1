package com.pvt.less_02;

import java.util.Scanner;

/**
 * Created by W510 on 27.11.2017.
 */
public class class_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dd = in.nextInt();
        int mm = in.nextInt();
        int yyyy = in.nextInt();
        int maxDate;
        boolean xYear = false;
        if (yyyy % 4 == 0) {
            xYear = true;
            if (yyyy % 100 == 0) {
                xYear = false;
                if (yyyy % 400 == 0)
                    xYear = true;
            }
        }
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            maxDate = 31;
        } else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
            maxDate = 30;
        } else if (mm == 2 && xYear == true)
            maxDate = 29;
        else maxDate = 28;

        if (dd < 1 || mm < 1 || yyyy < 1 || dd > maxDate || mm > 12)
            System.out.println("Ведены неверные данные");

                else{
        System.out.println("Дата " + dd + "." + mm + "." + yyyy);
        in.close();
    }
            }
        }
