package lesson_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
public class Task_01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,15,25,40);
        long result = numbers.stream()
        .filter((number) -> number% 2 != 0 && number%5 ==0)
        .mapToLong(element -> element)
        .sum();
       System.out.println(result);

    }
}
