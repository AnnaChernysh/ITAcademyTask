package lesson_07;
       //* Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
//        Добавить конструктор, принимающий количество здоровья, а также сеттер и геттер.
//        Добавить метод takeDamage(int damage), который уменьшает количество здоровья в соответствии с полученным уроном.*//


public abstract class Enemy implements Mortal {
    private String name;
    private int health;
    private int damage;

    public Enemy(){

    }

    public Enemy(String name, int health, int damage1) {
        this.name = name;
        this.health = health;
        this.damage = damage1;

    }
    public String getName(){
        return name;
    }


    public boolean isAlive() {
        return health >0;
    }
@Override
public void attackEnemy(Mortal enemy){
        enemy.takeDamage(getDamage());
}

    private void getDamage(int damage) {
        health -= damage;
           }


}

