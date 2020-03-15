package lesson_14;
/*
        Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
        с помощью регулярных выражений и выводящую их на страницу
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_02 {

        private static String regex = "\\x64";
        private static String input = "abcdefghij";

        public static void main(String[] args) {

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
             System.out.println("Match String start(): "+matcher.start());
            }
        }
    }

