package lesson_07;

        /*Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero
        Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
        Протестировать создание героев различных классов и их атаки в классе TrainingGround.
*/

public class Warrior extends Hero {
    @Override
    public void attackEnemy() {
        System.out.println("Герой атакует врага.");

    }
    @Override
    public void takeDamage(int damage) {
        health -= damage;
}
