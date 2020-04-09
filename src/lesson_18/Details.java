package lesson_18;

import java.util.List;
import java.util.Random;

public enum Details{
        HEAD,
        BODY,
        LEFT_LEG,
        RIGHT_LEG,
        RIGHT_HAND,
        LEFT_HAND,
        CPU,
        RAM,
        HDD;
        private static final List<Details> VALUES = null;


        private static final int SIZE = VALUES.size();

        private static final Random RANDOM = new Random();

        public static Details randomDetail()  {
                return VALUES.get(RANDOM.nextInt(SIZE));
        }
}
