package lesson_14;

/*Написать программу, выполняющую поиск в строке всех тегов абзацев,
        в т.ч. тех, у которых есть параметры, например <p id ="p1">,
        и замену их на простые теги абзацев <p>.*/


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(line);

        while (m.find()) {
            matchFound = true;
            line = line.replaceAll("\\<.*?\\>", "");
            System.out.println(line);
        }
        if (!matchFound) {
            System.out.println("None");
        }
    }
}
