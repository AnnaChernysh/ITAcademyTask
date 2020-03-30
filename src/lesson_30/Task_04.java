package lesson_30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*8.	Дана строка вида "26-03-2014". Получить объект LocalDate,
        представляющий собой дату, полученную из этой строки.*/
public class Task_04 {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString = "26-03-2014";
        LocalDate localDateObj = LocalDate.parse(dateString, dateTimeFormatter);    //String to LocalDate

        String dateStr = localDateObj.format(dateTimeFormatter);
        System.out.println(dateStr);

    }
}
