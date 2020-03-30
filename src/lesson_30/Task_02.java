package lesson_30;

import java.time.LocalDate;

/* Создать объект LocalDate, представляющий собой сегодняшнюю дату.
        Используя этот объект, создать другой объект LocalTime,
        представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.*/
public class Task_02 {
     public static void main(String[] args) {

          LocalDate today = LocalDate.now();
          today = today.plusMonths(3);
          System.out.println(today);
     }
}
