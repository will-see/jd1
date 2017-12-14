package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(int Enemy) {
        System.out.println(name + " мощно атакует врага.");

//        System.out.println(Enemy);
    }
}
