package lesson_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
public class Task_02 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Program Files\\Java\\jre-10.0.2\\release"));
        String tmp = "";
        while ((tmp = br.readLine()) != null) {

            String[] s = tmp.split("\\s");

            Pattern p = Pattern.compile("^[aeyuio][a-z]+[^aeyuio]$");
            Matcher m;

            for (String string2 : s) {
                m = p.matcher(string2);
                if (m.matches()) {
                    System.out.println(string2);
                }
                br.close();
            }
        }
    }
}
