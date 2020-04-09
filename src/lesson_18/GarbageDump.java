
package lesson_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GarbageDump {
    final Map<String, Integer> map = new HashMap<>();

    public synchronized void throwDetails(Map<String, Integer> map1) {
        map.putAll(map1);
        System.out.println(map1);
    }

    public synchronized void collectDetails(Map<String, Integer> map1) {
        if(!map.isEmpty()) {
            for (String s : map.keySet()) {
                if (map1.containsKey(s)) {
                    map1.put(s, map1.get(s) + 1);
                } else {
                    map1.put(s, map.get(s));
                }
            }
        }
    }
}