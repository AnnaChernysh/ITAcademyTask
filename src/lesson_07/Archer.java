
package lesson_07;

import java.util.Random;

public class Archer extends Hero implements Mortal {
    Archer(String name, int health) {
        super(name, health);
    }

    public boolean isAlive() {

        if (super.getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damage) {
        int health = super.getHealth();
        health -= damage;
        super.setHealth(health);
    }

    @Override
    void attackEnemy(Enemy enemyObj) {
        Random rnd = new Random();
        int highRandomElement = 10;
        int lowRandomElement = 7;
        int damage = rnd.nextInt(highRandomElement - lowRandomElement) + lowRandomElement;

        if (enemyObj.getArmour()) {
            damage = 0;
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " doesn't affect at all and "
                    + enemyObj.getName() + " still has "
                    + enemyObj.getHealth() + "% of health");
            return;
        }

        if (enemyObj.isAlive() && (damage >= enemyObj.getHealth()) && enemyObj.getReborn()) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            enemyObj.setHealth(100);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "% but " + enemyObj.getName() + "is reborning and have again "
                    + enemyObj.getHealth() + "% health");

        } else if (enemyObj.isAlive() && (damage >= enemyObj.getHealth())) {
            damage = enemyObj.getHealth();
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking for the last "
                    + damage + "%" + " and " + enemyObj.getName() + " has "
                    + enemyObj.getHealth() + "% left");

        } else if (enemyObj.isAlive()) {
            enemyObj.takeDamage(damage);
            System.out.println("   " + super.getName() + " is attacking "
                    + " for " + damage + "% damage and " + enemyObj.getName() + " left "
                    + enemyObj.getHealth() + "%");
        }
    }
}