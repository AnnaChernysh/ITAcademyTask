package lesson_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

//Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
public class Task_01 {

    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new FileReader("C:\\Program Files\\Java\\jre-10.0.2\\release"));
      String tmp = "";
      while ((tmp = br.readLine()) != null) {

      String[] s = tmp.split("\\s");

      for (String res : s)
      System.out.println(res); }
       br.close();
           }
         }
