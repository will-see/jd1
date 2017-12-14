package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Archer extends  Hero {
    public Archer(String name) {
        super(name);
    }
    @Override
    public void attackEnemy(int Enemy) {
        System.out.println(name + " активно атакует врага.");
    }
}
