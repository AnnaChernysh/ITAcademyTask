package lesson_10;
/*Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
 Удалить неудовлетворительные оценки из списка.*/
import java.util.*;

public class Task_01 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(5);
        marks.add(3);
        marks.add(5);
        marks.add(4);
        marks.add(3);

        System.out.println("The ArrayList elements are: ");

        for (Integer integer : marks) {
            System.out.println(integer);
        }
        Iterator i = marks.iterator();
        Integer negative = 3;
        for(Iterator<Integer> it = marks.iterator();
            it.hasNext();)
            if(it.next()<= negative)
                it.remove();
        System.out.println(marks);

            System.out.println("The ArrayList elements are: ");
            marks.forEach(System.out::println);
        }
    }


