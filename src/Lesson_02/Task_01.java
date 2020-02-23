package Lesson_02;
/* Запросить у пользователя 2слова.Если они одинаковы
   вывести "Отлично! Слова одинаковы".
         Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
         Если они отличаются,но одной длины -"Ну, хотя бы они одной длины
         "*/

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 любых слова: ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        int len1 = word1.length();
        int len2 = word2.length();

        if (word1.equals(word2)) {
            System.out.println("Отлично! Слова одинаковы");
        }
        else if (word1.equalsIgnoreCase(word2))  {
            System.out.println("Хорошо! Почти одинаковы");
        }
        else if (len1 == len2) {

            System.out.println("Ну, хотя бы они одной длины");
        }
    }
}



