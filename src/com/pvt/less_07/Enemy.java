package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class Enemy implements Mortal{
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
    public void takeDamage(int damage){
        health-=damage;
    }
    public void attackHero(Hero hero) {
        hero.takeDamage(20);
        System.out.println(this + " сильно атакует " + hero.getName());
    }
    @Override
    public boolean isAlive() {
        if (health>0){
            return true;
        }
        return false;
    }
}
