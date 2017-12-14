package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Enemy {
    int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int takeDamage(int damage){

//        health-=enemy;
        return health;
    }
}
