package lesson_30;

import java.time.*;
import java.time.temporal.ChronoUnit;

//Даны два объекта LocalDate из предыдущего задания.
 //  Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
public class Task_06 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate date1 = LocalDate.of(2020, 06, 25);

        LocalDateTime localDateTime = today.atStartOfDay();
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime2 = date1.atStartOfDay();
        System.out.println("localDateTime2 = " + date1);

        Duration duration = Duration.between(localDateTime, localDateTime2);
        System.out.println(duration.getSeconds() + " seconds");

       /* int seconds = (int) ChronoUnit.SECONDS.between(localDateTime, localDateTime2);
        System.out.println(seconds);*/
    }
}


