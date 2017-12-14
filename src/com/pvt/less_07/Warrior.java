package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public boolean isAlive() {
        if (health>0){
            return true;
        }
        return false;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        System.out.println(name + " мощно атакует " + enemy);

    }
}
