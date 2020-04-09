package lesson_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*8.	Дана строка вида "26-03-2014". Получить объект LocalDate,
        представляющий собой дату, полученную из этой строки.*/
public class LocalDateFromString {
    public static void main(String[] args) {
        String dateFromString = "26-03-2014";
        LocalDate parsedDate = LocalDate.parse(dateFromString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(formatter);

    }
}
