
package lesson_07;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {

        int StrikeHero = 0;
        int StrikeEnemy = 0;
        int idHeroProfile = 0;
        int idEnemyProfile = 0;

        Hero heroReadyToFight = null;
        Enemy enemyReadyToFight = null;


        if (idHeroProfile == 1) {
            Warrior warriorOne = new Warrior("Warrior", 100);
            heroReadyToFight = warriorOne;
        } else if (idHeroProfile == 2) {
            Archer archerOne = new Archer("Archer", 100);
            heroReadyToFight = archerOne;
        } else if (idHeroProfile == 3) {
            Mage mageOne = new Mage("Mage", 100);
            heroReadyToFight = mageOne;

            System.out.println("\n" + heroReadyToFight.getName() + " vs "
                    + enemyReadyToFight.getName() + " - FIGHT");

            while (enemyReadyToFight.isAlive() && heroReadyToFight.isAlive()) {

                StrikeEnemy++;
                enemyReadyToFight.attackHero(heroReadyToFight);
                if (!heroReadyToFight.isAlive()) {
                    System.out.println("It tooks " + StrikeEnemy
                            + " strikes to kill " + heroReadyToFight.getName());
                    return;
                }

                StrikeHero++;
                heroReadyToFight.attackEnemy(enemyReadyToFight);
                if (!enemyReadyToFight.isAlive()) {
                    System.out.println(StrikeHero + enemyReadyToFight.getName());
                }
            }
        }
    }
}