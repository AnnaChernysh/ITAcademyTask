package lesson_30;
//Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


public class AddDays implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
    DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int daysToAdd =42 ;
        return temporal.plus(daysToAdd, ChronoUnit.DAYS);
    }

public static void main(String[]args) {
    LocalDate localDate = LocalDate.of(2020,3, 28);
    AddDays temporalAdjuster = new AddDays();
    LocalDate newDate = localDate.with(temporalAdjuster);

    System.out.println(newDate);

}}
