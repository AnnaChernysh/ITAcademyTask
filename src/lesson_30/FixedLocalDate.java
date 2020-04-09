package lesson_30;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

//Создать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль
public class FixedLocalDate {
    public static void main(String[] args)  {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "25.06.2020";
        System.out.println(dateInString);
    }
}

