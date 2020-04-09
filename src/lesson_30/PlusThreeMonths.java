package lesson_30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Создать объект LocalDate, представляющий собой сегодняшнюю дату.
        Используя этот объект, создать другой объект LocalTime,
        представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.*/
public class PlusThreeMonths {
     public static void main(String[] args) {
          LocalDate today = LocalDate.of(2020, 4, 3);
          LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);
          String actual = todayPlusMonths.toString();

     }
}
