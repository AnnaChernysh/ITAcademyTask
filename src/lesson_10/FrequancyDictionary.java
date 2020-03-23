package lesson_10;

import java.util.HashMap;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь.
public class FrequancyDictionary {

    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap();
        Integer integer = new Integer(1);

        for (int i = 0, n = args.length; i < n; i++) {
            String key = args[i];
            Integer frequency = (Integer) map.get(key);
            if (frequency == null) {
                frequency = integer;
            } else {
                int value = frequency.intValue();
                frequency = new Integer(value + 1);
            }
            map.put(key, frequency);
        }
    }
}
