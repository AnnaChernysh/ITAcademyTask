/*
package lesson_07;

       */
/* Создать класс Hero, представляющий собой героя и содержащий поле name.
        Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
        Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
        Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.

    Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
    Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.

*/


public abstract class Hero {

    String name;
    int health;
    int damage;


    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public int getDamage(){
        return damage;
    }

    public Hero() {
    }

    public abstract void attackEnemy(Enemy);


    public static class TrainingGround {
        public static void main(String[] args) {

            Hero hero2 = new Warrior();
            Hero hero3 = new Archer();
            Hero hero4 = new Mage();

            hero2.attackEnemy();
            hero3.attackEnemy();
            hero4.attackEnemy();

        }
    }
}
