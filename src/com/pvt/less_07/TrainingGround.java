package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("H1");
//        hero1.attackEnemy();
        Archer archer = new Archer("A1");
//        archer.attackEnemy();
        Mage mage = new Mage("M1");
//        mage.attackEnemy();
        Warrior warrior = new Warrior("W1");
        warrior.attackEnemy(5);
//        Enemy enemy = new Enemy(100);
    }
}
