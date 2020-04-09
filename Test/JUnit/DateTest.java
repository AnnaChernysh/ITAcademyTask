package JUnit;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


public class DateTest {

    @Test
    public void FixedLocalDateTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateInString = "25.06.2020";

        Assert.assertEquals(sdf.format(dateInString), "25.06.2020");

    }

    @Test
    public void getPlusThreeMonthsTest() {
        LocalDate today = LocalDate.of(2020, 4, 3);
        LocalDate todayPlusMonths = today.plus(3, ChronoUnit.MONTHS);
        String actual = todayPlusMonths.toString();

        Assert.assertEquals("2020-07-03", actual);

    }

    @Test
    public void LocalDateFromStringTest() {
        String dateFromString = "26-03-2014";
        LocalDate parsedDate = LocalDate.parse(dateFromString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Assert.assertEquals("26-03-2014", parsedDate.format(formatter));

    }

    @Test(expected = DateTimeParseException.class)
    public void LocalDateFromStringTestException01() {

        String stringDate = "25-06-1999999999";
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    }

    @Test(expected = DateTimeParseException.class)
    public void LocalDateFromStringTestException02() {
          String stringDate = "87-05-2012";
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    }

    @Test(expected = DateTimeParseException.class)
    public void LocalDateFromStringTestException03() {

        String stringDate = "26-23-2014";
        LocalDate parsedDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

    }


    @Test
    public void GetPeriodTest() {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate fixedDate = LocalDate.of(2020, 6, 30);
        long daysBetweenDates = ChronoUnit.DAYS.between(today, fixedDate);

        Assert.assertEquals(5, daysBetweenDates);

    }


    @Test
    public void GetDurationTest() {
        LocalDate today = LocalDate.of(2020, 6, 25);
        LocalDate fixedDate = LocalDate.of(2020, 6, 26);

        LocalDateTime todayMidnight = today.atStartOfDay();
        LocalDateTime fixedDateMidnight = fixedDate.atStartOfDay();

        Duration durationOfDates = Duration.between(todayMidnight, fixedDateMidnight);

        Assert.assertEquals(86400, durationOfDates.getSeconds());

    }


    @Test
    public void AddDaysTest() {

        LocalDate today = LocalDate.of(2020, 07, 15);
        LocalDate todayPlusDays = today.plus(2, ChronoUnit.DAYS);

        Assert.assertEquals("2020-07-17", todayPlusDays.toString());
    }

}


