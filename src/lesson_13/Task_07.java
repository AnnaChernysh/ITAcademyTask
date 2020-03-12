package lesson_13;
       /* Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
        Если число выходит за размер 10 символов вернуть все нули.
        Пример getString(22) -> 0000000022
        Найти 3 способа решения задачи и определить наиболее быстрый способ.
*/

import java.text.DecimalFormat;


public class Task_07 {
       public static void main(String[] args) {
             int number = 22;
             String getString = String.format("%012d", number);
             System.out.println(getString);

              }
       }
//Второй способ:

public class Task_07 {
       public static void main(String[] args) {
              int number = 22;
              DecimalFormat df = new DecimalFormat("000000000000");
              String getString = df.format(number);
              System.out.println(getString);
       }
}

