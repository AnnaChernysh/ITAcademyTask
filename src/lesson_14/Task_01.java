package lesson_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
        В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний,
        при этом оно должно начинаться с буквы.
        Возможные домены верхнего уровня: .org .com
*/
public class Task_01 {

  public static boolean valid(String email) {
  String emailRegex =
   ("^\\D([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\.-]{0,1}[A-Za-z0-9]{1,})+[\\.]{1}[a-z]{2,4}$");
                Pattern pattern = Pattern.compile(emailRegex);
                if (email == null)
                    return false;
                return pattern.matcher(email).matches();
            }

            public static void main(String[] args)
            {
                String email = "ann.cher-nysh2704@gmail.com";
                if (valid(email))
                    System.out.print("Yes");
                else
                    System.out.print("No");
            }
        }