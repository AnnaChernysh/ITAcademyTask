package lesson_11;

import java.util.HashSet;
import java.util.Set;

/* Написать метод countUnique, который принимает целочисленный список в качестве
 параметра и возвращает количество уникальных целых чисел в этом списке.
    При получении пустого списка метод должен возвращать 0.
    Пример: [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
*/
public class Task_01 {
    public static void main(String[] args) {

        int[] array = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
         Set<Integer> mySet = new HashSet<>();
         for (int x : array) {
            mySet.add(x);
        }
        System.out.println(mySet.size());
    }
}


