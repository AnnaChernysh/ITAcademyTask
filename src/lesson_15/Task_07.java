package lesson_15;
/*
        7. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл
                в обратном порядке символы каждой строки.*/
import java.io.FileReader;

public class Task_07 {
        public static void main(String[] args) {

            try {
                FileReader reader = new FileReader("C:\\Program Files\\Java\\jre-10.0.2\\release");
                String str = "";
                int ch;
                while ((ch = reader.read()) != -1) {
                    str += Character.toString((char) ch);
                }
                System.out.println("String : " + str);

                StringBuilder sb = new StringBuilder(str);
                System.out.println("Reverse order : " + sb.reverse());
                reader.close();
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

