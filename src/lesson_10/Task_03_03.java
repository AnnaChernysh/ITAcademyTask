package lesson_10;
/*  Вывести учеников из списка в обратном порядке. (2 варианта решения).
* Вариант №2*/
import java.util.ArrayList;
import java.util.Collections;

public class Task_03_03 {
        public static void main(String[] args) {

            ArrayList<String> students = new ArrayList<String>();

            students.add("Коровин А.В.");
            students.add("Быков Л.Ю");
            students.add("Зайцев В.С");
            students.add("Волкова М.С.");
            students.add("Лисичкин А.И");

            Collections.reverse(students);
            System.out.println(students);

        }

}




