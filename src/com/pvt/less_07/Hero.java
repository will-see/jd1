package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public abstract class Hero implements Mortal{
    public String name;
    public int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }
    //    public Hero(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);
    public void takeDamage(int damage){
        health-=damage;
    }
}
