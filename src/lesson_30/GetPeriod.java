package lesson_30;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/*Создать объект LocalDate, представляющий собой сегодняшнюю дату.
        Создать объект LocalDate, представляющий собой дату 25.06.2020.
        Используя созданные объекты, найти количество дней между этими двумя датами.*/
public class GetPeriod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate fixedDate = LocalDate.of(2020, 6, 30);
        long daysBetweenDates = ChronoUnit.DAYS.between(today, fixedDate);

        System.out.println(daysBetweenDates);
    }
}
