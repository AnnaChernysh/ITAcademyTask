
package lesson_14;

/*Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
   и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
        X - код оператора
        Y - номер телефона*/

import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Task_04 {

    public static void main(String[] args) {

        String regex = ("^(\\+375\\d{2}\\d{7})$");
        String replacement = ("^(\\+375\\s(\\d{2})\\s\\d{3}-\\d{2}-\\d[{2})$");
        String sPhoneNumber = "+375336043353";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(sPhoneNumber);

        String formatNumber = sPhoneNumber.replaceAll(regex,replacement);
        System.out.printf(formatNumber);
    }
}
