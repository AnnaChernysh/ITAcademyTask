package lesson_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Задан файл с текстом, найти и вывести в консоль все слова,
 для которых последняя буква одного слова совпадает с первой буквой следующего слова*/
public class Task_03 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Program Files\\Java\\jre-10.0.2\\release"));
        String tmp = "";

        while ((tmp = br.readLine()) != null) {

            String[] s = tmp.split("\\s");

            for (int i = 0; i < s.length - 1; i++) {
                if (Character.toLowerCase(s[i].charAt(s[i].length() - 1)) ==
                        Character.toLowerCase(s[i + 1].charAt(0))) {
                    System.out.println(s[i] + " " + s[i + 1]);
                }
            }
        }
    }
}
