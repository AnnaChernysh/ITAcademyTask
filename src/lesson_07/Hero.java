
package lesson_07;

 /*Создать класс Hero, представляющий собой героя и содержащий поле name.
        Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
        Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.
        Создать класс TrainingGround, содержащий метод main. Протестировать создание героя и его атаку.

    Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.
    Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.


*/

abstract class Hero implements Mortal {
    private String name;
    private int health;

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attackEnemy(Enemy enemyObj);

    abstract void takeDamage(int damage);
}
