package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Hero hero1 = new Hero("H1");
        Enemy enemy1 = new Enemy(100);
        hero1.attackEnemy(enemy1);
        Archer archer = new Archer("A1");
        archer.attackEnemy(enemy1);
        Mage mage = new Mage("M1");
        mage.attackEnemy(enemy1);
        Warrior warrior = new Warrior("W1");
        warrior.attackEnemy(enemy1);
    }
}
