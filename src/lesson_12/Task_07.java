package lesson_12;
       /* Написать метод, который в 50% случаев бросает исключение.
        Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("abc.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}