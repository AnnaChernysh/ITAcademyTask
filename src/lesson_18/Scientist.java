
package lesson_18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Scientist implements Runnable {
    GarbageDump dump;

    Map<String, Integer> collectDetails = new HashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 1 + Math.random()*4; j++) {
                collect();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        showres();
    }


    public Scientist(GarbageDump dump) {
        this.dump = dump;
    }

    public void collect() {
        dump.collectDetails(collectDetails);
        dump.map.clear();
    }

    public void showres(){
        if(!collectDetails.isEmpty()) {

            for (Map.Entry<String, Integer> entry : collectDetails.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            int res = collectDetails.entrySet().stream()
                    .min(Comparator.comparingInt(Map.Entry::getValue))
                    .map(Map.Entry::getValue).orElse(0);

            if (collectDetails.size() == 10) {
                System.out.println(res);
            }
        }
    }
}
