package lesson_30;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//Создать объект LocalDate, представляющий собой сегодняшнюю дату.
       // Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль
public class DateToString {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String localDate = simpleDateFormat.format(new Date());
        System.out.println(localDate);


    }
}