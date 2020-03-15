package lesson_14;
/*Написать метод, который проверяет, является ли строка адресом IPv4.
        Пример корректных IPv4
        0.0.0.0
        0.0.1.0
        255.0.0.1
        255.55.255.255
        192.168.0.1*/

import java.util.regex.Pattern;

public class Task_05 {
public static boolean valid(String ip) {

    String ipRegex =
      "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";


    Pattern pattern = Pattern.compile(ipRegex);
    if (ip == null)
        return false;
    return pattern.matcher(ip).matches();
}

    public static void main(String[] args)
    {
        String ip = "256.1.1.1.";
        if (valid(ip))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}



