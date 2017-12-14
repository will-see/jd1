package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(7);
        System.out.println(name + " мощно атакует врага " + enemy);

    }
}
