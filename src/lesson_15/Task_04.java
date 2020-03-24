package lesson_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
public class Task_04 {

    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new FileReader("data.txt"));
       String tmp = "";

        int max = Integer.MIN_VALUE;
        while ((tmp = br.readLine()) != null) {

            if (Integer.parseInt(tmp) > max)
                max = Integer.parseInt(tmp);
        }
        System.out.println("Max: " + max);
      br.close();
    }
}
