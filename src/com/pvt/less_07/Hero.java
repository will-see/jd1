package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Hero{
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attackEnemy(int Enemy){

//        takeDamage(Enemy);
        System.out.println(name + " атакует врага.");
    }
}
