package lesson_10;

import java.util.ArrayList;
import java.util.Iterator;

/*Задание. Создать список оценок учеников с помощью ListIterator,
заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.*/
public class Task_02 {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(2);
        marks.add(4);
        marks.add(5);
        marks.add(4);
        marks.add(5);

        System.out.println("Список оценок учеников: ");

        for (Integer integer : marks) {
        System.out.println(integer);
        }
        Iterator i = marks.iterator();
        Integer excellent = 5;
        for(Iterator<Integer> it = marks.iterator();
            it.hasNext();)
            if(it.next() == excellent) {
                System.out.println("Самая высокая оценка:" + excellent);
            }
    }
}

