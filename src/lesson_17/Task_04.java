package lesson_17;
/*Дан список целых чисел,вывести строку,представляющую собой конкатенацию
        строковых представлений этих чисел.
        Пример:список{5,2,4,2,1}
        Результирующая строка:"52421"*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,4,2,1);
        List<String> strings = numbers.stream().map(Object::toString).collect(Collectors.toList());

        String concat = String.join("", strings);
        System.out.println(concat);
    }
}