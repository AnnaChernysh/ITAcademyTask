package lesson_30;

import java.time.*;


//Даны два объекта LocalDate из предыдущего задания.
 //  Подсчитать количество секунд между полуночью первой даты и полуночью второй даты.
public class GetDuration {
    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2020, 6, 25);

        LocalDate date1 = LocalDate.of(2020, 6, 26);

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


