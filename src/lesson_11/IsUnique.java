package lesson_11;
/*
       Написать метод isUnique, который принимает Map<String, String> и возвращает true,
        если два различных ключа не соответствуют двум одинаковым значениям.
        Например, в данном случае вернётся true:

        {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

        А в данном - false:

        {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsUnique {

    private static boolean isUnique(Map<String, String> map2) {

        Set<String> valueSet = new HashSet<String>();

        for (String value : map2.keySet()) {
            String key = map2.get(value);
            valueSet.add(key);
        }
        return valueSet.size() == map2.size();
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        boolean isTrue;

        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Kemp");
        map1.put("Hal", "Perkins");

        isTrue = isUnique(map1);
        System.out.println("map1 returns:" + isTrue);

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("Kendric", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Amanda", "Reges");
        map2.put("Hal", "Perkins");

        isTrue = isUnique(map2);
        System.out.println("map2 returns:" + isTrue);
    }
}
