package lesson_13;
 /*Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.*/

import java.util.Scanner;
public class Task_05 {

         public static void main(String[] args) {

             Scanner sc = new Scanner(System.in);

             System.out.println("Введите текст");

             String input = sc.nextLine();

             int count = 0;

             if(input.length() != 0){
                 count++;

                 for (int i = 0; i < input.length(); i++) {
                     if(input.charAt(i) == ' '){
                         count++;
                     }
                 }
             }

             System.out.println("Количество слов:" + count);
         }
}
