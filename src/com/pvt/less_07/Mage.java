package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(int Enemy) {
        System.out.println(name + " сильно атакует врага.");
    }
}
