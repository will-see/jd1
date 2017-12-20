package com.pvt.less_04.cl_02_ATM;

/**
 * Created by W510 on 03.12.2017.
 * Создать класс, описывающий банкомат.
 * Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
 * Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
 * При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class ATM {
    int cash20;
    int cash50;
    int cash100;

    public ATM(int cash100, int cash50, int cash20) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    public void fillATM(int cash100, int cash50, int cash20) {
        this.cash20 += cash20;
        this.cash50 += cash50;
        this.cash100 += cash100;
    }

    public boolean spend(int cashToSpend) {
        int need20 = 0;
        int need50 = 0;
        int need100 = 0;
        int ostatokToSpend = cashToSpend;

        if (cashToSpend % 20 == 0 || (cashToSpend / 10) % 10 >= 5) {
            if (cashToSpend - cashToSpend % 100 > cash100 * 100) {
                need100 = cash100;
                ostatokToSpend -= cash100 * 100;
            } else {
                need100 = (ostatokToSpend - ostatokToSpend % 100) / 100;
                ostatokToSpend -= need100 * 100;
            }
        } else {

            if (cashToSpend - cashToSpend % 100 > cash100 * 100) {
                need100 = cash100;
                ostatokToSpend -= cash100 * 100;
            } else {
                if (cashToSpend < 150) {
                    need100 = 0;
                } else {
                    need100 = ((ostatokToSpend - ostatokToSpend % 100) / 100)-1;
                }
                ostatokToSpend -= need100 * 100;
            }
        }


        if (ostatokToSpend - ostatokToSpend % 50 > cash50 * 50) {
            need50 = cash50;
            ostatokToSpend -= cash50 * 50;
            if (ostatokToSpend % 20 != 0) {
                need50--;
                ostatokToSpend += 50;
            }
        } else {
            need50 = (ostatokToSpend - ostatokToSpend % 50) / 50;
            ostatokToSpend -= need50 * 50;
            if (ostatokToSpend % 20 != 0) {
                need50--;
                ostatokToSpend += 50;
            }
        }
        if (ostatokToSpend % 20 > 0 || ostatokToSpend > cash20 * 20) {
            System.out.println("wrong summ");
            System.out.println("Balance:" + (int) (cash100 * 100 + cash50 * 50 + cash20 * 20) + "try to exchange:" + cashToSpend);
            return false;

        } else {
            need20 = (ostatokToSpend - ostatokToSpend % 20) / 20;
            cash100 -= need100;
            cash50 -= need50;
            cash20 -= need20;

            System.out.println("Выдано " + cashToSpend + ":" + " cash100:" + need100 + " cash50:" + need50 + " cash20:" + need20);
            return true;
//            System.out.println("Осталось " + ostatokToSpend);
        }
    }
}