package com.pvt.less_07;

/**
 * Created by W510 on 14.12.2017.
 */
public class BattleGround {
    public static void main(String[] args) {
//        Hero [] heros;
        Archer archer = new Archer("A1", 100);
        Mage mage = new Mage("M1", 100);
        Warrior warrior = new Warrior("W1", 100);
        Enemy enemy = new Enemy(100);
        while (enemy.isAlive()) {
            int fightQuee = fightQuee();
            System.out.println("Health: Enemy " + enemy.getHealth() + " A1 " + archer.getHealth() + " M1 " + mage.getHealth() + " W1 " + warrior.getHealth());
            switch (fightQuee) {
                case 0:
                    if (archer.isAlive()) {
                        archer.attackEnemy(enemy);
                        if (enemy.isAlive())
                            enemy.attackHero(archer);
                    } else System.out.println(archer.getName() + " DIED");
                    break;
                case 1:
                    if (mage.isAlive()) {
                        mage.attackEnemy(enemy);
                        if (enemy.isAlive())
                            enemy.attackHero(mage);
                    } else System.out.println(mage.getName() + " DIED");

                    break;
                case 2:
                    if (warrior.isAlive()) {
                        warrior.attackEnemy(enemy);
                        if (enemy.isAlive()) ;
                        enemy.attackHero(warrior);
                    } else System.out.println(warrior.getName() + " DIED");
                    break;
            }
            if (!archer.isAlive() && !mage.isAlive() && !warrior.isAlive()) {
                System.out.println("all heroes died, enemy win");
                break;
            }
            riseAgain(enemy);
        }
    }

    private static void riseAgain(Enemy enemy) {
        if (!enemy.isAlive()) {
            System.out.println(enemy + " DIED");

            int riseAgain = (int) (Math.random() * 9);
            if (riseAgain % 2 == 0) {
                enemy.setHealth(100);
                System.out.println(enemy + " Rise Again!!!");
            } else {
                System.out.println("enemy died, heroes Win");
            }
        }
    }

    private static int fightQuee() {
        int fightQuee = (int) (Math.random() * 3);
        return fightQuee;
    }
}
