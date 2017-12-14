package com.pvt.less_07;

/**
 * Created by W510 on 14.12.2017.
 */
public class BattleGround {
    public static void main(String[] args) {
//        Hero [] heros;
        Archer archer = new Archer("A1");
        Mage mage = new Mage("M1");
        Warrior warrior = new Warrior("W1");
        Enemy enemy = new Enemy(100);
        while (enemy.isAlive()) {
            int fightQuee = fightQuee();
            System.out.println("Health " + enemy.getHealth());
            switch (fightQuee) {
                case 0:
                    archer.attackEnemy(enemy);
                    break;
                case 1:
                    mage.attackEnemy(enemy);
                    break;
                case 2:
                    warrior.attackEnemy(enemy);
                    break;
            }
        }
        System.out.println(enemy + " DIED");
    }

    private static int fightQuee() {
        int fightQuee = (int) (Math.random() * 3);
        return fightQuee;
    }
}
