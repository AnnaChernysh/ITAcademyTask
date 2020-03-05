package lesson_07;
       /* Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
        Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
        Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.*/

    interface Mortal {
    void isAlive();
           }

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public Enemy() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
           }

    @Override
    public boolean isAlive() {
        boolean result;
        if (health > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

