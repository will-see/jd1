package com.pvt.less_07;

/**
 * Created by W510 on 13.12.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100);
        Archer archer = new Archer("A1",100);
        archer.attackEnemy(enemy1);
        Mage mage = new Mage("M1",100);
        mage.attackEnemy(enemy1);
        Warrior warrior = new Warrior("W1",100);
        warrior.attackEnemy(enemy1);
    }
}
