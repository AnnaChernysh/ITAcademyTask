package lesson_17;

import java.util.*;
import java.util.stream.Collectors;

//Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
public class Human {
        public static void main(String[] args) {

   Map<String,Integer> human = new HashMap<String,Integer>();
        human.put("James", 25);
        human.put("Lucrecia", 68);
        human.put("Jack", 33);
        human.put("Christiano", 56);
            Map<String, Integer> result = human.entrySet()
                    .stream()
                    .filter(h -> h.getKey().length() < 7) //filter by key
                    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

            System.out.println(human.entrySet().stream().filter(h -> h.getKey().length() < 7).
                    mapToInt(h -> h.getValue()).count());
        }
}



