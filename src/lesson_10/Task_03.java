package lesson_10;
 /*  Вывести учеников из списка в обратном порядке. (2 варианта решения).*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task_03 {
    public static void main(String[] args) throws Exception {

    ArrayList<String> students = new ArrayList<String>();

        students.add("Коровин А.В.");
        students.add("Быков Л.Ю");
        students.add("Зайцев В.С");
        students.add("Волкова М.С.");
        students.add("Лисичкин А.И");

        Iterator itr = students.iterator();
        System.out.println("Iterator:");
        System.out.println("Выводим в обычном порядке: ");

        while (itr.hasNext())

        System.out.println(itr.next() + " ");

         ListIterator i = students.listIterator();
        System.out.println("ListIterator:");
        System.out.println("Выводим в обычном порядке: ");

        while (i.hasNext())
                System.out.println(i.next() + " ");

        System.out.println("Выводим в обратном порядке: ");

        while (i.hasPrevious())
        System.out.println(i.previous() + " ");

        System.out.println();
}
}
