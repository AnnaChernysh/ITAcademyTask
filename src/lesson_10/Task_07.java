package lesson_10;
/*7.	Использовать Алгоритмы. Не используя вспомогательных объектов,
        переставить отрицательные элементы сгенерированного списка в конец, а положительные –
        в начало этого списка.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_07 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-18, 9, 4, 3, -6, -2, 4, 15, -1, 9, -3));

        int len = list.size();
        int x = 0;
        int replace = 0;
        while (x < len - replace) {
            if (list.get(x) < 0) {
                list.add(len - 1, list.remove(x));
                replace++;
            } else {
                x++;
            }
        }
        System.out.println(list);
    }
}