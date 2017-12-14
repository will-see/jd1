package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public abstract class Hero{
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
