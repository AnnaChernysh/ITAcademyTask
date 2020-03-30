package lesson_30;

import java.time.Duration;
import java.time.LocalDate;


/*Создать объект LocalDate, представляющий собой сегодняшнюю дату.
        Создать объект LocalDate, представляющий собой дату 25.06.2020.
        Используя созданные объекты, найти количество дней между этими двумя датами.*/
public class Task_05 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2020, 06, 25);
        Duration duration = Duration.between(today.atStartOfDay(), date1.atStartOfDay());
        System.out.println(duration.toDays());
    }
}
