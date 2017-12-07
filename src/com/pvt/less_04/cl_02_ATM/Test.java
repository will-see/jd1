package com.pvt.less_04.cl_02_ATM;

/**
 * Created by W510 on 03.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        ATM atm1 = new ATM(1,10,10);
        System.out.println("В банкомате " + " cash100:" + atm1.cash100 + " cash50:" + atm1.cash50 + " cash20:" + atm1.cash20);
        atm1.spend(750);
        System.out.println("В банкомате " + " cash100:" + atm1.cash100 + " cash50:" + atm1.cash50 + " cash20:" + atm1.cash20);
        atm1.fillATM(5,5,10);
        System.out.println("В банкомате " + " cash100:" + atm1.cash100 + " cash50:" + atm1.cash50 + " cash20:" + atm1.cash20);
    }
}
